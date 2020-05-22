package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.Bottom
import typingsSlinky.atom.atomStrings.Left
import typingsSlinky.atom.atomStrings.Right
import typingsSlinky.atom.atomStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `13` extends js.Object {
  var newValue: Top | Right | Bottom | Left
  var oldValue: js.UndefOr[Top | Right | Bottom | Left] = js.undefined
}

object `13` {
  @scala.inline
  def apply(newValue: Top | Right | Bottom | Left, oldValue: Top | Right | Bottom | Left = null): `13` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
}

