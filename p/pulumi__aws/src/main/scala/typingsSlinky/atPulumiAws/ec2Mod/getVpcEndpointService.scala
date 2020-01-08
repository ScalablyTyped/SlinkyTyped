package typingsSlinky.atPulumiAws.ec2Mod

import typingsSlinky.atPulumiAws.ec2GetVpcEndpointServiceMod.GetVpcEndpointServiceArgs
import typingsSlinky.atPulumiAws.ec2GetVpcEndpointServiceMod.GetVpcEndpointServiceResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getVpcEndpointService")
@js.native
object getVpcEndpointService extends js.Object {
  def apply(): js.Promise[GetVpcEndpointServiceResult] with GetVpcEndpointServiceResult = js.native
  def apply(args: GetVpcEndpointServiceArgs): js.Promise[GetVpcEndpointServiceResult] with GetVpcEndpointServiceResult = js.native
  def apply(args: GetVpcEndpointServiceArgs, opts: InvokeOptions): js.Promise[GetVpcEndpointServiceResult] with GetVpcEndpointServiceResult = js.native
}

