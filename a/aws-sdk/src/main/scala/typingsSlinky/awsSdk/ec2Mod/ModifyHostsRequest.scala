package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyHostsRequest extends js.Object {
  /**
    * Specify whether to enable or disable auto-placement.
    */
  var AutoPlacement: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.AutoPlacement] = js.native
  /**
    * The IDs of the Dedicated Hosts to modify.
    */
  var HostIds: RequestHostIdList = js.native
  /**
    * Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see  Host Recovery in the Amazon Elastic Compute Cloud User Guide.
    */
  var HostRecovery: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.HostRecovery] = js.native
  /**
    * Specifies the instance family to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated Host to support multiple instance types within its current instance family. If you want to modify a Dedicated Host to support a specific instance type only, omit this parameter and specify InstanceType instead. You cannot specify InstanceFamily and InstanceType in the same request.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  /**
    * Specifies the instance type to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated Host to support only a specific instance type. If you want to modify a Dedicated Host to support multiple instance types in its current instance family, omit this parameter and specify InstanceFamily instead. You cannot specify InstanceType and InstanceFamily in the same request.
    */
  var InstanceType: js.UndefOr[String] = js.native
}

object ModifyHostsRequest {
  @scala.inline
  def apply(HostIds: RequestHostIdList): ModifyHostsRequest = {
    val __obj = js.Dynamic.literal(HostIds = HostIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHostsRequest]
  }
  @scala.inline
  implicit class ModifyHostsRequestOps[Self <: ModifyHostsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostIds(value: RequestHostIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoPlacement(value: AutoPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withHostRecovery(value: HostRecovery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostRecovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostRecovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostRecovery")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
  }
  
}

