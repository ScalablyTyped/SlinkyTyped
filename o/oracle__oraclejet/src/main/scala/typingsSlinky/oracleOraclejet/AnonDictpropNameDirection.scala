package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ascending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.descending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictpropNameDirection
  extends /* propName */ StringDictionary[js.Any] {
  var direction: ascending | descending
  var header: js.Any
}

object AnonDictpropNameDirection {
  @scala.inline
  def apply(
    direction: ascending | descending,
    header: js.Any,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonDictpropNameDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictpropNameDirection]
  }
}

