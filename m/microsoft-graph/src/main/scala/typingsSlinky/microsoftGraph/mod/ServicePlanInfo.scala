package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicePlanInfo extends js.Object {
  /**
    * The object the service plan can be assigned to. Possible values:'User' - service plan can be assigned to individual
    * users.'Company' - service plan can be assigned to the entire tenant.
    */
  var appliesTo: js.UndefOr[String] = js.native
  /**
    * The provisioning status of the service plan. Possible values:'Success' - Service is fully provisioned.'Disabled' -
    * Service has been disabled.'PendingInput' - Service is not yet provisioned; awaiting service
    * confirmation.'PendingActivation' - Service is provisioned but requires explicit activation by administrator (for
    * example, Intune_O365 service plan)'PendingProvisioning' - Microsoft has added a new service to the product SKU and it
    * has not been activated in the tenant, yet.
    */
  var provisioningStatus: js.UndefOr[String] = js.native
  // The unique identifier of the service plan.
  var servicePlanId: js.UndefOr[String] = js.native
  // The name of the service plan.
  var servicePlanName: js.UndefOr[String] = js.native
}

object ServicePlanInfo {
  @scala.inline
  def apply(): ServicePlanInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServicePlanInfo]
  }
  @scala.inline
  implicit class ServicePlanInfoOps[Self <: ServicePlanInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppliesTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliesTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliesTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliesTo")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withServicePlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicePlanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePlanId")(js.undefined)
        ret
    }
    @scala.inline
    def withServicePlanName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePlanName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicePlanName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePlanName")(js.undefined)
        ret
    }
  }
  
}

