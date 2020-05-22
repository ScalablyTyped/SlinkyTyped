package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.limited
import typingsSlinky.atom.atomStrings.no
import typingsSlinky.atom.atomStrings.undecided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends js.Object {
  var newValue: limited | no | undecided
  var oldValue: js.UndefOr[limited | no | undecided] = js.undefined
}

object `2` {
  @scala.inline
  def apply(newValue: limited | no | undecided, oldValue: limited | no | undecided = null): `2` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

