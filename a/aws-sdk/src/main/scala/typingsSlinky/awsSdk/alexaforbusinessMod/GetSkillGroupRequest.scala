package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSkillGroupRequest extends js.Object {
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
  implicit class GetSkillGroupRequestOps[Self <: GetSkillGroupRequest] (val x: Self) extends AnyVal {
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

