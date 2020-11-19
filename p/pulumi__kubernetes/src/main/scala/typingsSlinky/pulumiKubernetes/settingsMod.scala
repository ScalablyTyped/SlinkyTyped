package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.podPresetListMod.PodPresetListArgs
import typingsSlinky.pulumiKubernetes.podPresetMod.PodPresetArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/settings", JSImport.Namespace)
@js.native
object settingsMod extends js.Object {
  
  @js.native
  object v1alpha1 extends js.Object {
    
    @js.native
    class PodPreset protected ()
      extends typingsSlinky.pulumiKubernetes.settingsV1alpha1Mod.PodPreset {
      /**
        * Create a PodPreset resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodPresetArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodPresetArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object PodPreset extends js.Object {
      
      /**
        * Get an existing PodPreset resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.podPresetMod.PodPreset = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.podPresetMod.PodPreset = js.native
      
      /**
        * Returns true if the given object is an instance of PodPreset.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPreset.PodPreset */ Boolean = js.native
    }
    
    @js.native
    class PodPresetList protected ()
      extends typingsSlinky.pulumiKubernetes.settingsV1alpha1Mod.PodPresetList {
      /**
        * Create a PodPresetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodPresetListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodPresetListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object PodPresetList extends js.Object {
      
      /**
        * Get an existing PodPresetList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.podPresetListMod.PodPresetList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.podPresetListMod.PodPresetList = js.native
      
      /**
        * Returns true if the given object is an instance of PodPresetList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPresetList.PodPresetList */ Boolean = js.native
    }
  }
}
