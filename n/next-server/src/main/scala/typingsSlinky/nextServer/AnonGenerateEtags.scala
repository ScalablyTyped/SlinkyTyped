package typingsSlinky.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGenerateEtags extends js.Object {
  var generateEtags: Boolean = js.native
  var poweredByHeader: Boolean = js.native
}

object AnonGenerateEtags {
  @scala.inline
  def apply(generateEtags: Boolean, poweredByHeader: Boolean): AnonGenerateEtags = {
    val __obj = js.Dynamic.literal(generateEtags = generateEtags.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGenerateEtags]
  }
  @scala.inline
  implicit class AnonGenerateEtagsOps[Self <: AnonGenerateEtags] (val x: Self) extends AnyVal {
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

