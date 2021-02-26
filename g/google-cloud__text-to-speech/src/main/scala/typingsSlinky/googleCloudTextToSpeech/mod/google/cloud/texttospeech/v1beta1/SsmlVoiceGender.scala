package typingsSlinky.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SsmlVoiceGender extends StObject
/** SsmlVoiceGender enum. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SsmlVoiceGender")
@js.native
object SsmlVoiceGender extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SsmlVoiceGender with Double] = js.native
  
  @js.native
  sealed trait FEMALE extends SsmlVoiceGender
  /* 2 */ val FEMALE: typingsSlinky.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.FEMALE with Double = js.native
  
  @js.native
  sealed trait MALE extends SsmlVoiceGender
  /* 1 */ val MALE: typingsSlinky.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.MALE with Double = js.native
  
  @js.native
  sealed trait NEUTRAL extends SsmlVoiceGender
  /* 3 */ val NEUTRAL: typingsSlinky.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.NEUTRAL with Double = js.native
  
  @js.native
  sealed trait SSML_VOICE_GENDER_UNSPECIFIED extends SsmlVoiceGender
  /* 0 */ val SSML_VOICE_GENDER_UNSPECIFIED: typingsSlinky.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED with Double = js.native
}
