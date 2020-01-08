package typingsSlinky.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveRoomRequest extends js.Object {
  /**
    * The ARN of the skill that was requested. Required.
    */
  var SkillId: typingsSlinky.awsDashSdk.clientsAlexaforbusinessMod.SkillId = js.native
  /**
    * The ARN of the user. Required.
    */
  var UserId: typingsSlinky.awsDashSdk.clientsAlexaforbusinessMod.UserId = js.native
}

object ResolveRoomRequest {
  @scala.inline
  def apply(SkillId: SkillId, UserId: UserId): ResolveRoomRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResolveRoomRequest]
  }
}

