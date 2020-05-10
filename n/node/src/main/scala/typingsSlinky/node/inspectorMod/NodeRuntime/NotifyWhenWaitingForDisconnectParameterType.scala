package typingsSlinky.node.inspectorMod.NodeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyWhenWaitingForDisconnectParameterType extends js.Object {
  var enabled: Boolean = js.native
}

object NotifyWhenWaitingForDisconnectParameterType {
  @scala.inline
  def apply(enabled: Boolean): NotifyWhenWaitingForDisconnectParameterType = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyWhenWaitingForDisconnectParameterType]
  }
  @scala.inline
  implicit class NotifyWhenWaitingForDisconnectParameterTypeOps[Self <: NotifyWhenWaitingForDisconnectParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

