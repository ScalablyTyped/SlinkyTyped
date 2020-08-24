package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysArgs
import typingsSlinky.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getLocalGateways")
@js.native
object getLocalGateways extends js.Object {
  def apply(): js.Promise[GetLocalGatewaysResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLocalGatewaysResult] = js.native
  def apply(args: GetLocalGatewaysArgs): js.Promise[GetLocalGatewaysResult] = js.native
  def apply(args: GetLocalGatewaysArgs, opts: InvokeOptions): js.Promise[GetLocalGatewaysResult] = js.native
}

