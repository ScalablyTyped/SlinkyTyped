package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotDataSelector
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A function that will be called to determine if an item can be moved in or dropped on an area of the data selector.
    *
    * paramType="string" The location where the item will be moved - igPivotGrid, igPivotDataSelector, filters, rows, columns or measures.
    * paramType="string" The type of the item - Hierarchy, Measure or MeasureList.
    * paramType="string" The unique name of the item.
    * returnType="bool"  The function must return true if the item should be accepted.
    */
  var customMoveValidation: js.UndefOr[js.Function] = js.native
  
  /**
    * Fired after the data selector is rendered. Changing the data source instance will re-render the data selector.
    */
  var dataSelectorRendered: js.UndefOr[DataSelectorRenderedEvent] = js.native
  
  /**
    * An instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
    *
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired after the data source has initialized.
    */
  var dataSourceInitialized: js.UndefOr[DataSourceInitializedEvent] = js.native
  
  /**
    * An object that will be used to create an instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
    * The provided value must contain an object with settings for one of the data source types - xmlaOptions or flatDataOptions.
    *
    */
  var dataSourceOptions: js.UndefOr[IgPivotDataSelectorDataSourceOptions] = js.native
  
  /**
    * Fired after the data source has updated.
    */
  var dataSourceUpdated: js.UndefOr[DataSourceUpdatedEvent] = js.native
  
  /**
    * Setting deferUpdate to true will not apply changes to the data source until the update method is called or the update layout button is clicked.
    *
    */
  var deferUpdate: js.UndefOr[Boolean] = js.native
  
  /**
    * Fired when the defer update checkbox changes.
    */
  var deferUpdateChanged: js.UndefOr[DeferUpdateChangedEvent] = js.native
  
  /**
    * Disable the drag and drop for the columns drop area and the ability to use filtering and remove items from it.
    *
    */
  var disableColumnsDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the drag and drop for the filters drop area and the ability to use filtering and remove items from it.
    *
    */
  var disableFiltersDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the drag and drop for the measures drop area and the ability to use filtering and remove items from it.
    *
    */
  var disableMeasuresDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the drag and drop for the rows drop area and the ability to use filtering and remove items from it.
    *
    */
  var disableRowsDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Fired on drag. Return false to cancel the dragging.
    */
  var drag: js.UndefOr[DragEvent] = js.native
  
  /**
    * Settings for the drag and drop functionality of the igPivotDataSelector.
    *
    */
  var dragAndDropSettings: js.UndefOr[IgPivotDataSelectorDragAndDropSettings] = js.native
  
  /**
    * Fired on drag start. Return false to cancel the drag.
    */
  var dragStart: js.UndefOr[DragStartEvent] = js.native
  
  /**
    * Fired on drag stop.
    */
  var dragStop: js.UndefOr[DragStopEvent] = js.native
  
  /**
    * Specifies the parent for the drop downs.
    */
  var dropDownParent: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired after the filter members drop down closes.
    */
  var filterDropDownClosed: js.UndefOr[FilterDropDownClosedEvent] = js.native
  
  /**
    * Fired before the filter members drop down closes. Return false to cancel the closing.
    */
  var filterDropDownClosing: js.UndefOr[FilterDropDownClosingEvent] = js.native
  
  /**
    * Fired after the OK button in the filter members drop down is clicked. Return false to cancel the applying of the filters.
    */
  var filterDropDownOk: js.UndefOr[FilterDropDownOkEvent] = js.native
  
  /**
    * Fired after the filter members drop down opens.
    */
  var filterDropDownOpened: js.UndefOr[FilterDropDownOpenedEvent] = js.native
  
  /**
    * Fired before the filter members drop down opens. Return false to cancel the opening.
    */
  var filterDropDownOpening: js.UndefOr[FilterDropDownOpeningEvent] = js.native
  
  /**
    * Fired after the filter members are loaded.
    */
  var filterMembersLoaded: js.UndefOr[FilterMembersLoadedEvent] = js.native
  
  /**
    * This is the total height of the grid, including all UI elements - scroll container with data rows, header, footer, filter row -  (if any), etc.
    *
    *
    * Valid values:
    * "string" The widget height can be set in pixels (px) and percentage (%).
    * "number" The widget height can be set as a number.
    * "null" will stretch vertically to fit data, if no other heights are defined.
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
    * Fired after a metadata item drop.
    */
  var metadataDropped: js.UndefOr[MetadataDroppedEvent] = js.native
  
  /**
    * Fired before a metadata item drop. Return false to cancel the drop.
    */
  var metadataDropping: js.UndefOr[MetadataDroppingEvent] = js.native
  
  /**
    * Fired after a metadata item is removed when the user clicks the close icon.
    */
  var metadataRemoved: js.UndefOr[MetadataRemovedEvent] = js.native
  
  /**
    * Fired before a metadata item is removed when the user clicks the close icon. Return false to cancel the removing.
    */
  var metadataRemoving: js.UndefOr[MetadataRemovingEvent] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    *
    *
    * Valid values:
    * "string" The widget width can be set in pixels (px) and percentage (%). The recommended width is 250px.
    * "number" The widget width can be set as a number.
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.native
}
object IgPivotDataSelector {
  
  @scala.inline
  def apply(): IgPivotDataSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelector]
  }
  
  @scala.inline
  implicit class IgPivotDataSelectorMutableBuilder[Self <: IgPivotDataSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomMoveValidation(value: js.Function): Self = StObject.set(x, "customMoveValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMoveValidationUndefined: Self = StObject.set(x, "customMoveValidation", js.undefined)
    
    @scala.inline
    def setDataSelectorRendered(value: (/* event */ Event, /* ui */ DataSelectorRenderedEventUIParam) => Unit): Self = StObject.set(x, "dataSelectorRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataSelectorRenderedUndefined: Self = StObject.set(x, "dataSelectorRendered", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceInitialized(value: (/* event */ Event, /* ui */ DataSourceInitializedEventUIParam) => Unit): Self = StObject.set(x, "dataSourceInitialized", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataSourceInitializedUndefined: Self = StObject.set(x, "dataSourceInitialized", js.undefined)
    
    @scala.inline
    def setDataSourceOptions(value: IgPivotDataSelectorDataSourceOptions): Self = StObject.set(x, "dataSourceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceOptionsUndefined: Self = StObject.set(x, "dataSourceOptions", js.undefined)
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceUpdated(value: (/* event */ Event, /* ui */ DataSourceUpdatedEventUIParam) => Unit): Self = StObject.set(x, "dataSourceUpdated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataSourceUpdatedUndefined: Self = StObject.set(x, "dataSourceUpdated", js.undefined)
    
    @scala.inline
    def setDeferUpdate(value: Boolean): Self = StObject.set(x, "deferUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUpdateChanged(value: (/* event */ Event, /* ui */ DeferUpdateChangedEventUIParam) => Unit): Self = StObject.set(x, "deferUpdateChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeferUpdateChangedUndefined: Self = StObject.set(x, "deferUpdateChanged", js.undefined)
    
    @scala.inline
    def setDeferUpdateUndefined: Self = StObject.set(x, "deferUpdate", js.undefined)
    
    @scala.inline
    def setDisableColumnsDropArea(value: Boolean): Self = StObject.set(x, "disableColumnsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableColumnsDropAreaUndefined: Self = StObject.set(x, "disableColumnsDropArea", js.undefined)
    
    @scala.inline
    def setDisableFiltersDropArea(value: Boolean): Self = StObject.set(x, "disableFiltersDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFiltersDropAreaUndefined: Self = StObject.set(x, "disableFiltersDropArea", js.undefined)
    
    @scala.inline
    def setDisableMeasuresDropArea(value: Boolean): Self = StObject.set(x, "disableMeasuresDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMeasuresDropAreaUndefined: Self = StObject.set(x, "disableMeasuresDropArea", js.undefined)
    
    @scala.inline
    def setDisableRowsDropArea(value: Boolean): Self = StObject.set(x, "disableRowsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableRowsDropAreaUndefined: Self = StObject.set(x, "disableRowsDropArea", js.undefined)
    
    @scala.inline
    def setDrag(value: (/* event */ Event, /* ui */ DragEventUIParam) => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragAndDropSettings(value: IgPivotDataSelectorDragAndDropSettings): Self = StObject.set(x, "dragAndDropSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragAndDropSettingsUndefined: Self = StObject.set(x, "dragAndDropSettings", js.undefined)
    
    @scala.inline
    def setDragStart(value: (/* event */ Event, /* ui */ DragStartEventUIParam) => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    @scala.inline
    def setDragStop(value: (/* event */ Event, /* ui */ DragStopEventUIParam) => Unit): Self = StObject.set(x, "dragStop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragStopUndefined: Self = StObject.set(x, "dragStop", js.undefined)
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setDropDownParent(value: js.Any): Self = StObject.set(x, "dropDownParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownParentUndefined: Self = StObject.set(x, "dropDownParent", js.undefined)
    
    @scala.inline
    def setFilterDropDownClosed(value: (/* event */ Event, /* ui */ FilterDropDownClosedEventUIParam) => Unit): Self = StObject.set(x, "filterDropDownClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDropDownClosedUndefined: Self = StObject.set(x, "filterDropDownClosed", js.undefined)
    
    @scala.inline
    def setFilterDropDownClosing(value: (/* event */ Event, /* ui */ FilterDropDownClosingEventUIParam) => Unit): Self = StObject.set(x, "filterDropDownClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDropDownClosingUndefined: Self = StObject.set(x, "filterDropDownClosing", js.undefined)
    
    @scala.inline
    def setFilterDropDownOk(value: (/* event */ Event, /* ui */ FilterDropDownOkEventUIParam) => Unit): Self = StObject.set(x, "filterDropDownOk", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDropDownOkUndefined: Self = StObject.set(x, "filterDropDownOk", js.undefined)
    
    @scala.inline
    def setFilterDropDownOpened(value: (/* event */ Event, /* ui */ FilterDropDownOpenedEventUIParam) => Unit): Self = StObject.set(x, "filterDropDownOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDropDownOpenedUndefined: Self = StObject.set(x, "filterDropDownOpened", js.undefined)
    
    @scala.inline
    def setFilterDropDownOpening(value: (/* event */ Event, /* ui */ FilterDropDownOpeningEventUIParam) => Unit): Self = StObject.set(x, "filterDropDownOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDropDownOpeningUndefined: Self = StObject.set(x, "filterDropDownOpening", js.undefined)
    
    @scala.inline
    def setFilterMembersLoaded(value: (/* event */ Event, /* ui */ FilterMembersLoadedEventUIParam) => Unit): Self = StObject.set(x, "filterMembersLoaded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterMembersLoadedUndefined: Self = StObject.set(x, "filterMembersLoaded", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMetadataDropped(value: (/* event */ Event, /* ui */ MetadataDroppedEventUIParam) => Unit): Self = StObject.set(x, "metadataDropped", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMetadataDroppedUndefined: Self = StObject.set(x, "metadataDropped", js.undefined)
    
    @scala.inline
    def setMetadataDropping(value: (/* event */ Event, /* ui */ MetadataDroppingEventUIParam) => Unit): Self = StObject.set(x, "metadataDropping", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMetadataDroppingUndefined: Self = StObject.set(x, "metadataDropping", js.undefined)
    
    @scala.inline
    def setMetadataRemoved(value: (/* event */ Event, /* ui */ MetadataRemovedEventUIParam) => Unit): Self = StObject.set(x, "metadataRemoved", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMetadataRemovedUndefined: Self = StObject.set(x, "metadataRemoved", js.undefined)
    
    @scala.inline
    def setMetadataRemoving(value: (/* event */ Event, /* ui */ MetadataRemovingEventUIParam) => Unit): Self = StObject.set(x, "metadataRemoving", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMetadataRemovingUndefined: Self = StObject.set(x, "metadataRemoving", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
