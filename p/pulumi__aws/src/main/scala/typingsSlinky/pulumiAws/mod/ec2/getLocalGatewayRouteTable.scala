package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableArgs
import typingsSlinky.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getLocalGatewayRouteTable")
@js.native
object getLocalGatewayRouteTable extends js.Object {
  def apply(): js.Promise[GetLocalGatewayRouteTableResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTableResult] = js.native
  def apply(args: GetLocalGatewayRouteTableArgs): js.Promise[GetLocalGatewayRouteTableResult] = js.native
  def apply(args: GetLocalGatewayRouteTableArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTableResult] = js.native
}

