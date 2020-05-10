package typingsSlinky.magicsuggest.MagicSuggest

import typingsSlinky.jquery.JQueryAjaxSettings
import typingsSlinky.magicsuggest.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  /**
    * Additional config object passed to each $.ajax call
    */
  var ajaxConfig: js.UndefOr[JQueryAjaxSettings] = js.native
  /**
    * Restricts or allows the user to add the same entry more than once
    * Defaults to false.
    */
  var allowDuplicates: js.UndefOr[Boolean] = js.native
  /* ********  CONFIGURATION PROPERTIES ************/
  /**
    * Restricts or allows the user to validate typed entries.
    * Defaults to true.
    */
  var allowFreeEntries: js.UndefOr[Boolean] = js.native
  /**
    * If a single suggestion comes out, it is preselected.
    */
  var autoSelect: js.UndefOr[Boolean] = js.native
  /**
    * A function triggered just before the ajax request is sent, similar to jQuery
    */
  var beforeSend: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A custom CSS class to apply to the field's underlying element.
    */
  var cls: js.UndefOr[String] = js.native
  /**
    * JSON Data source used to populate the combo box. 3 options are available here:
    * No Data Source (default)
    *    When left null, the combo box will not suggest anything. It can still enable the user to enter
    *    multiple entries if allowFreeEntries is * set to true (default).
    * Static Source
    *    You can pass an array of JSON objects, an array of strings or even a single CSV string as the
    *    data source.For ex. data: [* {id:0,name:"Paris"}, {id: 1, name: "New York"}]
    *    You can also pass any json object with the results property containing the json array.
    * Url
    *     You can pass the url from which the component will fetch its JSON data.Data will be fetched
    *     using a POST ajax request that will * include the entered text as 'query' parameter. The results
    *     fetched from the server can be:
    *     - an array of JSON objects (ex: [{id:...,name:...},{...}])
    *     - a string containing an array of JSON objects ready to be parsed (ex: "[{id:...,name:...},{...}]")
    *     - a JSON object whose data will be contained in the results property
    *      (ex: {results: [{id:...,name:...},{...}]
    * Function
    *     You can pass a function which returns an array of JSON objects  (ex: [{id:...,name:...},{...}])
    *     The function can return the JSON data or it can use the first argument as function to handle the data.
    *     Only one (callback function or return value) is needed for the function to succeed.
    *     See the following example:
    *     function (response) { var myjson = [{name: 'test', id: 1}]; response(myjson); return myjson; }
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Additional parameters to the ajax call
    */
  var dataUrlParams: js.UndefOr[js.Object] = js.native
  /**
    * Start the component in a disabled state.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Name of JSON object property that defines the disabled behaviour
    */
  var disabledField: js.UndefOr[String] = js.native
  /**
    * Name of JSON object property displayed in the combo list
    */
  var displayField: js.UndefOr[String] = js.native
  /**
    * Set to false if you only want mouse interaction. In that case the combo will
    * automatically expand on focus.
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * Automatically expands combo on focus.
    */
  var expandOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * Set starting state for combo.
    */
  var expanded: js.UndefOr[Boolean] = js.native
  /**
    * JSON property by which the list should be grouped
    */
  var groupBy: js.UndefOr[String] = js.native
  /**
    * Set to true to hide the trigger on the right
    */
  var hideTrigger: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to highlight search input within displayed suggestions
    */
  var highlight: js.UndefOr[Boolean] = js.native
  /**
    * A custom ID for this component
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A class that is added to the info message appearing on the top-right part of the component
    */
  var infoMsgCls: js.UndefOr[String] = js.native
  /**
    * Additional parameters passed out to the INPUT tag. Enables usage of AngularJS's custom tags for ex.
    */
  var inputCfg: js.UndefOr[js.Any] = js.native
  /**
    * The class that is applied to show that the field is invalid
    */
  var invalidCls: js.UndefOr[String] = js.native
  /**
    * Set to true to filter data results according to case. Useless if the data is fetched remotely
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  /**
    * Once expanded, the combo's height will take as much room as the # of available results.
    *    In case there are too many results displayed, this will fix the drop down height.
    */
  var maxDropHeight: js.UndefOr[Double] = js.native
  /**
    * Defines how long the user free entry can be. Set to null for no limit.
    */
  var maxEntryLength: js.UndefOr[Double] = js.native
  /**
    * A function that defines the helper text when the max entry length has been surpassed.
    */
  var maxEntryRenderer: js.UndefOr[js.Function1[/* v */ js.UndefOr[Double], Unit]] = js.native
  /**
    * The maximum number of items the user can select if multiple selection is allowed.
    *    Set to null to remove the limit.
    */
  var maxSelection: js.UndefOr[Double] = js.native
  /**
    * A function that defines the helper text when the max selection amount has been reached. The function has a single
    *    parameter which is the number of selected elements.
    */
  var maxSelectionRenderer: js.UndefOr[js.Function1[/* v */ Double, Unit]] = js.native
  /**
    * The maximum number of results displayed in the combo drop down at once.
    */
  var maxSuggestions: js.UndefOr[Double] = js.native
  /**
    * The method used by the ajax request.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * The minimum number of characters the user must type before the combo expands and offers suggestions.
    */
  var minChars: js.UndefOr[Double] = js.native
  /**
    * A function that defines the helper text when not enough letters are set. The function has a single
    *    parameter which is the difference between the required amount of letters and the current one.
    */
  var minCharsRenderer: js.UndefOr[js.Function1[/* v */ Double, Unit]] = js.native
  /**
    * Whether or not sorting / filtering should be done remotely or locally.
    * Use either 'local' or 'remote'
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * The name used as a form element.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The text displayed when there are no suggestions.
    */
  var noSuggestionText: js.UndefOr[String] = js.native
  /**
    * The default placeholder text when nothing has been entered
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Allow customization of query parameter
    */
  var queryParam: js.UndefOr[String] = js.native
  /**
    * A function used to define how the items will be presented in the combo
    */
  var renderer: js.UndefOr[js.Function1[/* item */ js.Any, Unit]] = js.native
  /**
    * Whether or not this field should be required
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to render selection as a delimited string
    */
  var resultAsString: js.UndefOr[Boolean] = js.native
  /**
    * Text delimiter to use in a delimited string.
    */
  var resultAsStringDelimiter: js.UndefOr[String] = js.native
  /**
    * Name of JSON object property that represents the list of suggested objects
    */
  var resultsField: js.UndefOr[String] = js.native
  /**
    * Auto select the first matching item with multiple items shown
    */
  var selectFirst: js.UndefOr[Boolean] = js.native
  /**
    * A custom CSS class to add to a selected item
    */
  var selectionCls: js.UndefOr[String] = js.native
  /**
    * An optional element replacement in which the selection is rendered
    */
  var selectionContainer: js.UndefOr[JQuery] = js.native
  /**
    * Where the selected items will be displayed. Only 'right', 'bottom' and 'inner' are valid values
    */
  var selectionPosition: js.UndefOr[String] = js.native
  /**
    * A function used to define how the items will be presented in the tag list
    */
  var selectionRenderer: js.UndefOr[js.Function1[/* item */ js.Any, Unit]] = js.native
  /**
    * Set to true to stack the selectioned items when positioned on the bottom
    *    Requires the selectionPosition to be set to 'bottom'
    */
  var selectionStacked: js.UndefOr[Boolean] = js.native
  /**
    * Direction used for sorting. Only 'asc' and 'desc' are valid values
    */
  var sortDir: js.UndefOr[String] = js.native
  /**
    * name of JSON object property for local result sorting.
    *    Leave null if you do not wish the results to be ordered or if they are already ordered remotely.
    */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * If set to boolean; suggestions will have to start by user input (and not simply contain it as a substring)
    */
  var strictSuggest: js.UndefOr[Boolean] = js.native
  /**
    * Custom style added to the component container.
    */
  var style: js.UndefOr[String] = js.native
  /**
    * If set to boolean; the combo will expand / collapse when clicked upon
    */
  var toggleOnClick: js.UndefOr[Boolean] = js.native
  /**
    * Amount (in ms) between keyboard registers.
    */
  var typeDelay: js.UndefOr[Double] = js.native
  /**
    * If set to boolean; using comma will validate the user's choice
    */
  var useCommaKey: js.UndefOr[Boolean] = js.native
  /**
    * If set to boolean; tab won't blur the component but will be registered as the ENTER key
    */
  var useTabKey: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether or not the results will be displayed with a zebra table style
    */
  var useZebraStyle: js.UndefOr[Boolean] = js.native
  /**
    * initial value for the field
    */
  var value: js.UndefOr[js.Any] = js.native
  /**
    * name of JSON object property that represents its underlying value
    */
  var valueField: js.UndefOr[String] = js.native
  /**
    * regular expression to validate the values against
    */
  var vregex: js.UndefOr[js.Any] = js.native
  /**
    * type to validate against
    */
  var vtype: js.UndefOr[js.Any] = js.native
}

object Configuration {
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxConfig(value: JQueryAjaxSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDuplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDuplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDuplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDuplicates")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFreeEntries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFreeEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFreeEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFreeEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSend(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.undefined)
        ret
    }
    @scala.inline
    def withCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataUrlParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataUrlParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataUrlParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataUrlParams")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledField")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
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
    def withExpandOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTrigger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoMsgCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoMsgCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoMsgCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoMsgCls")(js.undefined)
        ret
    }
    @scala.inline
    def withInputCfg(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputCfg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputCfg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputCfg")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidCls")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDropHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDropHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDropHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDropHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEntryLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntryLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEntryLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntryLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEntryRenderer(value: /* v */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntryRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMaxEntryRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntryRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSelection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSelectionRenderer(value: /* v */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSelectionRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMaxSelectionRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSelectionRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSuggestions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
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
    def withMinCharsRenderer(value: /* v */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCharsRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMinCharsRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCharsRenderer")(js.undefined)
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
    def withNoSuggestionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSuggestionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSuggestionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSuggestionText")(js.undefined)
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
    def withQueryParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParam")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: /* item */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withResultAsString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultAsString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultAsString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultAsString")(js.undefined)
        ret
    }
    @scala.inline
    def withResultAsStringDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultAsStringDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultAsStringDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultAsStringDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withResultsField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultsField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsField")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionContainer(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionRenderer(value: /* item */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectionRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionStacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStacked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStacked")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDir")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictSuggest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictSuggest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictSuggest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictSuggest")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCommaKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCommaKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCommaKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCommaKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTabKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTabKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTabKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTabKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUseZebraStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useZebraStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseZebraStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useZebraStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(js.undefined)
        ret
    }
    @scala.inline
    def withVregex(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vregex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVregex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vregex")(js.undefined)
        ret
    }
    @scala.inline
    def withVtype(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vtype")(js.undefined)
        ret
    }
  }
  
}

