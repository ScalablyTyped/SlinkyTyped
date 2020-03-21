package typingsSlinky.dateFns

import typingsSlinky.dateFns.dateFnsNumbers.`0`
import typingsSlinky.dateFns.dateFnsNumbers.`1`
import typingsSlinky.dateFns.dateFnsNumbers.`2`
import typingsSlinky.dateFns.dateFnsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFractionDigits extends js.Object {
  var fractionDigits: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
}

object AnonFractionDigits {
  @scala.inline
  def apply(fractionDigits: `0` | `1` | `2` | `3` = null): AnonFractionDigits = {
    val __obj = js.Dynamic.literal()
    if (fractionDigits != null) __obj.updateDynamic("fractionDigits")(fractionDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFractionDigits]
  }
}

