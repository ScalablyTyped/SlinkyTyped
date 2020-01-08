package typingsSlinky.atPulumiAws.ec2Mod

import typingsSlinky.atPulumiAws.ec2GetVpcPeeringConnectionMod.GetVpcPeeringConnectionArgs
import typingsSlinky.atPulumiAws.ec2GetVpcPeeringConnectionMod.GetVpcPeeringConnectionResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getVpcPeeringConnection")
@js.native
object getVpcPeeringConnection extends js.Object {
  def apply(): js.Promise[GetVpcPeeringConnectionResult] with GetVpcPeeringConnectionResult = js.native
  def apply(args: GetVpcPeeringConnectionArgs): js.Promise[GetVpcPeeringConnectionResult] with GetVpcPeeringConnectionResult = js.native
  def apply(args: GetVpcPeeringConnectionArgs, opts: InvokeOptions): js.Promise[GetVpcPeeringConnectionResult] with GetVpcPeeringConnectionResult = js.native
}

