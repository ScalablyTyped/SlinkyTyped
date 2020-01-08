package typingsSlinky.atPulumiAws.atPulumiAwsMod.ec2

import typingsSlinky.atPulumiAws.ec2GetNatGatewayMod.GetNatGatewayArgs
import typingsSlinky.atPulumiAws.ec2GetNatGatewayMod.GetNatGatewayResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getNatGateway")
@js.native
object getNatGateway extends js.Object {
  def apply(): js.Promise[GetNatGatewayResult] with GetNatGatewayResult = js.native
  def apply(args: GetNatGatewayArgs): js.Promise[GetNatGatewayResult] with GetNatGatewayResult = js.native
  def apply(args: GetNatGatewayArgs, opts: InvokeOptions): js.Promise[GetNatGatewayResult] with GetNatGatewayResult = js.native
}

