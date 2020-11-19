package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getSubnetMod.GetSubnetArgs
import typingsSlinky.pulumiAws.getSubnetMod.GetSubnetResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getSubnet")
@js.native
object getSubnet extends js.Object {
  
  def apply(): js.Promise[GetSubnetResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSubnetResult] = js.native
  def apply(args: GetSubnetArgs): js.Promise[GetSubnetResult] = js.native
  def apply(args: GetSubnetArgs, opts: InvokeOptions): js.Promise[GetSubnetResult] = js.native
}
