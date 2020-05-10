package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSkillAuthorizationRequest extends js.Object {
  /**
    * The authorization result specific to OAUTH code grant output. "Code” must be populated in the AuthorizationResult map to establish the authorization.
    */
  var AuthorizationResult: typingsSlinky.awsSdk.alexaforbusinessMod.AuthorizationResult = js.native
  /**
    * The room that the skill is authorized for.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The unique identifier of a skill.
    */
  var SkillId: typingsSlinky.awsSdk.alexaforbusinessMod.SkillId = js.native
}

object PutSkillAuthorizationRequest {
  @scala.inline
  def apply(AuthorizationResult: AuthorizationResult, SkillId: SkillId): PutSkillAuthorizationRequest = {
    val __obj = js.Dynamic.literal(AuthorizationResult = AuthorizationResult.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSkillAuthorizationRequest]
  }
  @scala.inline
  implicit class PutSkillAuthorizationRequestOps[Self <: PutSkillAuthorizationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationResult(value: AuthorizationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizationResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkillId(value: SkillId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoomArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomArn")(js.undefined)
        ret
    }
  }
  
}

