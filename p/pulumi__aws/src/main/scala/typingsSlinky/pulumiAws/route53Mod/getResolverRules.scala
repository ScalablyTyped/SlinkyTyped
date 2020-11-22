package typingsSlinky.pulumiAws.route53Mod

import typingsSlinky.pulumiAws.getResolverRulesMod.GetResolverRulesArgs
import typingsSlinky.pulumiAws.getResolverRulesMod.GetResolverRulesResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/route53", "getResolverRules")
@js.native
object getResolverRules extends js.Object {
  
  def apply(): js.Promise[GetResolverRulesResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetResolverRulesResult] = js.native
  def apply(args: GetResolverRulesArgs): js.Promise[GetResolverRulesResult] = js.native
  def apply(args: GetResolverRulesArgs, opts: InvokeOptions): js.Promise[GetResolverRulesResult] = js.native
}
