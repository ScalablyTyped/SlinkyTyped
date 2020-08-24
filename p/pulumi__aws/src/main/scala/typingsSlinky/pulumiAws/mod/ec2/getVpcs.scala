package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getVpcsMod.GetVpcsArgs
import typingsSlinky.pulumiAws.getVpcsMod.GetVpcsResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getVpcs")
@js.native
object getVpcs extends js.Object {
  def apply(): js.Promise[GetVpcsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcsResult] = js.native
  def apply(args: GetVpcsArgs): js.Promise[GetVpcsResult] = js.native
  def apply(args: GetVpcsArgs, opts: InvokeOptions): js.Promise[GetVpcsResult] = js.native
}

