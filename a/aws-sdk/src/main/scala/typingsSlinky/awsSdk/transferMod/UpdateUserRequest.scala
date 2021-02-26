package typingsSlinky.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserRequest extends StObject {
  
  /**
    * Specifies the landing directory (folder) for a user when they log in to the server using their file transfer protocol client. An example is your-Amazon-S3-bucket-name&gt;/home/username.
    */
  var HomeDirectory: js.UndefOr[typingsSlinky.awsSdk.transferMod.HomeDirectory] = js.native
  
  /**
    * Logical directory mappings that specify what Amazon S3 paths and keys should be visible to your user and how you want to make them visible. You will need to specify the "Entry" and "Target" pair, where Entry shows how the path is made visible and Target is the actual Amazon S3 path. If you only specify a target, it will be displayed as is. You will need to also make sure that your IAM role provides access to paths in Target. The following is an example.  '[ "/bucket2/documentation", { "Entry": "your-personal-report.pdf", "Target": "/bucket3/customized-reports/${transfer:UserName}.pdf" } ]'  In most cases, you can use this value instead of the scope-down policy to lock your user down to the designated home directory ("chroot"). To do this, you can set Entry to '/' and set Target to the HomeDirectory parameter value.  If the target of a logical directory entry does not exist in Amazon S3, the entry will be ignored. As a workaround, you can use the Amazon S3 API to create 0 byte objects as place holders for your directory. If using the CLI, use the s3api call instead of s3 so you can use the put-object operation. For example, you use the following: aws s3api put-object --bucket bucketname --key path/to/folder/. Make sure that the end of the key name ends in a / for it to be considered a folder. 
    */
  var HomeDirectoryMappings: js.UndefOr[typingsSlinky.awsSdk.transferMod.HomeDirectoryMappings] = js.native
  
  /**
    * The type of landing directory (folder) you want your users' home directory to be when they log into the server. If you set it to PATH, the user will see the absolute Amazon S3 bucket paths as is in their file transfer protocol clients. If you set it LOGICAL, you will need to provide mappings in the HomeDirectoryMappings for how you want to make Amazon S3 paths visible to your users.
    */
  var HomeDirectoryType: js.UndefOr[typingsSlinky.awsSdk.transferMod.HomeDirectoryType] = js.native
  
  /**
    * Allows you to supply a scope-down policy for your user so you can use the same IAM role across multiple users. The policy scopes down user access to portions of your Amazon S3 bucket. Variables you can use inside this policy include ${Transfer:UserName}, ${Transfer:HomeDirectory}, and ${Transfer:HomeBucket}.  For scope-down policies, AWS Transfer Family stores the policy as a JSON blob, instead of the Amazon Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the Policy argument. For an example of a scope-down policy, see Creating a scope-down policy. For more information, see AssumeRole in the AWS Security Token Service API Reference. 
    */
  var Policy: js.UndefOr[typingsSlinky.awsSdk.transferMod.Policy] = js.native
  
  /**
    * The IAM role that controls your users' access to your Amazon S3 bucket. The policies attached to this role will determine the level of access you want to provide your users when transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the server to access your resources when servicing your users' transfer requests.
    */
  var Role: js.UndefOr[typingsSlinky.awsSdk.transferMod.Role] = js.native
  
  /**
    * A system-assigned unique identifier for a server instance that the user account is assigned to.
    */
  var ServerId: typingsSlinky.awsSdk.transferMod.ServerId = js.native
  
  /**
    * A unique string that identifies a user and is associated with a server as specified by the ServerId. This user name must be a minimum of 3 and a maximum of 100 characters long. The following are valid characters: a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '@'. The user name can't start with a hyphen, period, or at sign.
    */
  var UserName: typingsSlinky.awsSdk.transferMod.UserName = js.native
}
object UpdateUserRequest {
  
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  
  @scala.inline
  implicit class UpdateUserRequestMutableBuilder[Self <: UpdateUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHomeDirectory(value: HomeDirectory): Self = StObject.set(x, "HomeDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDirectoryMappings(value: HomeDirectoryMappings): Self = StObject.set(x, "HomeDirectoryMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDirectoryMappingsUndefined: Self = StObject.set(x, "HomeDirectoryMappings", js.undefined)
    
    @scala.inline
    def setHomeDirectoryMappingsVarargs(value: HomeDirectoryMapEntry*): Self = StObject.set(x, "HomeDirectoryMappings", js.Array(value :_*))
    
    @scala.inline
    def setHomeDirectoryType(value: HomeDirectoryType): Self = StObject.set(x, "HomeDirectoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDirectoryTypeUndefined: Self = StObject.set(x, "HomeDirectoryType", js.undefined)
    
    @scala.inline
    def setHomeDirectoryUndefined: Self = StObject.set(x, "HomeDirectory", js.undefined)
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
