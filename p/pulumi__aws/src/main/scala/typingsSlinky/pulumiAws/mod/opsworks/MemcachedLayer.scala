package typingsSlinky.pulumiAws.mod.opsworks

import typingsSlinky.pulumiAws.memcachedLayerMod.MemcachedLayerArgs
import typingsSlinky.pulumiAws.memcachedLayerMod.MemcachedLayerState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "opsworks.MemcachedLayer")
@js.native
class MemcachedLayer protected ()
  extends typingsSlinky.pulumiAws.opsworksMod.MemcachedLayer {
  /**
    * Create a MemcachedLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MemcachedLayerArgs) = this()
  def this(name: String, args: MemcachedLayerArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws", "opsworks.MemcachedLayer")
@js.native
object MemcachedLayer extends js.Object {
  
  /**
    * Get an existing MemcachedLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
  def get(name: String, id: Input[ID], state: MemcachedLayerState): typingsSlinky.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
  def get(name: String, id: Input[ID], state: MemcachedLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
  
  /**
    * Returns true if the given object is an instance of MemcachedLayer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/memcachedLayer.MemcachedLayer */ Boolean = js.native
}
