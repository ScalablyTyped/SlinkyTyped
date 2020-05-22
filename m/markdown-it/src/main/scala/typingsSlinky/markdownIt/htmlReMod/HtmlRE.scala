package typingsSlinky.markdownIt.htmlReMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlRE extends js.Object {
  var HTML_OPEN_CLOSE_TAG_RE: js.RegExp
  var HTML_TAG_RE: js.RegExp
}

object HtmlRE {
  @scala.inline
  def apply(HTML_OPEN_CLOSE_TAG_RE: js.RegExp, HTML_TAG_RE: js.RegExp): HtmlRE = {
    val __obj = js.Dynamic.literal(HTML_OPEN_CLOSE_TAG_RE = HTML_OPEN_CLOSE_TAG_RE.asInstanceOf[js.Any], HTML_TAG_RE = HTML_TAG_RE.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlRE]
  }
}

