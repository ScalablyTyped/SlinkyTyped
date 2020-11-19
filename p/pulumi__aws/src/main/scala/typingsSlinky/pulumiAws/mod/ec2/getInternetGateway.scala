package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getInternetGatewayMod.GetInternetGatewayArgs
import typingsSlinky.pulumiAws.getInternetGatewayMod.GetInternetGatewayResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getInternetGateway")
@js.native
object getInternetGateway extends js.Object {
  
  def apply(): js.Promise[GetInternetGatewayResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetInternetGatewayResult] = js.native
  def apply(args: GetInternetGatewayArgs): js.Promise[GetInternetGatewayResult] = js.native
  def apply(args: GetInternetGatewayArgs, opts: InvokeOptions): js.Promise[GetInternetGatewayResult] = js.native
}
