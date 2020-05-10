package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillGroup extends js.Object {
  /**
    * The description of a skill group.
    */
  var Description: js.UndefOr[SkillGroupDescription] = js.native
  /**
    * The ARN of a skill group.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The name of a skill group.
    */
  var SkillGroupName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SkillGroupName] = js.native
}

object SkillGroup {
  @scala.inline
  def apply(): SkillGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillGroup]
  }
  @scala.inline
  implicit class SkillGroupOps[Self <: SkillGroup] (val x: Self) extends AnyVal {
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

