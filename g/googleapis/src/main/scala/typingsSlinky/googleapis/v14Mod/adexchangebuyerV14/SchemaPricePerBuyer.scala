package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to specify pricing rules for buyers. Each PricePerBuyer in a product
  * can become [0,1] deals. To check if there is a PricePerBuyer for a
  * particular buyer we look for the most specific matching rule - we first
  * look for a rule matching the buyer and otherwise look for a matching rule
  * where no buyer is set.
  */
@js.native
trait SchemaPricePerBuyer extends js.Object {
  /**
    * Optional access type for this buyer.
    */
  var auctionTier: js.UndefOr[String] = js.native
  /**
    * Reference to the buyer that will get billed.
    */
  var billedBuyer: js.UndefOr[SchemaBuyer] = js.native
  /**
    * The buyer who will pay this price. If unset, all buyers can pay this
    * price (if the advertisers match, and there&#39;s no more specific rule
    * matching the buyer).
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.native
  /**
    * The specified price
    */
  var price: js.UndefOr[SchemaPrice] = js.native
}

object SchemaPricePerBuyer {
  @scala.inline
  def apply(): SchemaPricePerBuyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricePerBuyer]
  }
  @scala.inline
  implicit class SchemaPricePerBuyerOps[Self <: SchemaPricePerBuyer] (val x: Self) extends AnyVal {
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
    def withBilledBuyer(value: SchemaBuyer): Self = {
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
    def withBuyer(value: SchemaBuyer): Self = {
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
    def withPrice(value: SchemaPrice): Self = {
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

