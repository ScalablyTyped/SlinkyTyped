package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment extends StObject {
  
  /** Output only. Whether the playback of this segment can be interrupted by the end user's speech and the client should then start the next Dialogflow request. */
  var allowPlaybackInterruption: js.UndefOr[Boolean] = js.native
  
  /** Raw audio synthesized from the Dialogflow agent's response using the output config specified in the request. */
  var audio: js.UndefOr[String] = js.native
  
  /** Client-specific URI that points to an audio clip accessible to the client. Dialogflow does not impose any validation on it. */
  var uri: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentMutableBuilder[Self <: GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPlaybackInterruption(value: Boolean): Self = StObject.set(x, "allowPlaybackInterruption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPlaybackInterruptionUndefined: Self = StObject.set(x, "allowPlaybackInterruption", js.undefined)
    
    @scala.inline
    def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
