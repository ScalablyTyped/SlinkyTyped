package typingsSlinky.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynthesizeSpeechOutput extends StObject {
  
  /**
    *  Stream containing the synthesized speech. 
    */
  var AudioStream: js.UndefOr[typingsSlinky.awsSdk.pollyMod.AudioStream] = js.native
  
  /**
    *  Specifies the type audio stream. This should reflect the OutputFormat parameter in your request.     If you request mp3 as the OutputFormat, the ContentType returned is audio/mpeg.     If you request ogg_vorbis as the OutputFormat, the ContentType returned is audio/ogg.     If you request pcm as the OutputFormat, the ContentType returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.    If you request json as the OutputFormat, the ContentType returned is audio/json.    
    */
  var ContentType: js.UndefOr[typingsSlinky.awsSdk.pollyMod.ContentType] = js.native
  
  /**
    * Number of characters synthesized.
    */
  var RequestCharacters: js.UndefOr[typingsSlinky.awsSdk.pollyMod.RequestCharacters] = js.native
}
object SynthesizeSpeechOutput {
  
  @scala.inline
  def apply(): SynthesizeSpeechOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthesizeSpeechOutput]
  }
  
  @scala.inline
  implicit class SynthesizeSpeechOutputMutableBuilder[Self <: SynthesizeSpeechOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioStream(value: AudioStream): Self = StObject.set(x, "AudioStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioStreamUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "AudioStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioStreamUndefined: Self = StObject.set(x, "AudioStream", js.undefined)
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setRequestCharacters(value: RequestCharacters): Self = StObject.set(x, "RequestCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCharactersUndefined: Self = StObject.set(x, "RequestCharacters", js.undefined)
  }
}
