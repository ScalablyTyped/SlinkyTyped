package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.SchedulerDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerOptions extends js.Object {
  var add: js.UndefOr[js.Function1[/* e */ SchedulerAddEvent, Unit]] = js.native
  var allDayEventTemplate: js.UndefOr[String | js.Function] = js.native
  var allDaySlot: js.UndefOr[Boolean] = js.native
  var autoBind: js.UndefOr[Boolean] = js.native
  var cancel: js.UndefOr[js.Function1[/* e */ SchedulerCancelEvent, Unit]] = js.native
  var change: js.UndefOr[js.Function1[/* e */ SchedulerChangeEvent, Unit]] = js.native
  var currentTimeMarker: js.UndefOr[Boolean | SchedulerCurrentTimeMarker] = js.native
  var dataBinding: js.UndefOr[js.Function1[/* e */ SchedulerDataBindingEvent, Unit]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ SchedulerDataBoundEvent, Unit]] = js.native
  var dataSource: js.UndefOr[js.Any | SchedulerDataSource] = js.native
  var date: js.UndefOr[js.Date] = js.native
  var dateHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var edit: js.UndefOr[js.Function1[/* e */ SchedulerEditEvent, Unit]] = js.native
  var editable: js.UndefOr[Boolean | SchedulerEditable] = js.native
  var endTime: js.UndefOr[js.Date] = js.native
  var eventTemplate: js.UndefOr[String | js.Function] = js.native
  var footer: js.UndefOr[Boolean | SchedulerFooter] = js.native
  var group: js.UndefOr[SchedulerGroup] = js.native
  var groupHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var majorTick: js.UndefOr[Double] = js.native
  var majorTimeHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var max: js.UndefOr[js.Date] = js.native
  var messages: js.UndefOr[SchedulerMessages] = js.native
  var min: js.UndefOr[js.Date] = js.native
  var minorTickCount: js.UndefOr[Double] = js.native
  var minorTimeHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var mobile: js.UndefOr[Boolean | String] = js.native
  var move: js.UndefOr[js.Function1[/* e */ SchedulerMoveEvent, Unit]] = js.native
  var moveEnd: js.UndefOr[js.Function1[/* e */ SchedulerMoveEndEvent, Unit]] = js.native
  var moveStart: js.UndefOr[js.Function1[/* e */ SchedulerMoveStartEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var navigate: js.UndefOr[js.Function1[/* e */ SchedulerNavigateEvent, Unit]] = js.native
  var pdf: js.UndefOr[SchedulerPdf] = js.native
  var pdfExport: js.UndefOr[js.Function1[/* e */ SchedulerPdfExportEvent, Unit]] = js.native
  var remove: js.UndefOr[js.Function1[/* e */ SchedulerRemoveEvent, Unit]] = js.native
  var resize: js.UndefOr[js.Function1[/* e */ SchedulerResizeEvent, Unit]] = js.native
  var resizeEnd: js.UndefOr[js.Function1[/* e */ SchedulerResizeEndEvent, Unit]] = js.native
  var resizeStart: js.UndefOr[js.Function1[/* e */ SchedulerResizeStartEvent, Unit]] = js.native
  var resources: js.UndefOr[js.Array[SchedulerResource]] = js.native
  var save: js.UndefOr[js.Function1[/* e */ SchedulerSaveEvent, Unit]] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var showWorkHours: js.UndefOr[Boolean] = js.native
  var snap: js.UndefOr[Boolean] = js.native
  var startTime: js.UndefOr[js.Date] = js.native
  var timezone: js.UndefOr[String] = js.native
  var toolbar: js.UndefOr[js.Array[SchedulerToolbarItem]] = js.native
  var views: js.UndefOr[js.Array[SchedulerView]] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var workDayEnd: js.UndefOr[js.Date] = js.native
  var workDayStart: js.UndefOr[js.Date] = js.native
  var workWeekEnd: js.UndefOr[Double] = js.native
  var workWeekStart: js.UndefOr[Double] = js.native
}

object SchedulerOptions {
  @scala.inline
  def apply(): SchedulerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerOptions]
  }
  @scala.inline
  implicit class SchedulerOptionsOps[Self <: SchedulerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: /* e */ SchedulerAddEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAllDayEventTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayEventTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDayEventTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayEventTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withAllDaySlot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDaySlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDaySlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDaySlot")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoBind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: /* e */ SchedulerCancelEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ SchedulerChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTimeMarker(value: Boolean | SchedulerCurrentTimeMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTimeMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTimeMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTimeMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBinding(value: /* e */ SchedulerDataBindingEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: /* e */ SchedulerDataBoundEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any | SchedulerDataSource): Self = {
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
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDateHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEdit(value: /* e */ SchedulerEditEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean | SchedulerEditable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: Boolean | SchedulerFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: SchedulerGroup): Self = {
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
    def withGroupHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
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
    def withMajorTick(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTick")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTimeHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTimeHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTimeHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTimeHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: js.Date): Self = {
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
    def withMessages(value: SchedulerMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: js.Date): Self = {
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
    def withMinorTickCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTimeHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTimeHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTimeHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTimeHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: /* e */ SchedulerMoveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveEnd(value: /* e */ SchedulerMoveEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMoveEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveStart(value: /* e */ SchedulerMoveStartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMoveStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveStart")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigate(value: /* e */ SchedulerNavigateEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNavigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(js.undefined)
        ret
    }
    @scala.inline
    def withPdf(value: SchedulerPdf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(js.undefined)
        ret
    }
    @scala.inline
    def withPdfExport(value: /* e */ SchedulerPdfExportEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfExport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPdfExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfExport")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* e */ SchedulerRemoveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: /* e */ SchedulerResizeEvent => Unit): Self = {
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
    def withResizeEnd(value: /* e */ SchedulerResizeEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResizeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeStart(value: /* e */ SchedulerResizeStartEvent => Unit): Self = {
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
    def withResources(value: js.Array[SchedulerResource]): Self = {
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
    def withSave(value: /* e */ SchedulerSaveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWorkHours(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWorkHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWorkHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWorkHours")(js.undefined)
        ret
    }
    @scala.inline
    def withSnap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: js.Array[SchedulerToolbarItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: js.Array[SchedulerView]): Self = {
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
    def withWidth(value: Double | String): Self = {
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
    def withWorkDayEnd(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workDayEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkDayEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workDayEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkDayStart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workDayStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkDayStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workDayStart")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkWeekEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeekEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkWeekEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeekEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkWeekStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeekStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkWeekStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeekStart")(js.undefined)
        ret
    }
  }
  
}

