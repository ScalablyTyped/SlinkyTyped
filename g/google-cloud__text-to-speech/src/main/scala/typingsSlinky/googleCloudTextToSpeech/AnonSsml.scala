package typingsSlinky.googleCloudTextToSpeech

import typingsSlinky.googleCloudTextToSpeech.mod.SynthesisInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSsml extends SynthesisInput {
  var ssml: String = js.native
}

object AnonSsml {
  @scala.inline
  def apply(ssml: String): AnonSsml = {
    val __obj = js.Dynamic.literal(ssml = ssml.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSsml]
  }
  @scala.inline
  implicit class AnonSsmlOps[Self <: AnonSsml] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSsml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

