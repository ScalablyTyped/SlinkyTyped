package typingsSlinky.pulumiAws.rdsMod

import typingsSlinky.pulumiAws.rdsGetSnapshotMod.GetSnapshotArgs
import typingsSlinky.pulumiAws.rdsGetSnapshotMod.GetSnapshotResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/rds", "getSnapshot")
@js.native
object getSnapshot extends js.Object {
  
  def apply(): js.Promise[GetSnapshotResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSnapshotResult] = js.native
  def apply(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] = js.native
  def apply(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] = js.native
}
