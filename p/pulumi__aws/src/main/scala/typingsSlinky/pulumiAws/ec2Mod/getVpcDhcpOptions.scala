package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsArgs
import typingsSlinky.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getVpcDhcpOptions")
@js.native
object getVpcDhcpOptions extends js.Object {
  
  def apply(): js.Promise[GetVpcDhcpOptionsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcDhcpOptionsResult] = js.native
  def apply(args: GetVpcDhcpOptionsArgs): js.Promise[GetVpcDhcpOptionsResult] = js.native
  def apply(args: GetVpcDhcpOptionsArgs, opts: InvokeOptions): js.Promise[GetVpcDhcpOptionsResult] = js.native
}
