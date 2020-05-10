package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSkillGroupRequest extends js.Object {
  /**
    * The ARN of the skill group to delete. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
}

object DeleteSkillGroupRequest {
  @scala.inline
  def apply(): DeleteSkillGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSkillGroupRequest]
  }
  @scala.inline
  implicit class DeleteSkillGroupRequestOps[Self <: DeleteSkillGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

