package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcEndpointServicePermissionsRequest extends js.Object {
  /**
    * The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in this list. To grant permissions to all principals, specify an asterisk (*).
    */
  var AddAllowedPrincipals: js.UndefOr[ValueStringList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this list.
    */
  var RemoveAllowedPrincipals: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the service.
    */
  var ServiceId: VpcEndpointServiceId = js.native
}

object ModifyVpcEndpointServicePermissionsRequest {
  @scala.inline
  def apply(ServiceId: VpcEndpointServiceId): ModifyVpcEndpointServicePermissionsRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointServicePermissionsRequest]
  }
  @scala.inline
  implicit class ModifyVpcEndpointServicePermissionsRequestOps[Self <: ModifyVpcEndpointServicePermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceId(value: VpcEndpointServiceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddAllowedPrincipals(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddAllowedPrincipals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddAllowedPrincipals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddAllowedPrincipals")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAllowedPrincipals(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveAllowedPrincipals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAllowedPrincipals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveAllowedPrincipals")(js.undefined)
        ret
    }
  }
  
}

