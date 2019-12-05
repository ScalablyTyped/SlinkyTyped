package typingsSlinky.atPostlightMercuryDashParser.atPostlightMercuryDashParserMod

import typingsSlinky.atPostlightMercuryDashParser.atPostlightMercuryDashParserStrings.html
import typingsSlinky.atPostlightMercuryDashParser.atPostlightMercuryDashParserStrings.markdown
import typingsSlinky.atPostlightMercuryDashParser.atPostlightMercuryDashParserStrings.text
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var contentType: js.UndefOr[html | markdown | text] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var html: js.UndefOr[String | Buffer] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    contentType: html | markdown | text = null,
    headers: js.Object = null,
    html: String | Buffer = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

