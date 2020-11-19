package typingsSlinky.pulumiKubernetes.mod

import typingsSlinky.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationListArgs
import typingsSlinky.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfigurationArgs
import typingsSlinky.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationListArgs
import typingsSlinky.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfigurationArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes", "admissionregistration")
@js.native
object admissionregistration extends js.Object {
  
  @js.native
  object v1 extends js.Object {
    
    @js.native
    class MutatingWebhookConfiguration protected ()
      extends typingsSlinky.pulumiKubernetes.admissionregistrationMod.v1.MutatingWebhookConfiguration {
      /**
        * Create a MutatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: MutatingWebhookConfigurationArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: MutatingWebhookConfigurationArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object MutatingWebhookConfiguration extends js.Object {
      
      /**
        * Get an existing MutatingWebhookConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
      
      /**
        * Returns true if the given object is an instance of MutatingWebhookConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/mutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean = js.native
    }
    
    @js.native
    class MutatingWebhookConfigurationList protected ()
      extends typingsSlinky.pulumiKubernetes.admissionregistrationMod.v1.MutatingWebhookConfigurationList {
      /**
        * Create a MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: MutatingWebhookConfigurationListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: MutatingWebhookConfigurationListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object MutatingWebhookConfigurationList extends js.Object {
      
      /**
        * Get an existing MutatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
      
      /**
        * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/mutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean = js.native
    }
    
    @js.native
    class ValidatingWebhookConfiguration protected ()
      extends typingsSlinky.pulumiKubernetes.admissionregistrationMod.v1.ValidatingWebhookConfiguration {
      /**
        * Create a ValidatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: ValidatingWebhookConfigurationArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: ValidatingWebhookConfigurationArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object ValidatingWebhookConfiguration extends js.Object {
      
      /**
        * Get an existing ValidatingWebhookConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
      
      /**
        * Returns true if the given object is an instance of ValidatingWebhookConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/validatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean = js.native
    }
    
    @js.native
    class ValidatingWebhookConfigurationList protected ()
      extends typingsSlinky.pulumiKubernetes.admissionregistrationMod.v1.ValidatingWebhookConfigurationList {
      /**
        * Create a ValidatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: ValidatingWebhookConfigurationListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: ValidatingWebhookConfigurationListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object ValidatingWebhookConfigurationList extends js.Object {
      
      /**
        * Get an existing ValidatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
      
      /**
        * Returns true if the given object is an instance of ValidatingWebhookConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/validatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean = js.native
    }
  }
  
  @js.native
  object v1beta1 extends js.Object {
    
    @js.native
    class MutatingWebhookConfiguration protected ()
      extends typingsSlinky.pulumiKubernetes.admissionregistrationMod.v1beta1.MutatingWebhookConfiguration {
      /**
        * Create a MutatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfigurationArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfigurationArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    @js.native
    object MutatingWebhookConfiguration extends js.Object {
      
      /**
        * Get an existing MutatingWebhookConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
      
      /**
        * Returns true if the given object is an instance of MutatingWebhookConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean = js.native
    }
    
    @js.native
    class MutatingWebhookConfigurationList protected ()
      extends typingsSlinky.pulumiKubernetes.admissionregistrationMod.v1beta1.MutatingWebhookConfigurationList {
      /**
        * Create a MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationListArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    @js.native
    object MutatingWebhookConfigurationList extends js.Object {
      
      /**
        * Get an existing MutatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
      
      /**
        * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean = js.native
    }
    
    @js.native
    class ValidatingWebhookConfiguration protected ()
      extends typingsSlinky.pulumiKubernetes.admissionregistrationMod.v1beta1.ValidatingWebhookConfiguration {
      /**
        * Create a ValidatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfigurationArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfigurationArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    @js.native
    object ValidatingWebhookConfiguration extends js.Object {
      
      /**
        * Get an existing ValidatingWebhookConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
      
      /**
        * Returns true if the given object is an instance of ValidatingWebhookConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean = js.native
    }
    
    @js.native
    class ValidatingWebhookConfigurationList protected ()
      extends typingsSlinky.pulumiKubernetes.admissionregistrationMod.v1beta1.ValidatingWebhookConfigurationList {
      /**
        * Create a ValidatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationListArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    @js.native
    object ValidatingWebhookConfigurationList extends js.Object {
      
      /**
        * Get an existing ValidatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
      
      /**
        * Returns true if the given object is an instance of ValidatingWebhookConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean = js.native
    }
  }
}
