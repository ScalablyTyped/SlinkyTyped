package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantAccountCreateRequest extends js.Object {
  var business: js.UndefOr[MerchantBusinessRequest] = js.native
  var funding: MerchantFunding = js.native
  var id: js.UndefOr[String] = js.native
  var individual: MerchantIndividualRequest = js.native
  var masterMerchantAccountId: String = js.native
  var tosAccepted: Boolean = js.native
}

object MerchantAccountCreateRequest {
  @scala.inline
  def apply(
    funding: MerchantFunding,
    individual: MerchantIndividualRequest,
    masterMerchantAccountId: String,
    tosAccepted: Boolean
  ): MerchantAccountCreateRequest = {
    val __obj = js.Dynamic.literal(funding = funding.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any], masterMerchantAccountId = masterMerchantAccountId.asInstanceOf[js.Any], tosAccepted = tosAccepted.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantAccountCreateRequest]
  }
  @scala.inline
  implicit class MerchantAccountCreateRequestOps[Self <: MerchantAccountCreateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunding(value: MerchantFunding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndividual(value: MerchantIndividualRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasterMerchantAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterMerchantAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTosAccepted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tosAccepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBusiness(value: MerchantBusinessRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

