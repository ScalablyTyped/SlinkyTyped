package typingsSlinky.reactInstantsearchDom.mod

import typingsSlinky.reactInstantsearchDom.reactInstantsearchDomStrings.`audio-capture`
import typingsSlinky.reactInstantsearchDom.reactInstantsearchDomStrings.`bad-grammar`
import typingsSlinky.reactInstantsearchDom.reactInstantsearchDomStrings.`language-not-supported`
import typingsSlinky.reactInstantsearchDom.reactInstantsearchDomStrings.`no-speech`
import typingsSlinky.reactInstantsearchDom.reactInstantsearchDomStrings.`not-allowed`
import typingsSlinky.reactInstantsearchDom.reactInstantsearchDomStrings.`service-not-allowed`
import typingsSlinky.reactInstantsearchDom.reactInstantsearchDomStrings.aborted
import typingsSlinky.reactInstantsearchDom.reactInstantsearchDomStrings.network
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceListeningState extends StObject {
  
  var errorCode: js.UndefOr[
    `no-speech` | aborted | `audio-capture` | network | `not-allowed` | `service-not-allowed` | `bad-grammar` | `language-not-supported`
  ] = js.native
  
  var isSpeechFinal: Boolean = js.native
  
  var status: Status = js.native
  
  var transcript: String = js.native
}
object VoiceListeningState {
  
  @scala.inline
  def apply(isSpeechFinal: Boolean, status: Status, transcript: String): VoiceListeningState = {
    val __obj = js.Dynamic.literal(isSpeechFinal = isSpeechFinal.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transcript = transcript.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceListeningState]
  }
  
  @scala.inline
  implicit class VoiceListeningStateMutableBuilder[Self <: VoiceListeningState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(
      value: `no-speech` | aborted | `audio-capture` | network | `not-allowed` | `service-not-allowed` | `bad-grammar` | `language-not-supported`
    ): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setIsSpeechFinal(value: Boolean): Self = StObject.set(x, "isSpeechFinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
  }
}
