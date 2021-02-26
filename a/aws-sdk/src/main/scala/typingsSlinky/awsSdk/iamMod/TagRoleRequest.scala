package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagRoleRequest extends StObject {
  
  /**
    * The name of the role that you want to add tags to. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType = js.native
  
  /**
    * The list of tags that you want to attach to the role. Each tag consists of a key name and an associated value. You can specify this with a JSON string.
    */
  var Tags: tagListType = js.native
}
object TagRoleRequest {
  
  @scala.inline
  def apply(RoleName: roleNameType, Tags: tagListType): TagRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagRoleRequest]
  }
  
  @scala.inline
  implicit class TagRoleRequestMutableBuilder[Self <: TagRoleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
