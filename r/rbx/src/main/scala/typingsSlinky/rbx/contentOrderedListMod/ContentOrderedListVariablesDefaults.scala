package typingsSlinky.rbx.contentOrderedListMod

import typingsSlinky.rbx.rbxStrings.`lower-alpha`
import typingsSlinky.rbx.rbxStrings.`lower-roman`
import typingsSlinky.rbx.rbxStrings.`upper-alpha`
import typingsSlinky.rbx.rbxStrings.`upper-roman`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentOrderedListVariablesDefaults extends js.Object {
  var types: `lower-alpha` | `lower-roman` | `upper-alpha` | `upper-roman`
}

object ContentOrderedListVariablesDefaults {
  @scala.inline
  def apply(types: `lower-alpha` | `lower-roman` | `upper-alpha` | `upper-roman`): ContentOrderedListVariablesDefaults = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOrderedListVariablesDefaults]
  }
}

