package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getCoipPoolsMod.GetCoipPoolsArgs
import typingsSlinky.pulumiAws.getCoipPoolsMod.GetCoipPoolsResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getCoipPools")
@js.native
object getCoipPools extends js.Object {
  
  def apply(): js.Promise[GetCoipPoolsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetCoipPoolsResult] = js.native
  def apply(args: GetCoipPoolsArgs): js.Promise[GetCoipPoolsResult] = js.native
  def apply(args: GetCoipPoolsArgs, opts: InvokeOptions): js.Promise[GetCoipPoolsResult] = js.native
}
