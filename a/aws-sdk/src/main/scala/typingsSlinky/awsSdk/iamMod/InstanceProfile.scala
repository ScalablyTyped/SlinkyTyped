package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceProfile extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide. 
    */
  var Arn: arnType = js.native
  
  /**
    * The date when the instance profile was created.
    */
  var CreateDate: js.Date = js.native
  
  /**
    *  The stable and unique string identifying the instance profile. For more information about IDs, see IAM Identifiers in the IAM User Guide. 
    */
  var InstanceProfileId: idType = js.native
  
  /**
    * The name identifying the instance profile.
    */
  var InstanceProfileName: instanceProfileNameType = js.native
  
  /**
    *  The path to the instance profile. For more information about paths, see IAM Identifiers in the IAM User Guide. 
    */
  var Path: pathType = js.native
  
  /**
    * The role associated with the instance profile.
    */
  var Roles: roleListType = js.native
}
object InstanceProfile {
  
  @scala.inline
  def apply(
    Arn: arnType,
    CreateDate: js.Date,
    InstanceProfileId: idType,
    InstanceProfileName: instanceProfileNameType,
    Path: pathType,
    Roles: roleListType
  ): InstanceProfile = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreateDate = CreateDate.asInstanceOf[js.Any], InstanceProfileId = InstanceProfileId.asInstanceOf[js.Any], InstanceProfileName = InstanceProfileName.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceProfile]
  }
  
  @scala.inline
  implicit class InstanceProfileMutableBuilder[Self <: InstanceProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileId(value: idType): Self = StObject.set(x, "InstanceProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileName(value: instanceProfileNameType): Self = StObject.set(x, "InstanceProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: pathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoles(value: roleListType): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesVarargs(value: Role*): Self = StObject.set(x, "Roles", js.Array(value :_*))
  }
}
