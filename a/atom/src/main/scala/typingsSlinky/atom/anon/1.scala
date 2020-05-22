package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.always
import typingsSlinky.atom.atomStrings.no
import typingsSlinky.atom.atomStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var newValue: no | yes | always
  var oldValue: js.UndefOr[no | yes | always] = js.undefined
}

object `1` {
  @scala.inline
  def apply(newValue: no | yes | always, oldValue: no | yes | always = null): `1` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

