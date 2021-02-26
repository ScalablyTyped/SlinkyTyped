package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openIdConnectProviderMod {
  
  @JSImport("@pulumi/aws/iam/openIdConnectProvider", "OpenIdConnectProvider")
  @js.native
  class OpenIdConnectProvider protected () extends CustomResource {
    /**
      * Create a OpenIdConnectProvider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OpenIdConnectProviderArgs) = this()
    def this(name: String, args: OpenIdConnectProviderArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN assigned by AWS for this provider.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the clientId parameter on OAuth requests.)
      */
    val clientIdLists: Output_[js.Array[String]] = js.native
    
    /**
      * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
      */
    val thumbprintLists: Output_[js.Array[String]] = js.native
    
    /**
      * The URL of the identity provider. Corresponds to the _iss_ claim.
      */
    val url: Output_[String] = js.native
  }
  /* static members */
  object OpenIdConnectProvider {
    
    /**
      * Get an existing OpenIdConnectProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iam/openIdConnectProvider", "OpenIdConnectProvider.get")
    @js.native
    def get(name: String, id: Input[ID]): OpenIdConnectProvider = js.native
    @JSImport("@pulumi/aws/iam/openIdConnectProvider", "OpenIdConnectProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): OpenIdConnectProvider = js.native
    @JSImport("@pulumi/aws/iam/openIdConnectProvider", "OpenIdConnectProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: OpenIdConnectProviderState): OpenIdConnectProvider = js.native
    @JSImport("@pulumi/aws/iam/openIdConnectProvider", "OpenIdConnectProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: OpenIdConnectProviderState, opts: CustomResourceOptions): OpenIdConnectProvider = js.native
    
    /**
      * Returns true if the given object is an instance of OpenIdConnectProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iam/openIdConnectProvider", "OpenIdConnectProvider.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/openIdConnectProvider.OpenIdConnectProvider */ Boolean = js.native
  }
  
  @js.native
  trait OpenIdConnectProviderArgs extends StObject {
    
    /**
      * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the clientId parameter on OAuth requests.)
      */
    val clientIdLists: Input[js.Array[Input[String]]] = js.native
    
    /**
      * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
      */
    val thumbprintLists: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The URL of the identity provider. Corresponds to the _iss_ claim.
      */
    val url: Input[String] = js.native
  }
  object OpenIdConnectProviderArgs {
    
    @scala.inline
    def apply(
      clientIdLists: Input[js.Array[Input[String]]],
      thumbprintLists: Input[js.Array[Input[String]]],
      url: Input[String]
    ): OpenIdConnectProviderArgs = {
      val __obj = js.Dynamic.literal(clientIdLists = clientIdLists.asInstanceOf[js.Any], thumbprintLists = thumbprintLists.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenIdConnectProviderArgs]
    }
    
    @scala.inline
    implicit class OpenIdConnectProviderArgsMutableBuilder[Self <: OpenIdConnectProviderArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientIdLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "clientIdLists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdListsVarargs(value: Input[String]*): Self = StObject.set(x, "clientIdLists", js.Array(value :_*))
      
      @scala.inline
      def setThumbprintLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "thumbprintLists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbprintListsVarargs(value: Input[String]*): Self = StObject.set(x, "thumbprintLists", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpenIdConnectProviderState extends StObject {
    
    /**
      * The ARN assigned by AWS for this provider.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the clientId parameter on OAuth requests.)
      */
    val clientIdLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
      */
    val thumbprintLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The URL of the identity provider. Corresponds to the _iss_ claim.
      */
    val url: js.UndefOr[Input[String]] = js.native
  }
  object OpenIdConnectProviderState {
    
    @scala.inline
    def apply(): OpenIdConnectProviderState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenIdConnectProviderState]
    }
    
    @scala.inline
    implicit class OpenIdConnectProviderStateMutableBuilder[Self <: OpenIdConnectProviderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setClientIdLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "clientIdLists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdListsUndefined: Self = StObject.set(x, "clientIdLists", js.undefined)
      
      @scala.inline
      def setClientIdListsVarargs(value: Input[String]*): Self = StObject.set(x, "clientIdLists", js.Array(value :_*))
      
      @scala.inline
      def setThumbprintLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "thumbprintLists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbprintListsUndefined: Self = StObject.set(x, "thumbprintLists", js.undefined)
      
      @scala.inline
      def setThumbprintListsVarargs(value: Input[String]*): Self = StObject.set(x, "thumbprintLists", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
