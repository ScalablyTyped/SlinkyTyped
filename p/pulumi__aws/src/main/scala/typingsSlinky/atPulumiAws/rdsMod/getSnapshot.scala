package typingsSlinky.atPulumiAws.rdsMod

import typingsSlinky.atPulumiAws.rdsGetSnapshotMod.GetSnapshotArgs
import typingsSlinky.atPulumiAws.rdsGetSnapshotMod.GetSnapshotResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds", "getSnapshot")
@js.native
object getSnapshot extends js.Object {
  def apply(): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def apply(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def apply(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
}

