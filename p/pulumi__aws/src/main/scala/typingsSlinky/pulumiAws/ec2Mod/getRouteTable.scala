package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.ec2GetRouteTableMod.GetRouteTableArgs
import typingsSlinky.pulumiAws.ec2GetRouteTableMod.GetRouteTableResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getRouteTable")
@js.native
object getRouteTable extends js.Object {
  
  def apply(): js.Promise[GetRouteTableResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
  def apply(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] = js.native
  def apply(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
}
