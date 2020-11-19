package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getRegionsMod.GetRegionsArgs
import typingsSlinky.pulumiAws.getRegionsMod.GetRegionsResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "getRegions")
@js.native
object getRegions extends js.Object {
  
  def apply(): js.Promise[GetRegionsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetRegionsResult] = js.native
  def apply(args: GetRegionsArgs): js.Promise[GetRegionsResult] = js.native
  def apply(args: GetRegionsArgs, opts: InvokeOptions): js.Promise[GetRegionsResult] = js.native
}
