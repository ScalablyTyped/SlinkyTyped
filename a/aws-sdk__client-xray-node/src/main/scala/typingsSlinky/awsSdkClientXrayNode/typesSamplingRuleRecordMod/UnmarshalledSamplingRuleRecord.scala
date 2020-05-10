package typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleRecordMod

import typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleMod.UnmarshalledSamplingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSamplingRuleRecord extends SamplingRuleRecord {
  /**
    * <p>When the rule was created.</p>
    */
  @JSName("CreatedAt")
  var CreatedAt_UnmarshalledSamplingRuleRecord: js.UndefOr[js.Date] = js.native
  /**
    * <p>When the rule was last modified.</p>
    */
  @JSName("ModifiedAt")
  var ModifiedAt_UnmarshalledSamplingRuleRecord: js.UndefOr[js.Date] = js.native
  /**
    * <p>The sampling rule.</p>
    */
  @JSName("SamplingRule")
  var SamplingRule_UnmarshalledSamplingRuleRecord: js.UndefOr[UnmarshalledSamplingRule] = js.native
}

object UnmarshalledSamplingRuleRecord {
  @scala.inline
  def apply(): UnmarshalledSamplingRuleRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSamplingRuleRecord]
  }
  @scala.inline
  implicit class UnmarshalledSamplingRuleRecordOps[Self <: UnmarshalledSamplingRuleRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingRule(value: UnmarshalledSamplingRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingRule")(js.undefined)
        ret
    }
  }
  
}

