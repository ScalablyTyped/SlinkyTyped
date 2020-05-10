package typingsSlinky.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers on the beginning of every action that starts within the Schedule.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggers after the completion of every action within the Schedule.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Sets the week to display more than one week appointment summary.
    */
  var agendaViewSettings: js.UndefOr[AgendaViewSettings] = js.native
  /** Accepts the id value of the template layout defined for the all-day cells and customizes it.
    * @Default {null}
    */
  var allDayCellsTemplateId: js.UndefOr[String] = js.native
  /** When set to false, disables the appointment delete option on the Scheduler.
    * @Default {true}
    */
  var allowDelete: js.UndefOr[Boolean] = js.native
  /** When set to true, Schedule allows the appointments to be dragged and dropped at required time.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** When set to true, allows the user to create/edit appointments inline - simply through a single click made either on the Scheduler cells or on the existing appointmentâ€™s Subject
    * text respectively. Pressing enter key after the new Subject text   typed onto the inline created text box, will save/update the appointments appropriately.
    * @Default {false}
    */
  var allowInline: js.UndefOr[Boolean] = js.native
  /** When set to true, Scheduler allows interaction through keyboard shortcut keys.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Triggers after an existing appointment is edited.
    */
  var appointmentChanged: js.UndefOr[js.Function1[/* e */ AppointmentChangedEventArgs, Unit]] = js.native
  /** Triggers after an appointment is clicked.
    */
  var appointmentClick: js.UndefOr[js.Function1[/* e */ AppointmentClickEventArgs, Unit]] = js.native
  /** Triggers after the new appointment is saved.
    */
  var appointmentCreated: js.UndefOr[js.Function1[/* e */ AppointmentCreatedEventArgs, Unit]] = js.native
  /** Allows setting draggable area for the Scheduler appointments. Also, turns on the external drag and drop, when set with some specific external drag area name.
    */
  var appointmentDragArea: js.UndefOr[String] = js.native
  /** Triggers on hovering the mouse over the appointments.
    */
  var appointmentHover: js.UndefOr[js.Function1[/* e */ AppointmentHoverEventArgs, Unit]] = js.native
  /** Triggers after the appointment is deleted.
    */
  var appointmentRemoved: js.UndefOr[js.Function1[/* e */ AppointmentRemovedEventArgs, Unit]] = js.native
  /** It includes the dataSource option and the fields related to Schedule appointments. The appointment fields within the appointmentSettings can accept both string and object type
    * values. To apply validation rules on the appointment window fields, then the appointment fields needs to be defined with object type values.
    */
  var appointmentSettings: js.UndefOr[AppointmentSettings] = js.native
  /** Template design that applies on the Schedule appointments. All the field names that are mapped from dataSource to the appropriate field properties within the appointmentSettings
    * can be used within the template.
    * @Default {null}
    */
  var appointmentTemplateId: js.UndefOr[String] = js.native
  /** Triggers before the appointment window opens.
    */
  var appointmentWindowOpen: js.UndefOr[js.Function1[/* e */ AppointmentWindowOpenEventArgs, Unit]] = js.native
  /** Triggers before the edited appointment is being saved.
    */
  var beforeAppointmentChange: js.UndefOr[js.Function1[/* e */ BeforeAppointmentChangeEventArgs, Unit]] = js.native
  /** Triggers before the new appointment gets saved.
    */
  var beforeAppointmentCreate: js.UndefOr[js.Function1[/* e */ BeforeAppointmentCreateEventArgs, Unit]] = js.native
  /** Triggers before the appointment is being removed from the Scheduler.
    */
  var beforeAppointmentRemove: js.UndefOr[js.Function1[/* e */ BeforeAppointmentRemoveEventArgs, Unit]] = js.native
  /** Triggers before the context menu opens.
    */
  var beforeContextMenuOpen: js.UndefOr[js.Function1[/* e */ BeforeContextMenuOpenEventArgs, Unit]] = js.native
  /** Blocks the user-specific time interval on the Scheduler, so that no appointments can be created on that particular time slots. It includes the dataSource option and also the
    * fields related to block intervals.
    */
  var blockoutSettings: js.UndefOr[BlockoutSettings] = js.native
  /** Sets various categorize colors to the Schedule appointments to differentiate it.
    */
  var categorizeSettings: js.UndefOr[CategorizeSettings] = js.native
  /** Triggers after the cell is clicked.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.native
  /** Triggers after the cell is clicked twice.
    */
  var cellDoubleClick: js.UndefOr[js.Function1[/* e */ CellDoubleClickEventArgs, Unit]] = js.native
  /** Sets the height for Schedule cells.
    * @Default {20px}
    */
  var cellHeight: js.UndefOr[String] = js.native
  /** Triggers on hovering the mouse overs the cells.
    */
  var cellHover: js.UndefOr[js.Function1[/* e */ CellHoverEventArgs, Unit]] = js.native
  /** Sets the width for Schedule cells.
    */
  var cellWidth: js.UndefOr[String] = js.native
  /** Holds all options related to the context menu settings of Scheduler.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  /** Triggers when the Scheduler completely renders on the page.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Accepts the custom CSS class name that defines specific user-defined styles and themes to be applied for partial or complete elements of the Schedule.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Sets current date of the Schedule. The Schedule displays initially with the date that is provided here.
    * @Default {new Date()}
    */
  var currentDate: js.UndefOr[js.Any] = js.native
  /** Sets current view of the Schedule. Schedule renders initially with the view that is specified here. The available views are day, week, workweek, month, agenda and custom view -
    * from which any one of the required view can be set to the Schedule. It accepts both string or enum values. The enum values that are accepted by
    * currentView(ej.Schedule.CurrentView) are as follows,
    * @Default {ej.Schedule.CurrentView.Week}
    */
  var currentView: js.UndefOr[String | CurrentView] = js.native
  /** Sets the date format for Schedule.
    */
  var dateFormat: js.UndefOr[String] = js.native
  /** Accepts the id value of the template layout defined for the date header cells and customizes it.
    * @Default {null}
    */
  var dateHeaderTemplateId: js.UndefOr[String] = js.native
  /** Triggers when the Scheduler and all its sub-components gets destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Triggers while the appointment is being dragged over the work cells.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.native
  /** Triggers when the appointment dragging begins.
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.native
  /** Triggers when the appointment is dropped.
    */
  var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.native
  /** When set to true, enables the resize behavior of appointments within the Schedule.
    * @Default {true}
    */
  var enableAppointmentResize: js.UndefOr[Boolean] = js.native
  /** When set to true, enables the loading of Schedule appointments based on your demand. With this load on demand concept, the data consumption of the Schedule can be limited.
    * @Default {false}
    */
  var enableLoadOnDemand: js.UndefOr[Boolean] = js.native
  /** Saves the current model value to browser cookies for state maintenance. When the page gets refreshed, Schedule control values are retained.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** When set to true, the Schedule layout and behavior changes as per the common RTL conventions.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** When set to true, Schedule allows the validation of recurrence pattern to take place before it is being assigned to the appointments. For example, when one of the instance of
    * recurrence appointment is dragged beyond the next or previous instance of the same recurrence appointment, a pop-up is displayed with the validation message disallowing the drag
    * functionality.
    * @Default {true}
    */
  var enableRecurrenceValidation: js.UndefOr[Boolean] = js.native
  /** Sets the end hour time limit to be displayed on the Schedule.
    * @Default {24}
    */
  var endHour: js.UndefOr[Double] = js.native
  /** Sets specific day as the starting day of the week.
    * @Default {null}
    */
  var firstDayOfWeek: js.UndefOr[String] = js.native
  /** To configure resource grouping on the Schedule.
    */
  var group: js.UndefOr[Group] = js.native
  /** Sets the height of the Schedule. Accepts both pixel and percentage values.
    * @Default {1120px}
    */
  var height: js.UndefOr[String] = js.native
  /** When set to true, enables the Schedule to observe Daylight Saving Time for supported timezones.
    * @Default {false}
    */
  var isDST: js.UndefOr[Boolean] = js.native
  /** When set to true, adapts the Schedule layout to fit the screen size of devices on which it renders.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Triggers when any of the keyboard keys are pressed.
    */
  var keyDown: js.UndefOr[js.Function1[/* e */ KeyDownEventArgs, Unit]] = js.native
  /** Sets the specific culture to the Schedule.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the maximum date limit to display on the Schedule. Setting maxDate with specific date value disallows the Schedule to navigate beyond that date.
    * @Default {new Date(2099, 12, 31)}
    */
  var maxDate: js.UndefOr[js.Any] = js.native
  /** Triggers after the menu/sub-menu items within the context menu is clicked.
    */
  var menuItemClick: js.UndefOr[js.Function1[/* e */ MenuItemClickEventArgs, Unit]] = js.native
  /** Sets the minimum date limit to display on the Schedule. Setting minDate with specific date value disallows the Schedule to navigate beyond that date.
    * @Default {new Date(1900, 01, 01)}
    */
  var minDate: js.UndefOr[js.Any] = js.native
  /** Triggers after the Schedule view or date is navigated.
    */
  var navigation: js.UndefOr[js.Function1[/* e */ NavigationEventArgs, Unit]] = js.native
  /** Sets the mode of Schedule rendering either in a vertical or horizontal direction. It accepts either string(&quot;vertical&quot; or &quot;horizontal&quot;) or enum values. The enum
    * values that are accepted by orientation(ej.Schedule.Orientation) are as follows,
    * @Default {ej.Schedule.Orientation.Vertical}
    */
  var orientation: js.UndefOr[String | Orientation] = js.native
  /** Triggers when the overflow button is clicked.
    */
  var overflowButtonClick: js.UndefOr[js.Function1[/* e */ OverflowButtonClickEventArgs, Unit]] = js.native
  /** Triggers while mouse hovering on the overflow button.
    */
  var overflowButtonHover: js.UndefOr[js.Function1[/* e */ OverflowButtonHoverEventArgs, Unit]] = js.native
  /** Holds all the options related to priority settings of the Schedule.
    */
  var prioritySettings: js.UndefOr[PrioritySettings] = js.native
  /** Triggers every time before the elements of the scheduler such as work cells, time cells or header cells and so on renders or re-renders on a page.
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.native
  /** When set to true, disables the interaction with the Schedule appointments, simply allowing the date and view navigation to occur.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Triggers when the reminder is raised for an appointment based on the alertBefore value.
    */
  var reminder: js.UndefOr[js.Function1[/* e */ ReminderEventArgs, Unit]] = js.native
  /** Holds all the options related to reminder settings of the Schedule.
    */
  var reminderSettings: js.UndefOr[ReminderSettings] = js.native
  /** Defines the specific start and end dates to be rendered in the Schedule control. To render such user-specified custom date ranges in the Schedule control, set the currentView
    * property to ej.Schedule.CurrentView.CustomView.
    * @Default {null}
    */
  var renderDates: js.UndefOr[RenderDates] = js.native
  /** Triggers while resizing the appointment.
    */
  var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, Unit]] = js.native
  /** Triggers when the appointment resizing begins.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.native
  /** Triggers when an appointment resizing stops.
    */
  var resizeStop: js.UndefOr[js.Function1[/* e */ ResizeStopEventArgs, Unit]] = js.native
  /** Template design that applies on the Schedule resource header.
    * @Default {null}
    */
  var resourceHeaderTemplateId: js.UndefOr[String] = js.native
  /** Holds all the options related to the resources settings of the Schedule. It is a collection of one or more resource objects, where the levels of resources are rendered on the
    * Schedule based on the order of the resource data provided within this collection.
    * @Default {null}
    */
  var resources: js.UndefOr[js.Array[Resource]] = js.native
  /** When set to true, displays the all-day row cells on the Schedule.
    * @Default {true}
    */
  var showAllDayRow: js.UndefOr[Boolean] = js.native
  /** When set to true, shows the previous/next appointment navigator button on the Scheduler.
    * @Default {true}
    */
  var showAppointmentNavigator: js.UndefOr[Boolean] = js.native
  /** When set to true, displays the current time indicator on the Schedule.
    * @Default {true}
    */
  var showCurrentTimeIndicator: js.UndefOr[Boolean] = js.native
  /** When set to true, shows the delete confirmation dialog before deleting an appointment.
    * @Default {true}
    */
  var showDeleteConfirmationDialog: js.UndefOr[Boolean] = js.native
  /** When set to true, displays the header bar on the Schedule.
    * @Default {true}
    */
  var showHeaderBar: js.UndefOr[Boolean] = js.native
  /** When set to true, displays the location field additionally on Schedule appointment window.
    * @Default {false}
    */
  var showLocationField: js.UndefOr[Boolean] = js.native
  /** When set to true, displays the other months days from the current month on the Schedule.
    * @Default {true}
    */
  var showNextPrevMonth: js.UndefOr[Boolean] = js.native
  /** when set to false, allows the height of the work-cells to adjust automatically (either expand or collapse) based on the number of appointment count it has.
    * @Default {true}
    */
  var showOverflowButton: js.UndefOr[Boolean] = js.native
  /** When set to true, displays the quick window for every single click made on the Schedule cells or appointments.
    * @Default {true}
    */
  var showQuickWindow: js.UndefOr[Boolean] = js.native
  /** When set to false, doesn't render the start and end timezone fields on the Schedule appointment window.
    * @Default {true}
    */
  var showTimeZoneFields: js.UndefOr[Boolean] = js.native
  /** When set to false, hides the weekend days on all the Scheduler views.
    * @Default {true}
    */
  var showWeekend: js.UndefOr[Boolean] = js.native
  /** Sets the start hour time range to be displayed on the Schedule.
    * @Default {0}
    */
  var startHour: js.UndefOr[Double] = js.native
  /** Sets either 12 or 24 hour time mode on the Schedule. It accepts either the string value(&quot;12&quot; or &quot;24&quot;) or the below mentioned enum values. The enum values that
    * are accepted by timeMode(ej.Schedule.TimeMode) are as follows,
    * @Default {null}
    */
  var timeMode: js.UndefOr[String | TimeMode] = js.native
  /** Holds all the options related to the time scale of Scheduler. The timeslots either major or minor slots can be customized with this property.
    */
  var timeScale: js.UndefOr[TimeScale] = js.native
  /** Sets the timezone for the Schedule.
    * @Default {null}
    */
  var timeZone: js.UndefOr[String] = js.native
  /** Sets the collection of timezone items to be bound to the Schedule. Only the items bound to this property gets listed out in the timezone field of the appointment window.
    */
  var timeZoneCollection: js.UndefOr[TimeZoneCollection] = js.native
  /** Allows to pop-up appointment details in a tooltip while hovering over the appointments.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.native
  /** Defines the view collection to be displayed on the Schedule. By default, it displays all the views namely, Day, Week, WorkWeek and Month.
    * @Default {[Day, Week, WorkWeek, Month, Agenda]}
    */
  var views: js.UndefOr[js.Array[_]] = js.native
  /** Sets the width of the Schedule. Accepts both pixel and percentage values.
    * @Default {100%}
    */
  var width: js.UndefOr[String] = js.native
  /** Accepts the id value of the template layout defined for the work cells and month cells.
    * @Default {null}
    */
  var workCellsTemplateId: js.UndefOr[String] = js.native
  /** To define the work hours within the Schedule control.
    */
  var workHours: js.UndefOr[WorkHours] = js.native
  /** Sets different day collection within workWeek view.
    * @Default {[Monday, Tuesday, Wednesday, Thursday, Friday]}
    */
  var workWeek: js.UndefOr[js.Array[_]] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAgendaViewSettings(value: AgendaViewSettings): Self = {
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
    def withAllDayCellsTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayCellsTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDayCellsTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayCellsTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInline")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowKeyboardNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentChanged(value: /* e */ AppointmentChangedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppointmentChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentClick(value: /* e */ AppointmentClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppointmentClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentClick")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentCreated(value: /* e */ AppointmentCreatedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCreated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppointmentCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentDragArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDragArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentDragArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDragArea")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentHover(value: /* e */ AppointmentHoverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppointmentHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentHover")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentRemoved(value: /* e */ AppointmentRemovedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppointmentRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentSettings(value: AppointmentSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentWindowOpen(value: /* e */ AppointmentWindowOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentWindowOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppointmentWindowOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentWindowOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeAppointmentChange(value: /* e */ BeforeAppointmentChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAppointmentChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeAppointmentChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAppointmentChange")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeAppointmentCreate(value: /* e */ BeforeAppointmentCreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAppointmentCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeAppointmentCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAppointmentCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeAppointmentRemove(value: /* e */ BeforeAppointmentRemoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAppointmentRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeAppointmentRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAppointmentRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeContextMenuOpen(value: /* e */ BeforeContextMenuOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeContextMenuOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeContextMenuOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeContextMenuOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockoutSettings(value: BlockoutSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockoutSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockoutSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCategorizeSettings(value: CategorizeSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categorizeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategorizeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categorizeSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCellClick(value: /* e */ CellClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCellDoubleClick(value: /* e */ CellDoubleClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCellHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCellHover(value: /* e */ CellHoverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHover")(js.undefined)
        ret
    }
    @scala.inline
    def withCellWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuSettings(value: ContextMenuSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentView(value: String | CurrentView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentView")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDateHeaderTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateHeaderTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateHeaderTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateHeaderTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: /* e */ DragEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStart(value: /* e */ DragStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStop(value: /* e */ DragStopEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAppointmentResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAppointmentResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAppointmentResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAppointmentResize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLoadOnDemand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLoadOnDemand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLoadOnDemand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLoadOnDemand")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRecurrenceValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRecurrenceValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRecurrenceValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRecurrenceValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withEndHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endHour")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: Group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
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
    def withIsDST(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDST")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyDown(value: /* e */ KeyDownEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
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
    def withMaxDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItemClick(value: /* e */ MenuItemClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMenuItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigation(value: /* e */ NavigationEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String | Orientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowButtonClick(value: /* e */ OverflowButtonClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOverflowButtonClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowButtonHover(value: /* e */ OverflowButtonHoverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOverflowButtonHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonHover")(js.undefined)
        ret
    }
    @scala.inline
    def withPrioritySettings(value: PrioritySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prioritySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrioritySettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prioritySettings")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCellInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQueryCellInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCellInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withReminder(value: /* e */ ReminderEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReminder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminder")(js.undefined)
        ret
    }
    @scala.inline
    def withReminderSettings(value: ReminderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminderSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderDates(value: RenderDates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDates")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: /* e */ ResizeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResizeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeStop(value: /* e */ ResizeStopEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResizeStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStop")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceHeaderTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceHeaderTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceHeaderTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceHeaderTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Array[Resource]): Self = {
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
    def withShowAllDayRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllDayRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAllDayRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllDayRow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAppointmentNavigator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAppointmentNavigator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAppointmentNavigator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAppointmentNavigator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCurrentTimeIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCurrentTimeIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCurrentTimeIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCurrentTimeIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDeleteConfirmationDialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDeleteConfirmationDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDeleteConfirmationDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDeleteConfirmationDialog")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeaderBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeaderBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderBar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLocationField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLocationField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLocationField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLocationField")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNextPrevMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNextPrevMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNextPrevMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNextPrevMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOverflowButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverflowButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOverflowButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverflowButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowQuickWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showQuickWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowQuickWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showQuickWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTimeZoneFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTimeZoneFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTimeZoneFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTimeZoneFields")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeekend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeekend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekend")(js.undefined)
        ret
    }
    @scala.inline
    def withStartHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHour")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeMode(value: String | TimeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeScale(value: TimeScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeScale")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZoneCollection(value: TimeZoneCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZoneCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipSettings(value: TooltipSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipSettings")(js.undefined)
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
    def withWidth(value: String): Self = {
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
    @scala.inline
    def withWorkCellsTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workCellsTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkCellsTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workCellsTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkHours(value: WorkHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workHours")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkWeek(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeek")(js.undefined)
        ret
    }
  }
  
}

