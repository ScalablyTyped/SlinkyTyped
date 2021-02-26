package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioEncoding extends StObject
/** AudioEncoding enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.AudioEncoding")
@js.native
object AudioEncoding extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioEncoding with Double] = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_AMR extends AudioEncoding
  /* 4 */ val AUDIO_ENCODING_AMR: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_AMR with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_AMR_WB extends AudioEncoding
  /* 5 */ val AUDIO_ENCODING_AMR_WB: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_AMR_WB with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_FLAC extends AudioEncoding
  /* 2 */ val AUDIO_ENCODING_FLAC: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_FLAC with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_LINEAR_16 extends AudioEncoding
  /* 1 */ val AUDIO_ENCODING_LINEAR_16: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_LINEAR_16 with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_MULAW extends AudioEncoding
  /* 3 */ val AUDIO_ENCODING_MULAW: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_MULAW with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_OGG_OPUS extends AudioEncoding
  /* 6 */ val AUDIO_ENCODING_OGG_OPUS: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_OGG_OPUS with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE extends AudioEncoding
  /* 7 */ val AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_UNSPECIFIED extends AudioEncoding
  /* 0 */ val AUDIO_ENCODING_UNSPECIFIED: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED with Double = js.native
}
