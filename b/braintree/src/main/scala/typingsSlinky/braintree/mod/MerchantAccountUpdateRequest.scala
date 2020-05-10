package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantAccountUpdateRequest extends js.Object {
  var business: js.UndefOr[MerchantBusinessRequest] = js.native
  var funding: MerchantFunding = js.native
  var id: String = js.native
  var individual: MerchantIndividualRequest = js.native
  var masterMerchantAccountId: String = js.native
}

object MerchantAccountUpdateRequest {
  @scala.inline
  def apply(
    funding: MerchantFunding,
    id: String,
    individual: MerchantIndividualRequest,
    masterMerchantAccountId: String
  ): MerchantAccountUpdateRequest = {
    val __obj = js.Dynamic.literal(funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any], masterMerchantAccountId = masterMerchantAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantAccountUpdateRequest]
  }
  @scala.inline
  implicit class MerchantAccountUpdateRequestOps[Self <: MerchantAccountUpdateRequest] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
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
  }
  
}

