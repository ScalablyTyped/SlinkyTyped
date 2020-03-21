package typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleRecordMod

import typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleMod.SamplingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingRuleRecord extends js.Object {
  /**
    * <p>When the rule was created.</p>
    */
  var CreatedAt: js.UndefOr[js.Date | String | Double] = js.undefined
  /**
    * <p>When the rule was last modified.</p>
    */
  var ModifiedAt: js.UndefOr[js.Date | String | Double] = js.undefined
  /**
    * <p>The sampling rule.</p>
    */
  var SamplingRule: js.UndefOr[typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleMod.SamplingRule] = js.undefined
}

object SamplingRuleRecord {
  @scala.inline
  def apply(
    CreatedAt: js.Date | String | Double = null,
    ModifiedAt: js.Date | String | Double = null,
    SamplingRule: SamplingRule = null
  ): SamplingRuleRecord = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (ModifiedAt != null) __obj.updateDynamic("ModifiedAt")(ModifiedAt.asInstanceOf[js.Any])
    if (SamplingRule != null) __obj.updateDynamic("SamplingRule")(SamplingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRuleRecord]
  }
}

