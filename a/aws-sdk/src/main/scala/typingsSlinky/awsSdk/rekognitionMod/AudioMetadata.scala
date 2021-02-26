package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioMetadata extends StObject {
  
  /**
    * The audio codec used to encode or decode the audio stream. 
    */
  var Codec: js.UndefOr[String] = js.native
  
  /**
    * The duration of the audio stream in milliseconds.
    */
  var DurationMillis: js.UndefOr[ULong] = js.native
  
  /**
    * The number of audio channels in the segment.
    */
  var NumberOfChannels: js.UndefOr[ULong] = js.native
  
  /**
    * The sample rate for the audio stream.
    */
  var SampleRate: js.UndefOr[ULong] = js.native
}
object AudioMetadata {
  
  @scala.inline
  def apply(): AudioMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioMetadata]
  }
  
  @scala.inline
  implicit class AudioMetadataMutableBuilder[Self <: AudioMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodec(value: String): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    @scala.inline
    def setDurationMillis(value: ULong): Self = StObject.set(x, "DurationMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMillisUndefined: Self = StObject.set(x, "DurationMillis", js.undefined)
    
    @scala.inline
    def setNumberOfChannels(value: ULong): Self = StObject.set(x, "NumberOfChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfChannelsUndefined: Self = StObject.set(x, "NumberOfChannels", js.undefined)
    
    @scala.inline
    def setSampleRate(value: ULong): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
  }
}
