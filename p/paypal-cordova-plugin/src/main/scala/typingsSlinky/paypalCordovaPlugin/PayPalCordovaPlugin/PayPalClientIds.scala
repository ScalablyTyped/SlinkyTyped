package typingsSlinky.paypalCordovaPlugin.PayPalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPalClientIds extends js.Object {
  var PayPalEnvironmentProduction: String = js.native
  var PayPalEnvironmentSandbox: String = js.native
}

object PayPalClientIds {
  @scala.inline
  def apply(PayPalEnvironmentProduction: String, PayPalEnvironmentSandbox: String): PayPalClientIds = {
    val __obj = js.Dynamic.literal(PayPalEnvironmentProduction = PayPalEnvironmentProduction.asInstanceOf[js.Any], PayPalEnvironmentSandbox = PayPalEnvironmentSandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalClientIds]
  }
  @scala.inline
  implicit class PayPalClientIdsOps[Self <: PayPalClientIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayPalEnvironmentProduction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PayPalEnvironmentProduction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayPalEnvironmentSandbox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PayPalEnvironmentSandbox")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

