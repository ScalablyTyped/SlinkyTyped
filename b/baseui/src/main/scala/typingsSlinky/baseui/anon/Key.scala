package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var expanded: js.Array[typingsSlinky.react.mod.Key]
  var key: typingsSlinky.react.mod.Key
}

object Key {
  @scala.inline
  def apply(expanded: js.Array[typingsSlinky.react.mod.Key], key: typingsSlinky.react.mod.Key): Key = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

