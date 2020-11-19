package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getNetworkAclsMod.GetNetworkAclsArgs
import typingsSlinky.pulumiAws.getNetworkAclsMod.GetNetworkAclsResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getNetworkAcls")
@js.native
object getNetworkAcls extends js.Object {
  
  def apply(): js.Promise[GetNetworkAclsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetNetworkAclsResult] = js.native
  def apply(args: GetNetworkAclsArgs): js.Promise[GetNetworkAclsResult] = js.native
  def apply(args: GetNetworkAclsArgs, opts: InvokeOptions): js.Promise[GetNetworkAclsResult] = js.native
}
