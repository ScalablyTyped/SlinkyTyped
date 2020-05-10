package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a seller of inventory. Each seller is identified by a unique Ad
  * Manager account ID.
  */
@js.native
trait SchemaSeller extends js.Object {
  /**
    * The unique ID for the seller. The seller fills in this field. The seller
    * account ID is then available to buyer in the product.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Optional sub-account ID for the seller.
    */
  var subAccountId: js.UndefOr[String] = js.native
}

object SchemaSeller {
  @scala.inline
  def apply(): SchemaSeller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeller]
  }
  @scala.inline
  implicit class SchemaSellerOps[Self <: SchemaSeller] (val x: Self) extends AnyVal {
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

