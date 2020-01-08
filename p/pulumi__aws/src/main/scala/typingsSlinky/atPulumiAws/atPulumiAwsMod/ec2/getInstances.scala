package typingsSlinky.atPulumiAws.atPulumiAwsMod.ec2

import typingsSlinky.atPulumiAws.ec2GetInstancesMod.GetInstancesArgs
import typingsSlinky.atPulumiAws.ec2GetInstancesMod.GetInstancesResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getInstances")
@js.native
object getInstances extends js.Object {
  def apply(): js.Promise[GetInstancesResult] with GetInstancesResult = js.native
  def apply(args: GetInstancesArgs): js.Promise[GetInstancesResult] with GetInstancesResult = js.native
  def apply(args: GetInstancesArgs, opts: InvokeOptions): js.Promise[GetInstancesResult] with GetInstancesResult = js.native
}

