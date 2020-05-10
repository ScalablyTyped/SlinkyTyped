package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsListAccountsUserOrOrgOnPlanStubbedResponseItem extends js.Object {
  var email: Null = js.native
  var id: Double = js.native
  var login: String = js.native
  var marketplace_pending_change: AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePendingChange = js.native
  var marketplace_purchase: AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePurchase = js.native
  var organization_billing_email: String = js.native
  var `type`: String = js.native
  var url: String = js.native
}

object AppsListAccountsUserOrOrgOnPlanStubbedResponseItem {
  @scala.inline
  def apply(
    email: Null,
    id: Double,
    login: String,
    marketplace_pending_change: AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePendingChange,
    marketplace_purchase: AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePurchase,
    organization_billing_email: String,
    `type`: String,
    url: String
  ): AppsListAccountsUserOrOrgOnPlanStubbedResponseItem = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], marketplace_pending_change = marketplace_pending_change.asInstanceOf[js.Any], marketplace_purchase = marketplace_purchase.asInstanceOf[js.Any], organization_billing_email = organization_billing_email.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListAccountsUserOrOrgOnPlanStubbedResponseItem]
  }
  @scala.inline
  implicit class AppsListAccountsUserOrOrgOnPlanStubbedResponseItemOps[Self <: AppsListAccountsUserOrOrgOnPlanStubbedResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarketplace_pending_change(value: AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePendingChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketplace_pending_change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarketplace_purchase(value: AppsListAccountsUserOrOrgOnPlanStubbedResponseItemMarketplacePurchase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketplace_purchase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization_billing_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization_billing_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

