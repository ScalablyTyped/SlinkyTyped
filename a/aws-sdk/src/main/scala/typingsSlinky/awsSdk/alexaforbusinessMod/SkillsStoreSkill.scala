package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillsStoreSkill extends js.Object {
  /**
    * The URL where the skill icon resides.
    */
  var IconUrl: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.IconUrl] = js.native
  /**
    * Sample utterances that interact with the skill.
    */
  var SampleUtterances: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SampleUtterances] = js.native
  /**
    * Short description about the skill.
    */
  var ShortDescription: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ShortDescription] = js.native
  /**
    * Information about the skill.
    */
  var SkillDetails: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SkillDetails] = js.native
  /**
    * The ARN of the skill.
    */
  var SkillId: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SkillId] = js.native
  /**
    * The name of the skill.
    */
  var SkillName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SkillName] = js.native
  /**
    * Linking support for a skill.
    */
  var SupportsLinking: js.UndefOr[scala.Boolean] = js.native
}

object SkillsStoreSkill {
  @scala.inline
  def apply(): SkillsStoreSkill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillsStoreSkill]
  }
  @scala.inline
  implicit class SkillsStoreSkillOps[Self <: SkillsStoreSkill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconUrl(value: IconUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleUtterances(value: SampleUtterances): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleUtterances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleUtterances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleUtterances")(js.undefined)
        ret
    }
    @scala.inline
    def withShortDescription(value: ShortDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShortDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShortDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSkillDetails(value: SkillDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkillDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillDetails")(js.undefined)
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

