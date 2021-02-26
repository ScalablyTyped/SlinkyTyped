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

object platformApplicationMod {
  
  @JSImport("@pulumi/aws/sns/platformApplication", "PlatformApplication")
  @js.native
  class PlatformApplication protected () extends CustomResource {
    /**
      * Create a PlatformApplication resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PlatformApplicationArgs) = this()
    def this(name: String, args: PlatformApplicationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the SNS platform application
      */
    val arn: Output_[String] = js.native
    
    /**
      * SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
      */
    val eventDeliveryFailureTopicArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * SNS Topic triggered when a new platform endpoint is added to your platform application.
      */
    val eventEndpointCreatedTopicArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
      */
    val eventEndpointDeletedTopicArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * SNS Topic triggered when an existing platform endpoint is changed from your platform application.
      */
    val eventEndpointUpdatedTopicArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The IAM role permitted to receive failure feedback for this application.
      */
    val failureFeedbackRoleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The friendly name for the SNS platform application
      */
    val name: Output_[String] = js.native
    
    /**
      * The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
      */
    val platform: Output_[String] = js.native
    
    /**
      * Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
      */
    val platformCredential: Output_[String] = js.native
    
    /**
      * Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
      */
    val platformPrincipal: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The IAM role permitted to receive success feedback for this application.
      */
    val successFeedbackRoleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The percentage of success to sample (0-100)
      */
    val successFeedbackSampleRate: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object PlatformApplication {
    
    /**
      * Get an existing PlatformApplication resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sns/platformApplication", "PlatformApplication.get")
    @js.native
    def get(name: String, id: Input[ID]): PlatformApplication = js.native
    @JSImport("@pulumi/aws/sns/platformApplication", "PlatformApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PlatformApplication = js.native
    @JSImport("@pulumi/aws/sns/platformApplication", "PlatformApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: PlatformApplicationState): PlatformApplication = js.native
    @JSImport("@pulumi/aws/sns/platformApplication", "PlatformApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: PlatformApplicationState, opts: CustomResourceOptions): PlatformApplication = js.native
    
    /**
      * Returns true if the given object is an instance of PlatformApplication.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sns/platformApplication", "PlatformApplication.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/platformApplication.PlatformApplication */ Boolean = js.native
  }
  
  @js.native
  trait PlatformApplicationArgs extends StObject {
    
    /**
      * SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
      */
    val eventDeliveryFailureTopicArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * SNS Topic triggered when a new platform endpoint is added to your platform application.
      */
    val eventEndpointCreatedTopicArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
      */
    val eventEndpointDeletedTopicArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * SNS Topic triggered when an existing platform endpoint is changed from your platform application.
      */
    val eventEndpointUpdatedTopicArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IAM role permitted to receive failure feedback for this application.
      */
    val failureFeedbackRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The friendly name for the SNS platform application
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
      */
    val platform: Input[String] = js.native
    
    /**
      * Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
      */
    val platformCredential: Input[String] = js.native
    
    /**
      * Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
      */
    val platformPrincipal: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IAM role permitted to receive success feedback for this application.
      */
    val successFeedbackRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The percentage of success to sample (0-100)
      */
    val successFeedbackSampleRate: js.UndefOr[Input[String]] = js.native
  }
  object PlatformApplicationArgs {
    
    @scala.inline
    def apply(platform: Input[String], platformCredential: Input[String]): PlatformApplicationArgs = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], platformCredential = platformCredential.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformApplicationArgs]
    }
    
    @scala.inline
    implicit class PlatformApplicationArgsMutableBuilder[Self <: PlatformApplicationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventDeliveryFailureTopicArn(value: Input[String]): Self = StObject.set(x, "eventDeliveryFailureTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventDeliveryFailureTopicArnUndefined: Self = StObject.set(x, "eventDeliveryFailureTopicArn", js.undefined)
      
      @scala.inline
      def setEventEndpointCreatedTopicArn(value: Input[String]): Self = StObject.set(x, "eventEndpointCreatedTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventEndpointCreatedTopicArnUndefined: Self = StObject.set(x, "eventEndpointCreatedTopicArn", js.undefined)
      
      @scala.inline
      def setEventEndpointDeletedTopicArn(value: Input[String]): Self = StObject.set(x, "eventEndpointDeletedTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventEndpointDeletedTopicArnUndefined: Self = StObject.set(x, "eventEndpointDeletedTopicArn", js.undefined)
      
      @scala.inline
      def setEventEndpointUpdatedTopicArn(value: Input[String]): Self = StObject.set(x, "eventEndpointUpdatedTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventEndpointUpdatedTopicArnUndefined: Self = StObject.set(x, "eventEndpointUpdatedTopicArn", js.undefined)
      
      @scala.inline
      def setFailureFeedbackRoleArn(value: Input[String]): Self = StObject.set(x, "failureFeedbackRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureFeedbackRoleArnUndefined: Self = StObject.set(x, "failureFeedbackRoleArn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlatform(value: Input[String]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformCredential(value: Input[String]): Self = StObject.set(x, "platformCredential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformPrincipal(value: Input[String]): Self = StObject.set(x, "platformPrincipal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformPrincipalUndefined: Self = StObject.set(x, "platformPrincipal", js.undefined)
      
      @scala.inline
      def setSuccessFeedbackRoleArn(value: Input[String]): Self = StObject.set(x, "successFeedbackRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessFeedbackRoleArnUndefined: Self = StObject.set(x, "successFeedbackRoleArn", js.undefined)
      
      @scala.inline
      def setSuccessFeedbackSampleRate(value: Input[String]): Self = StObject.set(x, "successFeedbackSampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessFeedbackSampleRateUndefined: Self = StObject.set(x, "successFeedbackSampleRate", js.undefined)
    }
  }
  
  @js.native
  trait PlatformApplicationState extends StObject {
    
    /**
      * The ARN of the SNS platform application
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
      */
    val eventDeliveryFailureTopicArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * SNS Topic triggered when a new platform endpoint is added to your platform application.
      */
    val eventEndpointCreatedTopicArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
      */
    val eventEndpointDeletedTopicArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * SNS Topic triggered when an existing platform endpoint is changed from your platform application.
      */
    val eventEndpointUpdatedTopicArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IAM role permitted to receive failure feedback for this application.
      */
    val failureFeedbackRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The friendly name for the SNS platform application
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
      */
    val platform: js.UndefOr[Input[String]] = js.native
    
    /**
      * Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
      */
    val platformCredential: js.UndefOr[Input[String]] = js.native
    
    /**
      * Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
      */
    val platformPrincipal: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IAM role permitted to receive success feedback for this application.
      */
    val successFeedbackRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The percentage of success to sample (0-100)
      */
    val successFeedbackSampleRate: js.UndefOr[Input[String]] = js.native
  }
  object PlatformApplicationState {
    
    @scala.inline
    def apply(): PlatformApplicationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlatformApplicationState]
    }
    
    @scala.inline
    implicit class PlatformApplicationStateMutableBuilder[Self <: PlatformApplicationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEventDeliveryFailureTopicArn(value: Input[String]): Self = StObject.set(x, "eventDeliveryFailureTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventDeliveryFailureTopicArnUndefined: Self = StObject.set(x, "eventDeliveryFailureTopicArn", js.undefined)
      
      @scala.inline
      def setEventEndpointCreatedTopicArn(value: Input[String]): Self = StObject.set(x, "eventEndpointCreatedTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventEndpointCreatedTopicArnUndefined: Self = StObject.set(x, "eventEndpointCreatedTopicArn", js.undefined)
      
      @scala.inline
      def setEventEndpointDeletedTopicArn(value: Input[String]): Self = StObject.set(x, "eventEndpointDeletedTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventEndpointDeletedTopicArnUndefined: Self = StObject.set(x, "eventEndpointDeletedTopicArn", js.undefined)
      
      @scala.inline
      def setEventEndpointUpdatedTopicArn(value: Input[String]): Self = StObject.set(x, "eventEndpointUpdatedTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventEndpointUpdatedTopicArnUndefined: Self = StObject.set(x, "eventEndpointUpdatedTopicArn", js.undefined)
      
      @scala.inline
      def setFailureFeedbackRoleArn(value: Input[String]): Self = StObject.set(x, "failureFeedbackRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureFeedbackRoleArnUndefined: Self = StObject.set(x, "failureFeedbackRoleArn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlatform(value: Input[String]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformCredential(value: Input[String]): Self = StObject.set(x, "platformCredential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformCredentialUndefined: Self = StObject.set(x, "platformCredential", js.undefined)
      
      @scala.inline
      def setPlatformPrincipal(value: Input[String]): Self = StObject.set(x, "platformPrincipal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformPrincipalUndefined: Self = StObject.set(x, "platformPrincipal", js.undefined)
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setSuccessFeedbackRoleArn(value: Input[String]): Self = StObject.set(x, "successFeedbackRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessFeedbackRoleArnUndefined: Self = StObject.set(x, "successFeedbackRoleArn", js.undefined)
      
      @scala.inline
      def setSuccessFeedbackSampleRate(value: Input[String]): Self = StObject.set(x, "successFeedbackSampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessFeedbackSampleRateUndefined: Self = StObject.set(x, "successFeedbackSampleRate", js.undefined)
    }
  }
}
