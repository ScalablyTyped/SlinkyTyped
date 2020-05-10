package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillSummary extends js.Object {
  /**
    * Whether the skill is enabled under the user's account, or if it requires linking to be used.
    */
  var EnablementType: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.EnablementType] = js.native
  /**
    * The ARN of the skill summary.
    */
  var SkillId: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SkillId] = js.native
  /**
    * The name of the skill.
    */
  var SkillName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SkillName] = js.native
  /**
    * Whether the skill is publicly available or is a private skill.
    */
  var SkillType: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SkillType] = js.native
  /**
    * Linking support for a skill.
    */
  var SupportsLinking: js.UndefOr[scala.Boolean] = js.native
}

object SkillSummary {
  @scala.inline
  def apply(): SkillSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillSummary]
  }
  @scala.inline
  implicit class SkillSummaryOps[Self <: SkillSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnablementType(value: EnablementType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablementType")(js.undefined)
        ret
    }
    @scala.inline
    def withSkillId(value: SkillId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkillId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillId")(js.undefined)
        ret
    }
    @scala.inline
    def withSkillName(value: SkillName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkillName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillName")(js.undefined)
        ret
    }
    @scala.inline
    def withSkillType(value: SkillType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkillType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillType")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsLinking(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsLinking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsLinking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsLinking")(js.undefined)
        ret
    }
  }
  
}

