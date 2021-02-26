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

object baiduChannelMod {
  
  @JSImport("@pulumi/aws/pinpoint/baiduChannel", "BaiduChannel")
  @js.native
  class BaiduChannel protected () extends CustomResource {
    /**
      * Create a BaiduChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BaiduChannelArgs) = this()
    def this(name: String, args: BaiduChannelArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Platform credential API key from Baidu.
      */
    val apiKey: Output_[String] = js.native
    
    /**
      * The application ID.
      */
    val applicationId: Output_[String] = js.native
    
    /**
      * Specifies whether to enable the channel. Defaults to `true`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Platform credential Secret key from Baidu.
      */
    val secretKey: Output_[String] = js.native
  }
  /* static members */
  object BaiduChannel {
    
    /**
      * Get an existing BaiduChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint/baiduChannel", "BaiduChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): BaiduChannel = js.native
    @JSImport("@pulumi/aws/pinpoint/baiduChannel", "BaiduChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BaiduChannel = js.native
    @JSImport("@pulumi/aws/pinpoint/baiduChannel", "BaiduChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: BaiduChannelState): BaiduChannel = js.native
    @JSImport("@pulumi/aws/pinpoint/baiduChannel", "BaiduChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: BaiduChannelState, opts: CustomResourceOptions): BaiduChannel = js.native
    
    /**
      * Returns true if the given object is an instance of BaiduChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint/baiduChannel", "BaiduChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/baiduChannel.BaiduChannel */ Boolean = js.native
  }
  
  @js.native
  trait BaiduChannelArgs extends StObject {
    
    /**
      * Platform credential API key from Baidu.
      */
    val apiKey: Input[String] = js.native
    
    /**
      * The application ID.
      */
    val applicationId: Input[String] = js.native
    
    /**
      * Specifies whether to enable the channel. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Platform credential Secret key from Baidu.
      */
    val secretKey: Input[String] = js.native
  }
  object BaiduChannelArgs {
    
    @scala.inline
    def apply(apiKey: Input[String], applicationId: Input[String], secretKey: Input[String]): BaiduChannelArgs = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaiduChannelArgs]
    }
    
    @scala.inline
    implicit class BaiduChannelArgsMutableBuilder[Self <: BaiduChannelArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: Input[String]): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setSecretKey(value: Input[String]): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BaiduChannelState extends StObject {
    
    /**
      * Platform credential API key from Baidu.
      */
    val apiKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The application ID.
      */
    val applicationId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies whether to enable the channel. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Platform credential Secret key from Baidu.
      */
    val secretKey: js.UndefOr[Input[String]] = js.native
  }
  object BaiduChannelState {
    
    @scala.inline
    def apply(): BaiduChannelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaiduChannelState]
    }
    
    @scala.inline
    implicit class BaiduChannelStateMutableBuilder[Self <: BaiduChannelState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: Input[String]): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setSecretKey(value: Input[String]): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
    }
  }
}
