package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DealTermsRubiconNonGuaranteedTerms extends js.Object {
  /** Optional price for Rubicon priority access in the auction. */
  var priorityPrice: js.UndefOr[Price] = js.native
  /** Optional price for Rubicon standard access in the auction. */
  var standardPrice: js.UndefOr[Price] = js.native
}

object DealTermsRubiconNonGuaranteedTerms {
  @scala.inline
  def apply(): DealTermsRubiconNonGuaranteedTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsRubiconNonGuaranteedTerms]
  }
  @scala.inline
  implicit class DealTermsRubiconNonGuaranteedTermsOps[Self <: DealTermsRubiconNonGuaranteedTerms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPriorityPrice(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorityPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriorityPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorityPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardPrice(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardPrice")(js.undefined)
        ret
    }
  }
  
}

