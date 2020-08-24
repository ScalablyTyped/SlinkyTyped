package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getRegionMod.GetRegionArgs
import typingsSlinky.pulumiAws.getRegionMod.GetRegionResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getRegion")
@js.native
object getRegion extends js.Object {
  def apply(): js.Promise[GetRegionResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetRegionResult] = js.native
  def apply(args: GetRegionArgs): js.Promise[GetRegionResult] = js.native
  def apply(args: GetRegionArgs, opts: InvokeOptions): js.Promise[GetRegionResult] = js.native
}

