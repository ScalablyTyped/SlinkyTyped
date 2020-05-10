package typingsSlinky.pulumiAws.getMountTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMountTargetResult extends js.Object {
  /**
    * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
    */
  val dnsName: String = js.native
  /**
    * Amazon Resource Name of the file system for which the mount target is intended.
    */
  val fileSystemArn: String = js.native
  /**
    * ID of the file system for which the mount target is intended.
    */
  val fileSystemId: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Address at which the file system may be mounted via the mount target.
    */
  val ipAddress: String = js.native
  val mountTargetId: String = js.native
  /**
    * The ID of the network interface that Amazon EFS created when it created the mount target.
    */
  val networkInterfaceId: String = js.native
  /**
    * List of VPC security group IDs attached to the mount target.
    */
  val securityGroups: js.Array[String] = js.native
  /**
    * ID of the mount target's subnet.
    */
  val subnetId: String = js.native
}

object GetMountTargetResult {
  @scala.inline
  def apply(
    dnsName: String,
    fileSystemArn: String,
    fileSystemId: String,
    id: String,
    ipAddress: String,
    mountTargetId: String,
    networkInterfaceId: String,
    securityGroups: js.Array[String],
    subnetId: String
  ): GetMountTargetResult = {
    val __obj = js.Dynamic.literal(dnsName = dnsName.asInstanceOf[js.Any], fileSystemArn = fileSystemArn.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], mountTargetId = mountTargetId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMountTargetResult]
  }
  @scala.inline
  implicit class GetMountTargetResultOps[Self <: GetMountTargetResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSystemArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystemArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSystemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMountTargetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountTargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

