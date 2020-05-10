package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgScheduler
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Fired after agenda view range is changed when using previous and next buttons (fired only in Agenda View)
  	 */
  var agendaRangeChanged: js.UndefOr[AgendaRangeChangedEvent] = js.native
  /**
  	 * Fired before agenda view range is changed when using previous and next buttons (fired only in Agenda View)
  	 */
  var agendaRangeChanging: js.UndefOr[AgendaRangeChangingEvent] = js.native
  /**
  	 * Gets/Sets AgendaView settings.
  	 *
  	 */
  var agendaViewSettings: js.UndefOr[IgSchedulerAgendaViewSettings] = js.native
  /**
  	 * Fired after an appointment is created.
  	 */
  var appointmentCreated: js.UndefOr[AppointmentCreatedEvent] = js.native
  /**
  	 * Fired before an appointment is created.
  	 */
  var appointmentCreating: js.UndefOr[AppointmentCreatingEvent] = js.native
  /**
  	 * Fired after an appointment is deleted.
  	 */
  var appointmentDeleted: js.UndefOr[AppointmentDeletedEvent] = js.native
  /**
  	 * Fired before an appointment is deleted.
  	 */
  var appointmentDeleting: js.UndefOr[AppointmentDeletingEvent] = js.native
  /**
  	 * Fired after closing the dialog window for adding/editing appointment.
  	 */
  var appointmentDialogClosed: js.UndefOr[AppointmentDialogClosedEvent] = js.native
  /**
  	 * Fired before closing the dialog for adding/editing appointment.
  	 */
  var appointmentDialogClosing: js.UndefOr[AppointmentDialogClosingEvent] = js.native
  /**
  	 * Fired after opening the dialog for creating/editing appointment.
  	 */
  var appointmentDialogOpened: js.UndefOr[AppointmentDialogOpenedEvent] = js.native
  /**
  	 * Fired before opening the dialog for creating/editing appointment.
  	 */
  var appointmentDialogOpening: js.UndefOr[AppointmentDialogOpeningEvent] = js.native
  /**
  	 * Gets/Sets whether the appointment dialog and the related day and appointment popups should be shown.
  	 *
  	 */
  var appointmentDialogSuppress: js.UndefOr[Boolean] = js.native
  /**
  	 * Fired after an appointment is edited.
  	 */
  var appointmentEdited: js.UndefOr[AppointmentEditedEvent] = js.native
  /**
  	 * Fired before an appointment is edited.
  	 */
  var appointmentEditing: js.UndefOr[AppointmentEditingEvent] = js.native
  /**
  	 * Gets/Sets dataSource of type $.ig.scheduler.ScheduleListDataSource.
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Fired after day is changed when using previous and next buttons (fired only in Day View)
  	 */
  var dayChanged: js.UndefOr[DayChangedEvent] = js.native
  /**
  	 * Fired before changing the day begins, when using previous and next buttons (fired only in Day View)
  	 */
  var dayChanging: js.UndefOr[DayChangingEvent] = js.native
  /**
  	 * Fired when a day is selected from the datepicker calendar.
  	 */
  var daySelected: js.UndefOr[DaySelectedEvent] = js.native
  /**
  	 * Gets/Sets DayView settings.
  	 *
  	 */
  var dayViewSettings: js.UndefOr[IgSchedulerDayViewSettings] = js.native
  /**
  	 * Enables/Disables today button.
  	 *
  	 */
  var enableTodayButton: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the height of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will fit the editor inside its parent container, if no other heights are defined.
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Fired after month is changed when using previous and next buttons (fired only in Month View)
  	 */
  var monthChanged: js.UndefOr[MonthChangedEvent] = js.native
  /**
  	 * Fired before changing the month begins, when using previous and next buttons (fired only in Month View)
  	 */
  var monthChanging: js.UndefOr[MonthChangingEvent] = js.native
  /**
  	 * Gets/Sets MonthView settings.
  	 *
  	 */
  var monthViewSettings: js.UndefOr[IgSchedulerMonthViewSettings] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Fired after rendering of the scheduler has finished.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
  	 * Fired before rendering of the scheduler begins.
  	 */
  var rendering: js.UndefOr[RenderingEvent] = js.native
  /**
  	 * Gets the resources collection that holds the activities` owners
  	 *
  	 * //Initialize
  	 * var resources = [
  	 * { id: 1, displayName: "Trina Friesen" },
  	 * { id: 2, displayName: "Mack Koch" }];
  	 * $(".selector").%%WidgetName%%({
  	 * resources: resources
  	 * });
  	 *
  	 * // Get
  	 * var resources = $(".selector").%%WidgetName%%("option", "resources");
  	 */
  var resources: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets selected date in the Scheduler.
  	 *
  	 */
  var selectedDate: js.UndefOr[js.Date] = js.native
  /**
  	 * Fired after the view is changed, when using the menu buttons.
  	 */
  var viewChanged: js.UndefOr[ViewChangedEvent] = js.native
  /**
  	 * Fired before the view is changed, when using the menu buttons.
  	 */
  var viewChanging: js.UndefOr[ViewChangingEvent] = js.native
  /**
  	 * Gets/Sets current view mode in the Scheduler. If this options is not defined, then the first defined view in the views property is taken.
  	 *
  	 *
  	 * Valid values:
  	 * "monthView" Enables MonthView in the Scheduler.
  	 * "agendaView" Enables AgendaView in the Scheduler.
  	 */
  var viewMode: js.UndefOr[String] = js.native
  /**
  	 * Lists of all the views, rendered in the Scheduler.
  	 *
  	 */
  var views: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Fired after week is changed when using previous and next buttons (fired only in Week View)
  	 */
  var weekChanged: js.UndefOr[WeekChangedEvent] = js.native
  /**
  	 * Fired before changing the week begins, when using previous and next buttons (fired only in Week View)
  	 */
  var weekChanging: js.UndefOr[WeekChangingEvent] = js.native
  /**
  	 * Gets/Sets WeekView settings.
  	 *
  	 */
  var weekViewSettings: js.UndefOr[IgSchedulerWeekViewSettings] = js.native
  /**
  	 * Gets/Sets the width of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will stretch to fit data, if no other widths are defined.
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgScheduler {
  @scala.inline
  def apply(): IgScheduler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgScheduler]
  }
  @scala.inline
  implicit class IgSchedulerOps[Self <: IgScheduler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgendaRangeChanged(value: (/* event */ Event_, /* ui */ AgendaRangeChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaRangeChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAgendaRangeChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaRangeChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withAgendaRangeChanging(value: (/* event */ Event_, /* ui */ AgendaRangeChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaRangeChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAgendaRangeChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaRangeChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withAgendaViewSettings(value: IgSchedulerAgendaViewSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaViewSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgendaViewSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaViewSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentCreated(value: (/* event */ Event_, /* ui */ AppointmentCreatedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCreated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAppointmentCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentCreating(value: (/* event */ Event_, /* ui */ AppointmentCreatingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCreating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAppointmentCreating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCreating")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentDeleted(value: (/* event */ Event_, /* ui */ AppointmentDeletedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDeleted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAppointmentDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentDeleting(value: (/* event */ Event_, /* ui */ AppointmentDeletingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDeleting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAppointmentDeleting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDeleting")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentDialogClosed(value: (/* event */ Event_, /* ui */ AppointmentDialogClosedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDialogClosed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAppointmentDialogClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDialogClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentDialogClosing(value: (/* event */ Event_, /* ui */ AppointmentDialogClosingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDialogClosing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAppointmentDialogClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDialogClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentDialogOpened(value: (/* event */ Event_, /* ui */ AppointmentDialogOpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDialogOpened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAppointmentDialogOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDialogOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentDialogOpening(value: (/* event */ Event_, /* ui */ AppointmentDialogOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDialogOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAppointmentDialogOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDialogOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentDialogSuppress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDialogSuppress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentDialogSuppress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDialogSuppress")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentEdited(value: (/* event */ Event_, /* ui */ AppointmentEditedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentEdited")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAppointmentEdited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentEdited")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentEditing(value: (/* event */ Event_, /* ui */ AppointmentEditingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentEditing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAppointmentEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDayChanged(value: (/* event */ Event_, /* ui */ DayChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDayChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withDayChanging(value: (/* event */ Event_, /* ui */ DayChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDayChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withDaySelected(value: (/* event */ Event_, /* ui */ DaySelectedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daySelected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDaySelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daySelected")(js.undefined)
        ret
    }
    @scala.inline
    def withDayViewSettings(value: IgSchedulerDayViewSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayViewSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayViewSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayViewSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTodayButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTodayButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTodayButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTodayButton")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthChanged(value: (/* event */ Event_, /* ui */ MonthChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMonthChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthChanging(value: (/* event */ Event_, /* ui */ MonthChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMonthChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthViewSettings(value: IgSchedulerMonthViewSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthViewSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthViewSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthViewSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withRendered(value: (/* event */ Event_, /* ui */ RenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.undefined)
        ret
    }
    @scala.inline
    def withRendering(value: (/* event */ Event_, /* ui */ RenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendering")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withViewChanged(value: (/* event */ Event_, /* ui */ ViewChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutViewChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withViewChanging(value: (/* event */ Event_, /* ui */ ViewChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutViewChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withViewMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekChanged(value: (/* event */ Event_, /* ui */ WeekChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWeekChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekChanging(value: (/* event */ Event_, /* ui */ WeekChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWeekChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekViewSettings(value: IgSchedulerWeekViewSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekViewSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekViewSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekViewSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

