package typingsSlinky.pouchdbCore.PouchDB.Core

import typingsSlinky.pouchdbCore.anon.Docs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkGetResponse[Content /* <: js.Object */] extends js.Object {
  var results: js.Array[Docs[Content]] = js.native
}

object BulkGetResponse {
  @scala.inline
  def apply[Content](results: js.Array[Docs[Content]]): BulkGetResponse[Content] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkGetResponse[Content]]
  }
  @scala.inline
  implicit class BulkGetResponseOps[Self[content] <: BulkGetResponse[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withResults(value: js.Array[Docs[Content]]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

