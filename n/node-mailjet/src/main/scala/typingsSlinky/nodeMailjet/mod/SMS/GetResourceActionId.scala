package typingsSlinky.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceActionId extends js.Object {
  def request(): js.Promise[ExportResponse] = js.native
}

object GetResourceActionId {
  @scala.inline
  def apply(request: () => js.Promise[ExportResponse]): GetResourceActionId = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction0(request))
    __obj.asInstanceOf[GetResourceActionId]
  }
  @scala.inline
  implicit class GetResourceActionIdOps[Self <: GetResourceActionId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: () => js.Promise[ExportResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

