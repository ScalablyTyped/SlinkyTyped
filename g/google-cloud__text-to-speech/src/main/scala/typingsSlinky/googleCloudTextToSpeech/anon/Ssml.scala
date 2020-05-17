package typingsSlinky.googleCloudTextToSpeech.anon

import typingsSlinky.googleCloudTextToSpeech.mod.SynthesisInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ssml extends SynthesisInput {
  var ssml: String = js.native
}

object Ssml {
  @scala.inline
  def apply(ssml: String): Ssml = {
    val __obj = js.Dynamic.literal(ssml = ssml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ssml]
  }
  @scala.inline
  implicit class SsmlOps[Self <: Ssml] (val x: Self) extends AnyVal {
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

