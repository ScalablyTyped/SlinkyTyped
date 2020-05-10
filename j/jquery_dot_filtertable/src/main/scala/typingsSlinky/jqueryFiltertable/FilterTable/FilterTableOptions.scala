package typingsSlinky.jqueryFiltertable.FilterTable

import typingsSlinky.jqueryFiltertable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterTableOptions extends js.Object {
  /**
    * Makes the filter input field autofocused (not recommended for accessibility reasons)
    * Default: 'false'
    */
  var autofocus: js.UndefOr[Boolean] = js.native
  /**
    * Callback function after a filter is performed.
    * Default: 'null'
    * @param term filter term (string)
    * @param table table being filtered (JQuery object)
    * @returns {void} 
    */
  var callback: js.UndefOr[js.Function2[/* term */ String, /* table */ JQuery, Unit]] = js.native
  /**
    * Class applied to the main filter input container
    * Default: 'filter-table'
    */
  var containerClass: js.UndefOr[String] = js.native
  /**
    * Tag name of the main filter input container
    * Default: 'p'
    */
  var containerTag: js.UndefOr[String] = js.native
  /**
    * Controls whether the table's tfoot(s) will be hidden when the table is filtered
    * Default: 'false'
    */
  var hideTFootOnFilter: js.UndefOr[Boolean] = js.native
  /**
    * Class applied to cells containing the filter term
    * Default: 'alt'
    */
  var highlightClass: js.UndefOr[String] = js.native
  /**
    * Ignore these columns (0-indexed) when filtering
    * Default: '[]'
    */
  var ignoreColumns: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Name attribute of the filter input field
    * Default: 'filter-table'
    */
  var inputName: js.UndefOr[String] = js.native
  /**
    * Use this selector to find the filter input instead of creating a new one (only works if selector returns a single element)
    * Default: 'null'
    */
  var inputSelector: js.UndefOr[String] = js.native
  /**
    * Tag name of the filter input itself
    * Default: 'search'
    */
  var inputType: js.UndefOr[String] = js.native
  /**
    * Text to precede the filter input
    * Default: 'Filter:'
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Filter only when at least this number of characters are in the filter input field
    * Default: '1'
    */
  var minChars: js.UndefOr[Double] = js.native
  /**
    * Only show the filter on tables with this number of rows or more
    * Default: '8'
    */
  var minRows: js.UndefOr[Double] = js.native
  /**
    * HTML5 placeholder text for the filter input
    * Default: 'search this table'
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Trap the return key in the filter input field to prevent form submission
    * Default: 'true'
    */
  var preventReturnKey: js.UndefOr[Boolean] = js.native
  /**
    * List of clickable phrases to quick fill the search
    * Default: '[]'
    */
  var quickList: js.UndefOr[js.Array[String]] = js.native
  /**
    * Class of each quick list item
    * Default: 'quick'
    */
  var quickListClass: js.UndefOr[String] = js.native
  /**
    * Label for the clear filtering quick list item (or none if blank)
    * Default: ''
    */
  var quickListClear: js.UndefOr[String] = js.native
  /**
    * Tag name surrounding quick list items (e.g., ul)
    * Default: ''
    */
  var quickListGroupTag: js.UndefOr[String] = js.native
  /**
    * Tag name of each quick list item (e.g., a or li)
    * Default: 'a'
    */
  var quickListTag: js.UndefOr[String] = js.native
   // "a" | "li"
  /**
    * Class applied to visible rows
    * Default: 'visible'
    */
  var visibleClass: js.UndefOr[String] = js.native
}

object FilterTableOptions {
  @scala.inline
  def apply(): FilterTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterTableOptions]
  }
  @scala.inline
  implicit class FilterTableOptionsOps[Self <: FilterTableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutofocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutofocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: (/* term */ String, /* table */ JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerTag")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTFootOnFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTFootOnFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideTFootOnFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTFootOnFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightClass")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreColumns(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withInputName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(js.undefined)
        ret
    }
    @scala.inline
    def withInputSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withInputType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMinChars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChars")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRows")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventReturnKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventReturnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventReturnKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventReturnKey")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickList")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickListClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickListClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickListClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickListClass")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickListClear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickListClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickListClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickListClear")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickListGroupTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickListGroupTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickListGroupTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickListGroupTag")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickListTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickListTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickListTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickListTag")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleClass")(js.undefined)
        ret
    }
  }
  
}

