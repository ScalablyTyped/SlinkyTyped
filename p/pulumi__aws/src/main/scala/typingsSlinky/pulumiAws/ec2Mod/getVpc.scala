package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getVpcMod.GetVpcArgs
import typingsSlinky.pulumiAws.getVpcMod.GetVpcResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getVpc")
@js.native
object getVpc extends js.Object {
  def apply(): js.Promise[GetVpcResult] with GetVpcResult = js.native
  def apply(args: GetVpcArgs): js.Promise[GetVpcResult] with GetVpcResult = js.native
  def apply(args: GetVpcArgs, opts: InvokeOptions): js.Promise[GetVpcResult] with GetVpcResult = js.native
}

