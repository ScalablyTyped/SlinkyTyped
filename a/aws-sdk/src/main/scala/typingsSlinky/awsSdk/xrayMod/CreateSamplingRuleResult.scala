package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSamplingRuleResult extends js.Object {
  /**
    * The saved rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typingsSlinky.awsSdk.xrayMod.SamplingRuleRecord] = js.native
}

object CreateSamplingRuleResult {
  @scala.inline
  def apply(): CreateSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSamplingRuleResult]
  }
  @scala.inline
  implicit class CreateSamplingRuleResultOps[Self <: CreateSamplingRuleResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSamplingRuleRecord(value: SamplingRuleRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingRuleRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingRuleRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingRuleRecord")(js.undefined)
        ret
    }
  }
  
}

