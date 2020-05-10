package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSkillGroupResponse extends js.Object {
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
  implicit class CreateSkillGroupResponseOps[Self <: CreateSkillGroupResponse] (val x: Self) extends AnyVal {
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

