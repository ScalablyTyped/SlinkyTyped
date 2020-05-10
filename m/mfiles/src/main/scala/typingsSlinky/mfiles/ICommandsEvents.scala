package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandsEvents extends IEvents {
  var OnCustomCommand: js.UndefOr[js.Function1[/* commandID */ Double, Unit]] = js.native
}

object ICommandsEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): ICommandsEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[ICommandsEvents]
  }
  @scala.inline
  implicit class ICommandsEventsOps[Self <: ICommandsEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCustomCommand(value: /* commandID */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCustomCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCustomCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCustomCommand")(js.undefined)
        ret
    }
  }
  
}

