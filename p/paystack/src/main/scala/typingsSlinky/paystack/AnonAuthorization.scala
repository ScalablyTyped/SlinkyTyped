package typingsSlinky.paystack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthorization extends js.Object {
  var authorization: String = js.native
  var customer: String = js.native
  var plan: String = js.native
  var start_date: js.UndefOr[js.Date] = js.native
}

object AnonAuthorization {
  @scala.inline
  def apply(authorization: String, customer: String, plan: String): AnonAuthorization = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorization]
  }
  @scala.inline
  implicit class AnonAuthorizationOps[Self <: AnonAuthorization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_date(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_date")(js.undefined)
        ret
    }
  }
  
}

