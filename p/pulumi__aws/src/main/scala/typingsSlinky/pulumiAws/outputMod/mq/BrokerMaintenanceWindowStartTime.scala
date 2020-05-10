package typingsSlinky.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerMaintenanceWindowStartTime extends js.Object {
  /**
    * The day of the week. e.g. `MONDAY`, `TUESDAY`, or `WEDNESDAY`
    */
  var dayOfWeek: String = js.native
  /**
    * The time, in 24-hour format. e.g. `02:00`
    */
  var timeOfDay: String = js.native
  /**
    * The time zone, UTC by default, in either the Country/City format, or the UTC offset format. e.g. `CET`
    */
  var timeZone: String = js.native
}

object BrokerMaintenanceWindowStartTime {
  @scala.inline
  def apply(dayOfWeek: String, timeOfDay: String, timeZone: String): BrokerMaintenanceWindowStartTime = {
    val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any], timeOfDay = timeOfDay.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerMaintenanceWindowStartTime]
  }
  @scala.inline
  implicit class BrokerMaintenanceWindowStartTimeOps[Self <: BrokerMaintenanceWindowStartTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayOfWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeOfDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

