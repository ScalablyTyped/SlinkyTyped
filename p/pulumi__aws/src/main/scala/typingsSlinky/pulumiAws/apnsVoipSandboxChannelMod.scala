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

object apnsVoipSandboxChannelMod {
  
  @JSImport("@pulumi/aws/pinpoint/apnsVoipSandboxChannel", "ApnsVoipSandboxChannel")
  @js.native
  class ApnsVoipSandboxChannel protected () extends CustomResource {
    /**
      * Create a ApnsVoipSandboxChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApnsVoipSandboxChannelArgs) = this()
    def this(name: String, args: ApnsVoipSandboxChannelArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The application ID.
      */
    val applicationId: Output_[String] = js.native
    
    /**
      * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
      */
    val bundleId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The pem encoded TLS Certificate from Apple.
      */
    val certificate: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The default authentication method used for APNs.
      * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
      * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
      * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
      */
    val defaultAuthenticationMethod: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The Certificate Private Key file (ie. `.key` file).
      */
    val privateKey: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
      */
    val teamId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The `.p8` file that you download from your Apple developer account when you create an authentication key.
      */
    val tokenKey: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
      */
    val tokenKeyId: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object ApnsVoipSandboxChannel {
    
    /**
      * Get an existing ApnsVoipSandboxChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint/apnsVoipSandboxChannel", "ApnsVoipSandboxChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): ApnsVoipSandboxChannel = js.native
    @JSImport("@pulumi/aws/pinpoint/apnsVoipSandboxChannel", "ApnsVoipSandboxChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ApnsVoipSandboxChannel = js.native
    @JSImport("@pulumi/aws/pinpoint/apnsVoipSandboxChannel", "ApnsVoipSandboxChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState): ApnsVoipSandboxChannel = js.native
    @JSImport("@pulumi/aws/pinpoint/apnsVoipSandboxChannel", "ApnsVoipSandboxChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState, opts: CustomResourceOptions): ApnsVoipSandboxChannel = js.native
    
    /**
      * Returns true if the given object is an instance of ApnsVoipSandboxChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint/apnsVoipSandboxChannel", "ApnsVoipSandboxChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsVoipSandboxChannel.ApnsVoipSandboxChannel */ Boolean = js.native
  }
  
  @js.native
  trait ApnsVoipSandboxChannelArgs extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: Input[String] = js.native
    
    /**
      * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
      */
    val bundleId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The pem encoded TLS Certificate from Apple.
      */
    val certificate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The default authentication method used for APNs.
      * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
      * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
      * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
      */
    val defaultAuthenticationMethod: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The Certificate Private Key file (ie. `.key` file).
      */
    val privateKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
      */
    val teamId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The `.p8` file that you download from your Apple developer account when you create an authentication key.
      */
    val tokenKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
      */
    val tokenKeyId: js.UndefOr[Input[String]] = js.native
  }
  object ApnsVoipSandboxChannelArgs {
    
    @scala.inline
    def apply(applicationId: Input[String]): ApnsVoipSandboxChannelArgs = {
      val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApnsVoipSandboxChannelArgs]
    }
    
    @scala.inline
    implicit class ApnsVoipSandboxChannelArgsMutableBuilder[Self <: ApnsVoipSandboxChannelArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleId(value: Input[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
      
      @scala.inline
      def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
      
      @scala.inline
      def setDefaultAuthenticationMethod(value: Input[String]): Self = StObject.set(x, "defaultAuthenticationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAuthenticationMethodUndefined: Self = StObject.set(x, "defaultAuthenticationMethod", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: Input[String]): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      @scala.inline
      def setTeamId(value: Input[String]): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
      
      @scala.inline
      def setTokenKey(value: Input[String]): Self = StObject.set(x, "tokenKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenKeyId(value: Input[String]): Self = StObject.set(x, "tokenKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenKeyIdUndefined: Self = StObject.set(x, "tokenKeyId", js.undefined)
      
      @scala.inline
      def setTokenKeyUndefined: Self = StObject.set(x, "tokenKey", js.undefined)
    }
  }
  
  @js.native
  trait ApnsVoipSandboxChannelState extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
      */
    val bundleId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The pem encoded TLS Certificate from Apple.
      */
    val certificate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The default authentication method used for APNs.
      * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
      * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
      * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
      */
    val defaultAuthenticationMethod: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The Certificate Private Key file (ie. `.key` file).
      */
    val privateKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
      */
    val teamId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The `.p8` file that you download from your Apple developer account when you create an authentication key.
      */
    val tokenKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
      */
    val tokenKeyId: js.UndefOr[Input[String]] = js.native
  }
  object ApnsVoipSandboxChannelState {
    
    @scala.inline
    def apply(): ApnsVoipSandboxChannelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApnsVoipSandboxChannelState]
    }
    
    @scala.inline
    implicit class ApnsVoipSandboxChannelStateMutableBuilder[Self <: ApnsVoipSandboxChannelState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
      
      @scala.inline
      def setBundleId(value: Input[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
      
      @scala.inline
      def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
      
      @scala.inline
      def setDefaultAuthenticationMethod(value: Input[String]): Self = StObject.set(x, "defaultAuthenticationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAuthenticationMethodUndefined: Self = StObject.set(x, "defaultAuthenticationMethod", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: Input[String]): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      @scala.inline
      def setTeamId(value: Input[String]): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
      
      @scala.inline
      def setTokenKey(value: Input[String]): Self = StObject.set(x, "tokenKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenKeyId(value: Input[String]): Self = StObject.set(x, "tokenKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenKeyIdUndefined: Self = StObject.set(x, "tokenKeyId", js.undefined)
      
      @scala.inline
      def setTokenKeyUndefined: Self = StObject.set(x, "tokenKey", js.undefined)
    }
  }
}
