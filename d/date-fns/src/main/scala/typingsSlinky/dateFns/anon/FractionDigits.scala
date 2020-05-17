package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsNumbers.`0`
import typingsSlinky.dateFns.dateFnsNumbers.`1`
import typingsSlinky.dateFns.dateFnsNumbers.`2`
import typingsSlinky.dateFns.dateFnsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FractionDigits extends js.Object {
  var fractionDigits: js.UndefOr[`0` | `1` | `2` | `3`] = js.native
}

object FractionDigits {
  @scala.inline
  def apply(): FractionDigits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FractionDigits]
  }
  @scala.inline
  implicit class FractionDigitsOps[Self <: FractionDigits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFractionDigits(value: `0` | `1` | `2` | `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractionDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFractionDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractionDigits")(js.undefined)
        ret
    }
  }
  
}

