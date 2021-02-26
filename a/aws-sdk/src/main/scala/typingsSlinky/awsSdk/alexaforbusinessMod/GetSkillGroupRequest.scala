package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSkillGroupRequest extends StObject {
  
  /**
    * The ARN of the skill group for which to get details. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
}
object GetSkillGroupRequest {
  
  @scala.inline
  def apply(): GetSkillGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSkillGroupRequest]
  }
  
  @scala.inline
  implicit class GetSkillGroupRequestMutableBuilder[Self <: GetSkillGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
  }
}
