package typingsSlinky.pouchdbCore.anon

import typingsSlinky.pouchdbCore.PouchDB.Core.GetMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ok[Content /* <: js.Object */] extends js.Object {
  var ok: Content with GetMeta = js.native
}

object Ok {
  @scala.inline
  def apply[Content](ok: Content with GetMeta): Ok[Content] = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ok[Content]]
  }
  @scala.inline
  implicit class OkOps[Self[content] <: Ok[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withOk(value: Content with GetMeta): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

