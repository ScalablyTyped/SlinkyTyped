package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplaceDealParty extends js.Object {
  /** The buyer/seller associated with the deal. One of buyer/seller is specified for a deal-party. */
  var buyer: js.UndefOr[Buyer] = js.native
  /** The buyer/seller associated with the deal. One of buyer/seller is specified for a deal party. */
  var seller: js.UndefOr[Seller] = js.native
}

object MarketplaceDealParty {
  @scala.inline
  def apply(): MarketplaceDealParty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketplaceDealParty]
  }
  @scala.inline
  implicit class MarketplaceDealPartyOps[Self <: MarketplaceDealParty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSeller(value: Seller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seller")(js.undefined)
        ret
    }
  }
  
}

