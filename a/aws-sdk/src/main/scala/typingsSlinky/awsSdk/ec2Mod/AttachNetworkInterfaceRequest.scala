package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachNetworkInterfaceRequest extends js.Object {
  /**
    * The index of the device for the network interface attachment.
    */
  var DeviceIndex: Integer = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typingsSlinky.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typingsSlinky.awsSdk.ec2Mod.NetworkInterfaceId = js.native
}

object AttachNetworkInterfaceRequest {
  @scala.inline
  def apply(DeviceIndex: Integer, InstanceId: InstanceId, NetworkInterfaceId: NetworkInterfaceId): AttachNetworkInterfaceRequest = {
    val __obj = js.Dynamic.literal(DeviceIndex = DeviceIndex.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachNetworkInterfaceRequest]
  }
  @scala.inline
  implicit class AttachNetworkInterfaceRequestOps[Self <: AttachNetworkInterfaceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceIndex(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: NetworkInterfaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(value.asInstanceOf[js.Any])
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
  }
  
}

