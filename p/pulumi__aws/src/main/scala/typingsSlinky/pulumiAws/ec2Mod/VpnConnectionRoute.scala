package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.vpnConnectionRouteMod.VpnConnectionRouteArgs
import typingsSlinky.pulumiAws.vpnConnectionRouteMod.VpnConnectionRouteState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "VpnConnectionRoute")
@js.native
class VpnConnectionRoute protected ()
  extends typingsSlinky.pulumiAws.vpnConnectionRouteMod.VpnConnectionRoute {
  /**
    * Create a VpnConnectionRoute resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpnConnectionRouteArgs) = this()
  def this(name: String, args: VpnConnectionRouteArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/ec2", "VpnConnectionRoute")
@js.native
object VpnConnectionRoute extends js.Object {
  
  /**
    * Get an existing VpnConnectionRoute resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.vpnConnectionRouteMod.VpnConnectionRoute = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpnConnectionRouteMod.VpnConnectionRoute = js.native
  def get(name: String, id: Input[ID], state: VpnConnectionRouteState): typingsSlinky.pulumiAws.vpnConnectionRouteMod.VpnConnectionRoute = js.native
  def get(name: String, id: Input[ID], state: VpnConnectionRouteState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpnConnectionRouteMod.VpnConnectionRoute = js.native
  
  /**
    * Returns true if the given object is an instance of VpnConnectionRoute.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnConnectionRoute.VpnConnectionRoute */ Boolean = js.native
}
