package typingsSlinky.atPulumiAws.wafMod

import typingsSlinky.atPulumiAws.wafGetRateBasedRuleMod.GetRateBasedRuleArgs
import typingsSlinky.atPulumiAws.wafGetRateBasedRuleMod.GetRateBasedRuleResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf", "getRateBasedRule")
@js.native
object getRateBasedRule extends js.Object {
  def apply(args: GetRateBasedRuleArgs): js.Promise[GetRateBasedRuleResult] with GetRateBasedRuleResult = js.native
  def apply(args: GetRateBasedRuleArgs, opts: InvokeOptions): js.Promise[GetRateBasedRuleResult] with GetRateBasedRuleResult = js.native
}

