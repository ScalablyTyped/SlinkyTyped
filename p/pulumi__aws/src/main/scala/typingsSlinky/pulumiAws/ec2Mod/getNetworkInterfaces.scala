package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesArgs
import typingsSlinky.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getNetworkInterfaces")
@js.native
object getNetworkInterfaces extends js.Object {
  def apply(): js.Promise[GetNetworkInterfacesResult] with GetNetworkInterfacesResult = js.native
  def apply(args: GetNetworkInterfacesArgs): js.Promise[GetNetworkInterfacesResult] with GetNetworkInterfacesResult = js.native
  def apply(args: GetNetworkInterfacesArgs, opts: InvokeOptions): js.Promise[GetNetworkInterfacesResult] with GetNetworkInterfacesResult = js.native
}

