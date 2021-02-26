package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSkillGroupRequest extends StObject {
  
  /**
    * The updated description for the skill group.
    */
  var Description: js.UndefOr[SkillGroupDescription] = js.native
  
  /**
    * The ARN of the skill group to update. 
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
  
  /**
    * The updated name for the skill group.
    */
  var SkillGroupName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SkillGroupName] = js.native
}
object UpdateSkillGroupRequest {
  
  @scala.inline
  def apply(): UpdateSkillGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSkillGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateSkillGroupRequestMutableBuilder[Self <: UpdateSkillGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: SkillGroupDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
    
    @scala.inline
    def setSkillGroupName(value: SkillGroupName): Self = StObject.set(x, "SkillGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillGroupNameUndefined: Self = StObject.set(x, "SkillGroupName", js.undefined)
  }
}
