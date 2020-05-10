package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderLineItemReturnInfo extends js.Object {
  var daysToReturn: js.UndefOr[Double] = js.native
  var isReturnable: js.UndefOr[Boolean] = js.native
  var policyUrl: js.UndefOr[String] = js.native
}

object OrderLineItemReturnInfo {
  @scala.inline
  def apply(): OrderLineItemReturnInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemReturnInfo]
  }
  @scala.inline
  implicit class OrderLineItemReturnInfoOps[Self <: OrderLineItemReturnInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaysToReturn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysToReturn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysToReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysToReturn")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReturnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReturnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReturnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReturnable")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyUrl")(js.undefined)
        ret
    }
  }
  
}

