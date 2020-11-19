package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayArgs
import typingsSlinky.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getCustomerGateway")
@js.native
object getCustomerGateway extends js.Object {
  
  def apply(): js.Promise[GetCustomerGatewayResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetCustomerGatewayResult] = js.native
  def apply(args: GetCustomerGatewayArgs): js.Promise[GetCustomerGatewayResult] = js.native
  def apply(args: GetCustomerGatewayArgs, opts: InvokeOptions): js.Promise[GetCustomerGatewayResult] = js.native
}
