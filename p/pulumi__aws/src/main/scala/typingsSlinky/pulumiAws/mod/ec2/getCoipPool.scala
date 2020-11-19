package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getCoipPoolMod.GetCoipPoolArgs
import typingsSlinky.pulumiAws.getCoipPoolMod.GetCoipPoolResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getCoipPool")
@js.native
object getCoipPool extends js.Object {
  
  def apply(): js.Promise[GetCoipPoolResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetCoipPoolResult] = js.native
  def apply(args: GetCoipPoolArgs): js.Promise[GetCoipPoolResult] = js.native
  def apply(args: GetCoipPoolArgs, opts: InvokeOptions): js.Promise[GetCoipPoolResult] = js.native
}
