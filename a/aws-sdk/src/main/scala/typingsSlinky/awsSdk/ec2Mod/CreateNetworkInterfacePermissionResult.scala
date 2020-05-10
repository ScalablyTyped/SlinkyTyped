package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNetworkInterfacePermissionResult extends js.Object {
  /**
    * Information about the permission for the network interface.
    */
  var InterfacePermission: js.UndefOr[NetworkInterfacePermission] = js.native
}

object CreateNetworkInterfacePermissionResult {
  @scala.inline
  def apply(): CreateNetworkInterfacePermissionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkInterfacePermissionResult]
  }
  @scala.inline
  implicit class CreateNetworkInterfacePermissionResultOps[Self <: CreateNetworkInterfacePermissionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterfacePermission(value: NetworkInterfacePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfacePermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfacePermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfacePermission")(js.undefined)
        ret
    }
  }
  
}

