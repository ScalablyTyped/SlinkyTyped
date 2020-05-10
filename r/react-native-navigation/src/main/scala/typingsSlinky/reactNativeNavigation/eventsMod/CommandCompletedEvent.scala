package typingsSlinky.reactNativeNavigation.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandCompletedEvent extends js.Object {
  var commandId: String = js.native
  var completionTime: Double = js.native
  var params: js.Any = js.native
}

object CommandCompletedEvent {
  @scala.inline
  def apply(commandId: String, completionTime: Double, params: js.Any): CommandCompletedEvent = {
    val __obj = js.Dynamic.literal(commandId = commandId.asInstanceOf[js.Any], completionTime = completionTime.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandCompletedEvent]
  }
  @scala.inline
  implicit class CommandCompletedEventOps[Self <: CommandCompletedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletionTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

