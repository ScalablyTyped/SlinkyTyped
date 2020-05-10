package typingsSlinky.reactAutosuggest.mod

import slinky.core.TagMod
import typingsSlinky.reactAutosuggest.reactAutosuggestBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutosuggestPropsMultiSection[TSuggestion, TSection]
  extends AutosuggestPropsBase[TSuggestion]
     with AutosuggestProps[TSuggestion, TSection] {
  /**
    * Implement it to teach Autosuggest where to find the suggestions for every section.
    */
  var getSectionSuggestions: js.UndefOr[GetSectionSuggestions[TSuggestion, TSection]] = js.native
  /**
    * Set it to true if you'd like to display suggestions in multiple sections (with optional titles).
    */
  var multiSection: `true` = js.native
  /**
    * Use your imagination to define how section titles are rendered.
    */
  var renderSectionTitle: js.UndefOr[RenderSectionTitle] = js.native
  /**
    * These are the suggestions that will be displayed. Items can take an arbitrary shape.
    */
  var suggestions: js.Array[TSection] = js.native
}

object AutosuggestPropsMultiSection {
  @scala.inline
  def apply[TSuggestion, TSection](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    multiSection: `true`,
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => TagMod[Any],
    suggestions: js.Array[TSection]
  ): AutosuggestPropsMultiSection[TSuggestion, TSection] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], multiSection = multiSection.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestPropsMultiSection[TSuggestion, TSection]]
  }
  @scala.inline
  implicit class AutosuggestPropsMultiSectionOps[Self[tsuggestion, tsection] <: AutosuggestPropsMultiSection[tsuggestion, tsection], TSuggestion, TSection] (val x: Self[TSuggestion, TSection]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSuggestion, TSection] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSuggestion, TSection]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSuggestion, TSection]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSuggestion, TSection]) with Other]
    @scala.inline
    def withMultiSection(value: `true`): Self[TSuggestion, TSection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestions(value: js.Array[TSection]): Self[TSuggestion, TSection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSectionSuggestions(value: TSection => js.Array[TSuggestion]): Self[TSuggestion, TSection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSectionSuggestions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSectionSuggestions: Self[TSuggestion, TSection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSectionSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSectionTitle(value: /* section */ js.Any => TagMod[Any]): Self[TSuggestion, TSection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSectionTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderSectionTitle: Self[TSuggestion, TSection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSectionTitle")(js.undefined)
        ret
    }
  }
  
}

