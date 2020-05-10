package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Terms for Private Auctions. Note that Private Auctions can be created only
  * by the seller, but they can be returned in a get or list request.
  */
@js.native
trait SchemaNonGuaranteedAuctionTerms extends js.Object {
  /**
    * True if open auction buyers are allowed to compete with invited buyers in
    * this private auction.
    */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.native
  /**
    * Reserve price for the specified buyer.
    */
  var reservePricesPerBuyer: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.native
}

object SchemaNonGuaranteedAuctionTerms {
  @scala.inline
  def apply(): SchemaNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonGuaranteedAuctionTerms]
  }
  @scala.inline
  implicit class SchemaNonGuaranteedAuctionTermsOps[Self <: SchemaNonGuaranteedAuctionTerms] (val x: Self) extends AnyVal {
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
    def withReservePricesPerBuyer(value: js.Array[SchemaPricePerBuyer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservePricesPerBuyer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservePricesPerBuyer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservePricesPerBuyer")(js.undefined)
        ret
    }
  }
  
}

