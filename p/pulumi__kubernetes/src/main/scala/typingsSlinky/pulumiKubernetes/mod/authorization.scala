package typingsSlinky.pulumiKubernetes.mod

import typingsSlinky.pulumiKubernetes.v1LocalSubjectAccessReviewMod.LocalSubjectAccessReviewArgs
import typingsSlinky.pulumiKubernetes.v1SelfSubjectAccessReviewMod.SelfSubjectAccessReviewArgs
import typingsSlinky.pulumiKubernetes.v1SelfSubjectRulesReviewMod.SelfSubjectRulesReviewArgs
import typingsSlinky.pulumiKubernetes.v1SubjectAccessReviewMod.SubjectAccessReviewArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorization {
  
  object v1 {
    
    @JSImport("@pulumi/kubernetes", "authorization.v1.LocalSubjectAccessReview")
    @js.native
    class LocalSubjectAccessReview protected ()
      extends typingsSlinky.pulumiKubernetes.authorizationMod.v1.LocalSubjectAccessReview {
      /**
        * Create a LocalSubjectAccessReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: LocalSubjectAccessReviewArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: LocalSubjectAccessReviewArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object LocalSubjectAccessReview {
      
      /**
        * Get an existing LocalSubjectAccessReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1.LocalSubjectAccessReview.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1LocalSubjectAccessReviewMod.LocalSubjectAccessReview = js.native
      @JSImport("@pulumi/kubernetes", "authorization.v1.LocalSubjectAccessReview.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1LocalSubjectAccessReviewMod.LocalSubjectAccessReview = js.native
      
      /**
        * Returns true if the given object is an instance of LocalSubjectAccessReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1.LocalSubjectAccessReview.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1/localSubjectAccessReview.LocalSubjectAccessReview */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "authorization.v1.SelfSubjectAccessReview")
    @js.native
    class SelfSubjectAccessReview protected ()
      extends typingsSlinky.pulumiKubernetes.authorizationMod.v1.SelfSubjectAccessReview {
      /**
        * Create a SelfSubjectAccessReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: SelfSubjectAccessReviewArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: SelfSubjectAccessReviewArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object SelfSubjectAccessReview {
      
      /**
        * Get an existing SelfSubjectAccessReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1.SelfSubjectAccessReview.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1SelfSubjectAccessReviewMod.SelfSubjectAccessReview = js.native
      @JSImport("@pulumi/kubernetes", "authorization.v1.SelfSubjectAccessReview.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1SelfSubjectAccessReviewMod.SelfSubjectAccessReview = js.native
      
      /**
        * Returns true if the given object is an instance of SelfSubjectAccessReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1.SelfSubjectAccessReview.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1/selfSubjectAccessReview.SelfSubjectAccessReview */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "authorization.v1.SelfSubjectRulesReview")
    @js.native
    class SelfSubjectRulesReview protected ()
      extends typingsSlinky.pulumiKubernetes.authorizationMod.v1.SelfSubjectRulesReview {
      /**
        * Create a SelfSubjectRulesReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: SelfSubjectRulesReviewArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: SelfSubjectRulesReviewArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object SelfSubjectRulesReview {
      
      /**
        * Get an existing SelfSubjectRulesReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1.SelfSubjectRulesReview.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1SelfSubjectRulesReviewMod.SelfSubjectRulesReview = js.native
      @JSImport("@pulumi/kubernetes", "authorization.v1.SelfSubjectRulesReview.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1SelfSubjectRulesReviewMod.SelfSubjectRulesReview = js.native
      
      /**
        * Returns true if the given object is an instance of SelfSubjectRulesReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1.SelfSubjectRulesReview.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1/selfSubjectRulesReview.SelfSubjectRulesReview */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "authorization.v1.SubjectAccessReview")
    @js.native
    class SubjectAccessReview protected ()
      extends typingsSlinky.pulumiKubernetes.authorizationMod.v1.SubjectAccessReview {
      /**
        * Create a SubjectAccessReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: SubjectAccessReviewArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: SubjectAccessReviewArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object SubjectAccessReview {
      
      /**
        * Get an existing SubjectAccessReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1.SubjectAccessReview.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1SubjectAccessReviewMod.SubjectAccessReview = js.native
      @JSImport("@pulumi/kubernetes", "authorization.v1.SubjectAccessReview.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1SubjectAccessReviewMod.SubjectAccessReview = js.native
      
      /**
        * Returns true if the given object is an instance of SubjectAccessReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1.SubjectAccessReview.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1/subjectAccessReview.SubjectAccessReview */ Boolean = js.native
    }
  }
  
  object v1beta1 {
    
    @JSImport("@pulumi/kubernetes", "authorization.v1beta1.LocalSubjectAccessReview")
    @js.native
    class LocalSubjectAccessReview protected ()
      extends typingsSlinky.pulumiKubernetes.authorizationMod.v1beta1.LocalSubjectAccessReview {
      /**
        * Create a LocalSubjectAccessReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.localSubjectAccessReviewMod.LocalSubjectAccessReviewArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.localSubjectAccessReviewMod.LocalSubjectAccessReviewArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object LocalSubjectAccessReview {
      
      /**
        * Get an existing LocalSubjectAccessReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.LocalSubjectAccessReview.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.localSubjectAccessReviewMod.LocalSubjectAccessReview = js.native
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.LocalSubjectAccessReview.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.localSubjectAccessReviewMod.LocalSubjectAccessReview = js.native
      
      /**
        * Returns true if the given object is an instance of LocalSubjectAccessReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.LocalSubjectAccessReview.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/localSubjectAccessReview.LocalSubjectAccessReview */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectAccessReview")
    @js.native
    class SelfSubjectAccessReview protected ()
      extends typingsSlinky.pulumiKubernetes.authorizationMod.v1beta1.SelfSubjectAccessReview {
      /**
        * Create a SelfSubjectAccessReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.selfSubjectAccessReviewMod.SelfSubjectAccessReviewArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.selfSubjectAccessReviewMod.SelfSubjectAccessReviewArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object SelfSubjectAccessReview {
      
      /**
        * Get an existing SelfSubjectAccessReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectAccessReview.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.selfSubjectAccessReviewMod.SelfSubjectAccessReview = js.native
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectAccessReview.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.selfSubjectAccessReviewMod.SelfSubjectAccessReview = js.native
      
      /**
        * Returns true if the given object is an instance of SelfSubjectAccessReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectAccessReview.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/selfSubjectAccessReview.SelfSubjectAccessReview */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectRulesReview")
    @js.native
    class SelfSubjectRulesReview protected ()
      extends typingsSlinky.pulumiKubernetes.authorizationMod.v1beta1.SelfSubjectRulesReview {
      /**
        * Create a SelfSubjectRulesReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.selfSubjectRulesReviewMod.SelfSubjectRulesReviewArgs
      ) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.selfSubjectRulesReviewMod.SelfSubjectRulesReviewArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object SelfSubjectRulesReview {
      
      /**
        * Get an existing SelfSubjectRulesReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectRulesReview.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.selfSubjectRulesReviewMod.SelfSubjectRulesReview = js.native
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectRulesReview.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.selfSubjectRulesReviewMod.SelfSubjectRulesReview = js.native
      
      /**
        * Returns true if the given object is an instance of SelfSubjectRulesReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectRulesReview.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/selfSubjectRulesReview.SelfSubjectRulesReview */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SubjectAccessReview")
    @js.native
    class SubjectAccessReview protected ()
      extends typingsSlinky.pulumiKubernetes.authorizationMod.v1beta1.SubjectAccessReview {
      /**
        * Create a SubjectAccessReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsSlinky.pulumiKubernetes.subjectAccessReviewMod.SubjectAccessReviewArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.subjectAccessReviewMod.SubjectAccessReviewArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object SubjectAccessReview {
      
      /**
        * Get an existing SubjectAccessReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SubjectAccessReview.get")
      @js.native
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.subjectAccessReviewMod.SubjectAccessReview = js.native
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SubjectAccessReview.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.subjectAccessReviewMod.SubjectAccessReview = js.native
      
      /**
        * Returns true if the given object is an instance of SubjectAccessReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SubjectAccessReview.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/subjectAccessReview.SubjectAccessReview */ Boolean = js.native
    }
  }
}
