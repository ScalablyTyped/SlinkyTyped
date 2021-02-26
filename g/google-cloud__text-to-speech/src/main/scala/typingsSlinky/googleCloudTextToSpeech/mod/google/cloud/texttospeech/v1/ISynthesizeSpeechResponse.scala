package typingsSlinky.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SynthesizeSpeechResponse. */
@js.native
trait ISynthesizeSpeechResponse extends StObject {
  
  /** SynthesizeSpeechResponse audioContent */
  var audioContent: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.native
}
object ISynthesizeSpeechResponse {
  
  @scala.inline
  def apply(): ISynthesizeSpeechResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISynthesizeSpeechResponse]
  }
  
  @scala.inline
  implicit class ISynthesizeSpeechResponseMutableBuilder[Self <: ISynthesizeSpeechResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioContent(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "audioContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioContentNull: Self = StObject.set(x, "audioContent", null)
    
    @scala.inline
    def setAudioContentUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "audioContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioContentUndefined: Self = StObject.set(x, "audioContent", js.undefined)
  }
}
