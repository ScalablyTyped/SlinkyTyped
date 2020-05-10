package typingsSlinky.paypalRestSdk

import typingsSlinky.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOther extends js.Object {
  var other: Currency = js.native
  var paypal: Currency = js.native
}

object AnonOther {
  @scala.inline
  def apply(other: Currency, paypal: Currency): AnonOther = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], paypal = paypal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOther]
  }
  @scala.inline
  implicit class AnonOtherOps[Self <: AnonOther] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOther(value: Currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaypal(value: Currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paypal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

