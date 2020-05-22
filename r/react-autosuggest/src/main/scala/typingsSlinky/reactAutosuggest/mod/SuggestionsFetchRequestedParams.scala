package typingsSlinky.reactAutosuggest.mod

import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.`escape-pressed`
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.`input-changed`
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.`input-focused`
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.`suggestion-selected`
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.`suggestions-revealed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionsFetchRequestedParams extends js.Object {
  var reason: `input-changed` | `input-focused` | `escape-pressed` | `suggestions-revealed` | `suggestion-selected`
  var value: String
}

object SuggestionsFetchRequestedParams {
  @scala.inline
  def apply(
    reason: `input-changed` | `input-focused` | `escape-pressed` | `suggestions-revealed` | `suggestion-selected`,
    value: String
  ): SuggestionsFetchRequestedParams = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionsFetchRequestedParams]
  }
}

