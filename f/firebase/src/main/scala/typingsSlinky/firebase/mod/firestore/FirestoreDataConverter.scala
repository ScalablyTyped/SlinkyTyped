package typingsSlinky.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirestoreDataConverter[T] extends js.Object {
  /**
    * Called by the Firestore SDK to convert Firestore data into an object of
    * type T. You can access your data by calling: `snapshot.data(options)`.
    *
    * @param snapshot A QueryDocumentSnapshot containing your data and metadata.
    * @param options The SnapshotOptions from the initial call to `data()`.
    */
  def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData], options: SnapshotOptions): T = js.native
  /**
    * Called by the Firestore SDK to convert a custom model object of type T
    * into a plain Javascript object (suitable for writing directly to the
    * Firestore database).
    */
  def toFirestore(modelObject: T): DocumentData = js.native
}

object FirestoreDataConverter {
  @scala.inline
  def apply[T](
    fromFirestore: (QueryDocumentSnapshot[DocumentData], SnapshotOptions) => T,
    toFirestore: T => DocumentData
  ): FirestoreDataConverter[T] = {
    val __obj = js.Dynamic.literal(fromFirestore = js.Any.fromFunction2(fromFirestore), toFirestore = js.Any.fromFunction1(toFirestore))
    __obj.asInstanceOf[FirestoreDataConverter[T]]
  }
  @scala.inline
  implicit class FirestoreDataConverterOps[Self[t] <: FirestoreDataConverter[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFromFirestore(value: (QueryDocumentSnapshot[DocumentData], SnapshotOptions) => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromFirestore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToFirestore(value: T => DocumentData): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFirestore")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

