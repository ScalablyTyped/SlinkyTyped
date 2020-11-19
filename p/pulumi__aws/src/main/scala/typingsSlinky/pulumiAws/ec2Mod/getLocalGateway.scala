package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getLocalGatewayMod.GetLocalGatewayArgs
import typingsSlinky.pulumiAws.getLocalGatewayMod.GetLocalGatewayResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getLocalGateway")
@js.native
object getLocalGateway extends js.Object {
  
  def apply(): js.Promise[GetLocalGatewayResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLocalGatewayResult] = js.native
  def apply(args: GetLocalGatewayArgs): js.Promise[GetLocalGatewayResult] = js.native
  def apply(args: GetLocalGatewayArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayResult] = js.native
}
