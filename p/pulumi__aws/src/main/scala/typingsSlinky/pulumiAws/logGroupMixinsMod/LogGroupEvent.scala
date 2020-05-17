package typingsSlinky.pulumiAws.logGroupMixinsMod

import typingsSlinky.pulumiAws.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogGroupEvent extends js.Object {
  var awslogs: Data = js.native
}

object LogGroupEvent {
  @scala.inline
  def apply(awslogs: Data): LogGroupEvent = {
    val __obj = js.Dynamic.literal(awslogs = awslogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogGroupEvent]
  }
  @scala.inline
  implicit class LogGroupEventOps[Self <: LogGroupEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwslogs(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awslogs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

