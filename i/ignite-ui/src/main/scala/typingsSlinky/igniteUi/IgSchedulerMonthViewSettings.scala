package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSchedulerMonthViewSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the scope of appointments that are displayed in a MonthView's AgendaView.
  	 *
  	 * allAppointments  Indicates that appointments for all days should be displayed in an AgendaView when it is a secondary view within a MonthView.
  	 * onlyAppointmentsForSelectedMonthViewDay  Indicates that only appointments for the day that is current selected in the associated MonthView should be displayed in an AgendaView that is associated with a MonthView as a secondary view.
  	 */
  var agendaVisibilityType: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the type of content displayed in a MonthView day.
  	 *
  	 * auto  Depending on the screen size, indicates square indicator mode for the appointment in the Month View, if scheduler size is larger than 768px, otherwise identifies horizontal one.
  	 * indicator  Indicates that a square indicator should be displayed.
  	 * detailed  Indicates that the subject should be displayed.
  	 */
  var appointmentMode: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the visibility of an AgendaView in a MonthView.  When true, the MonthView will display an AgendaView showing the Appointments for the currently selected day at the top of its list of Appointments.
  	 *
  	 */
  var isAgendaVisible: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/sets the visibility of the horizontal separators between weeks in the MonthView.
  	 *
  	 */
  var isHorizontalSeparatorVisibile: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/sets the visibility of the days from the next month that occur in the last week of a given month.
  	 *
  	 */
  var isNextMonthShown: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/sets the visibility of the days from the previous month that occur in the first week of a given month.
  	 *
  	 */
  var isPreviousMonthShown: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/sets the visibility of the vertical separators between days of the week in a MonthView.
  	 *
  	 */
  var isVerticalSeparatorVisibile: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/sets the visibility of the week numbers in a MonthView.
  	 *
  	 */
  var isWeekNumberVisible: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/sets the visibility of the weekday names in MonthView.
  	 *
  	 */
  var isWeekdayVisible: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the orientation, which determines whether the MonthView and AgendaView views are split vertically or horizontally. This option can be used when the AgendaView is displayed in the MonthView.
  	 *
  	 * auto  Depending on the screen size, identifies vertical split if scheduler size is larger than 768px, otherwise identifies horizontal one.
  	 * vertical  Identifies a vertical split between the Scheduler's views.
  	 * horizontal  Identifies a horizontal split between the Scheduler's views.
  	 */
  var viewSplitOrientation: js.UndefOr[String] = js.native
}

object IgSchedulerMonthViewSettings {
  @scala.inline
  def apply(): IgSchedulerMonthViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSchedulerMonthViewSettings]
  }
  @scala.inline
  implicit class IgSchedulerMonthViewSettingsOps[Self <: IgSchedulerMonthViewSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgendaVisibilityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaVisibilityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgendaVisibilityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaVisibilityType")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAgendaVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAgendaVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAgendaVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAgendaVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHorizontalSeparatorVisibile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontalSeparatorVisibile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHorizontalSeparatorVisibile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontalSeparatorVisibile")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNextMonthShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNextMonthShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNextMonthShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNextMonthShown")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPreviousMonthShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPreviousMonthShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPreviousMonthShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPreviousMonthShown")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVerticalSeparatorVisibile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerticalSeparatorVisibile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVerticalSeparatorVisibile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerticalSeparatorVisibile")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWeekNumberVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWeekNumberVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWeekNumberVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWeekNumberVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWeekdayVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWeekdayVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWeekdayVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWeekdayVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withViewSplitOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSplitOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewSplitOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSplitOrientation")(js.undefined)
        ret
    }
  }
  
}

