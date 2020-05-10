package typingsSlinky.reactToolbox.libAutocompleteAutocompleteMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactToolbox.libInputInputMod.InputProps
import typingsSlinky.reactToolbox.libInputInputMod.InputTheme
import typingsSlinky.reactToolbox.reactToolboxStrings.above
import typingsSlinky.reactToolbox.reactToolboxStrings.anywhere
import typingsSlinky.reactToolbox.reactToolboxStrings.auto
import typingsSlinky.reactToolbox.reactToolboxStrings.below
import typingsSlinky.reactToolbox.reactToolboxStrings.disabled
import typingsSlinky.reactToolbox.reactToolboxStrings.down
import typingsSlinky.reactToolbox.reactToolboxStrings.none
import typingsSlinky.reactToolbox.reactToolboxStrings.start
import typingsSlinky.reactToolbox.reactToolboxStrings.up
import typingsSlinky.reactToolbox.reactToolboxStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteProps
  extends InputProps
     with /**
  * Additional properties passed to inner Input component.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Determines if user can create a new option with the current typed value.
    * @default false
    */
  var allowCreate: js.UndefOr[Boolean] = js.native
  /**
    * Determines the opening direction. It can be auto, up or down.
    * @default auto
    */
  var direction: js.UndefOr[auto | up | down] = js.native
  /**
    * Whether component should keep focus after value change.
    * @default false
    */
  var keepFocusOnChange: js.UndefOr[Boolean] = js.native
  /**
    * If true, component can hold multiple values.
    * @default true
    */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
    * Callback function that is fired when the components's query value changes.
    */
  var onQueryChange: js.UndefOr[js.Function] = js.native
  /**
    * Determines if the selected list is shown above or below input. It can be above or below.
    * @default above
    */
  var selectedPosition: js.UndefOr[above | below | none] = js.native
  /**
    * Determines if the selected list is shown if the `value` keys don't exist in the source. Only works if passing the `value` prop as an Object.
    * @default false
    */
  var showSelectedWhenNotInSource: js.UndefOr[Boolean] = js.native
  /**
    * If true, the list of suggestions will not be filtered when a value is selected.
    * @default false
    */
  var showSuggestionsWhenValueIsSet: js.UndefOr[Boolean] = js.native
  /**
    * Object of key/values or array representing all items suggested.
    */
  var source: js.UndefOr[js.Any] = js.native
  /**
    * Determines how suggestions are supplied.
    * @default start
    */
  var suggestionMatch: js.UndefOr[disabled | start | anywhere | word] = js.native
  /**
    * Classnames object defining the component style.
    */
  @JSName("theme")
  var theme_AutocompleteProps: js.UndefOr[AutocompleteTheme with InputTheme] = js.native
}

object AutocompleteProps {
  @scala.inline
  def apply(): AutocompleteProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteProps]
  }
  @scala.inline
  implicit class AutocompletePropsOps[Self <: AutocompleteProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: auto | up | down): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepFocusOnChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepFocusOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepFocusOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepFocusOnChange")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withOnQueryChange(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQueryChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnQueryChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQueryChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedPosition(value: above | below | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSelectedWhenNotInSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectedWhenNotInSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSelectedWhenNotInSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectedWhenNotInSource")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSuggestionsWhenValueIsSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSuggestionsWhenValueIsSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSuggestionsWhenValueIsSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSuggestionsWhenValueIsSet")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
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
    def withSuggestionMatch(value: disabled | start | anywhere | word): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: AutocompleteTheme with InputTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

