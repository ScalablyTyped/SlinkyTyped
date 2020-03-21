package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ascending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.descending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectionHeader
  extends /* propName */ StringDictionary[js.Any] {
  var direction: ascending | descending
  var header: Element
}

object AnonDirectionHeader {
  @scala.inline
  def apply(
    direction: ascending | descending,
    header: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonDirectionHeader = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDirectionHeader]
  }
}

