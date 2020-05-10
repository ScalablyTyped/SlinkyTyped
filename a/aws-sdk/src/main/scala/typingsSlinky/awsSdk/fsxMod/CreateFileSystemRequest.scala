package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileSystemRequest extends js.Object {
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.fsxMod.ClientRequestToken] = js.native
  /**
    * The type of Amazon FSx file system to create, either WINDOWS or LUSTRE.
    */
  var FileSystemType: typingsSlinky.awsSdk.fsxMod.FileSystemType = js.native
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.fsxMod.KmsKeyId] = js.native
  var LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration] = js.native
  /**
    * A list of IDs specifying the security groups to apply to all network interfaces created for file system access. This list isn't returned in later requests to describe the file system.
    */
  var SecurityGroupIds: js.UndefOr[typingsSlinky.awsSdk.fsxMod.SecurityGroupIds] = js.native
  /**
    * The storage capacity of the file system being created. For Windows file systems, valid values are 32 GiB - 65,536 GiB. For SCRATCH_1 Lustre file systems, valid values are 1,200, 2,400, 3,600, then continuing in increments of 3600 GiB. For SCRATCH_2 and PERSISTENT_1 file systems, valid values are 1200, 2400, then continuing in increments of 2400 GiB.
    */
  var StorageCapacity: typingsSlinky.awsSdk.fsxMod.StorageCapacity = js.native
  /**
    * Specifies the IDs of the subnets that the file system will be accessible from. For Windows MULTI_AZ_1 file system deployment types, provide exactly two subnet IDs, one for the preferred file server and one for the standby file server. You specify one of these subnets as the preferred subnet using the WindowsConfiguration &gt; PreferredSubnetID property. For Windows SINGLE_AZ_1 file system deployment types and Lustre file systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
    */
  var SubnetIds: typingsSlinky.awsSdk.fsxMod.SubnetIds = js.native
  /**
    * The tags to apply to the file system being created. The key value of the Name tag appears in the console as the file system name.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.fsxMod.Tags] = js.native
  /**
    * The Microsoft Windows configuration for the file system being created. This value is required if FileSystemType is set to WINDOWS.
    */
  var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.native
}

object CreateFileSystemRequest {
  @scala.inline
  def apply(FileSystemType: FileSystemType, StorageCapacity: StorageCapacity, SubnetIds: SubnetIds): CreateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemType = FileSystemType.asInstanceOf[js.Any], StorageCapacity = StorageCapacity.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemRequest]
  }
  @scala.inline
  implicit class CreateFileSystemRequestOps[Self <: CreateFileSystemRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSystemType(value: FileSystemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageCapacity(value: StorageCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: SubnetIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
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
    def withLustreConfiguration(value: CreateFileSystemLustreConfiguration): Self = {
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
    def withSecurityGroupIds(value: SecurityGroupIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(js.undefined)
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
    def withWindowsConfiguration(value: CreateFileSystemWindowsConfiguration): Self = {
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

