package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSkillGroupRequest extends js.Object {
  /**
    * A unique, user-specified identifier for this request that ensures idempotency. 
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The description for the skill group.
    */
  var Description: js.UndefOr[SkillGroupDescription] = js.native
  /**
    * The name for the skill group.
    */
  var SkillGroupName: typingsSlinky.awsSdk.alexaforbusinessMod.SkillGroupName = js.native
}

object CreateSkillGroupRequest {
  @scala.inline
  def apply(SkillGroupName: SkillGroupName): CreateSkillGroupRequest = {
    val __obj = js.Dynamic.literal(SkillGroupName = SkillGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSkillGroupRequest]
  }
  @scala.inline
  implicit class CreateSkillGroupRequestOps[Self <: CreateSkillGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkillGroupName(value: SkillGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: SkillGroupDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
  }
  
}

