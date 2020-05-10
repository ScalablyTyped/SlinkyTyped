package typingsSlinky.reactAutosuggest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionHighlightedParams extends js.Object {
  var suggestion: js.Any = js.native
}

object SuggestionHighlightedParams {
  @scala.inline
  def apply(suggestion: js.Any): SuggestionHighlightedParams = {
    val __obj = js.Dynamic.literal(suggestion = suggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionHighlightedParams]
  }
  @scala.inline
  implicit class SuggestionHighlightedParamsOps[Self <: SuggestionHighlightedParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuggestion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

