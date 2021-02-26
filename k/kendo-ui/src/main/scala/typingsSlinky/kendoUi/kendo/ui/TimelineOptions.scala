package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineOptions extends StObject {
  
  var actionClick: js.UndefOr[js.Function1[/* e */ TimelineActionClickEvent, Unit]] = js.native
  
  var alternatingMode: js.UndefOr[Boolean] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ TimelineChangeEvent, Unit]] = js.native
  
  var collapse: js.UndefOr[js.Function1[/* e */ TimelineCollapseEvent, Unit]] = js.native
  
  var collapsibleEvents: js.UndefOr[Boolean] = js.native
  
  var dataActionsField: js.UndefOr[String] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ TimelineDataBoundEvent, Unit]] = js.native
  
  var dataDateField: js.UndefOr[String] = js.native
  
  var dataDescriptionField: js.UndefOr[String] = js.native
  
  var dataImagesField: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[DataSource | js.Any] = js.native
  
  var dataSubTitleField: js.UndefOr[String] = js.native
  
  var dataTitleField: js.UndefOr[String] = js.native
  
  var dateformat: js.UndefOr[String] = js.native
  
  var eventHeight: js.UndefOr[Double] = js.native
  
  var eventTemplate: js.UndefOr[String | js.Function] = js.native
  
  var eventWidth: js.UndefOr[Double] = js.native
  
  var expand: js.UndefOr[js.Function1[/* e */ TimelineExpandEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var navigate: js.UndefOr[js.Function1[/* e */ TimelineNavigateEvent, Unit]] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var showDateLabels: js.UndefOr[Boolean] = js.native
}
object TimelineOptions {
  
  @scala.inline
  def apply(): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineOptions]
  }
  
  @scala.inline
  implicit class TimelineOptionsMutableBuilder[Self <: TimelineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionClick(value: /* e */ TimelineActionClickEvent => Unit): Self = StObject.set(x, "actionClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActionClickUndefined: Self = StObject.set(x, "actionClick", js.undefined)
    
    @scala.inline
    def setAlternatingMode(value: Boolean): Self = StObject.set(x, "alternatingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternatingModeUndefined: Self = StObject.set(x, "alternatingMode", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ TimelineChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setCollapse(value: /* e */ TimelineCollapseEvent => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setCollapsibleEvents(value: Boolean): Self = StObject.set(x, "collapsibleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleEventsUndefined: Self = StObject.set(x, "collapsibleEvents", js.undefined)
    
    @scala.inline
    def setDataActionsField(value: String): Self = StObject.set(x, "dataActionsField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataActionsFieldUndefined: Self = StObject.set(x, "dataActionsField", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ TimelineDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataDateField(value: String): Self = StObject.set(x, "dataDateField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDateFieldUndefined: Self = StObject.set(x, "dataDateField", js.undefined)
    
    @scala.inline
    def setDataDescriptionField(value: String): Self = StObject.set(x, "dataDescriptionField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDescriptionFieldUndefined: Self = StObject.set(x, "dataDescriptionField", js.undefined)
    
    @scala.inline
    def setDataImagesField(value: String): Self = StObject.set(x, "dataImagesField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataImagesFieldUndefined: Self = StObject.set(x, "dataImagesField", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource | js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSubTitleField(value: String): Self = StObject.set(x, "dataSubTitleField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSubTitleFieldUndefined: Self = StObject.set(x, "dataSubTitleField", js.undefined)
    
    @scala.inline
    def setDataTitleField(value: String): Self = StObject.set(x, "dataTitleField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTitleFieldUndefined: Self = StObject.set(x, "dataTitleField", js.undefined)
    
    @scala.inline
    def setDateformat(value: String): Self = StObject.set(x, "dateformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateformatUndefined: Self = StObject.set(x, "dateformat", js.undefined)
    
    @scala.inline
    def setEventHeight(value: Double): Self = StObject.set(x, "eventHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventHeightUndefined: Self = StObject.set(x, "eventHeight", js.undefined)
    
    @scala.inline
    def setEventTemplate(value: String | js.Function): Self = StObject.set(x, "eventTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTemplateUndefined: Self = StObject.set(x, "eventTemplate", js.undefined)
    
    @scala.inline
    def setEventWidth(value: Double): Self = StObject.set(x, "eventWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventWidthUndefined: Self = StObject.set(x, "eventWidth", js.undefined)
    
    @scala.inline
    def setExpand(value: /* e */ TimelineExpandEvent => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNavigate(value: /* e */ TimelineNavigateEvent => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setShowDateLabels(value: Boolean): Self = StObject.set(x, "showDateLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDateLabelsUndefined: Self = StObject.set(x, "showDateLabels", js.undefined)
  }
}
