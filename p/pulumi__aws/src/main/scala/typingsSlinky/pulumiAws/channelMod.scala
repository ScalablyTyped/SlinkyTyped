package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.mediapackage.ChannelHlsIngest
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMod {
  
  @JSImport("@pulumi/aws/mediapackage/channel", "Channel")
  @js.native
  class Channel protected () extends CustomResource {
    /**
      * Create a Channel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ChannelArgs) = this()
    def this(name: String, args: ChannelArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the channel
      */
    val arn: Output_[String] = js.native
    
    /**
      * A unique identifier describing the channel
      */
    val channelId: Output_[String] = js.native
    
    /**
      * A description of the channel
      */
    val description: Output_[String] = js.native
    
    /**
      * A single item list of HLS ingest information
      */
    val hlsIngests: Output_[js.Array[ChannelHlsIngest]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Channel {
    
    /**
      * Get an existing Channel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/mediapackage/channel", "Channel.get")
    @js.native
    def get(name: String, id: Input[ID]): Channel = js.native
    @JSImport("@pulumi/aws/mediapackage/channel", "Channel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Channel = js.native
    @JSImport("@pulumi/aws/mediapackage/channel", "Channel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ChannelState): Channel = js.native
    @JSImport("@pulumi/aws/mediapackage/channel", "Channel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ChannelState, opts: CustomResourceOptions): Channel = js.native
    
    /**
      * Returns true if the given object is an instance of Channel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/mediapackage/channel", "Channel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediapackage/channel.Channel */ Boolean = js.native
  }
  
  @js.native
  trait ChannelArgs extends StObject {
    
    /**
      * A unique identifier describing the channel
      */
    val channelId: Input[String] = js.native
    
    /**
      * A description of the channel
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ChannelArgs {
    
    @scala.inline
    def apply(channelId: Input[String]): ChannelArgs = {
      val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelArgs]
    }
    
    @scala.inline
    implicit class ChannelArgsMutableBuilder[Self <: ChannelArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelId(value: Input[String]): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ChannelState extends StObject {
    
    /**
      * The ARN of the channel
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A unique identifier describing the channel
      */
    val channelId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A description of the channel
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A single item list of HLS ingest information
      */
    val hlsIngests: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.mediapackage.ChannelHlsIngest]]]
      ] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ChannelState {
    
    @scala.inline
    def apply(): ChannelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelState]
    }
    
    @scala.inline
    implicit class ChannelStateMutableBuilder[Self <: ChannelState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setChannelId(value: Input[String]): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setHlsIngests(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.mediapackage.ChannelHlsIngest]]]): Self = StObject.set(x, "hlsIngests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHlsIngestsUndefined: Self = StObject.set(x, "hlsIngests", js.undefined)
      
      @scala.inline
      def setHlsIngestsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.mediapackage.ChannelHlsIngest]*): Self = StObject.set(x, "hlsIngests", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
