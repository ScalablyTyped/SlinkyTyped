package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IgPivotDataSelectorOps[Self <: IgPivotDataSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomMoveValidation(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMoveValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMoveValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMoveValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSelectorRendered(value: (/* event */ Event, /* ui */ DataSelectorRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSelectorRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataSelectorRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSelectorRendered")(js.undefined)
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
    def withDataSourceInitialized(value: (/* event */ Event, /* ui */ DataSourceInitializedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceInitialized")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataSourceInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceOptions(value: IgPivotDataSelectorDataSourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceUpdated(value: (/* event */ Event, /* ui */ DataSourceUpdatedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUpdated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataSourceUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferUpdateChanged(value: (/* event */ Event, /* ui */ DeferUpdateChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdateChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDeferUpdateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableColumnsDropArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableColumnsDropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableColumnsDropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableColumnsDropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFiltersDropArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFiltersDropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFiltersDropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFiltersDropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableMeasuresDropArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMeasuresDropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMeasuresDropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMeasuresDropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableRowsDropArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRowsDropArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableRowsDropArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRowsDropArea")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: (/* event */ Event, /* ui */ DragEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragAndDropSettings(value: IgPivotDataSelectorDragAndDropSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDropSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragAndDropSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDropSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStart(value: (/* event */ Event, /* ui */ DragStartEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStop(value: (/* event */ Event, /* ui */ DragStopEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownParent")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownClosed(value: (/* event */ Event, /* ui */ FilterDropDownClosedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownClosed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDropDownClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownClosing(value: (/* event */ Event, /* ui */ FilterDropDownClosingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownClosing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDropDownClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownOk(value: (/* event */ Event, /* ui */ FilterDropDownOkEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownOk")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDropDownOk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownOk")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownOpened(value: (/* event */ Event, /* ui */ FilterDropDownOpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownOpened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDropDownOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropDownOpening(value: (/* event */ Event, /* ui */ FilterDropDownOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterDropDownOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropDownOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMembersLoaded(value: (/* event */ Event, /* ui */ FilterMembersLoadedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMembersLoaded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterMembersLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMembersLoaded")(js.undefined)
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
    def withMetadataDropped(value: (/* event */ Event, /* ui */ MetadataDroppedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataDropped")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMetadataDropped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataDropped")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataDropping(value: (/* event */ Event, /* ui */ MetadataDroppingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataDropping")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMetadataDropping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataDropping")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataRemoved(value: (/* event */ Event, /* ui */ MetadataRemovedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataRemoved")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMetadataRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataRemoving(value: (/* event */ Event, /* ui */ MetadataRemovingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataRemoving")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMetadataRemoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataRemoving")(js.undefined)
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

