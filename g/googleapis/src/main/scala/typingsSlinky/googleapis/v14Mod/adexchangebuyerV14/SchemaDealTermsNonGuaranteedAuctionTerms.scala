package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDealTermsNonGuaranteedAuctionTerms extends js.Object {
  /**
    * True if open auction buyers are allowed to compete with invited buyers in
    * this private auction (buyer-readonly).
    */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.native
  /**
    * Reserve price for the specified buyer.
    */
  var reservePricePerBuyers: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.native
}

object SchemaDealTermsNonGuaranteedAuctionTerms {
  @scala.inline
  def apply(): SchemaDealTermsNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTermsNonGuaranteedAuctionTerms]
  }
  @scala.inline
  implicit class SchemaDealTermsNonGuaranteedAuctionTermsOps[Self <: SchemaDealTermsNonGuaranteedAuctionTerms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoOptimizePrivateAuction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOptimizePrivateAuction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoOptimizePrivateAuction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOptimizePrivateAuction")(js.undefined)
        ret
    }
    @scala.inline
    def withReservePricePerBuyers(value: js.Array[SchemaPricePerBuyer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservePricePerBuyers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservePricePerBuyers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservePricePerBuyers")(js.undefined)
        ret
    }
  }
  
}

