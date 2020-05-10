package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * E-commerce details associated with the user activity.
  */
@js.native
trait SchemaEcommerceData extends js.Object {
  /**
    * Action associated with this e-commerce action.
    */
  var actionType: js.UndefOr[String] = js.native
  /**
    * The type of this e-commerce activity.
    */
  var ecommerceType: js.UndefOr[String] = js.native
  /**
    * Details of the products in this transaction.
    */
  var products: js.UndefOr[js.Array[SchemaProductData]] = js.native
  /**
    * Transaction details of this e-commerce action.
    */
  var transaction: js.UndefOr[SchemaTransactionData] = js.native
}

object SchemaEcommerceData {
  @scala.inline
  def apply(): SchemaEcommerceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEcommerceData]
  }
  @scala.inline
  implicit class SchemaEcommerceDataOps[Self <: SchemaEcommerceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(js.undefined)
        ret
    }
    @scala.inline
    def withEcommerceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecommerceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcommerceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecommerceType")(js.undefined)
        ret
    }
    @scala.inline
    def withProducts(value: js.Array[SchemaProductData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction(value: SchemaTransactionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
  }
  
}

