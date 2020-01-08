package typingsSlinky.atPulumiAws.ec2Mod

import typingsSlinky.atPulumiAws.ec2GetSubnetMod.GetSubnetArgs
import typingsSlinky.atPulumiAws.ec2GetSubnetMod.GetSubnetResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getSubnet")
@js.native
object getSubnet extends js.Object {
  def apply(): js.Promise[GetSubnetResult] with GetSubnetResult = js.native
  def apply(args: GetSubnetArgs): js.Promise[GetSubnetResult] with GetSubnetResult = js.native
  def apply(args: GetSubnetArgs, opts: InvokeOptions): js.Promise[GetSubnetResult] with GetSubnetResult = js.native
}

