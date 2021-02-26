package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridRowSelectors
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Event fired after a row selector checkbox had changed state.
    */
  var checkBoxStateChanged: js.UndefOr[CheckBoxStateChangedEvent] = js.native
  
  /**
    * Event fired when a row selector checkbox is changing.
    */
  var checkBoxStateChanging: js.UndefOr[CheckBoxStateChangingEvent] = js.native
  
  /**
    * Custom template for "deselect all" overlay with paging
    * Element with attribute data-rs-deselect-all is used for sellecting all the records
    * Element with attribute data-rs-close-all is used for closing the overlay
    * The default template is "<div class='ui-widget-header ui-priority-secondary' tabindex='0'><div>You have deselected ${unchecked} records. <a href='#' tabindex='0' data-rs-deselect-all>Deselect all ${totalRecordsCount} records</a><div style='float:right;'><span data-rs-close-all class='ui-icon-close ui-icon ui-button' tabindex='0'></div></span></div></div>"
    * There is also ${allCheckedRecords} parameter which is not used in the default template, but it represents the checked records from all pages.
    *
    */
  var deselectAllForPagingTemplate: js.UndefOr[String] = js.native
  
  /**
    * Determines whether the row selectors column should contain checkboxes
    *
    */
  var enableCheckBoxes: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines whether the row selectors column should contain row numbering
    *
    */
  var enableRowNumbering: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables/disables showing an overlay after clicking on the header checkbox, which allows selecting all records from all pages.
    *
    */
  var enableSelectAllForPaging: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[IgGridRowSelectorsLocale] = js.native
  
  /**
    * Determines whether the selection feature is required for the row selectors. If set to "false"
    * the widget will not check for Selection availability. If set to "true" an exception will be thrown if Selection is
    * not available.
    *
    */
  var requireSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * The seed to be added to the default numbering
    *
    */
  var rowNumberingSeed: js.UndefOr[Double] = js.native
  
  /**
    * Event fired after a row selector is clicked.
    */
  var rowSelectorClicked: js.UndefOr[RowSelectorClickedEvent] = js.native
  
  /**
    * defines width of the row selector`s column in pixels or percentage.
    *
    *
    * Valid values:
    * "string" The row selector column width can be set in pixels (px) and percentage (%)
    * "number" The row selector width can be set as a number
    * "null" will let the feature decide the best width depending on enabled contents
    */
  var rowSelectorColumnWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * Custom template for "select all" overlay with paging
    * Element with attribute data-rs-select-all is used for sellecting all the records
    * Element with attribute data-rs-close-all is used for closing the overlay
    * The default template is "<div class='ui-widget-header ui-priority-secondary' tabindex='0'><div>You have selected ${checked} records. <a href='#' tabindex='0' data-rs-select-all>Select all ${totalRecordsCount} records</a><div style='float:right;'><span data-rs-close-all class='ui-icon-close ui-icon ui-button' tabindex='0'></div></span></div></div>"
    * There is also ${allCheckedRecords} parameter which is not used in the default template, but it represents the checked records from all pages.
    *
    */
  var selectAllForPagingTemplate: js.UndefOr[String] = js.native
  
  /**
    * Determines whether checkboxes will be shown only if row selectors are on focus/selected.
    *
    */
  var showCheckBoxesOnFocus: js.UndefOr[Boolean] = js.native
}
object IgGridRowSelectors {
  
  @scala.inline
  def apply(): IgGridRowSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridRowSelectors]
  }
  
  @scala.inline
  implicit class IgGridRowSelectorsMutableBuilder[Self <: IgGridRowSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckBoxStateChanged(value: (/* event */ Event, /* ui */ CheckBoxStateChangedEventUIParam) => Unit): Self = StObject.set(x, "checkBoxStateChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckBoxStateChangedUndefined: Self = StObject.set(x, "checkBoxStateChanged", js.undefined)
    
    @scala.inline
    def setCheckBoxStateChanging(value: (/* event */ Event, /* ui */ CheckBoxStateChangingEventUIParam) => Unit): Self = StObject.set(x, "checkBoxStateChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckBoxStateChangingUndefined: Self = StObject.set(x, "checkBoxStateChanging", js.undefined)
    
    @scala.inline
    def setDeselectAllForPagingTemplate(value: String): Self = StObject.set(x, "deselectAllForPagingTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeselectAllForPagingTemplateUndefined: Self = StObject.set(x, "deselectAllForPagingTemplate", js.undefined)
    
    @scala.inline
    def setEnableCheckBoxes(value: Boolean): Self = StObject.set(x, "enableCheckBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCheckBoxesUndefined: Self = StObject.set(x, "enableCheckBoxes", js.undefined)
    
    @scala.inline
    def setEnableRowNumbering(value: Boolean): Self = StObject.set(x, "enableRowNumbering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRowNumberingUndefined: Self = StObject.set(x, "enableRowNumbering", js.undefined)
    
    @scala.inline
    def setEnableSelectAllForPaging(value: Boolean): Self = StObject.set(x, "enableSelectAllForPaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSelectAllForPagingUndefined: Self = StObject.set(x, "enableSelectAllForPaging", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    @scala.inline
    def setLocale(value: IgGridRowSelectorsLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setRequireSelection(value: Boolean): Self = StObject.set(x, "requireSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireSelectionUndefined: Self = StObject.set(x, "requireSelection", js.undefined)
    
    @scala.inline
    def setRowNumberingSeed(value: Double): Self = StObject.set(x, "rowNumberingSeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowNumberingSeedUndefined: Self = StObject.set(x, "rowNumberingSeed", js.undefined)
    
    @scala.inline
    def setRowSelectorClicked(value: (/* event */ Event, /* ui */ RowSelectorClickedEventUIParam) => Unit): Self = StObject.set(x, "rowSelectorClicked", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowSelectorClickedUndefined: Self = StObject.set(x, "rowSelectorClicked", js.undefined)
    
    @scala.inline
    def setRowSelectorColumnWidth(value: String | Double): Self = StObject.set(x, "rowSelectorColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSelectorColumnWidthUndefined: Self = StObject.set(x, "rowSelectorColumnWidth", js.undefined)
    
    @scala.inline
    def setSelectAllForPagingTemplate(value: String): Self = StObject.set(x, "selectAllForPagingTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllForPagingTemplateUndefined: Self = StObject.set(x, "selectAllForPagingTemplate", js.undefined)
    
    @scala.inline
    def setShowCheckBoxesOnFocus(value: Boolean): Self = StObject.set(x, "showCheckBoxesOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCheckBoxesOnFocusUndefined: Self = StObject.set(x, "showCheckBoxesOnFocus", js.undefined)
  }
}
