package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents details collected when the visitor performs a transaction on the
  * page.
  */
@js.native
trait SchemaTransactionData extends js.Object {
  /**
    * The transaction ID, supplied by the e-commerce tracking method, for the
    * purchase in the shopping cart.
    */
  var transactionId: js.UndefOr[String] = js.native
  /**
    * The total sale revenue (excluding shipping and tax) of the transaction.
    */
  var transactionRevenue: js.UndefOr[Double] = js.native
  /**
    * Total cost of shipping.
    */
  var transactionShipping: js.UndefOr[Double] = js.native
  /**
    * Total tax for the transaction.
    */
  var transactionTax: js.UndefOr[Double] = js.native
}

object SchemaTransactionData {
  @scala.inline
  def apply(): SchemaTransactionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransactionData]
  }
  @scala.inline
  implicit class SchemaTransactionDataOps[Self <: SchemaTransactionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionRevenue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionRevenue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionRevenue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionRevenue")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionShipping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionShipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionShipping")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionTax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionTax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionTax")(js.undefined)
        ret
    }
  }
  
}

