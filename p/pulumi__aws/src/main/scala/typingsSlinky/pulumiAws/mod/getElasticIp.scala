package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getElasticIpMod.GetElasticIpArgs
import typingsSlinky.pulumiAws.getElasticIpMod.GetElasticIpResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "getElasticIp")
@js.native
object getElasticIp extends js.Object {
  
  def apply(): js.Promise[GetElasticIpResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetElasticIpResult] = js.native
  def apply(args: GetElasticIpArgs): js.Promise[GetElasticIpResult] = js.native
  def apply(args: GetElasticIpArgs, opts: InvokeOptions): js.Promise[GetElasticIpResult] = js.native
}
