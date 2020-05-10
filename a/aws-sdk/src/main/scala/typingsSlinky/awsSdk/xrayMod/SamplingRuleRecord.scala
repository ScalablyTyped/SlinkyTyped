package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingRuleRecord extends js.Object {
  /**
    * When the rule was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * When the rule was last modified.
    */
  var ModifiedAt: js.UndefOr[js.Date] = js.native
  /**
    * The sampling rule.
    */
  var SamplingRule: js.UndefOr[typingsSlinky.awsSdk.xrayMod.SamplingRule] = js.native
}

object SamplingRuleRecord {
  @scala.inline
  def apply(): SamplingRuleRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingRuleRecord]
  }
  @scala.inline
  implicit class SamplingRuleRecordOps[Self <: SamplingRuleRecord] (val x: Self) extends AnyVal {
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
    def withSamplingRule(value: SamplingRule): Self = {
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

