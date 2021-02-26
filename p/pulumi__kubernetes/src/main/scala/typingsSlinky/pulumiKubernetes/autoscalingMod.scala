package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerListMod.HorizontalPodAutoscalerListArgs
import typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerMod.HorizontalPodAutoscalerArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoscalingMod {
  
  object v1 {
    
    @JSImport("@pulumi/kubernetes/autoscaling", "v1.HorizontalPodAutoscaler")
    @js.native
    class HorizontalPodAutoscaler protected ()
      extends typingsSlinky.pulumiKubernetes.autoscalingV1Mod.HorizontalPodAutoscaler {
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
    object HorizontalPodAutoscaler {
      
      /**
        * Get an existing HorizontalPodAutoscaler resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/autoscaling", "v1.HorizontalPodAutoscaler.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
      @JSImport("@pulumi/kubernetes/autoscaling", "v1.HorizontalPodAutoscaler.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
      
      /**
        * Returns true if the given object is an instance of HorizontalPodAutoscaler.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/autoscaling", "v1.HorizontalPodAutoscaler.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v1/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/autoscaling", "v1.HorizontalPodAutoscalerList")
    @js.native
    class HorizontalPodAutoscalerList protected ()
      extends typingsSlinky.pulumiKubernetes.autoscalingV1Mod.HorizontalPodAutoscalerList {
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
    object HorizontalPodAutoscalerList {
      
      /**
        * Get an existing HorizontalPodAutoscalerList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/autoscaling", "v1.HorizontalPodAutoscalerList.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
      @JSImport("@pulumi/kubernetes/autoscaling", "v1.HorizontalPodAutoscalerList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.horizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
      
      /**
        * Returns true if the given object is an instance of HorizontalPodAutoscalerList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/autoscaling", "v1.HorizontalPodAutoscalerList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v1/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean = js.native
    }
  }
  
  object v2beta1 {
    
    @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscaler")
    @js.native
    class HorizontalPodAutoscaler protected ()
      extends typingsSlinky.pulumiKubernetes.v2beta1Mod.HorizontalPodAutoscaler {
      /**
        * Create a HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.v2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscalerArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.v2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscalerArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object HorizontalPodAutoscaler {
      
      /**
        * Get an existing HorizontalPodAutoscaler resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscaler.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscaler.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
      
      /**
        * Returns true if the given object is an instance of HorizontalPodAutoscaler.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscaler.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscalerList")
    @js.native
    class HorizontalPodAutoscalerList protected ()
      extends typingsSlinky.pulumiKubernetes.v2beta1Mod.HorizontalPodAutoscalerList {
      /**
        * Create a HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.v2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerListArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.v2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object HorizontalPodAutoscalerList {
      
      /**
        * Get an existing HorizontalPodAutoscalerList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscalerList.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscalerList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
      
      /**
        * Returns true if the given object is an instance of HorizontalPodAutoscalerList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscalerList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean = js.native
    }
  }
  
  object v2beta2 {
    
    @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscaler")
    @js.native
    class HorizontalPodAutoscaler protected ()
      extends typingsSlinky.pulumiKubernetes.v2beta2Mod.HorizontalPodAutoscaler {
      /**
        * Create a HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.v2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscalerArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.v2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscalerArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object HorizontalPodAutoscaler {
      
      /**
        * Get an existing HorizontalPodAutoscaler resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscaler.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscaler.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
      
      /**
        * Returns true if the given object is an instance of HorizontalPodAutoscaler.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscaler.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscalerList")
    @js.native
    class HorizontalPodAutoscalerList protected ()
      extends typingsSlinky.pulumiKubernetes.v2beta2Mod.HorizontalPodAutoscalerList {
      /**
        * Create a HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.v2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerListArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.v2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object HorizontalPodAutoscalerList {
      
      /**
        * Get an existing HorizontalPodAutoscalerList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscalerList.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscalerList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
      
      /**
        * Returns true if the given object is an instance of HorizontalPodAutoscalerList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscalerList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean = js.native
    }
  }
}
