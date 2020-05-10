package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo extends js.Object {
  /**
    * Return is allowed within that many days.
    */
  var daysToReturn: js.UndefOr[Double] = js.native
  /**
    * If true, return is allowed.
    */
  var isReturnable: js.UndefOr[Boolean] = js.native
  /**
    * Link to the return policy.
    */
  var policyUrl: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfoOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo] (val x: Self) extends AnyVal {
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

