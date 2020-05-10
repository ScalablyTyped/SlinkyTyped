package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSkillGroupResponse extends js.Object {
  /**
    * The details of the skill group requested. Required.
    */
  var SkillGroup: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SkillGroup] = js.native
}

object GetSkillGroupResponse {
  @scala.inline
  def apply(): GetSkillGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSkillGroupResponse]
  }
  @scala.inline
  implicit class GetSkillGroupResponseOps[Self <: GetSkillGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkillGroup(value: SkillGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkillGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillGroup")(js.undefined)
        ret
    }
  }
  
}

