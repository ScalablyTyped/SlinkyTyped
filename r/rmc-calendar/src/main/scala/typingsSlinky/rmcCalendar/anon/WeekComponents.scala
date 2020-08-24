package typingsSlinky.rmcCalendar.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeekComponents extends js.Object {
  var weekComponents: js.Array[ReactElement] = js.native
}

object WeekComponents {
  @scala.inline
  def apply(weekComponents: js.Array[ReactElement]): WeekComponents = {
    val __obj = js.Dynamic.literal(weekComponents = weekComponents.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekComponents]
  }
  @scala.inline
  implicit class WeekComponentsOps[Self <: WeekComponents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWeekComponentsVarargs(value: ReactElement*): Self = this.set("weekComponents", js.Array(value :_*))
    @scala.inline
    def setWeekComponents(value: js.Array[ReactElement]): Self = this.set("weekComponents", value.asInstanceOf[js.Any])
  }
  
}

