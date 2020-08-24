package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getInstancesMod.GetInstancesArgs
import typingsSlinky.pulumiAws.getInstancesMod.GetInstancesResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getInstances")
@js.native
object getInstances extends js.Object {
  def apply(): js.Promise[GetInstancesResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetInstancesResult] = js.native
  def apply(args: GetInstancesArgs): js.Promise[GetInstancesResult] = js.native
  def apply(args: GetInstancesArgs, opts: InvokeOptions): js.Promise[GetInstancesResult] = js.native
}

