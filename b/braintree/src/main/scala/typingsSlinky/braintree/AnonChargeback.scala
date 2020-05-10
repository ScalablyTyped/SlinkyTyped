package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChargeback extends js.Object {
  var Chargeback: String = js.native
}

object AnonChargeback {
  @scala.inline
  def apply(Chargeback: String): AnonChargeback = {
    val __obj = js.Dynamic.literal(Chargeback = Chargeback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChargeback]
  }
  @scala.inline
  implicit class AnonChargebackOps[Self <: AnonChargeback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChargeback(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Chargeback")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

