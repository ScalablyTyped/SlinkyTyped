package typingsSlinky.nextServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateEtags extends js.Object {
  var generateEtags: Boolean = js.native
  var poweredByHeader: Boolean = js.native
}

object GenerateEtags {
  @scala.inline
  def apply(generateEtags: Boolean, poweredByHeader: Boolean): GenerateEtags = {
    val __obj = js.Dynamic.literal(generateEtags = generateEtags.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateEtags]
  }
  @scala.inline
  implicit class GenerateEtagsOps[Self <: GenerateEtags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerateEtags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateEtags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoweredByHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poweredByHeader")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

