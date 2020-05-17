package typingsSlinky.jqueryTypeahead.RunningCoder.Typeahead

import typingsSlinky.jqueryTypeahead.JQuery
import typingsSlinky.jqueryTypeahead.jqueryTypeaheadBooleans.`false`
import typingsSlinky.jqueryTypeahead.jqueryTypeaheadBooleans.`true`
import typingsSlinky.jqueryTypeahead.jqueryTypeaheadStrings.any
import typingsSlinky.jqueryTypeahead.jqueryTypeaheadStrings.asc
import typingsSlinky.jqueryTypeahead.jqueryTypeaheadStrings.desc
import typingsSlinky.jqueryTypeahead.jqueryTypeaheadStrings.localStorage
import typingsSlinky.jqueryTypeahead.jqueryTypeaheadStrings.sessionStorage
import typingsSlinky.jqueryTypeahead.jqueryTypeaheadStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If enabled, the query and search results will ignore accents (`ãàáäâẽèéëêìíïîõòóöôùúüûñç`) and display every matches regardless of the punctuation.  Ex: `é = e`, `À = a`, etc.
    * It is possible to set a custom accent object, by simply setting `from` and `to` keys
    * * Using this option on large data sets (10,000+ items) might impact your search performances.
    *
    * @default false
    */
  var accent: js.UndefOr[Boolean | FromToPair] = js.native
  /**
    * If set to `true`, html will be added to add a backdrop under the search input and results.
    * It is possible to override the css options by passing an object to this option.
    */
  var backdrop: js.UndefOr[Boolean | CssObject] = js.native
  /**
    * If set to `true`, as soon as the Typeahead input is focused, the `backdrop` option will be displayed regardless.
    */
  var backdropOnFocus: js.UndefOr[`true`] = js.native
  /** Blur Typeahead when Tab key is pressed, if false Tab will go though search results */
  var blurOnTab: js.UndefOr[Boolean] = js.native
  /**
    * * If set to `true` or `localStorage`, the source data will be stored in `localStorage`.
    * * If set to `sessionStorage`, the source data will be stored in `sessionStorage`.
    */
  var cache: js.UndefOr[Boolean | localStorage | sessionStorage] = js.native
  /**
    * The callbacks are used to customize and add functionality to your Typeahead instance. You will find plenty of examples in the Demo section.
    * There are 3 ways to define the callbacks:
    * * Function `(recommended)`: Anonymous function calling a local function with parameters.
    * * String: Function name (can be namespaced) located on the window scope without any parameters.
    * * Array: First element is the function name accessible from the window scope, second element is an array containing the parameters.
    */
  var callback: js.UndefOr[Callback] = js.native
  /**
    * This option provides a small `"x"` on the right side of the input to clear the text,
    * similar to some browser's default behavior with `input[type="search"]`.
    */
  var cancelButton: js.UndefOr[Boolean] = js.native
  /**
    * Enabling this option will compress the data inside Localstorage.
    * * Setting `compression: true` requires `cache: true` option to be enabled.
    */
  var compression: js.UndefOr[Boolean] = js.native
  /**
    * By default, search text matching is reserved to `display` keys. A searched text can't match multiple keys.
    *
    * If the option is enabled with `true` or `array` of display keys, every item will reveive an additional key called `compiled`.
    * This key will then be searched first (using soften matching mechanism) for any matching results, then the `display` keys will
    * be searched (using a `"string perfect"` matching mechanism).
    *
    * If the option is set to true, the `template` option will be compiled into the `"compiled"` item key.
    *
    * It is also possible to set an Array of display keys instead of the complete template. Try it on
    * [Hockey_v1](http://www.runningcoder.org/jquerytypeahead/demo/#form-hockey_v1)
    */
  var correlativeTemplate: js.UndefOr[Boolean | js.Array[_]] = js.native
  /** Display debug information (RECOMMENDED for dev environment) */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * If `dynamic: true`, the delay (in milliseconds) will add a timer to prevent from sending a request on every key typed.
    * Instead the request(s) will be sent once the delay expires.
    *
    * @default 300
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * The key that will be searched for typeahead matching results inside source objects.
    * It is possible to search through multiple keys by simply adding them inside the configuration array.
    */
  var display: js.UndefOr[js.Array[String]] = js.native
  /**
    * If a string a specified, a dropdown filter will be created between the search input and the search submit button using the `source.group` as indexes.
    * The string value will appear at the end of the dropdown and will filter through all the sources.
    *
    * If an array of objects is set, the dropdownFilter will be built based on it. It is then possible to create filters based on item matching key:value. -
    * [Demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-hockey_v1)
    */
  var dropdownFilter: js.UndefOr[Boolean | string | js.Array[DropdownFilterItem]] = js.native
  /**
    * By default, the typeahead will only load once the source data.
    * Although you can change this behavior and request the data to be re-loaded on every "input" event (similar to
    * keypress). - [Demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-user_v1)
    * * Note that you can modify the Ajax request to send the query with `{{query}}` modifier.
    *
    * @default false
    */
  var dynamic: js.UndefOr[Boolean] = js.native
  /**
    * If filters objects are defined, the Typeahead source data will be filtered based on the `"selected"` / `"checked"` checkboxes,
    * radios and selects based on `"OR"` and `"AND"` filtering similar to database queries.
    * * `selector` is the jquery selector to reach the unique input type `"checkbox"`, `"radio"` or select tag
    * * `key` the object key that will be filtered, you can use "dot" notation to reach deep object properties,
    * but in that case extra processing will be performed. Ex `object.key.is.deep`
    * * `|` key prefix means "OR" filtering, the object key CAN match the value
    * * `&` key prefix means "AND" filtering, the object key HAS to match the value
    *
    * Ex `dynamicFilter: [{ selector: "#assassin", key: "|tags.Assassin" }],`
    */
  var dynamicFilter: js.UndefOr[`false` | js.Array[DynamicFilterItem]] = js.native
  /**
    * In case there are no results to be displayed, a row will be displayed containing this template.
    * It is possible to display the query using `{{query}}` string.
    */
  var emptyTemplate: js.UndefOr[String | (js.Function1[/* query */ js.UndefOr[String], String | JQuery])] = js.native
  /**
    * If set to function, every element will be filtered using this custom rule AFTER the regular Typeahead filters have been applied.
    */
  var filter: js.UndefOr[
    Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
  ] = js.native
  /**
    * If enabled, the source data will be generated (doing Ajax request and preparing to data to be searched)
    * on page load instead of waiting for the input to be focused.
    * * This option does not work well with `dynamic: true` unless some other configuration is adjusted.
    */
  var generateOnLoad: js.UndefOr[Boolean] = js.native
  /**
    * If set to `true`, the results will grouped by the group name specified inside `source`.
    *
    * If set to `string`, the results will be grouped by the corresponding object key.
    * Ex: group: `"conference"` will group the hockey teams by `"Western"` and `"Eastern"` conferences in [hockey_v1 demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-hockey_v1)
    *
    * If an Object is set: `key`: Grouping key. `template`: Grouping template in the result list (custom header text), can be string or function.
    *
    * @default false
    */
  var group: js.UndefOr[Boolean | String | GroupSetting] = js.native
  /**
    * By default, the groups will be output in the same order as they are defined in `source`.
    * Set `"asc"` or `"desc"` to have the group name sorted ascending or descending
    * Set an `Array` to specify the group order to appear in the search result
    */
  var groupOrder: js.UndefOr[
    asc | desc | js.Array[String] | (js.Function5[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* result */ js.UndefOr[js.Any], 
      /* resultCount */ js.UndefOr[Double], 
      /* resultCountPerGroup */ js.UndefOr[Double], 
      js.Array[_]
    ])
  ] = js.native
  /** Set a custom template for the groups */
  var groupTemplate: js.UndefOr[Null] = js.native
  /**
    * The search result(s) will receive the <strong> HTML tag around the matched query.
    *
    * If set to `true`, only the display keys will be highlighted
    *
    * If set to `"any"`, any string within the template will be highlighted
    *
    * @default true
    */
  var highlight: js.UndefOr[any | Boolean] = js.native
  /**
    * A suggestion text will appear if there is an item inside the result list that starts by the user query.
    * Also pressing the right arrow at the end of the search input text will autocomplete the query with the suggested hint and call `callback.onClickBefore` with the selected item.
    *
    * @default false
    */
  var hint: js.UndefOr[Boolean | CssObject] = js.native
  /**
    * If a string is defined, every result item will receive the string as href attribute replacing any `{{itemKey}}` by the `item's value`.
    * It is possible to apply an extra operation of `"slugify"` on the value `{{url|slugify}}`. - [Demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-beer_v1)
    */
  var href: js.UndefOr[String | (js.Function1[/* item */ js.UndefOr[js.Any], String])] = js.native
  /**
    * The jQuery input selector is only required if the Typeahead was initialized without a jQuery object.
    * In that case, if no input is found, the Typeahead is dropped.
    */
  var input: js.UndefOr[String] = js.native
  /** Display a loading animation when typeahead is doing request / searching for results */
  var loadingAnimation: js.UndefOr[`true`] = js.native
  /** If set to function, every element will be filtered using this custom rule AFTER the regular Typeahead filters have been applied. */
  var matcher: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean]
  ] = js.native
  /**
    * The maximum number of search results that will appear inside the list. Set 0 to display ALL search results.
    * It is possible to combine `maxItem` with `maxItemPerGroup` to get different results.
    *
    * @default 8
    */
  var maxItem: js.UndefOr[`false` | Double] = js.native
  /** Set a maximum results per group if `group: true` configuration is enabled */
  var maxItemPerGroup: js.UndefOr[Double] = js.native
  /**
    * The maximum number of characters typed inside the input to perform a search.
    *
    * @default false
    */
  var maxLength: js.UndefOr[`false` | Double] = js.native
  /**
    * The number of characters typed inside the search input before searching for results.
    * It is possible to set this option to 0 and combine it with `searchOnFocus: true` to display a set of results by default.
    *
    * @default 2
    */
  var minLength: js.UndefOr[Double] = js.native
  /** `multiselect` configuration */
  var multiselect: js.UndefOr[MultiSelectSettings] = js.native
  /**
    * If enabled, an item will HAVE TO be selected in order to submit the form.
    * Use this option if you want to restrict searching to your data set only.
    */
  var mustSelectItem: js.UndefOr[Boolean] = js.native
  /**
    * `false` The position of the matched query can be anywhere inside the result string
    *
    * `true` The query can only be match if the result string starts by the query characters.
    *
    * @default false
    */
  var offset: js.UndefOr[Boolean] = js.native
  /**
    * Takes the default order in which the data was given.
    * If `"asc"` or `"desc"` is set, they results will re-order based on display key.
    */
  var order: js.UndefOr[asc | desc] = js.native
  /**
    * If a jQuery string selector or jQuery object is specified, the typeahead results will appear in that container instead of the default one.
    * If the option is set to `false`, the HTML result list will not be built.
    * Use this option for filtering "already on page" HTML list elements with show / hide.
    */
  var resultContainer: js.UndefOr[string | `false` | JQuery] = js.native
  /**
    * If enabled, the typeahead will display results (if any) on input focus. You can combine this option with the input
    * attribute `"autofocus"` to display results when the page is loaded.
    */
  var searchOnFocus: js.UndefOr[Boolean] = js.native
  var selector: js.UndefOr[Selector] = js.native
  /**
    * The source option corresponds to the data set(s) that Typeahead will look through to find matches for the user query string.
    * Inside the source, you can have multiple lists of data (groups)
    * It is possible to send an async request inside the data function using `$.Deferred`
    * `source.group` configuration:
    */
  var source: js.UndefOr[Source | js.Array[Source] | SourceTable] = js.native
  /**
    * The template is a HTML string containing keys that will replaced by match results object keys.
    * You MUST use `{{variable}}` delimiters for your string to be replaced.
    *
    * You can also reach multi-level deep object properties using regular `"."` format, `{{variable.secordlevel.thirdlevel}}`
    *
    * If you need to print the item values inside HTML data attributes, it is possible to use `{{variable|raw}}`.
    * That optional modifier will make sure to get the unmodified value.
    */
  var template: js.UndefOr[
    String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String])
  ] = js.native
  /**
    * When an item is selected / clicked, by default the `"Matched key"` will go inside the input.
    * By defining a `templateValue`, the text that will result in the input can be customized.
    */
  var templateValue: js.UndefOr[String] = js.native
  /** This is a `cache` configuration, it sets the storage time to live in milliseconds. */
  var ttl: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccent(value: Boolean | FromToPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdrop(value: Boolean | CssObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropOnFocus(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurOnTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurOnTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurOnTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurOnTab")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean | localStorage | sessionStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: Callback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrelativeTemplate(value: Boolean | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlativeTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrelativeTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlativeTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownFilter(value: Boolean | string | js.Array[DropdownFilterItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicFilter(value: `false` | js.Array[DynamicFilterItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyTemplateFunction1(value: /* query */ js.UndefOr[String] => String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmptyTemplate(value: String | (js.Function1[/* query */ js.UndefOr[String], String | JQuery])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction2(value: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFilter(
      value: Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: Boolean | String | GroupSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupOrderFunction5(
      value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any], /* resultCount */ js.UndefOr[Double], /* resultCountPerGroup */ js.UndefOr[Double]) => js.Array[_]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOrder")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withGroupOrder(
      value: asc | desc | js.Array[String] | (js.Function5[
          /* node */ js.UndefOr[JQuery], 
          /* query */ js.UndefOr[String], 
          /* result */ js.UndefOr[js.Any], 
          /* resultCount */ js.UndefOr[Double], 
          /* resultCountPerGroup */ js.UndefOr[Double], 
          js.Array[_]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight(value: any | Boolean): Self = {
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
    def withHint(value: Boolean | CssObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(js.undefined)
        ret
    }
    @scala.inline
    def withHrefFunction1(value: /* item */ js.UndefOr[js.Any] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHref(value: String | (js.Function1[/* item */ js.UndefOr[js.Any], String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingAnimation(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withMatcher(value: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItem(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItem")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItemPerGroup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemPerGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItemPerGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemPerGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiselect(value: MultiSelectSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiselect")(js.undefined)
        ret
    }
    @scala.inline
    def withMustSelectItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustSelectItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMustSelectItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustSelectItem")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: asc | desc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withResultContainer(value: string | `false` | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: Selector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Source | js.Array[Source] | SourceTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateFunction2(value: (/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTemplate(
      value: String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
  }
  
}

