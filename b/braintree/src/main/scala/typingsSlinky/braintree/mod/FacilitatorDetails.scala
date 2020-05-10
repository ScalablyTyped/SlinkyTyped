package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacilitatorDetails extends js.Object {
  var oauthApplicationClientId: String = js.native
  var oauthApplicationName: String = js.native
  var sourcePaymentMethodToken: String = js.native
}

object FacilitatorDetails {
  @scala.inline
  def apply(oauthApplicationClientId: String, oauthApplicationName: String, sourcePaymentMethodToken: String): FacilitatorDetails = {
    val __obj = js.Dynamic.literal(oauthApplicationClientId = oauthApplicationClientId.asInstanceOf[js.Any], oauthApplicationName = oauthApplicationName.asInstanceOf[js.Any], sourcePaymentMethodToken = sourcePaymentMethodToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacilitatorDetails]
  }
  @scala.inline
  implicit class FacilitatorDetailsOps[Self <: FacilitatorDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOauthApplicationClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthApplicationClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOauthApplicationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthApplicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourcePaymentMethodToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePaymentMethodToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

