package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesArgs
import typingsSlinky.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getNetworkInterfaces")
@js.native
object getNetworkInterfaces extends js.Object {
  
  def apply(): js.Promise[GetNetworkInterfacesResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetNetworkInterfacesResult] = js.native
  def apply(args: GetNetworkInterfacesArgs): js.Promise[GetNetworkInterfacesResult] = js.native
  def apply(args: GetNetworkInterfacesArgs, opts: InvokeOptions): js.Promise[GetNetworkInterfacesResult] = js.native
}
