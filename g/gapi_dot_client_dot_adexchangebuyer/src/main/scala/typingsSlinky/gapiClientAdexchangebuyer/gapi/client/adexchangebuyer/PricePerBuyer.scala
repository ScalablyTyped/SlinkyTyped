package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricePerBuyer extends js.Object {
  /** Optional access type for this buyer. */
  var auctionTier: js.UndefOr[String] = js.native
  /** Reference to the buyer that will get billed. */
  var billedBuyer: js.UndefOr[Buyer] = js.native
  /**
    * The buyer who will pay this price. If unset, all buyers can pay this price (if the advertisers match, and there's no more specific rule matching the
    * buyer).
    */
  var buyer: js.UndefOr[Buyer] = js.native
  /** The specified price */
  var price: js.UndefOr[Price] = js.native
}

object PricePerBuyer {
  @scala.inline
  def apply(): PricePerBuyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricePerBuyer]
  }
  @scala.inline
  implicit class PricePerBuyerOps[Self <: PricePerBuyer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuctionTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auctionTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuctionTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auctionTier")(js.undefined)
        ret
    }
    @scala.inline
    def withBilledBuyer(value: Buyer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billedBuyer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilledBuyer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billedBuyer")(js.undefined)
        ret
    }
    @scala.inline
    def withBuyer(value: Buyer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyer")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
  }
  
}

