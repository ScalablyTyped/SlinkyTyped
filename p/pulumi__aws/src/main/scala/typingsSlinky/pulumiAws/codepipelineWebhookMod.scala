package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.codepipeline.WebhookAuthenticationConfiguration
import typingsSlinky.pulumiAws.outputMod.codepipeline.WebhookFilter
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codepipelineWebhookMod {
  
  @JSImport("@pulumi/aws/codepipeline/webhook", "Webhook")
  @js.native
  class Webhook protected () extends CustomResource {
    /**
      * Create a Webhook resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebhookArgs) = this()
    def this(name: String, args: WebhookArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
      */
    val authentication: Output_[String] = js.native
    
    /**
      * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
      */
    val authenticationConfiguration: Output_[js.UndefOr[WebhookAuthenticationConfiguration]] = js.native
    
    /**
      * One or more `filter` blocks. Filter blocks are documented below.
      */
    val filters: Output_[js.Array[WebhookFilter]] = js.native
    
    /**
      * The name of the webhook.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
      */
    val targetAction: Output_[String] = js.native
    
    /**
      * The name of the pipeline.
      */
    val targetPipeline: Output_[String] = js.native
    
    /**
      * The CodePipeline webhook's URL. POST events to this endpoint to trigger the target.
      */
    val url: Output_[String] = js.native
  }
  /* static members */
  object Webhook {
    
    /**
      * Get an existing Webhook resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/codepipeline/webhook", "Webhook.get")
    @js.native
    def get(name: String, id: Input[ID]): Webhook = js.native
    @JSImport("@pulumi/aws/codepipeline/webhook", "Webhook.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Webhook = js.native
    @JSImport("@pulumi/aws/codepipeline/webhook", "Webhook.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebhookState): Webhook = js.native
    @JSImport("@pulumi/aws/codepipeline/webhook", "Webhook.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebhookState, opts: CustomResourceOptions): Webhook = js.native
    
    /**
      * Returns true if the given object is an instance of Webhook.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/codepipeline/webhook", "Webhook.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codepipeline/webhook.Webhook */ Boolean = js.native
  }
  
  @js.native
  trait WebhookArgs extends StObject {
    
    /**
      * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
      */
    val authentication: Input[String] = js.native
    
    /**
      * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
      */
    val authenticationConfiguration: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.codepipeline.WebhookAuthenticationConfiguration]
      ] = js.native
    
    /**
      * One or more `filter` blocks. Filter blocks are documented below.
      */
    val filters: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.codepipeline.WebhookFilter]]] = js.native
    
    /**
      * The name of the webhook.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
      */
    val targetAction: Input[String] = js.native
    
    /**
      * The name of the pipeline.
      */
    val targetPipeline: Input[String] = js.native
  }
  object WebhookArgs {
    
    @scala.inline
    def apply(
      authentication: Input[String],
      filters: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.codepipeline.WebhookFilter]]],
      targetAction: Input[String],
      targetPipeline: Input[String]
    ): WebhookArgs = {
      val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], targetAction = targetAction.asInstanceOf[js.Any], targetPipeline = targetPipeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookArgs]
    }
    
    @scala.inline
    implicit class WebhookArgsMutableBuilder[Self <: WebhookArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthentication(value: Input[String]): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationConfiguration(value: Input[typingsSlinky.pulumiAws.inputMod.codepipeline.WebhookAuthenticationConfiguration]): Self = StObject.set(x, "authenticationConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationConfigurationUndefined: Self = StObject.set(x, "authenticationConfiguration", js.undefined)
      
      @scala.inline
      def setFilters(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.codepipeline.WebhookFilter]]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.codepipeline.WebhookFilter]*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetAction(value: Input[String]): Self = StObject.set(x, "targetAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPipeline(value: Input[String]): Self = StObject.set(x, "targetPipeline", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebhookState extends StObject {
    
    /**
      * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
      */
    val authentication: js.UndefOr[Input[String]] = js.native
    
    /**
      * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
      */
    val authenticationConfiguration: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.codepipeline.WebhookAuthenticationConfiguration]
      ] = js.native
    
    /**
      * One or more `filter` blocks. Filter blocks are documented below.
      */
    val filters: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.codepipeline.WebhookFilter]]]
      ] = js.native
    
    /**
      * The name of the webhook.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
      */
    val targetAction: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the pipeline.
      */
    val targetPipeline: js.UndefOr[Input[String]] = js.native
    
    /**
      * The CodePipeline webhook's URL. POST events to this endpoint to trigger the target.
      */
    val url: js.UndefOr[Input[String]] = js.native
  }
  object WebhookState {
    
    @scala.inline
    def apply(): WebhookState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookState]
    }
    
    @scala.inline
    implicit class WebhookStateMutableBuilder[Self <: WebhookState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthentication(value: Input[String]): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationConfiguration(value: Input[typingsSlinky.pulumiAws.inputMod.codepipeline.WebhookAuthenticationConfiguration]): Self = StObject.set(x, "authenticationConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationConfigurationUndefined: Self = StObject.set(x, "authenticationConfiguration", js.undefined)
      
      @scala.inline
      def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
      
      @scala.inline
      def setFilters(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.codepipeline.WebhookFilter]]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.codepipeline.WebhookFilter]*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetAction(value: Input[String]): Self = StObject.set(x, "targetAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetActionUndefined: Self = StObject.set(x, "targetAction", js.undefined)
      
      @scala.inline
      def setTargetPipeline(value: Input[String]): Self = StObject.set(x, "targetPipeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPipelineUndefined: Self = StObject.set(x, "targetPipeline", js.undefined)
      
      @scala.inline
      def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
