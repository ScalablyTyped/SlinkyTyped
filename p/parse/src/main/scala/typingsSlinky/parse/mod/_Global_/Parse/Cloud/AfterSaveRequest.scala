package typingsSlinky.parse.mod._Global_.Parse.Cloud

import typingsSlinky.parse.mod._Global_.Parse.Attributes
import typingsSlinky.parse.mod._Global_.Parse.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterSaveRequest extends TriggerRequest {
  var context: js.Object = js.native
}

object AfterSaveRequest {
  @scala.inline
  def apply(
    context: js.Object,
    headers: js.Any,
    ip: String,
    log: js.Any,
    `object`: Object[Attributes],
    triggerName: String
  ): AfterSaveRequest = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterSaveRequest]
  }
  @scala.inline
  implicit class AfterSaveRequestOps[Self <: AfterSaveRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

