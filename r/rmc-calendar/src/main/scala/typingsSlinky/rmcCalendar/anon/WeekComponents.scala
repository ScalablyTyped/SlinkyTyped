package typingsSlinky.rmcCalendar.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeekComponents extends js.Object {
  var weekComponents: js.Array[TagMod[Any]] = js.native
}

object WeekComponents {
  @scala.inline
  def apply(weekComponents: js.Array[TagMod[Any]]): WeekComponents = {
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
    def withWeekComponents(value: js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekComponents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

