package typingsSlinky.paypalRestSdk.mod

import typingsSlinky.paypalRestSdk.anon.Brandname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payee extends js.Object {
  var email: String = js.native
  var merchant_id: String = js.native
  var payee_display_metadata: js.UndefOr[Brandname] = js.native
}

object Payee {
  @scala.inline
  def apply(email: String, merchant_id: String): Payee = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], merchant_id = merchant_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payee]
  }
  @scala.inline
  implicit class PayeeOps[Self <: Payee] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerchant_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayee_display_metadata(value: Brandname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payee_display_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayee_display_metadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payee_display_metadata")(js.undefined)
        ret
    }
  }
  
}

