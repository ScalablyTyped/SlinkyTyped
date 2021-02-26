package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStream extends StObject {
  
  // The direction. The possible values are inactive, sendOnly, receiveOnly, sendReceive.
  var direction: js.UndefOr[MediaDirection] = js.native
  
  // The media stream label.
  var label: js.UndefOr[NullableOption[String]] = js.native
  
  // The media type. The possible value are unknown, audio, video, videoBasedScreenSharing, data.
  var mediaType: js.UndefOr[Modality] = js.native
  
  // If the media is muted by the server.
  var serverMuted: js.UndefOr[Boolean] = js.native
  
  // The source ID.
  var sourceId: js.UndefOr[String] = js.native
}
object MediaStream {
  
  @scala.inline
  def apply(): MediaStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStream]
  }
  
  @scala.inline
  implicit class MediaStreamMutableBuilder[Self <: MediaStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: MediaDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setLabel(value: NullableOption[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMediaType(value: Modality): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    @scala.inline
    def setServerMuted(value: Boolean): Self = StObject.set(x, "serverMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerMutedUndefined: Self = StObject.set(x, "serverMuted", js.undefined)
    
    @scala.inline
    def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
  }
}
