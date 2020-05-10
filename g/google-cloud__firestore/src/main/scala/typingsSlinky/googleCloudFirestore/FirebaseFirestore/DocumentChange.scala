package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentChange[T] extends js.Object {
  /** The document affected by this change. */
  val doc: QueryDocumentSnapshot[T] = js.native
  /**
    * The index of the changed document in the result set immediately after
    * this DocumentChange (i.e. supposing that all prior DocumentChange
    * objects and the current DocumentChange object have been applied).
    * Is -1 for 'removed' events.
    */
  val newIndex: Double = js.native
  /**
    * The index of the changed document in the result set immediately prior to
    * this DocumentChange (i.e. supposing that all prior DocumentChange objects
    * have been applied). Is -1 for 'added' events.
    */
  val oldIndex: Double = js.native
  /** The type of change ('added', 'modified', or 'removed'). */
  val `type`: DocumentChangeType = js.native
  /**
    * Returns true if the data in this `DocumentChange` is equal to the
    * provided one.
    *
    * @param other The `DocumentChange` to compare against.
    * @return true if this `DocumentChange` is equal to the provided one.
    */
  def isEqual(other: DocumentChange[T]): Boolean = js.native
}

object DocumentChange {
  @scala.inline
  def apply[T](
    doc: QueryDocumentSnapshot[T],
    isEqual: DocumentChange[T] => Boolean,
    newIndex: Double,
    oldIndex: Double,
    `type`: DocumentChangeType
  ): DocumentChange[T] = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentChange[T]]
  }
  @scala.inline
  implicit class DocumentChangeOps[Self[t] <: DocumentChange[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDoc(value: QueryDocumentSnapshot[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEqual(value: DocumentChange[T] => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DocumentChangeType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

