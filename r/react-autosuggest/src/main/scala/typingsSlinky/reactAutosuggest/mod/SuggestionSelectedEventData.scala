package typingsSlinky.reactAutosuggest.mod

import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.click
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionSelectedEventData[TSuggestion] extends js.Object {
  var method: click | enter = js.native
  var sectionIndex: Double | Null = js.native
  var suggestion: TSuggestion = js.native
  var suggestionIndex: Double = js.native
  var suggestionValue: String = js.native
}

object SuggestionSelectedEventData {
  @scala.inline
  def apply[TSuggestion](method: click | enter, suggestion: TSuggestion, suggestionIndex: Double, suggestionValue: String): SuggestionSelectedEventData[TSuggestion] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], suggestionIndex = suggestionIndex.asInstanceOf[js.Any], suggestionValue = suggestionValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionSelectedEventData[TSuggestion]]
  }
  @scala.inline
  implicit class SuggestionSelectedEventDataOps[Self[tsuggestion] <: SuggestionSelectedEventData[tsuggestion], TSuggestion] (val x: Self[TSuggestion]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSuggestion] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSuggestion]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSuggestion] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSuggestion] with Other]
    @scala.inline
    def withMethod(value: click | enter): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestion(value: TSuggestion): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestionIndex(value: Double): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestionValue(value: String): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionIndex(value: Double): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionIndexNull: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionIndex")(null)
        ret
    }
  }
  
}

