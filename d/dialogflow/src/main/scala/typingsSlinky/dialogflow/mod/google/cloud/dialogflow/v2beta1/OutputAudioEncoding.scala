package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutputAudioEncoding extends StObject
/** OutputAudioEncoding enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioEncoding")
@js.native
object OutputAudioEncoding extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputAudioEncoding with Double] = js.native
  
  @js.native
  sealed trait OUTPUT_AUDIO_ENCODING_LINEAR_16 extends OutputAudioEncoding
  /* 1 */ val OUTPUT_AUDIO_ENCODING_LINEAR_16: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_LINEAR_16 with Double = js.native
  
  @js.native
  sealed trait OUTPUT_AUDIO_ENCODING_MP3 extends OutputAudioEncoding
  /* 2 */ val OUTPUT_AUDIO_ENCODING_MP3: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_MP3 with Double = js.native
  
  @js.native
  sealed trait OUTPUT_AUDIO_ENCODING_OGG_OPUS extends OutputAudioEncoding
  /* 3 */ val OUTPUT_AUDIO_ENCODING_OGG_OPUS: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_OGG_OPUS with Double = js.native
  
  @js.native
  sealed trait OUTPUT_AUDIO_ENCODING_UNSPECIFIED extends OutputAudioEncoding
  /* 0 */ val OUTPUT_AUDIO_ENCODING_UNSPECIFIED: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_UNSPECIFIED with Double = js.native
}
