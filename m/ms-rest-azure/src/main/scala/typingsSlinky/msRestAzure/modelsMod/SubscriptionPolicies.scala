package typingsSlinky.msRestAzure.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionPolicies extends js.Object {
  val locationPlacementId: js.UndefOr[String] = js.native
  val quotaId: js.UndefOr[String] = js.native
  val spendingLimit: js.UndefOr[String] = js.native
}

object SubscriptionPolicies {
  @scala.inline
  def apply(): SubscriptionPolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPolicies]
  }
  @scala.inline
  implicit class SubscriptionPoliciesOps[Self <: SubscriptionPolicies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocationPlacementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationPlacementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationPlacementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationPlacementId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaId")(js.undefined)
        ret
    }
    @scala.inline
    def withSpendingLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spendingLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpendingLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spendingLimit")(js.undefined)
        ret
    }
  }
  
}

