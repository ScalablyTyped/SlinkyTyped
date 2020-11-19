package typingsSlinky.pulumiKubernetes.mod

import typingsSlinky.pulumiKubernetes.tokenRequestMod.TokenRequestArgs
import typingsSlinky.pulumiKubernetes.v1TokenReviewMod.TokenReviewArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes", "authentication")
@js.native
object authentication extends js.Object {
  
  @js.native
  object v1 extends js.Object {
    
    @js.native
    class TokenRequest protected ()
      extends typingsSlinky.pulumiKubernetes.authenticationMod.v1.TokenRequest {
      /**
        * Create a TokenRequest resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: TokenRequestArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: TokenRequestArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object TokenRequest extends js.Object {
      
      /**
        * Get an existing TokenRequest resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.tokenRequestMod.TokenRequest = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.tokenRequestMod.TokenRequest = js.native
      
      /**
        * Returns true if the given object is an instance of TokenRequest.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1/tokenRequest.TokenRequest */ Boolean = js.native
    }
    
    @js.native
    class TokenReview protected ()
      extends typingsSlinky.pulumiKubernetes.authenticationMod.v1.TokenReview {
      /**
        * Create a TokenReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: TokenReviewArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: TokenReviewArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object TokenReview extends js.Object {
      
      /**
        * Get an existing TokenReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1TokenReviewMod.TokenReview = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1TokenReviewMod.TokenReview = js.native
      
      /**
        * Returns true if the given object is an instance of TokenReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1/tokenReview.TokenReview */ Boolean = js.native
    }
  }
  
  @js.native
  object v1beta1 extends js.Object {
    
    @js.native
    class TokenReview protected ()
      extends typingsSlinky.pulumiKubernetes.authenticationMod.v1beta1.TokenReview {
      /**
        * Create a TokenReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsSlinky.pulumiKubernetes.tokenReviewMod.TokenReviewArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typingsSlinky.pulumiKubernetes.tokenReviewMod.TokenReviewArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    @js.native
    object TokenReview extends js.Object {
      
      /**
        * Get an existing TokenReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.tokenReviewMod.TokenReview = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.tokenReviewMod.TokenReview = js.native
      
      /**
        * Returns true if the given object is an instance of TokenReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1beta1/tokenReview.TokenReview */ Boolean = js.native
    }
  }
}
