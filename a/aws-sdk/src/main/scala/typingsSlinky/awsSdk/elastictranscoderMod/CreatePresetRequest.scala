package typingsSlinky.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePresetRequest extends StObject {
  
  /**
    * A section of the request body that specifies the audio parameters.
    */
  var Audio: js.UndefOr[AudioParameters] = js.native
  
  /**
    * The container type for the output file. Valid values include flac, flv, fmp4, gif, mp3, mp4, mpg, mxf, oga, ogg, ts, and webm.
    */
  var Container: PresetContainer = js.native
  
  /**
    * A description of the preset.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Description] = js.native
  
  /**
    * The name of the preset. We recommend that the name be unique within the AWS account, but uniqueness is not enforced.
    */
  var Name: typingsSlinky.awsSdk.elastictranscoderMod.Name = js.native
  
  /**
    * A section of the request body that specifies the thumbnail parameters, if any.
    */
  var Thumbnails: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Thumbnails] = js.native
  
  /**
    * A section of the request body that specifies the video parameters.
    */
  var Video: js.UndefOr[VideoParameters] = js.native
}
object CreatePresetRequest {
  
  @scala.inline
  def apply(Container: PresetContainer, Name: Name): CreatePresetRequest = {
    val __obj = js.Dynamic.literal(Container = Container.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresetRequest]
  }
  
  @scala.inline
  implicit class CreatePresetRequestMutableBuilder[Self <: CreatePresetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: AudioParameters): Self = StObject.set(x, "Audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "Audio", js.undefined)
    
    @scala.inline
    def setContainer(value: PresetContainer): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnails(value: Thumbnails): Self = StObject.set(x, "Thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "Thumbnails", js.undefined)
    
    @scala.inline
    def setVideo(value: VideoParameters): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "Video", js.undefined)
  }
}
