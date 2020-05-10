package typingsSlinky.braintreeWebDropIn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait googlePayCreateOptions extends js.Object {
  var button: js.UndefOr[js.Any] = js.native
  var googlePayVersion: js.UndefOr[String] = js.native
  var merchantId: String = js.native
  var transactionInfo: js.Any = js.native
}

object googlePayCreateOptions {
  @scala.inline
  def apply(merchantId: String, transactionInfo: js.Any): googlePayCreateOptions = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any], transactionInfo = transactionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[googlePayCreateOptions]
  }
  @scala.inline
  implicit class googlePayCreateOptionsOps[Self <: googlePayCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMerchantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButton(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withGooglePayVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePayVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePayVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePayVersion")(js.undefined)
        ret
    }
  }
  
}

