package typingsSlinky.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for calendar triggers.
  */
@js.native
trait CalendarTriggerBuilder extends js.Object {
  def create(): Trigger = js.native
  def onEventUpdated(): CalendarTriggerBuilder = js.native
}

object CalendarTriggerBuilder {
  @scala.inline
  def apply(create: () => Trigger, onEventUpdated: () => CalendarTriggerBuilder): CalendarTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onEventUpdated = js.Any.fromFunction0(onEventUpdated))
    __obj.asInstanceOf[CalendarTriggerBuilder]
  }
  @scala.inline
  implicit class CalendarTriggerBuilderOps[Self <: CalendarTriggerBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: () => Trigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnEventUpdated(value: () => CalendarTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEventUpdated")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

