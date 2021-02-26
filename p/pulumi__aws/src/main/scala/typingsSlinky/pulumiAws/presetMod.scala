package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.elastictranscoder.PresetAudio
import typingsSlinky.pulumiAws.outputMod.elastictranscoder.PresetAudioCodecOptions
import typingsSlinky.pulumiAws.outputMod.elastictranscoder.PresetThumbnails
import typingsSlinky.pulumiAws.outputMod.elastictranscoder.PresetVideo
import typingsSlinky.pulumiAws.outputMod.elastictranscoder.PresetVideoWatermark
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presetMod {
  
  @JSImport("@pulumi/aws/elastictranscoder/preset", "Preset")
  @js.native
  class Preset protected () extends CustomResource {
    /**
      * Create a Preset resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PresetArgs) = this()
    def this(name: String, args: PresetArgs, opts: CustomResourceOptions) = this()
    
    val arn: Output_[String] = js.native
    
    /**
      * Audio parameters object (documented below).
      */
    val audio: Output_[js.UndefOr[PresetAudio]] = js.native
    
    /**
      * Codec options for the audio parameters (documented below)
      */
    val audioCodecOptions: Output_[js.UndefOr[PresetAudioCodecOptions]] = js.native
    
    /**
      * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
      */
    val container: Output_[String] = js.native
    
    /**
      * A description of the preset (maximum 255 characters)
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the preset. (maximum 40 characters)
      */
    val name: Output_[String] = js.native
    
    /**
      * Thumbnail parameters object (documented below)
      */
    val thumbnails: Output_[js.UndefOr[PresetThumbnails]] = js.native
    
    val `type`: Output_[String] = js.native
    
    /**
      * Video parameters object (documented below)
      */
    val video: Output_[js.UndefOr[PresetVideo]] = js.native
    
    /**
      * Codec options for the video parameters
      */
    val videoCodecOptions: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Watermark parameters for the video parameters (documented below)
      */
    val videoWatermarks: Output_[js.UndefOr[js.Array[PresetVideoWatermark]]] = js.native
  }
  /* static members */
  object Preset {
    
    /**
      * Get an existing Preset resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elastictranscoder/preset", "Preset.get")
    @js.native
    def get(name: String, id: Input[ID]): Preset = js.native
    @JSImport("@pulumi/aws/elastictranscoder/preset", "Preset.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Preset = js.native
    @JSImport("@pulumi/aws/elastictranscoder/preset", "Preset.get")
    @js.native
    def get(name: String, id: Input[ID], state: PresetState): Preset = js.native
    @JSImport("@pulumi/aws/elastictranscoder/preset", "Preset.get")
    @js.native
    def get(name: String, id: Input[ID], state: PresetState, opts: CustomResourceOptions): Preset = js.native
    
    /**
      * Returns true if the given object is an instance of Preset.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elastictranscoder/preset", "Preset.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elastictranscoder/preset.Preset */ Boolean = js.native
  }
  
  @js.native
  trait PresetArgs extends StObject {
    
    /**
      * Audio parameters object (documented below).
      */
    val audio: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetAudio]] = js.native
    
    /**
      * Codec options for the audio parameters (documented below)
      */
    val audioCodecOptions: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetAudioCodecOptions]
      ] = js.native
    
    /**
      * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
      */
    val container: Input[String] = js.native
    
    /**
      * A description of the preset (maximum 255 characters)
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the preset. (maximum 40 characters)
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Thumbnail parameters object (documented below)
      */
    val thumbnails: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetThumbnails]] = js.native
    
    val `type`: js.UndefOr[Input[String]] = js.native
    
    /**
      * Video parameters object (documented below)
      */
    val video: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetVideo]] = js.native
    
    /**
      * Codec options for the video parameters
      */
    val videoCodecOptions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Watermark parameters for the video parameters (documented below)
      */
    val videoWatermarks: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetVideoWatermark]]
        ]
      ] = js.native
  }
  object PresetArgs {
    
    @scala.inline
    def apply(container: Input[String]): PresetArgs = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresetArgs]
    }
    
    @scala.inline
    implicit class PresetArgsMutableBuilder[Self <: PresetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetAudio]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioCodecOptions(value: Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetAudioCodecOptions]): Self = StObject.set(x, "audioCodecOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioCodecOptionsUndefined: Self = StObject.set(x, "audioCodecOptions", js.undefined)
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def setContainer(value: Input[String]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setThumbnails(value: Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetThumbnails]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVideo(value: Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetVideo]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoCodecOptions(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "videoCodecOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoCodecOptionsUndefined: Self = StObject.set(x, "videoCodecOptions", js.undefined)
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      @scala.inline
      def setVideoWatermarks(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetVideoWatermark]]
            ]
      ): Self = StObject.set(x, "videoWatermarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoWatermarksUndefined: Self = StObject.set(x, "videoWatermarks", js.undefined)
      
      @scala.inline
      def setVideoWatermarksVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetVideoWatermark]*): Self = StObject.set(x, "videoWatermarks", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PresetState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Audio parameters object (documented below).
      */
    val audio: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetAudio]] = js.native
    
    /**
      * Codec options for the audio parameters (documented below)
      */
    val audioCodecOptions: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetAudioCodecOptions]
      ] = js.native
    
    /**
      * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
      */
    val container: js.UndefOr[Input[String]] = js.native
    
    /**
      * A description of the preset (maximum 255 characters)
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the preset. (maximum 40 characters)
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Thumbnail parameters object (documented below)
      */
    val thumbnails: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetThumbnails]] = js.native
    
    val `type`: js.UndefOr[Input[String]] = js.native
    
    /**
      * Video parameters object (documented below)
      */
    val video: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetVideo]] = js.native
    
    /**
      * Codec options for the video parameters
      */
    val videoCodecOptions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Watermark parameters for the video parameters (documented below)
      */
    val videoWatermarks: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetVideoWatermark]]
        ]
      ] = js.native
  }
  object PresetState {
    
    @scala.inline
    def apply(): PresetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PresetState]
    }
    
    @scala.inline
    implicit class PresetStateMutableBuilder[Self <: PresetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAudio(value: Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetAudio]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioCodecOptions(value: Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetAudioCodecOptions]): Self = StObject.set(x, "audioCodecOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioCodecOptionsUndefined: Self = StObject.set(x, "audioCodecOptions", js.undefined)
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def setContainer(value: Input[String]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setThumbnails(value: Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetThumbnails]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVideo(value: Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetVideo]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoCodecOptions(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "videoCodecOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoCodecOptionsUndefined: Self = StObject.set(x, "videoCodecOptions", js.undefined)
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      @scala.inline
      def setVideoWatermarks(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetVideoWatermark]]
            ]
      ): Self = StObject.set(x, "videoWatermarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoWatermarksUndefined: Self = StObject.set(x, "videoWatermarks", js.undefined)
      
      @scala.inline
      def setVideoWatermarksVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.elastictranscoder.PresetVideoWatermark]*): Self = StObject.set(x, "videoWatermarks", js.Array(value :_*))
    }
  }
}
