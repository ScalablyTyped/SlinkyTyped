package typingsSlinky.pulumiAws.route53Mod

import typingsSlinky.pulumiAws.getResolverEndpointMod.GetResolverEndpointArgs
import typingsSlinky.pulumiAws.getResolverEndpointMod.GetResolverEndpointResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/route53", "getResolverEndpoint")
@js.native
object getResolverEndpoint extends js.Object {
  
  def apply(): js.Promise[GetResolverEndpointResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetResolverEndpointResult] = js.native
  def apply(args: GetResolverEndpointArgs): js.Promise[GetResolverEndpointResult] = js.native
  def apply(args: GetResolverEndpointArgs, opts: InvokeOptions): js.Promise[GetResolverEndpointResult] = js.native
}
