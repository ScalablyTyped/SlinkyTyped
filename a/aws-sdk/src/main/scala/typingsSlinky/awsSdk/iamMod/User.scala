package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use ARNs in policies, see IAM Identifiers in the IAM User Guide. 
    */
  var Arn: arnType = js.native
  
  /**
    * The date and time, in ISO 8601 date-time format, when the user was created.
    */
  var CreateDate: js.Date = js.native
  
  /**
    * The date and time, in ISO 8601 date-time format, when the user's password was last used to sign in to an AWS website. For a list of AWS websites that capture a user's last sign-in time, see the Credential Reports topic in the IAM User Guide. If a password is used more than once in a five-minute span, only the first use is returned in this field. If the field is null (no value), then it indicates that they never signed in with a password. This can be because:   The user never had a password.   A password exists but has not been used since IAM started tracking this information on October 20, 2014.   A null value does not mean that the user never had a password. Also, if the user does not currently have a password but had one in the past, then this field contains the date and time the most recent password was used. This value is returned only in the GetUser and ListUsers operations. 
    */
  var PasswordLastUsed: js.UndefOr[js.Date] = js.native
  
  /**
    * The path to the user. For more information about paths, see IAM Identifiers in the IAM User Guide.
    */
  var Path: pathType = js.native
  
  /**
    * The ARN of the policy used to set the permissions boundary for the user. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.native
  
  /**
    * A list of tags that are associated with the specified user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.native
  
  /**
    * The stable and unique string identifying the user. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var UserId: idType = js.native
  
  /**
    * The friendly name identifying the user.
    */
  var UserName: userNameType = js.native
}
object User {
  
  @scala.inline
  def apply(Arn: arnType, CreateDate: js.Date, Path: pathType, UserId: idType, UserName: userNameType): User = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreateDate = CreateDate.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: arnType): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDate(value: js.Date): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: pathType): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: idType): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: userNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordLastUsed(value: js.Date): Self = this.set("PasswordLastUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordLastUsed: Self = this.set("PasswordLastUsed", js.undefined)
    
    @scala.inline
    def setPermissionsBoundary(value: AttachedPermissionsBoundary): Self = this.set("PermissionsBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionsBoundary: Self = this.set("PermissionsBoundary", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: tagListType): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
