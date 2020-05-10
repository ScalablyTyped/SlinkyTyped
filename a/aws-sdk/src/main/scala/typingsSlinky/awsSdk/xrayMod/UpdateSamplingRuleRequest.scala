package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSamplingRuleRequest extends js.Object {
  /**
    * The rule and fields to change.
    */
  var SamplingRuleUpdate: typingsSlinky.awsSdk.xrayMod.SamplingRuleUpdate = js.native
}

object UpdateSamplingRuleRequest {
  @scala.inline
  def apply(SamplingRuleUpdate: SamplingRuleUpdate): UpdateSamplingRuleRequest = {
    val __obj = js.Dynamic.literal(SamplingRuleUpdate = SamplingRuleUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSamplingRuleRequest]
  }
  @scala.inline
  implicit class UpdateSamplingRuleRequestOps[Self <: UpdateSamplingRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSamplingRuleUpdate(value: SamplingRuleUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingRuleUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

