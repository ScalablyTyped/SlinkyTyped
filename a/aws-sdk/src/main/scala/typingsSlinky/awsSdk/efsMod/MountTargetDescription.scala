package typingsSlinky.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MountTargetDescription extends StObject {
  
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
  
  /**
    * The Virtual Private Cloud (VPC) ID that the mount target is configured in.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.efsMod.VpcId] = js.native
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
  implicit class MountTargetDescriptionMutableBuilder[Self <: MountTargetDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZoneId(value: AvailabilityZoneId): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setAvailabilityZoneName(value: AvailabilityZoneName): Self = StObject.set(x, "AvailabilityZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneNameUndefined: Self = StObject.set(x, "AvailabilityZoneName", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    @scala.inline
    def setLifeCycleState(value: LifeCycleState): Self = StObject.set(x, "LifeCycleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountTargetId(value: MountTargetId): Self = StObject.set(x, "MountTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: AwsAccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
