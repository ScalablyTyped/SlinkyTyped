package typingsSlinky.pulumiAws.rdsMod

import typingsSlinky.pulumiAws.rdsGetInstanceMod.GetInstanceArgs
import typingsSlinky.pulumiAws.rdsGetInstanceMod.GetInstanceResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds", "getInstance")
@js.native
object getInstance extends js.Object {
  def apply(args: GetInstanceArgs): js.Promise[GetInstanceResult] = js.native
  def apply(args: GetInstanceArgs, opts: InvokeOptions): js.Promise[GetInstanceResult] = js.native
}

