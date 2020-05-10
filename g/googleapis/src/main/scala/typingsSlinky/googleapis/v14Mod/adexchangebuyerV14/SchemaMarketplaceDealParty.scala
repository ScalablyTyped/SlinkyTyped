package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMarketplaceDealParty extends js.Object {
  /**
    * The buyer/seller associated with the deal. One of buyer/seller is
    * specified for a deal-party.
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.native
  /**
    * The buyer/seller associated with the deal. One of buyer/seller is
    * specified for a deal party.
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
}

object SchemaMarketplaceDealParty {
  @scala.inline
  def apply(): SchemaMarketplaceDealParty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMarketplaceDealParty]
  }
  @scala.inline
  implicit class SchemaMarketplaceDealPartyOps[Self <: SchemaMarketplaceDealParty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSeller(value: SchemaSeller): Self = {
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

