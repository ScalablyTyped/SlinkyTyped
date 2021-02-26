package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveRoomRequest extends StObject {
  
  /**
    * The ARN of the skill that was requested. Required.
    */
  var SkillId: typingsSlinky.awsSdk.alexaforbusinessMod.SkillId = js.native
  
  /**
    * The ARN of the user. Required.
    */
  var UserId: typingsSlinky.awsSdk.alexaforbusinessMod.UserId = js.native
}
object ResolveRoomRequest {
  
  @scala.inline
  def apply(SkillId: SkillId, UserId: UserId): ResolveRoomRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveRoomRequest]
  }
  
  @scala.inline
  implicit class ResolveRoomRequestMutableBuilder[Self <: ResolveRoomRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
