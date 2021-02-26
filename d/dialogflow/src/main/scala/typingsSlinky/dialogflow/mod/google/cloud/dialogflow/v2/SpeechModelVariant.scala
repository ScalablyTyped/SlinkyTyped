package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpeechModelVariant extends StObject
/** SpeechModelVariant enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SpeechModelVariant")
@js.native
object SpeechModelVariant extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechModelVariant with Double] = js.native
  
  @js.native
  sealed trait SPEECH_MODEL_VARIANT_UNSPECIFIED extends SpeechModelVariant
  /* 0 */ val SPEECH_MODEL_VARIANT_UNSPECIFIED: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.SpeechModelVariant.SPEECH_MODEL_VARIANT_UNSPECIFIED with Double = js.native
  
  @js.native
  sealed trait USE_BEST_AVAILABLE extends SpeechModelVariant
  /* 1 */ val USE_BEST_AVAILABLE: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.SpeechModelVariant.USE_BEST_AVAILABLE with Double = js.native
  
  @js.native
  sealed trait USE_ENHANCED extends SpeechModelVariant
  /* 3 */ val USE_ENHANCED: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.SpeechModelVariant.USE_ENHANCED with Double = js.native
  
  @js.native
  sealed trait USE_STANDARD extends SpeechModelVariant
  /* 2 */ val USE_STANDARD: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.SpeechModelVariant.USE_STANDARD with Double = js.native
}
