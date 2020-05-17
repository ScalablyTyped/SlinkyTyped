package typingsSlinky.googleCloudTextToSpeech.mod

import typingsSlinky.googleCloudTextToSpeech.anon.Ssml
import typingsSlinky.googleCloudTextToSpeech.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleCloudTextToSpeech.anon.Text
  - typingsSlinky.googleCloudTextToSpeech.anon.Ssml
*/
trait SynthesisInput extends js.Object

object SynthesisInput {
  @scala.inline
  implicit def apply(value: Ssml): SynthesisInput = value.asInstanceOf[SynthesisInput]
  @scala.inline
  implicit def apply(value: Text): SynthesisInput = value.asInstanceOf[SynthesisInput]
}

