package typingsSlinky.jqueryFiltertable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilterTable {
  
  @js.native
  trait FilterTableOptions extends StObject {
    
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
    implicit class FilterTableOptionsMutableBuilder[Self <: FilterTableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      @scala.inline
      def setCallback(value: (/* term */ String, /* table */ JQuery) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
      
      @scala.inline
      def setContainerTag(value: String): Self = StObject.set(x, "containerTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerTagUndefined: Self = StObject.set(x, "containerTag", js.undefined)
      
      @scala.inline
      def setHideTFootOnFilter(value: Boolean): Self = StObject.set(x, "hideTFootOnFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideTFootOnFilterUndefined: Self = StObject.set(x, "hideTFootOnFilter", js.undefined)
      
      @scala.inline
      def setHighlightClass(value: String): Self = StObject.set(x, "highlightClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightClassUndefined: Self = StObject.set(x, "highlightClass", js.undefined)
      
      @scala.inline
      def setIgnoreColumns(value: js.Array[Double]): Self = StObject.set(x, "ignoreColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreColumnsUndefined: Self = StObject.set(x, "ignoreColumns", js.undefined)
      
      @scala.inline
      def setIgnoreColumnsVarargs(value: Double*): Self = StObject.set(x, "ignoreColumns", js.Array(value :_*))
      
      @scala.inline
      def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
      
      @scala.inline
      def setInputSelector(value: String): Self = StObject.set(x, "inputSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputSelectorUndefined: Self = StObject.set(x, "inputSelector", js.undefined)
      
      @scala.inline
      def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMinChars(value: Double): Self = StObject.set(x, "minChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCharsUndefined: Self = StObject.set(x, "minChars", js.undefined)
      
      @scala.inline
      def setMinRows(value: Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPreventReturnKey(value: Boolean): Self = StObject.set(x, "preventReturnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventReturnKeyUndefined: Self = StObject.set(x, "preventReturnKey", js.undefined)
      
      @scala.inline
      def setQuickList(value: js.Array[String]): Self = StObject.set(x, "quickList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickListClass(value: String): Self = StObject.set(x, "quickListClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickListClassUndefined: Self = StObject.set(x, "quickListClass", js.undefined)
      
      @scala.inline
      def setQuickListClear(value: String): Self = StObject.set(x, "quickListClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickListClearUndefined: Self = StObject.set(x, "quickListClear", js.undefined)
      
      @scala.inline
      def setQuickListGroupTag(value: String): Self = StObject.set(x, "quickListGroupTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickListGroupTagUndefined: Self = StObject.set(x, "quickListGroupTag", js.undefined)
      
      @scala.inline
      def setQuickListTag(value: String): Self = StObject.set(x, "quickListTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickListTagUndefined: Self = StObject.set(x, "quickListTag", js.undefined)
      
      @scala.inline
      def setQuickListUndefined: Self = StObject.set(x, "quickList", js.undefined)
      
      @scala.inline
      def setQuickListVarargs(value: String*): Self = StObject.set(x, "quickList", js.Array(value :_*))
      
      @scala.inline
      def setVisibleClass(value: String): Self = StObject.set(x, "visibleClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleClassUndefined: Self = StObject.set(x, "visibleClass", js.undefined)
    }
  }
  
  @js.native
  trait FilterTableStatic extends StObject {
    
    /**
      * init with default options
      * @returns {JQuery}
      */
    def apply(): JQuery = js.native
    /**
      * init with custom options
      * @param options
      * @returns {JQuery}
      */
    def apply(options: FilterTableOptions): JQuery = js.native
  }
}
