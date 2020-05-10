package typingsSlinky.pouchdbCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDocs[Content /* <: js.Object */] extends js.Object {
  var docs: js.Array[AnonOk[Content] | AnonError] = js.native
  var id: String = js.native
}

object AnonDocs {
  @scala.inline
  def apply[Content](docs: js.Array[AnonOk[Content] | AnonError], id: String): AnonDocs[Content] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocs[Content]]
  }
  @scala.inline
  implicit class AnonDocsOps[Self[content] <: AnonDocs[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withDocs(value: js.Array[AnonOk[Content] | AnonError]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

