package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionArgs
import typingsSlinky.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getVpcPeeringConnection")
@js.native
object getVpcPeeringConnection extends js.Object {
  
  def apply(): js.Promise[GetVpcPeeringConnectionResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcPeeringConnectionResult] = js.native
  def apply(args: GetVpcPeeringConnectionArgs): js.Promise[GetVpcPeeringConnectionResult] = js.native
  def apply(args: GetVpcPeeringConnectionArgs, opts: InvokeOptions): js.Promise[GetVpcPeeringConnectionResult] = js.native
}
