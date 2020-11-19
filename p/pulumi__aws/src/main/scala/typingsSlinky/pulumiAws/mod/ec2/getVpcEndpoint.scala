package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getVpcEndpointMod.GetVpcEndpointArgs
import typingsSlinky.pulumiAws.getVpcEndpointMod.GetVpcEndpointResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getVpcEndpoint")
@js.native
object getVpcEndpoint extends js.Object {
  
  def apply(): js.Promise[GetVpcEndpointResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcEndpointResult] = js.native
  def apply(args: GetVpcEndpointArgs): js.Promise[GetVpcEndpointResult] = js.native
  def apply(args: GetVpcEndpointArgs, opts: InvokeOptions): js.Promise[GetVpcEndpointResult] = js.native
}
