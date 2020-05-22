package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsNumbers.`0`
import typingsSlinky.dateFns.dateFnsNumbers.`1`
import typingsSlinky.dateFns.dateFnsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalDigits extends js.Object {
  var additionalDigits: js.UndefOr[`0` | `1` | `2`] = js.undefined
}

object AdditionalDigits {
  @scala.inline
  def apply(additionalDigits: `0` | `1` | `2` = null): AdditionalDigits = {
    val __obj = js.Dynamic.literal()
    if (additionalDigits != null) __obj.updateDynamic("additionalDigits")(additionalDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalDigits]
  }
}

