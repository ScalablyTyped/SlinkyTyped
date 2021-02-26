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

object smsChannelMod {
  
  @JSImport("@pulumi/aws/pinpoint/smsChannel", "SmsChannel")
  @js.native
  class SmsChannel protected () extends CustomResource {
    /**
      * Create a SmsChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SmsChannelArgs) = this()
    def this(name: String, args: SmsChannelArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The application ID.
      */
    val applicationId: Output_[String] = js.native
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Promotional messages per second that can be sent.
      */
    val promotionalMessagesPerSecond: Output_[Double] = js.native
    
    /**
      * Sender identifier of your messages.
      */
    val senderId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Short Code registered with the phone provider.
      */
    val shortCode: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Transactional messages per second that can be sent.
      */
    val transactionalMessagesPerSecond: Output_[Double] = js.native
  }
  /* static members */
  object SmsChannel {
    
    /**
      * Get an existing SmsChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint/smsChannel", "SmsChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): SmsChannel = js.native
    @JSImport("@pulumi/aws/pinpoint/smsChannel", "SmsChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SmsChannel = js.native
    @JSImport("@pulumi/aws/pinpoint/smsChannel", "SmsChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmsChannelState): SmsChannel = js.native
    @JSImport("@pulumi/aws/pinpoint/smsChannel", "SmsChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmsChannelState, opts: CustomResourceOptions): SmsChannel = js.native
    
    /**
      * Returns true if the given object is an instance of SmsChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint/smsChannel", "SmsChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/smsChannel.SmsChannel */ Boolean = js.native
  }
  
  @js.native
  trait SmsChannelArgs extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: Input[String] = js.native
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Sender identifier of your messages.
      */
    val senderId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Short Code registered with the phone provider.
      */
    val shortCode: js.UndefOr[Input[String]] = js.native
  }
  object SmsChannelArgs {
    
    @scala.inline
    def apply(applicationId: Input[String]): SmsChannelArgs = {
      val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmsChannelArgs]
    }
    
    @scala.inline
    implicit class SmsChannelArgsMutableBuilder[Self <: SmsChannelArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setSenderId(value: Input[String]): Self = StObject.set(x, "senderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderIdUndefined: Self = StObject.set(x, "senderId", js.undefined)
      
      @scala.inline
      def setShortCode(value: Input[String]): Self = StObject.set(x, "shortCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortCodeUndefined: Self = StObject.set(x, "shortCode", js.undefined)
    }
  }
  
  @js.native
  trait SmsChannelState extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Promotional messages per second that can be sent.
      */
    val promotionalMessagesPerSecond: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Sender identifier of your messages.
      */
    val senderId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Short Code registered with the phone provider.
      */
    val shortCode: js.UndefOr[Input[String]] = js.native
    
    /**
      * Transactional messages per second that can be sent.
      */
    val transactionalMessagesPerSecond: js.UndefOr[Input[Double]] = js.native
  }
  object SmsChannelState {
    
    @scala.inline
    def apply(): SmsChannelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmsChannelState]
    }
    
    @scala.inline
    implicit class SmsChannelStateMutableBuilder[Self <: SmsChannelState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setPromotionalMessagesPerSecond(value: Input[Double]): Self = StObject.set(x, "promotionalMessagesPerSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromotionalMessagesPerSecondUndefined: Self = StObject.set(x, "promotionalMessagesPerSecond", js.undefined)
      
      @scala.inline
      def setSenderId(value: Input[String]): Self = StObject.set(x, "senderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderIdUndefined: Self = StObject.set(x, "senderId", js.undefined)
      
      @scala.inline
      def setShortCode(value: Input[String]): Self = StObject.set(x, "shortCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortCodeUndefined: Self = StObject.set(x, "shortCode", js.undefined)
      
      @scala.inline
      def setTransactionalMessagesPerSecond(value: Input[Double]): Self = StObject.set(x, "transactionalMessagesPerSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionalMessagesPerSecondUndefined: Self = StObject.set(x, "transactionalMessagesPerSecond", js.undefined)
    }
  }
}
