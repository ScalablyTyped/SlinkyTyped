package typingsSlinky.pulumiAws.wafMod

import typingsSlinky.pulumiAws.wafGetRuleMod.GetRuleArgs
import typingsSlinky.pulumiAws.wafGetRuleMod.GetRuleResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf", "getRule")
@js.native
object getRule extends js.Object {
  def apply(args: GetRuleArgs): js.Promise[GetRuleResult] with GetRuleResult = js.native
  def apply(args: GetRuleArgs, opts: InvokeOptions): js.Promise[GetRuleResult] with GetRuleResult = js.native
}

