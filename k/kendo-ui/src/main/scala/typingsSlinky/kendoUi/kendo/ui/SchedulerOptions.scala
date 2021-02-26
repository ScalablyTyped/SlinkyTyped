package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.SchedulerDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerOptions extends StObject {
  
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
  implicit class SchedulerOptionsMutableBuilder[Self <: SchedulerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: /* e */ SchedulerAddEvent => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAllDayEventTemplate(value: String | js.Function): Self = StObject.set(x, "allDayEventTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllDayEventTemplateUndefined: Self = StObject.set(x, "allDayEventTemplate", js.undefined)
    
    @scala.inline
    def setAllDaySlot(value: Boolean): Self = StObject.set(x, "allDaySlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllDaySlotUndefined: Self = StObject.set(x, "allDaySlot", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ SchedulerCancelEvent => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ SchedulerChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setCurrentTimeMarker(value: Boolean | SchedulerCurrentTimeMarker): Self = StObject.set(x, "currentTimeMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeMarkerUndefined: Self = StObject.set(x, "currentTimeMarker", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ SchedulerDataBindingEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ SchedulerDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | SchedulerDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "dateHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateHeaderTemplateUndefined: Self = StObject.set(x, "dateHeaderTemplate", js.undefined)
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setEdit(value: /* e */ SchedulerEditEvent => Unit): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean | SchedulerEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setEventTemplate(value: String | js.Function): Self = StObject.set(x, "eventTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTemplateUndefined: Self = StObject.set(x, "eventTemplate", js.undefined)
    
    @scala.inline
    def setFooter(value: Boolean | SchedulerFooter): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setGroup(value: SchedulerGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "groupHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupHeaderTemplateUndefined: Self = StObject.set(x, "groupHeaderTemplate", js.undefined)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMajorTick(value: Double): Self = StObject.set(x, "majorTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTickUndefined: Self = StObject.set(x, "majorTick", js.undefined)
    
    @scala.inline
    def setMajorTimeHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "majorTimeHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTimeHeaderTemplateUndefined: Self = StObject.set(x, "majorTimeHeaderTemplate", js.undefined)
    
    @scala.inline
    def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMessages(value: SchedulerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMinorTickCount(value: Double): Self = StObject.set(x, "minorTickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickCountUndefined: Self = StObject.set(x, "minorTickCount", js.undefined)
    
    @scala.inline
    def setMinorTimeHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "minorTimeHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTimeHeaderTemplateUndefined: Self = StObject.set(x, "minorTimeHeaderTemplate", js.undefined)
    
    @scala.inline
    def setMobile(value: Boolean | String): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    @scala.inline
    def setMove(value: /* e */ SchedulerMoveEvent => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveEnd(value: /* e */ SchedulerMoveEndEvent => Unit): Self = StObject.set(x, "moveEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveEndUndefined: Self = StObject.set(x, "moveEnd", js.undefined)
    
    @scala.inline
    def setMoveStart(value: /* e */ SchedulerMoveStartEvent => Unit): Self = StObject.set(x, "moveStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveStartUndefined: Self = StObject.set(x, "moveStart", js.undefined)
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNavigate(value: /* e */ SchedulerNavigateEvent => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    @scala.inline
    def setPdf(value: SchedulerPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfExport(value: /* e */ SchedulerPdfExportEvent => Unit): Self = StObject.set(x, "pdfExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPdfExportUndefined: Self = StObject.set(x, "pdfExport", js.undefined)
    
    @scala.inline
    def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ SchedulerRemoveEvent => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setResize(value: /* e */ SchedulerResizeEvent => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeEnd(value: /* e */ SchedulerResizeEndEvent => Unit): Self = StObject.set(x, "resizeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeEndUndefined: Self = StObject.set(x, "resizeEnd", js.undefined)
    
    @scala.inline
    def setResizeStart(value: /* e */ SchedulerResizeStartEvent => Unit): Self = StObject.set(x, "resizeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeStartUndefined: Self = StObject.set(x, "resizeStart", js.undefined)
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[SchedulerResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: SchedulerResource*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setSave(value: /* e */ SchedulerSaveEvent => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setShowWorkHours(value: Boolean): Self = StObject.set(x, "showWorkHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWorkHoursUndefined: Self = StObject.set(x, "showWorkHours", js.undefined)
    
    @scala.inline
    def setSnap(value: Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    @scala.inline
    def setToolbar(value: js.Array[SchedulerToolbarItem]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setToolbarVarargs(value: SchedulerToolbarItem*): Self = StObject.set(x, "toolbar", js.Array(value :_*))
    
    @scala.inline
    def setViews(value: js.Array[SchedulerView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    @scala.inline
    def setViewsVarargs(value: SchedulerView*): Self = StObject.set(x, "views", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWorkDayEnd(value: js.Date): Self = StObject.set(x, "workDayEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkDayEndUndefined: Self = StObject.set(x, "workDayEnd", js.undefined)
    
    @scala.inline
    def setWorkDayStart(value: js.Date): Self = StObject.set(x, "workDayStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkDayStartUndefined: Self = StObject.set(x, "workDayStart", js.undefined)
    
    @scala.inline
    def setWorkWeekEnd(value: Double): Self = StObject.set(x, "workWeekEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkWeekEndUndefined: Self = StObject.set(x, "workWeekEnd", js.undefined)
    
    @scala.inline
    def setWorkWeekStart(value: Double): Self = StObject.set(x, "workWeekStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkWeekStartUndefined: Self = StObject.set(x, "workWeekStart", js.undefined)
  }
}
