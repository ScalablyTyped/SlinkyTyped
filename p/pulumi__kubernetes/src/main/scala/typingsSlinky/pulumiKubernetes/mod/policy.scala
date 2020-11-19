package typingsSlinky.pulumiKubernetes.mod

import typingsSlinky.pulumiKubernetes.podDisruptionBudgetListMod.PodDisruptionBudgetListArgs
import typingsSlinky.pulumiKubernetes.podDisruptionBudgetMod.PodDisruptionBudgetArgs
import typingsSlinky.pulumiKubernetes.v1beta1PodSecurityPolicyListMod.PodSecurityPolicyListArgs
import typingsSlinky.pulumiKubernetes.v1beta1PodSecurityPolicyMod.PodSecurityPolicyArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes", "policy")
@js.native
object policy extends js.Object {
  
  @js.native
  object v1beta1 extends js.Object {
    
    @js.native
    class PodDisruptionBudget protected ()
      extends typingsSlinky.pulumiKubernetes.policyMod.v1beta1.PodDisruptionBudget {
      /**
        * Create a PodDisruptionBudget resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodDisruptionBudgetArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodDisruptionBudgetArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object PodDisruptionBudget extends js.Object {
      
      /**
        * Get an existing PodDisruptionBudget resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.podDisruptionBudgetMod.PodDisruptionBudget = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.podDisruptionBudgetMod.PodDisruptionBudget = js.native
      
      /**
        * Returns true if the given object is an instance of PodDisruptionBudget.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudget.PodDisruptionBudget */ Boolean = js.native
    }
    
    @js.native
    class PodDisruptionBudgetList protected ()
      extends typingsSlinky.pulumiKubernetes.policyMod.v1beta1.PodDisruptionBudgetList {
      /**
        * Create a PodDisruptionBudgetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodDisruptionBudgetListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodDisruptionBudgetListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object PodDisruptionBudgetList extends js.Object {
      
      /**
        * Get an existing PodDisruptionBudgetList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.podDisruptionBudgetListMod.PodDisruptionBudgetList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.podDisruptionBudgetListMod.PodDisruptionBudgetList = js.native
      
      /**
        * Returns true if the given object is an instance of PodDisruptionBudgetList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetList.PodDisruptionBudgetList */ Boolean = js.native
    }
    
    @js.native
    class PodSecurityPolicy protected ()
      extends typingsSlinky.pulumiKubernetes.policyMod.v1beta1.PodSecurityPolicy {
      /**
        * Create a PodSecurityPolicy resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodSecurityPolicyArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodSecurityPolicyArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object PodSecurityPolicy extends js.Object {
      
      /**
        * Get an existing PodSecurityPolicy resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta1PodSecurityPolicyMod.PodSecurityPolicy = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta1PodSecurityPolicyMod.PodSecurityPolicy = js.native
      
      /**
        * Returns true if the given object is an instance of PodSecurityPolicy.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podSecurityPolicy.PodSecurityPolicy */ Boolean = js.native
    }
    
    @js.native
    class PodSecurityPolicyList protected ()
      extends typingsSlinky.pulumiKubernetes.policyMod.v1beta1.PodSecurityPolicyList {
      /**
        * Create a PodSecurityPolicyList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodSecurityPolicyListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodSecurityPolicyListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object PodSecurityPolicyList extends js.Object {
      
      /**
        * Get an existing PodSecurityPolicyList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = js.native
      
      /**
        * Returns true if the given object is an instance of PodSecurityPolicyList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podSecurityPolicyList.PodSecurityPolicyList */ Boolean = js.native
    }
  }
}
