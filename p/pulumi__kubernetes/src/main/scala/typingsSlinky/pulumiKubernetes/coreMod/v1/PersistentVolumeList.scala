package typingsSlinky.pulumiKubernetes.coreMod.v1

import typingsSlinky.pulumiKubernetes.persistentVolumeListMod.PersistentVolumeListArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/core", "v1.PersistentVolumeList")
@js.native
class PersistentVolumeList protected ()
  extends typingsSlinky.pulumiKubernetes.coreV1Mod.PersistentVolumeList {
  /**
    * Create a PersistentVolumeList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: PersistentVolumeListArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: PersistentVolumeListArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/kubernetes/core", "v1.PersistentVolumeList")
@js.native
object PersistentVolumeList extends js.Object {
  
  /**
    * Get an existing PersistentVolumeList resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.persistentVolumeListMod.PersistentVolumeList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.persistentVolumeListMod.PersistentVolumeList = js.native
  
  /**
    * Returns true if the given object is an instance of PersistentVolumeList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/persistentVolumeList.PersistentVolumeList */ Boolean = js.native
}
