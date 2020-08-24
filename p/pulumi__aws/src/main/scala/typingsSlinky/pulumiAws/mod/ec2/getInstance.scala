package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getInstanceMod.GetInstanceArgs
import typingsSlinky.pulumiAws.getInstanceMod.GetInstanceResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getInstance")
@js.native
object getInstance extends js.Object {
  def apply(): js.Promise[GetInstanceResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetInstanceResult] = js.native
  def apply(args: GetInstanceArgs): js.Promise[GetInstanceResult] = js.native
  def apply(args: GetInstanceArgs, opts: InvokeOptions): js.Promise[GetInstanceResult] = js.native
}

