package typingsSlinky.googleCloudTextToSpeech

import typingsSlinky.googleCloudTextToSpeech.mod.SynthesisInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends SynthesisInput {
  var text: String
}

object AnonText {
  @scala.inline
  def apply(text: String): AnonText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonText]
  }
}

