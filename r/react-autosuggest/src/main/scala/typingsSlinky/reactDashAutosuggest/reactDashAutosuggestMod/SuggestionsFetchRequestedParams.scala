package typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod

import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestStrings.`escape-pressed`
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestStrings.`input-changed`
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestStrings.`input-focused`
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestStrings.`suggestion-selected`
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestStrings.`suggestions-revealed`
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

