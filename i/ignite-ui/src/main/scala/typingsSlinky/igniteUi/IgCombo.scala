package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgCombo
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * If set to true:
  	 * 1. Allows custom value input only with single selection.
  	 * 2. Custom values will be auto completed to the closest value if [autoComplete](ui.igcombo#options:autoComplete) is enabled.
  	 *
  	 */
  var allowCustomValue: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets hide drop-down list animation duration in milliseconds.
  	 *
  	 */
  var animationHideDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets show drop-down list animation duration in milliseconds.
  	 *
  	 */
  var animationShowDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets ability to autocomplete field from first matching item in list.
  	 * Note: When autoComplete option is enabled, then "startsWith" is used for [filteringCondition](ui.igcombo#options:filteringCondition).
  	 *
  	 */
  var autoComplete: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether the first matching item should be auto selected when typing in input. When [multiSelection](ui.igcombo#options:multiSelection) is enabled this option will instead put the active item on the matching element.
  	 *
  	 */
  var autoSelectFirstMatch: js.UndefOr[Boolean] = js.native
  /**
  	 * If set to true, filtering and auto selection will be case-sensitive.
  	 *
  	 */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets title for html element which represent clear button.
  	 * Use option [locale.clearButtonTitle](ui.igcombo#options:locale.clearButtonTitle).
  	 */
  var clearButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets ability to close drop-down list when control loses focus.
  	 *
  	 */
  var closeDropDownOnBlur: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets sets ability to close drop-down list when single item in the list is selected with mouse click or enter press. The default value when [multiSelection](ui.igcombo#options:multiSelection) is enabled will be false. This option will not close the drop down when [multiSelection](ui.igcombo#options:multiSelection) is enabled and additive selection is performed.
  	 *
  	 */
  var closeDropDownOnSelect: js.UndefOr[Boolean] = js.native
  /**
  	 * Event which is raised before data binding is performed.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference to igCombo performing the databinding.
  	 * Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) combo is to be databound to.
  	 */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  /**
  	 * Event which is raised after data binding is complete.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo performing the data binding.
  	 * Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
  	 * Use ui.success to see if the databinding was performed correctly.
  	 * Use ui.errorMessage to get the error message if the databinding failed.
  	 */
  var dataBound: js.UndefOr[DataBoundEvent] = js.native
  /**
  	 * Gets/Sets a valid data source accepted by [$.ig.DataSource](ig.datasource), or an instance of an [$.ig.DataSource](ig.datasource) itself.
  	 * Note: if it is set to string and [dataSourceType](ui.igcombo#options:dataSourceType) option is not set, then [$.ig.JSONDataSource](ig.jsondatasource) is used.
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Sets data source type (such as "json", "xml", etc). Please refer to the documentation of [$.ig.DataSource](ig.datasource) and its [type](ig.datasource#options:settings.type) property.
  	 *
  	 */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
  	 * Sets URL which is used for sending JSON on request for remote filtering (MVC for example). That option is required when [load on demand](ui.igcombo#options:loadOnDemandSettings) is
  	 * [enabled](ui.igcombo#options:loadOnDemandSettings.enabled) and its [type](ui.igcombo#options:filteringType) is remote.
  	 *
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
  	 * Specifies the delay duration before processing the changes in the input. Useful to boost performance by lowering the count of selection, filtering, auto complete and highlighting operations executed on each input change.
  	 *
  	 */
  var delayInputChangeProcessing: js.UndefOr[Double] = js.native
  /**
  	 * If set to true, the container of the drop-down list is appended to the body.
  	 * If set to false, it is appended to the parent element of the combo.
  	 *
  	 */
  var dropDownAttachedToBody: js.UndefOr[Boolean] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets title for html element which represent the drop-down button.
  	 * Use option [locale.dropDownButtonTitle](ui.igcombo#options:locale.dropDownButtonTitle).
  	 */
  var dropDownButtonTitle: js.UndefOr[String] = js.native
  /**
  	 * Event which is raised after drop-down list was closed.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use evt.originalEvent to obtain reference to event of browser.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.list to obtain reference to jquery DOM element which represents drop down list container.
  	 */
  var dropDownClosed: js.UndefOr[DropDownClosedEvent] = js.native
  /**
  	 * Event which is raised before drop-down list is closed.
  	 *
  	 * Return false in order to cancel hide action.
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.list to obtain reference to jquery DOM element which represents drop down list container.
  	 */
  var dropDownClosing: js.UndefOr[DropDownClosingEvent] = js.native
  /**
  	 * Gets/Sets ability to show the drop-down list when the combo is in focus. This option has effect only if the combo is in editable [mode](ui.igcombo#options:mode).
  	 *
  	 */
  var dropDownOnFocus: js.UndefOr[Boolean] = js.native
  /**
  	 * Event which is raised after drop-down list was opened.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.list to obtain reference to jquery DOM element which represents drop down list container.
  	 */
  var dropDownOpened: js.UndefOr[DropDownOpenedEvent] = js.native
  /**
  	 * Event which is raised before drop-down list is opened.
  	 *
  	 * Return false in order to cancel drop-down action.
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.list to obtain reference to jquery DOM element which represents drop down list container.
  	 */
  var dropDownOpening: js.UndefOr[DropDownOpeningEvent] = js.native
  /**
  	 * Gets/Sets drop-down list orientation when open button is clicked.
  	 *
  	 *
  	 * Valid values:
  	 * "auto" if there is enough space, it positions the drop-down list below the combo input, otherwise - above the combo input
  	 * "bottom" below the combo input
  	 * "top" above the combo input
  	 */
  var dropDownOrientation: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the width of drop-down list in pixels.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The default drop-down list width can be set in pixels (px).
  	 * "number" The default drop-down list width can be set as a number.
  	 */
  var dropDownWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Specifies whether the clear button should be rendered.
  	 * When the [mode](ui.igcombo#options:mode) is single selection, readonly or readonlylist this option will default to false. It can still be enabled when it is specifically set to true.
  	 *
  	 */
  var enableClearButton: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets URL key name that specifies how the remote filtering expressions will be encoded for remote requests, e.g. &filter('col') = startsWith. Default is OData.
  	 *
  	 */
  var filterExprUrlKey: js.UndefOr[String] = js.native
  /**
  	 * Event which is raised after filtering.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use evt.originalEvent to obtain reference to event of browser. That can be null.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.elements to obtain a jquery reference to the rendered filtered elements.
  	 */
  var filtered: js.UndefOr[FilteredEvent] = js.native
  /**
  	 * Event which is raised before data filtering.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.expression to obtain reference to array which contains expressions supported by [$.ig.DataSource](ig.datasource).
  	 * Each expression-item contains following members: fieldName ([textKey](ui.igcombo#options:textKey)), cond ([filteringCondition](ui.igcombo#options:filteringCondition)), expr (value/string to filter).
  	 */
  var filtering: js.UndefOr[FilteringEvent] = js.native
  /**
  	 * Gets/Sets condition used for filtering.Note: When [autoComplete](ui.igcombo#options:autoComplete) is enabled, the filtering condition is always "startsWith".
  	 *
  	 *
  	 * Valid values:
  	 * "contains"
  	 * "doesNotContain"
  	 * "startsWith"
  	 * "endsWith"
  	 * "greaterThan"
  	 * "lessThan"
  	 * "greaterThanOrEqualTo"
  	 * "lessThanOrEqualTo"
  	 * "equals"
  	 * "doesNotEqual"
  	 */
  var filteringCondition: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets filtering logic.
  	 *
  	 *
  	 * Valid values:
  	 * "OR"
  	 * "AND"
  	 */
  var filteringLogic: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets type of filtering.Note: option is set to "remote", then the "css.waitFiltering" is applied to combo and its drop-down list.
  	 *
  	 *
  	 * Valid values:
  	 * "remote" filtering is performed by server
  	 * "local" filtering is performed by $.ig.DataSource
  	 * "none" filtering is disabled
  	 */
  var filteringType: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets template used to render a footer in the drop-down list.
  	 * Notes:
  	 * 1. The template is rendered inside of DIV html element.
  	 * 2. The following variables can be used:
  	 * - {0}: Number of records in igCombo (view of dataSource)
  	 * - {1}: Number of records in dataSource
  	 * - {2}: Number of (filtered) records on server
  	 * - {3}: Number of all records on server
  	 *
  	 */
  var footerTemplate: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the format string that is used to format the text display values in the combo.
  	 * Valid options are:
  	 * "auto" (default) - uses automatic formatting for Date and number objects.
  	 * "none", "", or null - will disable formatting
  	 *
  	 * Custom values can be something like "currency", "percent", "dateLong", "time", "MMM-dd-yyyy H:mm tt", etc.
  	 *
  	 * Custom format strings should match the data type in "textKey" column.
  	 *
  	 */
  var format: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets object specifying grouping feature options. The option has key and dir properties.
  	 *
  	 */
  var grouping: js.UndefOr[IgComboGrouping] = js.native
  /**
  	 * Gets/Sets template used to render a header in the drop-down list. The template is rendered inside of a DIV html element.
  	 *
  	 */
  var headerTemplate: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets height of combo. The numeric and string values (valid html units for size) are supported. It includes %, px, em and other units.
  	 *
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Gets/Sets condition used for highlighting of matching parts in items of drop-down list.
  	 *
  	 *
  	 * Valid values:
  	 * "multi" multiple matches in a single item are rendered
  	 * "contains" match at any position in item is rendered
  	 * "startsWith" only match which starts from the beginning of text is rendered
  	 * "full" only fully matched items are rendered
  	 * "null" matches are not rendered
  	 */
  var highlightMatchesMode: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets list of items to be selected when the combo is initialized. It should contain array of objects with index or value property, then on initialization the matching items will be selected. If initialSelectedItems are not set, the combo is with single selection and it is in a dropdown, readonly or readonlylist [mode](ui.igcombo#options:mode), the first item will be automatically selected.
  	 * Note: Only items loaded on initialization can be selected. When using [load on demand](ui.igCombo#options:loadOnDemandSettings), selecting an item which is not loaded yet will fail.
  	 *
  	 */
  var initialSelectedItems: js.UndefOr[js.Array[IgComboInitialSelectedItem]] = js.native
  /**
  	 * Gets/Sets the name of a hidden INPUT element, which is used when submitting data. Its value will be set to the values of the selected items valueKeys separated by ',' character on any change in igCombo. If the combo element has 'name' attribute and this option is not set, the 'name' attribute will be used for the input name.
  	 *
  	 */
  var inputName: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets a template used to render an item in list. The igCombo utilizes igTemplating for generating node content templates.
  	 * More info on the templating engine can be found here: http://www.igniteui.com/help/infragistics-templating-engine.
  	 *
  	 */
  var itemTemplate: js.UndefOr[String] = js.native
  /**
  	 * Event which is raised after rendering of the combo items completes.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference to the combo performing rendering.
  	 * Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
  	 */
  var itemsRendered: js.UndefOr[ItemsRenderedEvent] = js.native
  /**
  	 * Event which is raised before rendering of the combo items is performed.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference to the combo performing rendering.
  	 * Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
  	 */
  var itemsRendering: js.UndefOr[ItemsRenderingEvent] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets container of variables which define load on demand functionality.
  	 * Notes:
  	 * That option has effect only when data is loaded remotely using [dataSourceUrl](ui.igcombo#options:dataSourceUrl).
  	 * Selection is supported only for already loaded items.
  	 *
  	 */
  var loadOnDemandSettings: js.UndefOr[IgComboLoadOnDemandSettings] = js.native
  var locale: js.UndefOr[IgComboLocale] = js.native
  /**
  	 * Sets gets functionality mode.
  	 *
  	 *
  	 * Valid values:
  	 * "editable" Allows to modify value by edit field and drop-down list.
  	 * "dropdown" Allows to modify value by drop-down list only.
  	 * "readonlylist" Allows to open list, but does not allow any changes in field or selection in drop-down list. If selection is not set, then first item in [dataSource](ui.igcombo#options:dataSource) is automatically selected.
  	 * "readonly" Does not allow to open list or change value in field. If selection is not set, then first item in [dataSource](ui.igcombo#options:dataSource) is automatically selected.
  	 */
  var mode: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets object specifying multi selection feature options. Note showCheckboxes and itemSeparator has effect only if multi selection is enabled.
  	 *
  	 */
  var multiSelection: js.UndefOr[IgComboMultiSelection] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets text of list item for condition when [filteringType](ui.igcombo#options:filteringType) option is enabled and no match was found.
  	 * Use option [locale.noMatchFoundText](ui.igcombo#options:locale.noMatchFoundText).
  	 */
  var noMatchFoundText: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets value that is displayed when input field is empty.
  	 * Use option [locale.placeHolder](ui.igcombo#options:locale.placeHolder).
  	 */
  var placeHolder: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets ability to prevent submitting form on enter key press.
  	 *
  	 */
  var preventSubmitOnEnter: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Event which is raised after rendering of the combo completes.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference to the combo performing rendering.
  	 * Use ui.element to get a reference to the main/top combo element.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
  	 * Specifies the HTTP verb to be used to issue the request.
  	 *
  	 */
  var requestType: js.UndefOr[String] = js.native
  /**
  	 * Content type of the response. See http://api.jquery.com/jQuery.ajax/ => contentType.
  	 *
  	 */
  var responseContentType: js.UndefOr[String] = js.native
  /**
  	 * See [$.ig.DataSource](ig.datasource) This is basically the property in the response where data records are held, if the response is wrapped.
  	 *
  	 */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
  	 * Response type when a URL is set as the data source. See http://api.jquery.com/jQuery.ajax/ => dataType.
  	 *
  	 *
  	 * Valid values:
  	 * "json"
  	 * "xml"
  	 * "html"
  	 * "script"
  	 * "jsonp"
  	 * "text"
  	 */
  var responseDataType: js.UndefOr[String] = js.native
  /**
  	 * See [$.ig.DataSource](ig.datasource) property in the response specifying the total number of records on the server.
  	 *
  	 */
  var responseTotalRecCountKey: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets ability to select items by space button press.
  	 *
  	 */
  var selectItemBySpaceKey: js.UndefOr[Boolean] = js.native
  /**
  	 * Event which is raised after selection change.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.items to obtain reference to array of new selected items. That can be null.
  	 * Use ui.oldItems to obtain reference to array of old selected items. That can be null.
  	 */
  var selectionChanged: js.UndefOr[IgComboSelectionChangedEvent] = js.native
  /**
  	 * Event which is raised before selection change.
  	 *
  	 * Return false in order to cancel change.
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.currentItems to obtain reference to array of the selected items before the new selection has happened. That can be null.
  	 * Use ui.items to obtain reference to array of all items that will be selected after the selection finish. That can be null.
  	 */
  var selectionChanging: js.UndefOr[SelectionChangingEvent] = js.native
  /**
  	 * Gets/Sets whether the onscreen keyboard should be shown when the dropdown button is clicked (touch devices only).
  	 * Note: The keyboard will still show when the combo input is focused in editable mode.
  	 *
  	 */
  var suppressKeyboard: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets tabIndex for the field of the combo.
  	 *
  	 */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets name of column which contains the displayed text. If it is missing, then [valueKey](ui.igcombo#options:valueKey) option will be used.
  	 *
  	 */
  var textKey: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets object which contains options supported by [igValidator](ui.igvalidator).
  	 * Notes: in order for validator to work, application should ensure that [igValidator](ui.igvalidator) is loaded (ig.ui.validator.js/css files).
  	 *
  	 */
  var validatorOptions: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets name of column which contains the "value". If it is missing, then the name of first column will be used.
  	 *
  	 */
  var valueKey: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets ability to use virtual rendering for drop-down list. Enable to boost performance when combo has lots of records.
  	 * If that option is enabled, then only visible items are created and the top edge of the first visible item in list is aligned to the top edge of list.
  	 *
  	 */
  var virtualization: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets how many items should be shown at once.
  	 *    Notes:
  	 *    This option is used for [virtualization](ui.igcombo#options:virtualization) in order to render initial list items.
  	 *
  	 */
  var visibleItemsCount: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the width of combo. The numeric and string values (valid html units for size) are supported. It includes %, px, em and other units.
  	 *
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgCombo {
  @scala.inline
  def apply(): IgCombo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgCombo]
  }
  @scala.inline
  implicit class IgComboOps[Self <: IgCombo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCustomValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCustomValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCustomValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCustomValue")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationHideDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationHideDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationHideDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationHideDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationShowDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationShowDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationShowDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationShowDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSelectFirstMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelectFirstMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSelectFirstMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelectFirstMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withClearButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseDropDownOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDropDownOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseDropDownOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDropDownOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseDropDownOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDropDownOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseDropDownOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDropDownOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
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
    def withDataSourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayInputChangeProcessing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayInputChangeProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayInputChangeProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayInputChangeProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownAttachedToBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAttachedToBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownAttachedToBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAttachedToBody")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownClosed(value: (/* event */ Event, /* ui */ DropDownClosedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownClosed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownClosing(value: (/* event */ Event, /* ui */ DropDownClosingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownClosing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownOpened(value: (/* event */ Event, /* ui */ DropDownOpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOpened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownOpening(value: (/* event */ Event, /* ui */ DropDownOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableClearButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClearButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableClearButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClearButton")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterExprUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterExprUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterExprUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterExprUrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltered(value: (/* event */ Event, /* ui */ FilteredEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltering(value: (/* event */ Event, /* ui */ FilteringEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtering")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteringCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteringCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteringLogic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringLogic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteringLogic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringLogic")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteringType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteringType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringType")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouping(value: IgComboGrouping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(js.undefined)
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
    def withHighlightMatchesMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatchesMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightMatchesMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatchesMode")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSelectedItems(value: js.Array[IgComboInitialSelectedItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSelectedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelectedItems")(js.undefined)
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
    def withItemTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsRendered(value: (/* event */ Event, /* ui */ ItemsRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemsRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsRendering(value: (/* event */ Event, /* ui */ ItemsRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemsRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsRendering")(js.undefined)
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
    def withLoadOnDemandSettings(value: IgComboLoadOnDemandSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnDemandSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadOnDemandSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnDemandSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: IgComboLocale): Self = {
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
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelection(value: IgComboMultiSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withNoMatchFoundText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatchFoundText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoMatchFoundText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatchFoundText")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceHolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventSubmitOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSubmitOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventSubmitOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSubmitOnEnter")(js.undefined)
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
    def withRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseDataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseDataKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataKey")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTotalRecCountKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTotalRecCountKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTotalRecCountKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTotalRecCountKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectItemBySpaceKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectItemBySpaceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectItemBySpaceKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectItemBySpaceKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionChanged(value: (/* event */ Event, /* ui */ IgComboSelectionChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionChanging(value: (/* event */ Event, /* ui */ SelectionChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectionChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressKeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTextKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textKey")(js.undefined)
        ret
    }
    @scala.inline
    def withValidatorOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidatorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withValueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualization")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleItemsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleItemsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemsCount")(js.undefined)
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

