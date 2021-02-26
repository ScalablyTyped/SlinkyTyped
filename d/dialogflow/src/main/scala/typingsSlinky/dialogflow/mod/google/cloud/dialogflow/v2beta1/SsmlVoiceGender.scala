package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SsmlVoiceGender extends StObject
/** SsmlVoiceGender enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SsmlVoiceGender")
@js.native
object SsmlVoiceGender extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SsmlVoiceGender with Double] = js.native
  
  @js.native
  sealed trait SSML_VOICE_GENDER_FEMALE extends SsmlVoiceGender
  /* 2 */ val SSML_VOICE_GENDER_FEMALE: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.SsmlVoiceGender.SSML_VOICE_GENDER_FEMALE with Double = js.native
  
  @js.native
  sealed trait SSML_VOICE_GENDER_MALE extends SsmlVoiceGender
  /* 1 */ val SSML_VOICE_GENDER_MALE: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.SsmlVoiceGender.SSML_VOICE_GENDER_MALE with Double = js.native
  
  @js.native
  sealed trait SSML_VOICE_GENDER_NEUTRAL extends SsmlVoiceGender
  /* 3 */ val SSML_VOICE_GENDER_NEUTRAL: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.SsmlVoiceGender.SSML_VOICE_GENDER_NEUTRAL with Double = js.native
  
  @js.native
  sealed trait SSML_VOICE_GENDER_UNSPECIFIED extends SsmlVoiceGender
  /* 0 */ val SSML_VOICE_GENDER_UNSPECIFIED: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED with Double = js.native
}
