package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MountTargetDescription extends js.Object {
  /**
    * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in. For example, use1-az1 is an AZ ID for the us-east-1 Region and it has the same location in every AWS account.
    */
  var AvailabilityZoneId: js.UndefOr[typingsSlinky.awsSdk.efsMod.AvailabilityZoneId] = js.native
  /**
    * The name of the Availability Zone (AZ) that the mount target resides in. AZs are independently mapped to names for each AWS account. For example, the Availability Zone us-east-1a for your AWS account might not be the same location as us-east-1a for another AWS account.
    */
  var AvailabilityZoneName: js.UndefOr[typingsSlinky.awsSdk.efsMod.AvailabilityZoneName] = js.native
  /**
    * The ID of the file system for which the mount target is intended.
    */
  var FileSystemId: typingsSlinky.awsSdk.efsMod.FileSystemId = js.native
  /**
    * Address at which the file system can be mounted by using the mount target.
    */
  var IpAddress: js.UndefOr[typingsSlinky.awsSdk.efsMod.IpAddress] = js.native
  /**
    * Lifecycle state of the mount target.
    */
  var LifeCycleState: typingsSlinky.awsSdk.efsMod.LifeCycleState = js.native
  /**
    * System-assigned mount target ID.
    */
  var MountTargetId: typingsSlinky.awsSdk.efsMod.MountTargetId = js.native
  /**
    * The ID of the network interface that Amazon EFS created when it created the mount target.
    */
  var NetworkInterfaceId: js.UndefOr[typingsSlinky.awsSdk.efsMod.NetworkInterfaceId] = js.native
  /**
    * AWS account ID that owns the resource.
    */
  var OwnerId: js.UndefOr[AwsAccountId] = js.native
  /**
    * The ID of the mount target's subnet.
    */
  var SubnetId: typingsSlinky.awsSdk.efsMod.SubnetId = js.native
}

object MountTargetDescription {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId,
    LifeCycleState: LifeCycleState,
    MountTargetId: MountTargetId,
    SubnetId: SubnetId
  ): MountTargetDescription = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], LifeCycleState = LifeCycleState.asInstanceOf[js.Any], MountTargetId = MountTargetId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountTargetDescription]
  }
  @scala.inline
  implicit class MountTargetDescriptionOps[Self <: MountTargetDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSystemId(value: FileSystemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifeCycleState(value: LifeCycleState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifeCycleState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMountTargetId(value: MountTargetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MountTargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZoneId(value: AvailabilityZoneId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZoneName(value: AvailabilityZoneName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZoneName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZoneName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZoneName")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: NetworkInterfaceId): Self = {
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
    def withOwnerId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
  }
  
}

