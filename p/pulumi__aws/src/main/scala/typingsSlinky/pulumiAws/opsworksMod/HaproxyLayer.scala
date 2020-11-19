package typingsSlinky.pulumiAws.opsworksMod

import typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayerArgs
import typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayerState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/opsworks", "HaproxyLayer")
@js.native
class HaproxyLayer protected ()
  extends typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayer {
  /**
    * Create a HaproxyLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HaproxyLayerArgs) = this()
  def this(name: String, args: HaproxyLayerArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/opsworks", "HaproxyLayer")
@js.native
object HaproxyLayer extends js.Object {
  
  /**
    * Get an existing HaproxyLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayer = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayer = js.native
  def get(name: String, id: Input[ID], state: HaproxyLayerState): typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayer = js.native
  def get(name: String, id: Input[ID], state: HaproxyLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.haproxyLayerMod.HaproxyLayer = js.native
  
  /**
    * Returns true if the given object is an instance of HaproxyLayer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/haproxyLayer.HaproxyLayer */ Boolean = js.native
}
