package typingsSlinky.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A speech recognition result corresponding to a portion of the audio.
  */
@js.native
trait SchemaSpeechRecognitionResult extends StObject {
  
  /**
    * Output only. May contain one or more recognition hypotheses (up to the
    * maximum specified in `max_alternatives`). These alternatives are ordered
    * in terms of accuracy, with the top (first) alternative being the most
    * probable, as ranked by the recognizer.
    */
  var alternatives: js.UndefOr[js.Array[SchemaSpeechRecognitionAlternative]] = js.native
  
  /**
    * For multi-channel audio, this is the channel number corresponding to the
    * recognized result for the audio from that channel. For
    * audio_channel_count = N, its output values can range from &#39;1&#39; to
    * &#39;N&#39;.
    */
  var channelTag: js.UndefOr[Double] = js.native
}
object SchemaSpeechRecognitionResult {
  
  @scala.inline
  def apply(): SchemaSpeechRecognitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpeechRecognitionResult]
  }
  
  @scala.inline
  implicit class SchemaSpeechRecognitionResultMutableBuilder[Self <: SchemaSpeechRecognitionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternatives(value: js.Array[SchemaSpeechRecognitionAlternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
    
    @scala.inline
    def setAlternativesVarargs(value: SchemaSpeechRecognitionAlternative*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
    
    @scala.inline
    def setChannelTag(value: Double): Self = StObject.set(x, "channelTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTagUndefined: Self = StObject.set(x, "channelTag", js.undefined)
  }
}
