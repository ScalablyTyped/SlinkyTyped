package typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod

import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestStrings.`type`
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestStrings.click
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestStrings.down
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestStrings.enter
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestStrings.escape
import typingsSlinky.reactDashAutosuggest.reactDashAutosuggestStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEvent extends js.Object {
  var method: down | up | escape | enter | click | `type`
  var newValue: String
}

object ChangeEvent {
  @scala.inline
  def apply(method: down | up | escape | enter | click | `type`, newValue: String): ChangeEvent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangeEvent]
  }
}

