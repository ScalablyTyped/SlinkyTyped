package typingsSlinky.atPulumiAws.atPulumiAwsMod.ec2

import typingsSlinky.atPulumiAws.ec2GetInstanceMod.GetInstanceArgs
import typingsSlinky.atPulumiAws.ec2GetInstanceMod.GetInstanceResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getInstance")
@js.native
object getInstance extends js.Object {
  def apply(): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def apply(args: GetInstanceArgs): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def apply(args: GetInstanceArgs, opts: InvokeOptions): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
}

