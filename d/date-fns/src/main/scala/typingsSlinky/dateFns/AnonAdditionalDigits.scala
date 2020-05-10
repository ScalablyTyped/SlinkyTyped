package typingsSlinky.dateFns

import typingsSlinky.dateFns.dateFnsNumbers.`0`
import typingsSlinky.dateFns.dateFnsNumbers.`1`
import typingsSlinky.dateFns.dateFnsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdditionalDigits extends js.Object {
  var additionalDigits: js.UndefOr[`0` | `1` | `2`] = js.native
}

object AnonAdditionalDigits {
  @scala.inline
  def apply(): AnonAdditionalDigits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAdditionalDigits]
  }
  @scala.inline
  implicit class AnonAdditionalDigitsOps[Self <: AnonAdditionalDigits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalDigits(value: `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDigits")(js.undefined)
        ret
    }
  }
  
}

