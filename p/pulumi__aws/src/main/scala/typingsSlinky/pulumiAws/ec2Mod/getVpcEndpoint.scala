package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getVpcEndpointMod.GetVpcEndpointArgs
import typingsSlinky.pulumiAws.getVpcEndpointMod.GetVpcEndpointResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getVpcEndpoint")
@js.native
object getVpcEndpoint extends js.Object {
  def apply(): js.Promise[GetVpcEndpointResult] with GetVpcEndpointResult = js.native
  def apply(args: GetVpcEndpointArgs): js.Promise[GetVpcEndpointResult] with GetVpcEndpointResult = js.native
  def apply(args: GetVpcEndpointArgs, opts: InvokeOptions): js.Promise[GetVpcEndpointResult] with GetVpcEndpointResult = js.native
}

