package typingsSlinky.ejWebAll.ej.Autocomplete

import typingsSlinky.ejWebAll.ej.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers when the AJAX requests Begins.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggers when the AJAX requests complete. The request may get failed or succeed.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Triggers when the data requested from AJAX get failed.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  /** Triggers when the data requested from AJAX will get successfully loaded in the Autocomplete widget.
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.native
  /** Customize &quot;Add New&quot; text (label) to be added in the autocomplete popup list for the entered text when there are no suggestions for it.
    * @Default {Add New}
    */
  var addNewText: js.UndefOr[String] = js.native
  /** Allows new values to be added to the autocomplete input other than the values in the suggestion list. Normally, when there are no suggestions it will display â€œNo suggestionsâ€
    * label in the popup.
    * @Default {false}
    */
  var allowAddNew: js.UndefOr[Boolean] = js.native
  /** Enables or disables the sorting of suggestion list item. The default sort order is ascending order. You customize sort order.
    * @Default {true}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Enables or disables selecting the animation style for the popup list. Animation types can be selected through either of the following options,
    * @Default {slide}
    */
  var animateType: js.UndefOr[Animation | String] = js.native
  /** To focus the items in the suggestion list when the popup is shown. By default first item will be focused.
    * @Default {false}
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /** Enables or disables the case sensitive search.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[Boolean] = js.native
  /** Triggers when the text box value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Triggers after the suggestion popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  /** Triggers when Autocomplete widget is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** The root class for the Autocomplete textbox widget which helps in customizing its theme.
    * @Default {â€â€}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** The data source contains the list of data for the suggestions list. It can be a string array or JSON array or service URL that returns JSON.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.native
  /** The time delay (in milliseconds) after which the suggestion popup will be shown.
    * @Default {200}
    */
  var delaySuggestionTimeout: js.UndefOr[Double] = js.native
  /** The special character which acts as a separator for the given words for multi-mode search i.e. the text after the delimiter are considered as a separate word or query for search
    * operation.
    * @Default {â€™,â€™}
    */
  var delimiterChar: js.UndefOr[String] = js.native
  /** Triggers after the Autocomplete widget is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** The text to be displayed in the popup when there are no suggestions available for the entered text.
    * @Default {â€œNo suggestionsâ€}
    */
  var emptyResultText: js.UndefOr[String] = js.native
  /** Fills the autocomplete textbox with the first matched item from the suggestion list automatically based on the entered text when enabled.
    * @Default {false}
    */
  var enableAutoFill: js.UndefOr[Boolean] = js.native
  /** Enables or disables displaying the duplicate names present in the search result.
    * @Default {false}
    */
  var enableDistinct: js.UndefOr[Boolean] = js.native
  /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true. While refreshing the page, it retains the model value
    * from browser cookies or local storage.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Displays the Autocomplete widgetâ€™s content from right to left when enabled.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Enables or disables the Autocomplete textbox widget.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Mapping fields for the suggestion items of the Autocomplete textbox widget.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  /** Specifies the search filter type. There are several types of search filter available such as â€˜startswithâ€™, â€˜containsâ€™, â€˜endswithâ€™, â€˜lessthanâ€™,
    * â€˜lessthanorequalâ€™, â€˜greaterthanâ€™, â€˜greaterthanorequalâ€™, â€˜equalâ€™, â€˜notequalâ€™.
    * @Default {ej.filterType.StartsWith}
    */
  var filterType: js.UndefOr[String] = js.native
  /** Triggers after the autocomplete textbox is focused.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  /** Triggers after the Autocomplete textbox gets out of the focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  /** The height of the Autocomplete textbox.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** The search text can be highlighted in the AutoComplete suggestion list when enabled.
    * @Default {false}
    */
  var highlightSearch: js.UndefOr[Boolean] = js.native
  /** To enable or disable the diacritic characters of the Autocomplete suggestion list when filtering.
    * @Default {false}
    */
  var ignoreAccent: js.UndefOr[Boolean] = js.native
  /** Number of items to be displayed in the suggestion list.
    * @Default {0}
    */
  var itemsCount: js.UndefOr[Double] = js.native
  /** Set the localization culture for Autocomplete Widget.
    */
  var locale: js.UndefOr[String] = js.native
  /** Minimum number of character to be entered in the Autocomplete textbox to show the suggestion list.
    * @Default {1}
    */
  var minCharacter: js.UndefOr[Double] = js.native
  /** An Autocomplete column collection can be defined and customized through the multiColumnSettings property.Column's header, field, and stringFormat can be define via
    * multiColumnSettings properties.
    */
  var multiColumnSettings: js.UndefOr[MultiColumnSettings] = js.native
  /** Enables or disables selecting multiple values from the suggestion list. Multiple values can be selected through either of the following options,
    * @Default {ej.MultiSelectMode.None}
    */
  var multiSelectMode: js.UndefOr[MultiSelectMode | String] = js.native
  /** Triggers after the suggestion list is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  /** The height of the suggestion list.
    * @Default {â€œ152pxâ€}
    */
  var popupHeight: js.UndefOr[String] = js.native
  /** The width of the suggestion list.
    * @Default {â€œautoâ€}
    */
  var popupWidth: js.UndefOr[String] = js.native
  /** The query to retrieve the data from the data source.
    * @Default {null}
    */
  var query: js.UndefOr[Query] = js.native
  /** Indicates that the autocomplete textbox values can only be readable.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Triggers when an item has been selected from the suggestion list.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  /** Sets the value for the Autocomplete textbox based on the given input key value.
    */
  var selectValueByKey: js.UndefOr[Double] = js.native
  /** Enables or disables showing the message when there are no suggestions for the entered text.
    * @Default {true}
    */
  var showEmptyResultText: js.UndefOr[Boolean] = js.native
  /** Enables or disables the loading icon to intimate the searching operation. The loading icon is visible when there is a time delay to perform the search.
    * @Default {true}
    */
  var showLoadingIcon: js.UndefOr[Boolean] = js.native
  /** Enables the showPopup button in autocomplete textbox. When the showPopup button is clicked, it displays all the available data from the data source.
    * @Default {false}
    */
  var showPopupButton: js.UndefOr[Boolean] = js.native
  /** Enables or disables reset icon to clear the textbox values.
    * @Default {false}
    */
  var showResetIcon: js.UndefOr[Boolean] = js.native
  /** Enables or disables rounded corner.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Sort order specifies whether the suggestion list values has to be displayed in ascending or descending order.
    * @Default {ej.SortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[SortOrder | String] = js.native
  /** The template to display the suggestion list items with customized appearance.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** The jQuery validation error message to be displayed on form validation.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  /** The jQuery validation rules for form validation.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  /** The value to be displayed in the autocomplete textbox.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
  /** Enables or disables the visibility of the autocomplete textbox.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** The text to be displayed when the value of the autocomplete textbox is empty.
    * @Default {null}
    */
  var watermarkText: js.UndefOr[String] = js.native
  /** The width of the Autocomplete textbox.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withActionSuccess(value: /* e */ ActionSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withAddNewText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNewText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddNewText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNewText")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowAddNew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAddNew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAddNew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAddNew")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateType(value: Animation | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateType")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitiveSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitiveSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitiveSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitiveSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ ChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: /* e */ CloseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any | js.Array[_]): Self = {
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
    def withDelaySuggestionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delaySuggestionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelaySuggestionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delaySuggestionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiterChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiterChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterChar")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyResultText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyResultText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyResultText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyResultText")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutoFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoFill")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDistinct(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDistinct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDistinct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDistinct")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIn")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOut")(js.undefined)
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
    def withHighlightSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreAccent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAccent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreAccent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAccent")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
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
    def withMinCharacter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCharacter")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiColumnSettings(value: MultiColumnSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiColumnSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelectMode(value: MultiSelectMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: /* e */ OpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* e */ SelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectValueByKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectValueByKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectValueByKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectValueByKey")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEmptyResultText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptyResultText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEmptyResultText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptyResultText")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLoadingIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoadingIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLoadingIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoadingIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPopupButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopupButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPopupButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopupButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowResetIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showResetIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowResetIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showResetIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoundedCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoundedCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: SortOrder | String): Self = {
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
    def withTemplate(value: String): Self = {
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
    def withValidationMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
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
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWatermarkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatermarkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarkText")(js.undefined)
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

