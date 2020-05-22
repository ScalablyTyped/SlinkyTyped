package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.Cursor
import typingsSlinky.atom.atomStrings.Word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `9` extends js.Object {
  var newValue: Word | Cursor
  var oldValue: js.UndefOr[Word | Cursor] = js.undefined
}

object `9` {
  @scala.inline
  def apply(newValue: Word | Cursor, oldValue: Word | Cursor = null): `9` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
}

