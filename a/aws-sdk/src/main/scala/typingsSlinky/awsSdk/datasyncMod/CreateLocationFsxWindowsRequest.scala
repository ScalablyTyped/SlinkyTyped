package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocationFsxWindowsRequest extends js.Object {
  /**
    * The name of the Windows domain that the FSx for Windows server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.native
  /**
    * The Amazon Resource Name (ARN) for the FSx for Windows file system.
    */
  var FsxFilesystemArn: typingsSlinky.awsSdk.datasyncMod.FsxFilesystemArn = js.native
  /**
    * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  var Password: SmbPassword = js.native
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
    */
  var SecurityGroupArns: Ec2SecurityGroupArnList = js.native
  /**
    * A subdirectory in the location’s path. This subdirectory in the Amazon FSx for Windows file system is used to read data from the Amazon FSx for Windows source location or write data to the FSx for Windows destination.
    */
  var Subdirectory: js.UndefOr[FsxWindowsSubdirectory] = js.native
  /**
    * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for your location.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  var User: SmbUser = js.native
}

object CreateLocationFsxWindowsRequest {
  @scala.inline
  def apply(
    FsxFilesystemArn: FsxFilesystemArn,
    Password: SmbPassword,
    SecurityGroupArns: Ec2SecurityGroupArnList,
    User: SmbUser
  ): CreateLocationFsxWindowsRequest = {
    val __obj = js.Dynamic.literal(FsxFilesystemArn = FsxFilesystemArn.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], SecurityGroupArns = SecurityGroupArns.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationFsxWindowsRequest]
  }
  @scala.inline
  implicit class CreateLocationFsxWindowsRequestOps[Self <: CreateLocationFsxWindowsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFsxFilesystemArn(value: FsxFilesystemArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FsxFilesystemArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: SmbPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: SmbUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: SmbDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdirectory(value: FsxWindowsSubdirectory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subdirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subdirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
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
  }
  
}

