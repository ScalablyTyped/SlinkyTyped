package typingsSlinky.markdownIt.htmlReMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlRE extends js.Object {
  var HTML_OPEN_CLOSE_TAG_RE: js.RegExp = js.native
  var HTML_TAG_RE: js.RegExp = js.native
}

object HtmlRE {
  @scala.inline
  def apply(HTML_OPEN_CLOSE_TAG_RE: js.RegExp, HTML_TAG_RE: js.RegExp): HtmlRE = {
    val __obj = js.Dynamic.literal(HTML_OPEN_CLOSE_TAG_RE = HTML_OPEN_CLOSE_TAG_RE.asInstanceOf[js.Any], HTML_TAG_RE = HTML_TAG_RE.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlRE]
  }
  @scala.inline
  implicit class HtmlREOps[Self <: HtmlRE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHTML_OPEN_CLOSE_TAG_RE(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_OPEN_CLOSE_TAG_RE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTML_TAG_RE(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_TAG_RE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

