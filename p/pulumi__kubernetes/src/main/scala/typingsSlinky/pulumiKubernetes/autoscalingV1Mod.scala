package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerListMod.HorizontalPodAutoscalerListArgs
import typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerMod.HorizontalPodAutoscalerArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/autoscaling/v1", JSImport.Namespace)
@js.native
object autoscalingV1Mod extends js.Object {
  
  @js.native
  class HorizontalPodAutoscaler protected ()
    extends typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerMod.HorizontalPodAutoscaler {
    /**
      * Create a HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: HorizontalPodAutoscalerArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: HorizontalPodAutoscalerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object HorizontalPodAutoscaler extends js.Object {
    
    /**
      * Get an existing HorizontalPodAutoscaler resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
    
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscaler.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v1/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean = js.native
  }
  
  @js.native
  class HorizontalPodAutoscalerList protected ()
    extends typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerListMod.HorizontalPodAutoscalerList {
    /**
      * Create a HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: HorizontalPodAutoscalerListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: HorizontalPodAutoscalerListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object HorizontalPodAutoscalerList extends js.Object {
    
    /**
      * Get an existing HorizontalPodAutoscalerList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
    
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscalerList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v1/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean = js.native
  }
}
