package typingsSlinky.reactBootstrapTypeahead.mod

import slinky.core.TagMod
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeaheadProps[T /* <: TypeaheadModel */] extends js.Object {
  /* For localized accessibility: Should return a string indicating the number of results for screen readers.
    Receives the current results. */
  var a11yNumResults: js.UndefOr[js.Function0[Unit]] = js.native
  /* For localized accessibility: Should return a string indicating the number of selections for screen readers.
    Receives the current selections. */
  var a11yNumSelected: js.UndefOr[js.Function0[Unit]] = js.native
  /* Specify menu alignment. The default value is justify, which makes the menu as wide as the input and truncates long values.
    Specifying left or right will align the menu to that side and the width will be determined by the length of menu item values. */
  var align: js.UndefOr[TypeaheadAlign] = js.native
  /* Allows the creation of new selections on the fly. Any new items will be added to the list of selections,
    but not the list of original options unless handled as such by Typeahead's parent.
    The newly added item will always be returned as an object even if the other options are simply strings,
    so be sure your onChange callback can handle this. */
  var allowNew: js.UndefOr[
    Boolean | (js.Function2[/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
  ] = js.native
  /* Autofocus the input when the component initially mounts. */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /* Whether to render the menu inline or attach to document.body. */
  var bodyContainer: js.UndefOr[Boolean] = js.native
  /* Specify the size of the input. */
  var bsSize: js.UndefOr[TypeaheadBsSizes] = js.native
  /* Whether or not filtering should be case-sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /* Displays a button to clear the input when there are selections. */
  var clearButton: js.UndefOr[Boolean] = js.native
  /* The initial value displayed in the text input. */
  var defaultInputValue: js.UndefOr[String] = js.native
  /* Whether or not the menu is displayed upon initial render. */
  var defaultOpen: js.UndefOr[Boolean] = js.native
  /* Specify any pre-selected options. Use only if you want the component to be uncontrolled. */
  var defaultSelected: js.UndefOr[js.Array[T]] = js.native
  /* Whether to disable the input. Will also disable selections when multiple={true}. */
  var disabled: js.UndefOr[Boolean] = js.native
  /* Specify whether the menu should appear above the input. */
  var dropup: js.UndefOr[Boolean] = js.native
  /* Message displayed in the menu when there are no valid results.
    Passing a falsy value will hide the menu if no matches are found. */
  var emptyLabel: js.UndefOr[String] = js.native
  /* Either an array of fields in option to search, or a custom filtering callback. */
  var filterBy: js.UndefOr[
    js.Array[String] | (js.Function2[/* option */ T, /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
  ] = js.native
  /* Whether or not to automatically adjust the position of the menu when it reaches the viewport boundaries. */
  var flip: js.UndefOr[Boolean] = js.native
  /* Highlights the menu item if there is only one result and allows selecting that item by hitting enter.
    Does not work with allowNew. */
  var highlightOnlyResult: js.UndefOr[Boolean] = js.native
  /* An html id attribute, required for assistive technologies such as screen readers. */
  var id: js.UndefOr[String | Double] = js.native
  /* Whether the filter should ignore accents and other diacritical marks. */
  var ignoreDiacritics: js.UndefOr[Boolean] = js.native
  /* Props to be applied directly to the input. onBlur, onChange, onFocus, and onKeyDown are ignored. */
  var inputProps: js.UndefOr[InputProps] = js.native
  /* Bootstrap 4 only. Adds the `is-invalid` classname to the `form-control`. */
  var isInvalid: js.UndefOr[Boolean] = js.native
  /* Indicate whether an asynchronous data fetch is happening. */
  var isLoading: js.UndefOr[Boolean] = js.native
  /* Bootstrap 4 only. Adds the `is-valid` classname to the `form-control`. */
  var isValid: js.UndefOr[Boolean] = js.native
  /* Specify which option key to use for display or a render function.
    By default, the selector will use the label key. */
  var labelKey: js.UndefOr[TypeaheadLabelKey[T]] = js.native
  /* Maximum height of the dropdown menu. */
  var maxHeight: js.UndefOr[String] = js.native
  /* Maximum number of results to display by default. Mostly done for performance reasons
    so as not to render too many DOM nodes in the case of large data sets. */
  var maxResults: js.UndefOr[Double] = js.native
  /* DEPRECATED. Id applied to the top-level menu element. Required for accessibility. */
  var menuId: js.UndefOr[String] = js.native
  /* Number of input characters that must be entered before showing results. */
  var minLength: js.UndefOr[Double] = js.native
  /* Whether or not multiple selections are allowed. */
  var multiple: js.UndefOr[Boolean] = js.native
  /* Provides the ability to specify a prefix before the user-entered text to indicate that the selection will be new. No-op unless allowNew={true}. */
  var newSelectionPrefix: js.UndefOr[String] = js.native
  /* Invoked when the input is blurred. Receives an event. */
  var onBlur: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.native
  /* Invoked whenever items are added or removed. Receives an array of the selected options. */
  var onChange: js.UndefOr[js.Function1[/* selected */ js.Array[T], Unit]] = js.native
  /* Invoked when the input is focused. Receives an event. */
  var onFocus: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.native
  /* Invoked when the input value changes. Receives the string value of the input, as well as the original event. */
  var onInputChange: js.UndefOr[js.Function2[/* input */ String, /* e */ Event_, Unit]] = js.native
  /* Invoked when a key is pressed. Receives an event. */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.native
  /* DEPRECATED: Invoked when the menu is hidden. */
  var onMenuHide: js.UndefOr[js.Function0[Unit]] = js.native
  /* DEPRECATED: Invoked when the menu is shown. */
  var onMenuShow: js.UndefOr[js.Function0[Unit]] = js.native
  /* 	Invoked when menu visibility changes. */
  var onMenuToggle: js.UndefOr[js.Function1[/* show */ Boolean, Unit]] = js.native
  /* Invoked when the pagination menu item is clicked. */
  var onPaginate: js.UndefOr[js.Function2[/* e */ Event_, /* numResults */ Double, Unit]] = js.native
  /* Whether or not the menu should be displayed. undefined allows the component to control visibility,
    while true and false show and hide the menu, respectively. */
  var open: js.UndefOr[Boolean] = js.native
  /* Full set of options, including any pre-selected options. */
  var options: js.Array[T] = js.native
  /* Give user the ability to display additional results if the number of results exceeds maxResults. */
  var paginate: js.UndefOr[Boolean] = js.native
  /* Prompt displayed when large data sets are paginated. */
  var paginationText: js.UndefOr[String] = js.native
  /* Placeholder text for the input. */
  var placeholder: js.UndefOr[String] = js.native
  /* Whether to use fixed positioning for the menu, which is useful when rendering inside a
    container with overflow: hidden;. Uses absolute positioning by default. */
  var positionFixed: js.UndefOr[Boolean] = js.native
  /* Callback for custom menu rendering. */
  var renderMenu: js.UndefOr[
    js.Function2[/* results */ js.Array[TypeaheadResult[T]], /* menuProps */ js.Any, TagMod[Any]]
  ] = js.native
  /* Provides a hook for customized rendering of menu item contents. */
  var renderMenuItemChildren: js.UndefOr[
    js.Function3[
      /* option */ TypeaheadResult[T], 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ Double, 
      TagMod[Any]
    ]
  ] = js.native
  /* Provides a hook for customized rendering of tokens when multiple selections are enabled. */
  var renderToken: js.UndefOr[
    js.Function3[
      /* selectedItem */ T, 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ Double, 
      TagMod[Any]
    ]
  ] = js.native
  /* Allows selecting the hinted result by pressing enter. */
  var selectHintOnEnter: js.UndefOr[Boolean] = js.native
  /* The selected option(s) displayed in the input. Use this prop if you want to control the component via its parent. */
  var selected: js.UndefOr[js.Array[T]] = js.native
}

object TypeaheadProps {
  @scala.inline
  def apply[T](options: js.Array[T]): TypeaheadProps[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadProps[T]]
  }
  @scala.inline
  implicit class TypeaheadPropsOps[Self[t] <: TypeaheadProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOptions(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA11yNumResults(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a11yNumResults")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutA11yNumResults: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a11yNumResults")(js.undefined)
        ret
    }
    @scala.inline
    def withA11yNumSelected(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a11yNumSelected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutA11yNumSelected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a11yNumSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withAlign(value: TypeaheadAlign): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowNewFunction2(value: (/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T]) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNew")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAllowNew(
      value: Boolean | (js.Function2[/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNew: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNew")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyContainer(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyContainer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withBsSize(value: TypeaheadBsSizes): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsSize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withClearButton(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearButton: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButton")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultInputValue(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultInputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultInputValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultInputValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOpen(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOpen: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelected(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDropup(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropup: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropup")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyLabel(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterByFunction2(value: (/* option */ T, /* props */ AllTypeaheadOwnAndInjectedProps[T]) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFilterBy(
      value: js.Array[String] | (js.Function2[/* option */ T, /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterBy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFlip(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlip: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightOnlyResult(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightOnlyResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightOnlyResult: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightOnlyResult")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String | Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDiacritics(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiacritics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDiacritics: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiacritics")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: InputProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProps: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInvalid(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInvalid: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoading(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLoading: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsValid: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelKeyFunction1(value: T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabelKey(value: TypeaheadLabelKey[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuId")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withNewSelectionPrefix(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSelectionPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSelectionPrefix: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSelectionPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* e */ Event_ => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* selected */ js.Array[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* e */ Event_ => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInputChange(value: (/* input */ String, /* e */ Event_) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInputChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* e */ Event_ => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuHide(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMenuHide: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuShow(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMenuShow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuToggle(value: /* show */ Boolean => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMenuToggle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaginate(value: (/* e */ Event_, /* numResults */ Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaginate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPaginate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaginate")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginate(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationText")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionFixed(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionFixed: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMenu(value: (/* results */ js.Array[TypeaheadResult[T]], /* menuProps */ js.Any) => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderMenu: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMenuItemChildren(
      value: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => TagMod[Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMenuItemChildren")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderMenuItemChildren: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMenuItemChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderToken(
      value: (/* selectedItem */ T, /* props */ TypeaheadMenuProps[T], /* index */ Double) => TagMod[Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToken")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderToken: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectHintOnEnter(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectHintOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectHintOnEnter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectHintOnEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
  }
  
}

