package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed information about the merchant.
  */
@js.native
trait MerchantInfo extends js.Object {
  /**
    * The ID of the merchant account with Google Pay.
    *
    * You can find this ID on {@link
    * https://payments.developers.google.com} once you have registered for
    * the Google Pay API.
    *
    * This field should only be set when you integrate on web on the
    * production environment.
    */
  var merchantId: String = js.native
  /**
    * A user visible merchant name.
    *
    * This name may be shown to the user in Google Pay to describe who the
    * user made a transaction with.
    *
    * This field is optional. If not set, the Business name in your Google
    * Pay Developer Profile will be used.
    */
  var merchantName: js.UndefOr[String] = js.native
}

object MerchantInfo {
  @scala.inline
  def apply(merchantId: String): MerchantInfo = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantInfo]
  }
  @scala.inline
  implicit class MerchantInfoOps[Self <: MerchantInfo] (val x: Self) extends AnyVal {
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
    def withMerchantName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantName")(js.undefined)
        ret
    }
  }
  
}

