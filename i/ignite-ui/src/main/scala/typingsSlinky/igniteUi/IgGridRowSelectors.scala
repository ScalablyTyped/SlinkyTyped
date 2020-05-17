package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IgGridRowSelectorsOps[Self <: IgGridRowSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckBoxStateChanged(value: (/* event */ Event, /* ui */ CheckBoxStateChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBoxStateChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCheckBoxStateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBoxStateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckBoxStateChanging(value: (/* event */ Event, /* ui */ CheckBoxStateChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBoxStateChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCheckBoxStateChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBoxStateChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withDeselectAllForPagingTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectAllForPagingTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeselectAllForPagingTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectAllForPagingTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCheckBoxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCheckBoxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCheckBoxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCheckBoxes")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowNumbering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowNumbering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowNumbering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowNumbering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSelectAllForPaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelectAllForPaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSelectAllForPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelectAllForPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: IgGridRowSelectorsLocale): Self = {
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
    def withRequireSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withRowNumberingSeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNumberingSeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowNumberingSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNumberingSeed")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelectorClicked(value: (/* event */ Event, /* ui */ RowSelectorClickedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectorClicked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowSelectorClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectorClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelectorColumnWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectorColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSelectorColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectorColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllForPagingTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllForPagingTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllForPagingTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllForPagingTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCheckBoxesOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckBoxesOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCheckBoxesOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckBoxesOnFocus")(js.undefined)
        ret
    }
  }
  
}

