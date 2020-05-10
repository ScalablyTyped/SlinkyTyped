package typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore

import typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Types.SnapshotMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuerySnapshot_ extends js.Object {
  val docChanges: js.Array[DocumentChange] = js.native
  val docs: js.Array[DocumentSnapshot] = js.native
  val empty: Boolean = js.native
  val metadata: SnapshotMetadata = js.native
  val query: Query = js.native
  val size: Double = js.native
  def forEach(callback: js.Function1[/* snapshot */ DocumentSnapshot, _]): Unit = js.native
}

object QuerySnapshot_ {
  @scala.inline
  def apply(
    docChanges: js.Array[DocumentChange],
    docs: js.Array[DocumentSnapshot],
    empty: Boolean,
    forEach: js.Function1[/* snapshot */ DocumentSnapshot, _] => Unit,
    metadata: SnapshotMetadata,
    query: Query,
    size: Double
  ): QuerySnapshot_ = {
    val __obj = js.Dynamic.literal(docChanges = docChanges.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], forEach = js.Any.fromFunction1(forEach), metadata = metadata.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySnapshot_]
  }
  @scala.inline
  implicit class QuerySnapshot_Ops[Self <: QuerySnapshot_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocChanges(value: js.Array[DocumentChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocs(value: js.Array[DocumentSnapshot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForEach(value: js.Function1[/* snapshot */ DocumentSnapshot, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMetadata(value: SnapshotMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

