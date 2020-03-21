package typingsSlinky.reactAutosuggest.mod

import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.`type`
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.click
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.down
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.enter
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.escape
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.up
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

