package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSkillGroupRequest extends js.Object {
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
  implicit class UpdateSkillGroupRequestOps[Self <: UpdateSkillGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSkillGroupArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkillGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSkillGroupName(value: SkillGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkillGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillGroupName")(js.undefined)
        ret
    }
  }
  
}

