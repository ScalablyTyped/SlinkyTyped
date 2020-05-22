package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ascending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.descending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionHeader
  extends /* key */ StringDictionary[js.Any] {
  var direction: ascending | descending
  var header: org.scalajs.dom.raw.Element
}

object DirectionHeader {
  @scala.inline
  def apply(
    direction: ascending | descending,
    header: org.scalajs.dom.raw.Element,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): DirectionHeader = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DirectionHeader]
  }
}

