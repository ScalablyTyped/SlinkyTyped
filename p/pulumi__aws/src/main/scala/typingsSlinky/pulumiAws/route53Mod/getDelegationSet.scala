package typingsSlinky.pulumiAws.route53Mod

import typingsSlinky.pulumiAws.getDelegationSetMod.GetDelegationSetArgs
import typingsSlinky.pulumiAws.getDelegationSetMod.GetDelegationSetResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/route53", "getDelegationSet")
@js.native
object getDelegationSet extends js.Object {
  
  def apply(args: GetDelegationSetArgs): js.Promise[GetDelegationSetResult] = js.native
  def apply(args: GetDelegationSetArgs, opts: InvokeOptions): js.Promise[GetDelegationSetResult] = js.native
}
