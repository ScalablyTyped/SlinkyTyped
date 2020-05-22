package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsNumbers.`0`
import typingsSlinky.dateFns.dateFnsNumbers.`1`
import typingsSlinky.dateFns.dateFnsNumbers.`2`
import typingsSlinky.dateFns.dateFnsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FractionDigits extends js.Object {
  var fractionDigits: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
}

object FractionDigits {
  @scala.inline
  def apply(fractionDigits: `0` | `1` | `2` | `3` = null): FractionDigits = {
    val __obj = js.Dynamic.literal()
    if (fractionDigits != null) __obj.updateDynamic("fractionDigits")(fractionDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[FractionDigits]
  }
}

