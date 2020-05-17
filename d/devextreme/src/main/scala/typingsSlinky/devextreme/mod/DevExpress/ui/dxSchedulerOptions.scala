package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.AgendaDuration
import typingsSlinky.devextreme.anon.AllowAdding
import typingsSlinky.devextreme.anon.AllowMultiple
import typingsSlinky.devextreme.anon.AppointmentCount
import typingsSlinky.devextreme.anon.AppointmentData
import typingsSlinky.devextreme.anon.AppointmentDataAppointmentElement
import typingsSlinky.devextreme.anon.AppointmentDataCancel
import typingsSlinky.devextreme.anon.AppointmentDataComponent
import typingsSlinky.devextreme.anon.AppointmentElement
import typingsSlinky.devextreme.anon.AutoScroll
import typingsSlinky.devextreme.anon.CellData
import typingsSlinky.devextreme.anon.CellDataCellElement
import typingsSlinky.devextreme.anon.ElementForm
import typingsSlinky.devextreme.anon.EndDate
import typingsSlinky.devextreme.anon.Form
import typingsSlinky.devextreme.anon.OldData
import typingsSlinky.devextreme.anon.TargetedAppointmentData
import typingsSlinky.devextreme.devextremeNumbers.`0`
import typingsSlinky.devextreme.devextremeNumbers.`1`
import typingsSlinky.devextreme.devextremeNumbers.`2`
import typingsSlinky.devextreme.devextremeNumbers.`3`
import typingsSlinky.devextreme.devextremeNumbers.`4`
import typingsSlinky.devextreme.devextremeNumbers.`5`
import typingsSlinky.devextreme.devextremeNumbers.`6`
import typingsSlinky.devextreme.devextremeStrings.agenda
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.dialog
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.occurrence
import typingsSlinky.devextreme.devextremeStrings.series
import typingsSlinky.devextreme.devextremeStrings.timelineDay
import typingsSlinky.devextreme.devextremeStrings.timelineMonth
import typingsSlinky.devextreme.devextremeStrings.timelineWeek
import typingsSlinky.devextreme.devextremeStrings.timelineWorkWeek
import typingsSlinky.devextreme.devextremeStrings.unlimited
import typingsSlinky.devextreme.devextremeStrings.week
import typingsSlinky.devextreme.devextremeStrings.workWeek
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSchedulerOptions extends WidgetOptions[dxScheduler] {
  /** Specifies whether the widget adapts to small screens. */
  var adaptivityEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the name of the data source item field whose value defines whether or not the corresponding appointment is an all-day appointment. */
  var allDayExpr: js.UndefOr[String] = js.native
  /** Specifies a custom template for cell overflow indicators. */
  var appointmentCollectorTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ AppointmentCount, 
      /* collectorElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Configures appointment reordering using drag and drop gestures. */
  var appointmentDragging: js.UndefOr[AutoScroll] = js.native
  /** Specifies a custom template for appointments. */
  var appointmentTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* model */ AppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Specifies a custom template for tooltips displayed when users click an appointment or cell overflow indicator. */
  var appointmentTooltipTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* model */ AppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Specifies cell duration in minutes. */
  var cellDuration: js.UndefOr[Double] = js.native
  /** Specifies whether or not an end-user can scroll the view in both directions at the same time. */
  var crossScrollingEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies a date displayed on the current scheduler view by default. */
  var currentDate: js.UndefOr[js.Date | Double | String] = js.native
  /** Specifies the currently displayed view. Accepts the view's name or type. */
  var currentView: js.UndefOr[
    agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
  ] = js.native
  /** Customizes the date navigator's text. */
  var customizeDateNavigatorText: js.UndefOr[js.Function1[/* info */ EndDate, String]] = js.native
  /** Specifies a custom template for table cells. */
  var dataCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[String | js.Array[dxSchedulerAppointment] | DataSource | DataSourceOptions] = js.native
  /** Specifies a custom template for day scale items. */
  var dateCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Specifies the date-time values' serialization format. Use it only if you do not specify the dataSource at design time. */
  var dateSerializationFormat: js.UndefOr[String] = js.native
  /** Specifies the name of the data source item field whose value holds the description of the corresponding appointment. */
  var descriptionExpr: js.UndefOr[String] = js.native
  /** @deprecated Use the appointmentTooltipTemplate option instead. */
  /** Specifies a custom template for tooltips displayed when users click a cell overflow indicator. */
  var dropDownAppointmentTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Specifies which editing operations an end-user can perform on appointments. */
  var editing: js.UndefOr[Boolean | AllowAdding] = js.native
  /** Specifies the name of the data source item field that defines the ending of an appointment. */
  var endDateExpr: js.UndefOr[String] = js.native
  /** Specifies the name of the data source item field that defines the timezone of the appointment end date. */
  var endDateTimeZoneExpr: js.UndefOr[String] = js.native
  /** Specifies the last hour on the time scale. Accepts integer values from 0 to 24. */
  var endDayHour: js.UndefOr[Double] = js.native
  /** Specifies the first day of a week. Does not apply to the agenda view. */
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  /** If true, appointments are grouped by date first and then by resource; opposite if false. Applies only if appointments are grouped and groupOrientation is "horizontal". */
  var groupByDate: js.UndefOr[Boolean] = js.native
  /** Specifies the resource kinds by which the scheduler's appointments are grouped in a timetable. */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /** Specifies the time interval between when the date-time indicator changes its position, in milliseconds. */
  var indicatorUpdateInterval: js.UndefOr[Double] = js.native
  /** The latest date the widget allows you to select. */
  var max: js.UndefOr[js.Date | Double | String] = js.native
  /** Specifies the limit of full-sized appointments displayed per cell. Applies to all views except "agenda". */
  var maxAppointmentsPerCell: js.UndefOr[Double | auto | unlimited] = js.native
  /** The earliest date the widget allows you to select. */
  var min: js.UndefOr[js.Date | Double | String] = js.native
  /** The text or HTML markup displayed by the widget if the item collection is empty. Available for the Agenda view only. */
  var noDataText: js.UndefOr[String] = js.native
  /** A function that is executed after an appointment is added to the data source. */
  var onAppointmentAdded: js.UndefOr[js.Function1[/* e */ AppointmentDataComponent, _]] = js.native
  /** A function that is executed before an appointment is added to the data source. */
  var onAppointmentAdding: js.UndefOr[js.Function1[/* e */ AppointmentDataCancel, _]] = js.native
  /** A function that is executed when an appointment is clicked or tapped. */
  var onAppointmentClick: js.UndefOr[(js.Function1[/* e */ AppointmentElement, _]) | String] = js.native
  /** A function that is executed when a user attempts to open the browser's context menu for an appointment. Allows you to replace this context menu with a custom context menu. */
  var onAppointmentContextMenu: js.UndefOr[(js.Function1[/* e */ TargetedAppointmentData, _]) | String] = js.native
  /** A function that is executed when an appointment is double-clicked or double-tapped. */
  var onAppointmentDblClick: js.UndefOr[(js.Function1[/* e */ AppointmentElement, _]) | String] = js.native
  /** A function that is executed after an appointment is deleted from the data source. */
  var onAppointmentDeleted: js.UndefOr[js.Function1[/* e */ AppointmentDataComponent, _]] = js.native
  /** A function that is executed before an appointment is deleted from the data source. */
  var onAppointmentDeleting: js.UndefOr[js.Function1[/* e */ AppointmentDataCancel, _]] = js.native
  /** @deprecated Use the onAppointmentFormOpening option instead. */
  /** A function that is executed before an appointment details form is opened. */
  var onAppointmentFormCreated: js.UndefOr[js.Function1[/* e */ Form, _]] = js.native
  /** A function that is executed before an appointment details form is opened. */
  var onAppointmentFormOpening: js.UndefOr[js.Function1[/* e */ ElementForm, _]] = js.native
  /** A function that is executed when an appointment is rendered. */
  var onAppointmentRendered: js.UndefOr[js.Function1[/* e */ AppointmentDataAppointmentElement, _]] = js.native
  /** A function that is executed after an appointment is updated in the data source. */
  var onAppointmentUpdated: js.UndefOr[js.Function1[/* e */ AppointmentDataComponent, _]] = js.native
  /** A function that is executed before an appointment is updated in the data source. */
  var onAppointmentUpdating: js.UndefOr[js.Function1[/* e */ OldData, _]] = js.native
  /** A function that is executed when a view cell is clicked. */
  var onCellClick: js.UndefOr[(js.Function1[/* e */ CellData, _]) | String] = js.native
  /** A function that is executed when a user attempts to open the browser's context menu for a cell. Allows you to replace this context menu with a custom context menu. */
  var onCellContextMenu: js.UndefOr[(js.Function1[/* e */ CellDataCellElement, _]) | String] = js.native
  /** Specifies the edit mode for recurring appointments. */
  var recurrenceEditMode: js.UndefOr[dialog | occurrence | series] = js.native
  /** Specifies the name of the data source item field that defines exceptions for the current recurring appointment. */
  var recurrenceExceptionExpr: js.UndefOr[String] = js.native
  /** Specifies the name of the data source item field that defines a recurrence rule for generating recurring appointments. */
  var recurrenceRuleExpr: js.UndefOr[String] = js.native
  /** Specifies whether filtering is performed on the server or client side. */
  var remoteFiltering: js.UndefOr[Boolean] = js.native
  /** Specifies a custom template for resource headers. */
  var resourceCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Specifies an array of resources available in the scheduler. */
  var resources: js.UndefOr[js.Array[AllowMultiple]] = js.native
  /** Currently selected cells' data. */
  var selectedCellData: js.UndefOr[js.Array[_]] = js.native
  /** Specifies whether to apply shading to cover the timetable up to the current time. */
  var shadeUntilCurrentTime: js.UndefOr[Boolean] = js.native
  /** Specifies the "All-day" panel's visibility. Setting this option to false hides the panel along with the all-day appointments. */
  var showAllDayPanel: js.UndefOr[Boolean] = js.native
  /** Specifies the current date-time indicator's visibility. */
  var showCurrentTimeIndicator: js.UndefOr[Boolean] = js.native
  /** Specifies the name of the data source item field that defines the start of an appointment. */
  var startDateExpr: js.UndefOr[String] = js.native
  /** Specifies the name of the data source item field that defines the timezone of the appointment start date. */
  var startDateTimeZoneExpr: js.UndefOr[String] = js.native
  /** Specifies the first hour on the time scale. Accepts integer values from 0 to 24. */
  var startDayHour: js.UndefOr[Double] = js.native
  /** Specifies the name of the data source item field that holds the subject of an appointment. */
  var textExpr: js.UndefOr[String] = js.native
  /** Specifies a custom template for time scale items. */
  var timeCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Specifies the timezone of the widget. */
  var timeZone: js.UndefOr[String] = js.native
  /** Specifies whether a user can switch views using tabs or a drop-down menu. */
  var useDropDownViewSwitcher: js.UndefOr[Boolean] = js.native
  /** Specifies and configures the views to be available in the view switcher. */
  var views: js.UndefOr[
    js.Array[
      day | week | workWeek | month | timelineDay | timelineWeek | timelineWorkWeek | timelineMonth | agenda | AgendaDuration
    ]
  ] = js.native
}

object dxSchedulerOptions {
  @scala.inline
  def apply(): dxSchedulerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSchedulerOptions]
  }
  @scala.inline
  implicit class dxSchedulerOptionsOps[Self <: dxSchedulerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptivityEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptivityEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptivityEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptivityEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAllDayExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDayExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentCollectorTemplateFunction2(
      value: (/* data */ AppointmentCount, /* collectorElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCollectorTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAppointmentCollectorTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCollectorTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentCollectorTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
          /* data */ AppointmentCount, 
          /* collectorElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCollectorTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentCollectorTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCollectorTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentDragging(value: AutoScroll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentTemplateFunction3(
      value: (/* model */ AppointmentData, /* itemIndex */ Double, /* contentElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAppointmentTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* model */ AppointmentData, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentTooltipTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentTooltipTemplateFunction3(
      value: (/* model */ AppointmentData, /* itemIndex */ Double, /* contentElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTooltipTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAppointmentTooltipTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* model */ AppointmentData, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withCellDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossScrollingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossScrollingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossScrollingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossScrollingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentDate(value: js.Date | Double | String): Self = {
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
    def withCurrentView(
      value: agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
    ): Self = {
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
    def withCustomizeDateNavigatorText(value: /* info */ EndDate => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeDateNavigatorText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeDateNavigatorText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeDateNavigatorText")(js.undefined)
        ret
    }
    @scala.inline
    def withDataCellTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCellTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDataCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | js.Array[dxSchedulerAppointment] | DataSource | DataSourceOptions): Self = {
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
    def withDateCellTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDateCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDateSerializationFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSerializationFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateSerializationFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSerializationFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownAppointmentTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAppointmentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropDownAppointmentTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* contentElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAppointmentTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDropDownAppointmentTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAppointmentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownAppointmentTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAppointmentTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEditing(value: Boolean | AllowAdding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDateExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateTimeZoneExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateTimeZoneExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDateTimeZoneExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateTimeZoneExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDayHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDayHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDayHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDayHour")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = {
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
    def withGroupByDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByDate")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorUpdateInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorUpdateInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorUpdateInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorUpdateInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: js.Date | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAppointmentsPerCell(value: Double | auto | unlimited): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAppointmentsPerCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAppointmentsPerCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAppointmentsPerCell")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: js.Date | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDataText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDataText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppointmentAdded(value: /* e */ AppointmentDataComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentAdded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAppointmentAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppointmentAdding(value: /* e */ AppointmentDataCancel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentAdding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAppointmentAdding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentAdding")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppointmentClickFunction1(value: /* e */ AppointmentElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAppointmentClick(value: (js.Function1[/* e */ AppointmentElement, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAppointmentClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppointmentContextMenuFunction1(value: /* e */ TargetedAppointmentData => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAppointmentContextMenu(value: (js.Function1[/* e */ TargetedAppointmentData, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAppointmentContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppointmentDblClickFunction1(value: /* e */ AppointmentElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentDblClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAppointmentDblClick(value: (js.Function1[/* e */ AppointmentElement, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentDblClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAppointmentDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppointmentDeleted(value: /* e */ AppointmentDataComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentDeleted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAppointmentDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppointmentDeleting(value: /* e */ AppointmentDataCancel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentDeleting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAppointmentDeleting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentDeleting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppointmentFormCreated(value: /* e */ Form => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentFormCreated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAppointmentFormCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentFormCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppointmentFormOpening(value: /* e */ ElementForm => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentFormOpening")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAppointmentFormOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentFormOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppointmentRendered(value: /* e */ AppointmentDataAppointmentElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAppointmentRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppointmentUpdated(value: /* e */ AppointmentDataComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAppointmentUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppointmentUpdating(value: /* e */ OldData => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentUpdating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAppointmentUpdating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppointmentUpdating")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellClickFunction1(value: /* e */ CellData => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCellClick(value: (js.Function1[/* e */ CellData, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellContextMenuFunction1(value: /* e */ CellDataCellElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCellContextMenu(value: (js.Function1[/* e */ CellDataCellElement, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCellContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrenceEditMode(value: dialog | occurrence | series): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceEditMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrenceEditMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceEditMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrenceExceptionExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceExceptionExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrenceExceptionExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceExceptionExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrenceRuleExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceRuleExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrenceRuleExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceRuleExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceCellTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCellTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withResourceCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Array[AllowMultiple]): Self = {
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
    def withSelectedCellData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCellData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedCellData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCellData")(js.undefined)
        ret
    }
    @scala.inline
    def withShadeUntilCurrentTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadeUntilCurrentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadeUntilCurrentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadeUntilCurrentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAllDayPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllDayPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAllDayPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllDayPanel")(js.undefined)
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
    def withStartDateExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateTimeZoneExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTimeZoneExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateTimeZoneExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTimeZoneExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDayHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDayHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDayHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDayHour")(js.undefined)
        ret
    }
    @scala.inline
    def withTextExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeCellTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCellTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTimeCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCellTemplate")(js.undefined)
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
    def withUseDropDownViewSwitcher(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDropDownViewSwitcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDropDownViewSwitcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDropDownViewSwitcher")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(
      value: js.Array[
          day | week | workWeek | month | timelineDay | timelineWeek | timelineWorkWeek | timelineMonth | agenda | AgendaDuration
        ]
    ): Self = {
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
  }
  
}

