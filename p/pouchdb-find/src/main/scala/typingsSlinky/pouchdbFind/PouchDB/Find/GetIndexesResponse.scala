package typingsSlinky.pouchdbFind.PouchDB.Find

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIndexesResponse[Content /* <: js.Object */] extends js.Object {
  var indexes: js.Array[Index] = js.native
}

object GetIndexesResponse {
  @scala.inline
  def apply[Content](indexes: js.Array[Index]): GetIndexesResponse[Content] = {
    val __obj = js.Dynamic.literal(indexes = indexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIndexesResponse[Content]]
  }
  @scala.inline
  implicit class GetIndexesResponseOps[Self[content] <: GetIndexesResponse[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withIndexes(value: js.Array[Index]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

