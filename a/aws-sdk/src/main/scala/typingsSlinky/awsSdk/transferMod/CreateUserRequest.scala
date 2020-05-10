package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserRequest extends js.Object {
  /**
    * The landing directory (folder) for a user when they log in to the server using their SFTP client.  An example is &lt;your-Amazon-S3-bucket-name&gt;/home/username.
    */
  var HomeDirectory: js.UndefOr[typingsSlinky.awsSdk.transferMod.HomeDirectory] = js.native
  /**
    * Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. You will need to specify the "Entry" and "Target" pair, where Entry shows how the path is made visible and Target is the actual S3 path. If you only specify a target, it will be displayed as is. You will need to also make sure that your AWS IAM Role provides access to paths in Target. The following is an example.  '[ "/bucket2/documentation", { "Entry": "your-personal-report.pdf", "Target": "/bucket3/customized-reports/${transfer:UserName}.pdf" } ]'  In most cases, you can use this value instead of the scope down policy to lock your user down to the designated home directory ("chroot"). To do this, you can set Entry to '/' and set Target to the HomeDirectory parameter value.   If the target of a logical directory entry does not exist in S3, the entry will be ignored. As a workaround, you can use the S3 api to create 0 byte objects as place holders for your directory. If using the CLI, use the s3api call instead of s3 so you can use the put-object operation. For example, you use the following: aws s3api put-object --bucket bucketname --key path/to/folder/. Make sure that the end of the key name ends in a / for it to be considered a folder.  
    */
  var HomeDirectoryMappings: js.UndefOr[typingsSlinky.awsSdk.transferMod.HomeDirectoryMappings] = js.native
  /**
    * The type of landing directory (folder) you want your users' home directory to be when they log into the SFTP server. If you set it to PATH, the user will see the absolute Amazon S3 bucket paths as is in their SFTP clients. If you set it LOGICAL, you will need to provide mappings in the HomeDirectoryMappings for how you want to make S3 paths visible to your user.
    */
  var HomeDirectoryType: js.UndefOr[typingsSlinky.awsSdk.transferMod.HomeDirectoryType] = js.native
  /**
    * A scope-down policy for your user so you can use the same IAM role across multiple users. This policy scopes down user access to portions of their Amazon S3 bucket. Variables that you can use inside this policy include ${Transfer:UserName}, ${Transfer:HomeDirectory}, and ${Transfer:HomeBucket}.  For scope-down policies, AWS Transfer for SFTP stores the policy as a JSON blob, instead of the Amazon Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the Policy argument. For an example of a scope-down policy, see "https://docs.aws.amazon.com/transfer/latest/userguide/users.html#users-policies-scope-down"&gt;Creating a Scope-Down Policy. For more information, see "https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html" in the AWS Security Token Service API Reference. 
    */
  var Policy: js.UndefOr[typingsSlinky.awsSdk.transferMod.Policy] = js.native
  /**
    * The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will determine the level of access you want to provide your users when transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the SFTP server to access your resources when servicing your SFTP user's transfer requests.
    */
  var Role: typingsSlinky.awsSdk.transferMod.Role = js.native
  /**
    * A system-assigned unique identifier for an SFTP server instance. This is the specific SFTP server that you added your user to.
    */
  var ServerId: typingsSlinky.awsSdk.transferMod.ServerId = js.native
  /**
    * The public portion of the Secure Shell (SSH) key used to authenticate the user to the SFTP server.
    */
  var SshPublicKeyBody: js.UndefOr[typingsSlinky.awsSdk.transferMod.SshPublicKeyBody] = js.native
  /**
    * Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for any purpose.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.transferMod.Tags] = js.native
  /**
    * A unique string that identifies a user and is associated with a server as specified by the ServerId. This user name must be a minimum of 3 and a maximum of 32 characters long. The following are valid characters: a-z, A-Z, 0-9, underscore, and hyphen. The user name can't start with a hyphen.
    */
  var UserName: typingsSlinky.awsSdk.transferMod.UserName = js.native
}

object CreateUserRequest {
  @scala.inline
  def apply(Role: Role, ServerId: ServerId, UserName: UserName): CreateUserRequest = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  @scala.inline
  implicit class CreateUserRequestOps[Self <: CreateUserRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerId(value: ServerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: UserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
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
    def withHomeDirectoryMappings(value: HomeDirectoryMappings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeDirectoryMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeDirectoryMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeDirectoryMappings")(js.undefined)
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
    def withPolicy(value: Policy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(js.undefined)
        ret
    }
    @scala.inline
    def withSshPublicKeyBody(value: SshPublicKeyBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKeyBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshPublicKeyBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKeyBody")(js.undefined)
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
  }
  
}

