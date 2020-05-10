package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileSystemFromBackupRequest extends js.Object {
  var BackupId: typingsSlinky.awsSdk.fsxMod.BackupId = js.native
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.fsxMod.ClientRequestToken] = js.native
  /**
    * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups apply to all network interfaces. This value isn't returned in later describe requests.
    */
  var SecurityGroupIds: js.UndefOr[typingsSlinky.awsSdk.fsxMod.SecurityGroupIds] = js.native
  /**
    * A list of IDs for the subnets that the file system will be accessible from. Currently, you can specify only one subnet. The file server is also launched in that subnet's Availability Zone.
    */
  var SubnetIds: typingsSlinky.awsSdk.fsxMod.SubnetIds = js.native
  /**
    * The tags to be applied to the file system at file system creation. The key value of the Name tag appears in the console as the file system name.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.fsxMod.Tags] = js.native
  /**
    * The configuration for this Microsoft Windows file system.
    */
  var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.native
}

object CreateFileSystemFromBackupRequest {
  @scala.inline
  def apply(BackupId: BackupId, SubnetIds: SubnetIds): CreateFileSystemFromBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemFromBackupRequest]
  }
  @scala.inline
  implicit class CreateFileSystemFromBackupRequestOps[Self <: CreateFileSystemFromBackupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupId(value: BackupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupId")(value.asInstanceOf[js.Any])
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

