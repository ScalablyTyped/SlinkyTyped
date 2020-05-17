package typingsSlinky.chartmogulNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arpa extends js.Object {
  var arpa: Double = js.native
  var arr: Double = js.native
  var asp: Double = js.native
  var `customer-churn-rate`: Double = js.native
  var customers: Double = js.native
  var date: String = js.native
  var ltv: Double = js.native
  var mrr: Double = js.native
  var `mrr-churn-rate`: Double = js.native
}

object Arpa {
  @scala.inline
  def apply(
    arpa: Double,
    arr: Double,
    asp: Double,
    `customer-churn-rate`: Double,
    customers: Double,
    date: String,
    ltv: Double,
    mrr: Double,
    `mrr-churn-rate`: Double
  ): Arpa = {
    val __obj = js.Dynamic.literal(arpa = arpa.asInstanceOf[js.Any], arr = arr.asInstanceOf[js.Any], asp = asp.asInstanceOf[js.Any], customers = customers.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], ltv = ltv.asInstanceOf[js.Any], mrr = mrr.asInstanceOf[js.Any])
    __obj.updateDynamic("customer-churn-rate")(`customer-churn-rate`.asInstanceOf[js.Any])
    __obj.updateDynamic("mrr-churn-rate")(`mrr-churn-rate`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arpa]
  }
  @scala.inline
  implicit class ArpaOps[Self <: Arpa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArpa(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arpa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCustomer-churn-rate`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer-churn-rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLtv(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ltv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMrr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mrr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMrr-churn-rate`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mrr-churn-rate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

