package typingsSlinky.reactAutosuggest.mod

import slinky.core.TagMod
import typingsSlinky.reactAutosuggest.reactAutosuggestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutosuggestPropsSingleSection[TSuggestion]
  extends AutosuggestPropsBase[TSuggestion]
     with AutosuggestProps[TSuggestion, js.Any] {
  /**
    * Set it to true if you'd like to display suggestions in multiple sections (with optional titles).
    */
  var multiSection: js.UndefOr[`false`] = js.native
  /**
    * These are the suggestions that will be displayed. Items can take an arbitrary shape.
    */
  var suggestions: js.Array[TSuggestion] = js.native
}

object AutosuggestPropsSingleSection {
  @scala.inline
  def apply[TSuggestion](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => TagMod[Any],
    suggestions: js.Array[TSuggestion]
  ): AutosuggestPropsSingleSection[TSuggestion] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestPropsSingleSection[TSuggestion]]
  }
  @scala.inline
  implicit class AutosuggestPropsSingleSectionOps[Self[tsuggestion] <: AutosuggestPropsSingleSection[tsuggestion], TSuggestion] (val x: Self[TSuggestion]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSuggestion] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSuggestion]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSuggestion] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSuggestion] with Other]
    @scala.inline
    def withSuggestions(value: js.Array[TSuggestion]): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiSection(value: `false`): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSection: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSection")(js.undefined)
        ret
    }
  }
  
}

