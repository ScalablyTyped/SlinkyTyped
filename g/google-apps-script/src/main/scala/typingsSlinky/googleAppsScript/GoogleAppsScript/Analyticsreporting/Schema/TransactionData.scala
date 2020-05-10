package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionData extends js.Object {
  var transactionId: js.UndefOr[String] = js.native
  var transactionRevenue: js.UndefOr[Double] = js.native
  var transactionShipping: js.UndefOr[Double] = js.native
  var transactionTax: js.UndefOr[Double] = js.native
}

object TransactionData {
  @scala.inline
  def apply(): TransactionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionData]
  }
  @scala.inline
  implicit class TransactionDataOps[Self <: TransactionData] (val x: Self) extends AnyVal {
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

