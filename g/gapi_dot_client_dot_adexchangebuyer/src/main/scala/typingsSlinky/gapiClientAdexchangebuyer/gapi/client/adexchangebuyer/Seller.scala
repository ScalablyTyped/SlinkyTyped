package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Seller extends js.Object {
  /** The unique id for the seller. The seller fills in this field. The seller account id is then available to buyer in the product. */
  var accountId: js.UndefOr[String] = js.native
  /** Optional sub-account id for the seller. */
  var subAccountId: js.UndefOr[String] = js.native
}

object Seller {
  @scala.inline
  def apply(): Seller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seller]
  }
  @scala.inline
  implicit class SellerOps[Self <: Seller] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subAccountId")(js.undefined)
        ret
    }
  }
  
}

