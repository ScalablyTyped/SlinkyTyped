package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getLocalGatewayRouteTablesMod.GetLocalGatewayRouteTablesArgs
import typingsSlinky.pulumiAws.getLocalGatewayRouteTablesMod.GetLocalGatewayRouteTablesResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getLocalGatewayRouteTables")
@js.native
object getLocalGatewayRouteTables extends js.Object {
  
  def apply(): js.Promise[GetLocalGatewayRouteTablesResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTablesResult] = js.native
  def apply(args: GetLocalGatewayRouteTablesArgs): js.Promise[GetLocalGatewayRouteTablesResult] = js.native
  def apply(args: GetLocalGatewayRouteTablesArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTablesResult] = js.native
}
