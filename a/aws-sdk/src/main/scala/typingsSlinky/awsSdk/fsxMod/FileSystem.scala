package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystem extends js.Object {
  /**
    * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z), also known as Unix time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The DNS name for the file system.
    */
  var DNSName: js.UndefOr[typingsSlinky.awsSdk.fsxMod.DNSName] = js.native
  var FailureDetails: js.UndefOr[FileSystemFailureDetails] = js.native
  /**
    * The system-generated, unique 17-digit ID of the file system.
    */
  var FileSystemId: js.UndefOr[typingsSlinky.awsSdk.fsxMod.FileSystemId] = js.native
  /**
    * The type of Amazon FSx file system, either LUSTRE or WINDOWS.
    */
  var FileSystemType: js.UndefOr[typingsSlinky.awsSdk.fsxMod.FileSystemType] = js.native
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the file system's data for Amazon FSx for Windows File Server file systems and persistent Amazon FSx for Lustre file systems at rest. In either case, if not specified, the Amazon FSx managed key is used. The scratch Amazon FSx for Lustre file systems are always encrypted at rest using Amazon FSx managed keys. For more information, see Encrypt in the AWS Key Management Service API Reference.
    */
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.fsxMod.KmsKeyId] = js.native
  /**
    * The lifecycle status of the file system, following are the possible values and what they mean:    AVAILABLE - The file system is in a healthy state, and is reachable and available for use.    CREATING - Amazon FSx is creating the new file system.    DELETING - Amazon FSx is deleting an existing file system.    FAILED - An existing file system has experienced an unrecoverable failure. When creating a new file system, Amazon FSx was unable to create the file system.    MISCONFIGURED indicates that the file system is in a failed but recoverable state.    UPDATING indicates that the file system is undergoing a customer initiated update.  
    */
  var Lifecycle: js.UndefOr[FileSystemLifecycle] = js.native
  var LustreConfiguration: js.UndefOr[LustreFileSystemConfiguration] = js.native
  /**
    * The IDs of the elastic network interface from which a specific file system is accessible. The elastic network interface is automatically created in the same VPC that the Amazon FSx file system was created in. For more information, see Elastic Network Interfaces in the Amazon EC2 User Guide.  For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an Amazon FSx for Lustre file system, you can have more than one.
    */
  var NetworkInterfaceIds: js.UndefOr[typingsSlinky.awsSdk.fsxMod.NetworkInterfaceIds] = js.native
  /**
    * The AWS account that created the file system. If the file system was created by an AWS Identity and Access Management (IAM) user, the AWS account to which the IAM user belongs is the owner.
    */
  var OwnerId: js.UndefOr[AWSAccountId] = js.native
  /**
    * The Amazon Resource Name (ARN) for the file system resource.
    */
  var ResourceARN: js.UndefOr[typingsSlinky.awsSdk.fsxMod.ResourceARN] = js.native
  /**
    * The storage capacity of the file system in gigabytes (GB).
    */
  var StorageCapacity: js.UndefOr[typingsSlinky.awsSdk.fsxMod.StorageCapacity] = js.native
  /**
    * The ID of the subnet to contain the endpoint for the file system. One and only one is supported. The file system is launched in the Availability Zone associated with this subnet.
    */
  var SubnetIds: js.UndefOr[typingsSlinky.awsSdk.fsxMod.SubnetIds] = js.native
  /**
    * The tags to associate with the file system. For more information, see Tagging Your Amazon EC2 Resources in the Amazon EC2 User Guide.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.fsxMod.Tags] = js.native
  /**
    * The ID of the primary VPC for the file system.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.fsxMod.VpcId] = js.native
  /**
    * The configuration for this Microsoft Windows file system.
    */
  var WindowsConfiguration: js.UndefOr[WindowsFileSystemConfiguration] = js.native
}

object FileSystem {
  @scala.inline
  def apply(): FileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystem]
  }
  @scala.inline
  implicit class FileSystemOps[Self <: FileSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDNSName(value: DNSName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DNSName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDNSName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DNSName")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureDetails(value: FileSystemFailureDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSystemId(value: FileSystemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSystemType(value: FileSystemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemType")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycle(value: FileSystemLifecycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lifecycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lifecycle")(js.undefined)
        ret
    }
    @scala.inline
    def withLustreConfiguration(value: LustreFileSystemConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LustreConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLustreConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LustreConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceIds(value: NetworkInterfaceIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: AWSAccountId): Self = {
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
    @scala.inline
    def withResourceARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageCapacity(value: StorageCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: SubnetIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: VpcId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsConfiguration(value: WindowsFileSystemConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowsConfiguration")(js.undefined)
        ret
    }
  }
  
}

