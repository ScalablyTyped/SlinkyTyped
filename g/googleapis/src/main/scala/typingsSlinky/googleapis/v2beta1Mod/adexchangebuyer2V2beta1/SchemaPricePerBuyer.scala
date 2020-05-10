package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to specify pricing rules for buyers/advertisers. Each PricePerBuyer in
  * a product can become 0 or 1 deals. To check if there is a PricePerBuyer for
  * a particular buyer or buyer/advertiser pair, we look for the most specific
  * matching rule - we first look for a rule matching the buyer and advertiser,
  * next a rule with the buyer but an empty advertiser list, and otherwise look
  * for a matching rule where no buyer is set.
  */
@js.native
trait SchemaPricePerBuyer extends js.Object {
  /**
    * The list of advertisers for this price when associated with this buyer.
    * If empty, all advertisers with this buyer pay this price.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The buyer who will pay this price. If unset, all buyers can pay this
    * price (if the advertisers match, and there&#39;s no more specific rule
    * matching the buyer).
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.native
  /**
    * The specified price.
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
    def withAdvertiserIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserIds")(js.undefined)
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

