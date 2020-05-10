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

@js.native
trait ChangeEvent extends js.Object {
  var method: down | up | escape | enter | click | `type` = js.native
  var newValue: String = js.native
}

object ChangeEvent {
  @scala.inline
  def apply(method: down | up | escape | enter | click | `type`, newValue: String): ChangeEvent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
  @scala.inline
  implicit class ChangeEventOps[Self <: ChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: down | up | escape | enter | click | `type`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

