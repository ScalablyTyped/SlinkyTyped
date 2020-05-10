package typingsSlinky.reactAutosuggest.mod

import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutosuggestPropsBase[TSuggestion] extends js.Object {
  /**
    * Set it to true if you'd like to render suggestions even when the input is not focused.
    */
  var alwaysRenderSuggestions: js.UndefOr[Boolean] = js.native
  /**
    * Set it to false if you don't want Autosuggest to keep the input focused when suggestions are clicked/tapped.
    */
  var focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.native
  /**
    * Implement it to teach Autosuggest what should be the input value when suggestion is clicked.
    */
  var getSuggestionValue: GetSuggestionValue[TSuggestion] = js.native
  /**
    * 	Set it to true if you'd like Autosuggest to automatically highlight the first suggestion.
    */
  var highlightFirstSuggestion: js.UndefOr[Boolean] = js.native
  /**
    * Use it only if you have multiple Autosuggest components on a page.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Pass through arbitrary props to the input. It must contain at least value and onChange.
    */
  var inputProps: InputProps[TSuggestion] = js.native
  /**
    * Will be called every time the highlighted suggestion changes.
    */
  var onSuggestionHighlighted: js.UndefOr[OnSuggestionHighlighted] = js.native
  /**
    * Will be called every time suggestion is selected via mouse or keyboard.
    */
  var onSuggestionSelected: js.UndefOr[OnSuggestionSelected[TSuggestion]] = js.native
  /**
    * Will be called every time you need to set suggestions to [].
    */
  var onSuggestionsClearRequested: js.UndefOr[OnSuggestionsClearRequested] = js.native
  /**
    * Will be called every time you need to recalculate suggestions.
    */
  var onSuggestionsFetchRequested: SuggestionsFetchRequested = js.native
  /**
    * Use it only if you need to customize the rendering of the input.
    */
  var renderInputComponent: js.UndefOr[RenderInputComponent[TSuggestion]] = js.native
  /**
    * Use your imagination to define how suggestions are rendered.
    */
  var renderSuggestion: RenderSuggestion[TSuggestion] = js.native
  /**
    * Use it if you want to customize things inside the suggestions container beyond rendering the suggestions themselves.
    */
  var renderSuggestionsContainer: js.UndefOr[RenderSuggestionsContainer] = js.native
  /**
    * When the input is focused, Autosuggest will consult this function when to render suggestions.
    * Use it, for example, if you want to display suggestions when input value is at least 2 characters long.
    */
  var shouldRenderSuggestions: js.UndefOr[ShouldRenderSuggestions] = js.native
  /**
    * Use your imagination to style the Autosuggest.
    */
  var theme: js.UndefOr[Theme] = js.native
}

object AutosuggestPropsBase {
  @scala.inline
  def apply[TSuggestion](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => TagMod[Any]
  ): AutosuggestPropsBase[TSuggestion] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion))
    __obj.asInstanceOf[AutosuggestPropsBase[TSuggestion]]
  }
  @scala.inline
  implicit class AutosuggestPropsBaseOps[Self[tsuggestion] <: AutosuggestPropsBase[tsuggestion], TSuggestion] (val x: Self[TSuggestion]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSuggestion] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSuggestion]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSuggestion] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSuggestion] with Other]
    @scala.inline
    def withGetSuggestionValue(value: TSuggestion => String): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuggestionValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInputProps(value: InputProps[TSuggestion]): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSuggestionsFetchRequested(value: /* request */ SuggestionsFetchRequestedParams => Unit): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestionsFetchRequested")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderSuggestion(value: (TSuggestion, /* params */ RenderSuggestionParams) => TagMod[Any]): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuggestion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAlwaysRenderSuggestions(value: Boolean): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysRenderSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysRenderSuggestions: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysRenderSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusInputOnSuggestionClick(value: Boolean): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusInputOnSuggestionClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusInputOnSuggestionClick: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusInputOnSuggestionClick")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightFirstSuggestion(value: Boolean): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightFirstSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightFirstSuggestion: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightFirstSuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuggestionHighlighted(value: /* params */ SuggestionHighlightedParams => Unit): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestionHighlighted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuggestionHighlighted: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestionHighlighted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuggestionSelected(
      value: (SyntheticEvent[EventTarget with js.Any, Event_], /* data */ SuggestionSelectedEventData[TSuggestion]) => Unit
    ): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestionSelected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSuggestionSelected: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestionSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuggestionsClearRequested(value: () => Unit): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestionsClearRequested")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSuggestionsClearRequested: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestionsClearRequested")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderInputComponent(value: /* inputProps */ InputProps[TSuggestion] => TagMod[Any]): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderInputComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderInputComponent: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderInputComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSuggestionsContainer(value: /* params */ RenderSuggestionsContainerParams => TagMod[Any]): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuggestionsContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderSuggestionsContainer: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuggestionsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldRenderSuggestions(value: /* value */ String => Boolean): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldRenderSuggestions: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRenderSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

