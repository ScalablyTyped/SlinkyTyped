package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListedUser extends js.Object {
  /**
    * This property is the unique Amazon Resource Name (ARN) for the user that you want to learn about.
    */
  var Arn: typingsSlinky.awsSdk.transferMod.Arn = js.native
  /**
    * This value specifies the location that files are written to or read from an Amazon S3 bucket for the user you specify by their ARN.
    */
  var HomeDirectory: js.UndefOr[typingsSlinky.awsSdk.transferMod.HomeDirectory] = js.native
  /**
    * The type of landing directory (folder) you mapped for your users' home directory. If you set it to PATH, the user will see the absolute Amazon S3 bucket paths as is in their SFTP clients. If you set it LOGICAL, you will need to provide mappings in the HomeDirectoryMappings for how you want to make S3 paths visible to your user.
    */
  var HomeDirectoryType: js.UndefOr[typingsSlinky.awsSdk.transferMod.HomeDirectoryType] = js.native
  /**
    * The role in use by this user. A role is an AWS Identity and Access Management (IAM) entity that, in this case, allows the SFTP server to act on a user's behalf. It allows the server to inherit the trust relationship that enables that user to perform file operations to their Amazon S3 bucket.
    */
  var Role: js.UndefOr[typingsSlinky.awsSdk.transferMod.Role] = js.native
  /**
    * This value is the number of SSH public keys stored for the user you specified.
    */
  var SshPublicKeyCount: js.UndefOr[typingsSlinky.awsSdk.transferMod.SshPublicKeyCount] = js.native
  /**
    * The name of the user whose ARN was specified. User names are used for authentication purposes.
    */
  var UserName: js.UndefOr[typingsSlinky.awsSdk.transferMod.UserName] = js.native
}

object ListedUser {
  @scala.inline
  def apply(Arn: Arn): ListedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedUser]
  }
  @scala.inline
  implicit class ListedUserOps[Self <: ListedUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomeDirectory(value: HomeDirectory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeDirectoryType(value: HomeDirectoryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeDirectoryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeDirectoryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeDirectoryType")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(js.undefined)
        ret
    }
    @scala.inline
    def withSshPublicKeyCount(value: SshPublicKeyCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKeyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshPublicKeyCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKeyCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: UserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(js.undefined)
        ret
    }
  }
  
}

