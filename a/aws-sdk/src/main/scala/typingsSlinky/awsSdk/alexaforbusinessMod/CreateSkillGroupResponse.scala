package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSkillGroupResponse extends StObject {
  
  /**
    * The ARN of the newly created skill group in the response.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
}
object CreateSkillGroupResponse {
  
  @scala.inline
  def apply(): CreateSkillGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSkillGroupResponse]
  }
  
  @scala.inline
  implicit class CreateSkillGroupResponseMutableBuilder[Self <: CreateSkillGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
  }
}
