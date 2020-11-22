package typingsSlinky.pulumiAws.mod.rds

import typingsSlinky.pulumiAws.rdsGetEngineVersionMod.GetEngineVersionArgs
import typingsSlinky.pulumiAws.rdsGetEngineVersionMod.GetEngineVersionResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "rds.getEngineVersion")
@js.native
object getEngineVersion extends js.Object {
  
  def apply(args: GetEngineVersionArgs): js.Promise[GetEngineVersionResult] = js.native
  def apply(args: GetEngineVersionArgs, opts: InvokeOptions): js.Promise[GetEngineVersionResult] = js.native
}
