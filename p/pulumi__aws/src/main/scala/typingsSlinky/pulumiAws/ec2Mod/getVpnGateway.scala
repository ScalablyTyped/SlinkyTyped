package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getVpnGatewayMod.GetVpnGatewayArgs
import typingsSlinky.pulumiAws.getVpnGatewayMod.GetVpnGatewayResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getVpnGateway")
@js.native
object getVpnGateway extends js.Object {
  
  def apply(): js.Promise[GetVpnGatewayResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpnGatewayResult] = js.native
  def apply(args: GetVpnGatewayArgs): js.Promise[GetVpnGatewayResult] = js.native
  def apply(args: GetVpnGatewayArgs, opts: InvokeOptions): js.Promise[GetVpnGatewayResult] = js.native
}
