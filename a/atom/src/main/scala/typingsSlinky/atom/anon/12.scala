package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.`12px`
import typingsSlinky.atom.atomStrings.`14px`
import typingsSlinky.atom.atomStrings.`16px`
import typingsSlinky.atom.atomStrings.`18px`
import typingsSlinky.atom.atomStrings.`21px`
import typingsSlinky.atom.atomStrings.`24px`
import typingsSlinky.atom.atomStrings.`28px`
import typingsSlinky.atom.atomStrings.`32px`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `12` extends js.Object {
  var newValue: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`
  var oldValue: js.UndefOr[`12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`] = js.undefined
}

object `12` {
  @scala.inline
  def apply(
    newValue: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`,
    oldValue: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px` = null
  ): `12` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
}

