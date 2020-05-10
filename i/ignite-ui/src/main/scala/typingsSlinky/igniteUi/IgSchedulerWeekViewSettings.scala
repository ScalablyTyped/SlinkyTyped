package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSchedulerWeekViewSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the time slots duration. 5, 6, 10, 15, 30 and 60 minutes are supported.
  	 *
  	 */
  var timeSlotInterval: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the week view display mode (whether to show all days or just working days).
  	 *
  	 */
  var weekViewDisplayMode: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets whether to display all hours or just working hours.
  	 *
  	 */
  var workingHoursDisplayMode: js.UndefOr[String] = js.native
}

object IgSchedulerWeekViewSettings {
  @scala.inline
  def apply(): IgSchedulerWeekViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSchedulerWeekViewSettings]
  }
  @scala.inline
  implicit class IgSchedulerWeekViewSettingsOps[Self <: IgSchedulerWeekViewSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeSlotInterval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSlotInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSlotInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSlotInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekViewDisplayMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekViewDisplayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekViewDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekViewDisplayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkingHoursDisplayMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingHoursDisplayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingHoursDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingHoursDisplayMode")(js.undefined)
        ret
    }
  }
  
}

