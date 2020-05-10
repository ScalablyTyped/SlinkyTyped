package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfacePermission extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.native
  /**
    * The AWS service.
    */
  var AwsService: js.UndefOr[String] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The ID of the network interface permission.
    */
  var NetworkInterfacePermissionId: js.UndefOr[String] = js.native
  /**
    * The type of permission.
    */
  var Permission: js.UndefOr[InterfacePermissionType] = js.native
  /**
    * Information about the state of the permission.
    */
  var PermissionState: js.UndefOr[NetworkInterfacePermissionState] = js.native
}

object NetworkInterfacePermission {
  @scala.inline
  def apply(): NetworkInterfacePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfacePermission]
  }
  @scala.inline
  implicit class NetworkInterfacePermissionOps[Self <: NetworkInterfacePermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsService")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfacePermissionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfacePermissionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfacePermissionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfacePermissionId")(js.undefined)
        ret
    }
    @scala.inline
    def withPermission(value: InterfacePermissionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permission")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionState(value: NetworkInterfacePermissionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionState")(js.undefined)
        ret
    }
  }
  
}

