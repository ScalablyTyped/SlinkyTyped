package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getTopicMod.GetTopicArgs
import typingsSlinky.pulumiAws.getTopicMod.GetTopicResult
import typingsSlinky.pulumiAws.platformApplicationMod.PlatformApplicationArgs
import typingsSlinky.pulumiAws.platformApplicationMod.PlatformApplicationState
import typingsSlinky.pulumiAws.smsPreferencesMod.SmsPreferencesArgs
import typingsSlinky.pulumiAws.smsPreferencesMod.SmsPreferencesState
import typingsSlinky.pulumiAws.snsMixinsMod.TopicEventHandler
import typingsSlinky.pulumiAws.snsMixinsMod.TopicEventSubscriptionArgs
import typingsSlinky.pulumiAws.topicMod.TopicArgs
import typingsSlinky.pulumiAws.topicMod.TopicState
import typingsSlinky.pulumiAws.topicPolicyMod.TopicPolicyArgs
import typingsSlinky.pulumiAws.topicPolicyMod.TopicPolicyState
import typingsSlinky.pulumiAws.topicSubscriptionMod.TopicSubscriptionArgs
import typingsSlinky.pulumiAws.topicSubscriptionMod.TopicSubscriptionState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sns {
  
  @JSImport("@pulumi/aws", "sns.PlatformApplication")
  @js.native
  class PlatformApplication protected ()
    extends typingsSlinky.pulumiAws.snsMod.PlatformApplication {
    /**
      * Create a PlatformApplication resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PlatformApplicationArgs) = this()
    def this(name: String, args: PlatformApplicationArgs, opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws", "sns.PlatformApplication.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.platformApplicationMod.PlatformApplication = js.native
    @JSImport("@pulumi/aws", "sns.PlatformApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.platformApplicationMod.PlatformApplication = js.native
    @JSImport("@pulumi/aws", "sns.PlatformApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: PlatformApplicationState): typingsSlinky.pulumiAws.platformApplicationMod.PlatformApplication = js.native
    @JSImport("@pulumi/aws", "sns.PlatformApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: PlatformApplicationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.platformApplicationMod.PlatformApplication = js.native
    
    /**
      * Returns true if the given object is an instance of PlatformApplication.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "sns.PlatformApplication.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/platformApplication.PlatformApplication */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "sns.SmsPreferences")
  @js.native
  class SmsPreferences protected ()
    extends typingsSlinky.pulumiAws.snsMod.SmsPreferences {
    /**
      * Create a SmsPreferences resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SmsPreferencesArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: SmsPreferencesArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SmsPreferences {
    
    /**
      * Get an existing SmsPreferences resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "sns.SmsPreferences.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.smsPreferencesMod.SmsPreferences = js.native
    @JSImport("@pulumi/aws", "sns.SmsPreferences.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.smsPreferencesMod.SmsPreferences = js.native
    @JSImport("@pulumi/aws", "sns.SmsPreferences.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmsPreferencesState): typingsSlinky.pulumiAws.smsPreferencesMod.SmsPreferences = js.native
    @JSImport("@pulumi/aws", "sns.SmsPreferences.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmsPreferencesState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.smsPreferencesMod.SmsPreferences = js.native
    
    /**
      * Returns true if the given object is an instance of SmsPreferences.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "sns.SmsPreferences.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/smsPreferences.SmsPreferences */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "sns.Topic")
  @js.native
  class Topic protected ()
    extends typingsSlinky.pulumiAws.snsMod.Topic {
    /**
      * Create a Topic resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TopicArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TopicArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Topic {
    
    /**
      * Get an existing Topic resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "sns.Topic.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.topicMod.Topic = js.native
    @JSImport("@pulumi/aws", "sns.Topic.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.topicMod.Topic = js.native
    @JSImport("@pulumi/aws", "sns.Topic.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicState): typingsSlinky.pulumiAws.topicMod.Topic = js.native
    @JSImport("@pulumi/aws", "sns.Topic.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.topicMod.Topic = js.native
    
    /**
      * Returns true if the given object is an instance of Topic.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "sns.Topic.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topic.Topic */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "sns.TopicEventSubscription")
  @js.native
  class TopicEventSubscription protected ()
    extends typingsSlinky.pulumiAws.snsMod.TopicEventSubscription {
    def this(name: String, topic: typingsSlinky.pulumiAws.topicMod.Topic, handler: TopicEventHandler) = this()
    def this(
      name: String,
      topic: typingsSlinky.pulumiAws.topicMod.Topic,
      handler: TopicEventHandler,
      args: TopicEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      topic: typingsSlinky.pulumiAws.topicMod.Topic,
      handler: TopicEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ) = this()
    def this(
      name: String,
      topic: typingsSlinky.pulumiAws.topicMod.Topic,
      handler: TopicEventHandler,
      args: TopicEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @JSImport("@pulumi/aws", "sns.TopicPolicy")
  @js.native
  class TopicPolicy protected ()
    extends typingsSlinky.pulumiAws.snsMod.TopicPolicy {
    /**
      * Create a TopicPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TopicPolicyArgs) = this()
    def this(name: String, args: TopicPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TopicPolicy {
    
    /**
      * Get an existing TopicPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "sns.TopicPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.topicPolicyMod.TopicPolicy = js.native
    @JSImport("@pulumi/aws", "sns.TopicPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.topicPolicyMod.TopicPolicy = js.native
    @JSImport("@pulumi/aws", "sns.TopicPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicPolicyState): typingsSlinky.pulumiAws.topicPolicyMod.TopicPolicy = js.native
    @JSImport("@pulumi/aws", "sns.TopicPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.topicPolicyMod.TopicPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of TopicPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "sns.TopicPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topicPolicy.TopicPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "sns.TopicSubscription")
  @js.native
  class TopicSubscription protected ()
    extends typingsSlinky.pulumiAws.snsMod.TopicSubscription {
    /**
      * Create a TopicSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TopicSubscriptionArgs) = this()
    def this(name: String, args: TopicSubscriptionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TopicSubscription {
    
    /**
      * Get an existing TopicSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "sns.TopicSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.topicSubscriptionMod.TopicSubscription = js.native
    @JSImport("@pulumi/aws", "sns.TopicSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.topicSubscriptionMod.TopicSubscription = js.native
    @JSImport("@pulumi/aws", "sns.TopicSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicSubscriptionState): typingsSlinky.pulumiAws.topicSubscriptionMod.TopicSubscription = js.native
    @JSImport("@pulumi/aws", "sns.TopicSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicSubscriptionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.topicSubscriptionMod.TopicSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of TopicSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "sns.TopicSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topicSubscription.TopicSubscription */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "sns.getTopic")
  @js.native
  def getTopic(args: GetTopicArgs): js.Promise[GetTopicResult] = js.native
  @JSImport("@pulumi/aws", "sns.getTopic")
  @js.native
  def getTopic(args: GetTopicArgs, opts: InvokeOptions): js.Promise[GetTopicResult] = js.native
  
  /* augmented module */
  object pulumiAwsSnsTopicAugmentingMod {
    
    @js.native
    trait Topic extends StObject {
      
      /**
        * Creates a new subscription to events fired from this Topic to the handler provided, along
        * with options to control the behavior of the subscription.
        */
      def onEvent(name: String, handler: TopicEventHandler): typingsSlinky.pulumiAws.snsMixinsMod.TopicEventSubscription = js.native
      def onEvent(
        name: String,
        handler: TopicEventHandler,
        args: js.UndefOr[scala.Nothing],
        opts: ComponentResourceOptions
      ): typingsSlinky.pulumiAws.snsMixinsMod.TopicEventSubscription = js.native
      def onEvent(name: String, handler: TopicEventHandler, args: TopicEventSubscriptionArgs): typingsSlinky.pulumiAws.snsMixinsMod.TopicEventSubscription = js.native
      def onEvent(
        name: String,
        handler: TopicEventHandler,
        args: TopicEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): typingsSlinky.pulumiAws.snsMixinsMod.TopicEventSubscription = js.native
    }
  }
}
