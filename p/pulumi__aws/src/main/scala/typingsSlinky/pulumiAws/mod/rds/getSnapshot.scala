package typingsSlinky.pulumiAws.mod.rds

import typingsSlinky.pulumiAws.rdsGetSnapshotMod.GetSnapshotArgs
import typingsSlinky.pulumiAws.rdsGetSnapshotMod.GetSnapshotResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "rds.getSnapshot")
@js.native
object getSnapshot extends js.Object {
  def apply(): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def apply(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def apply(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
}

