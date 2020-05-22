package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header
  extends /* key */ StringDictionary[js.Any] {
  var content: org.scalajs.dom.raw.Element
  var header: org.scalajs.dom.raw.Element
}

object Header {
  @scala.inline
  def apply(
    content: org.scalajs.dom.raw.Element,
    header: org.scalajs.dom.raw.Element,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Header = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Header]
  }
}

