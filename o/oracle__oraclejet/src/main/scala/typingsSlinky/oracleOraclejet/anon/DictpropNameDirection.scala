package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ascending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.descending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictpropNameDirection
  extends /* key */ StringDictionary[js.Any] {
  var direction: ascending | descending
  var header: js.Any
}

object DictpropNameDirection {
  @scala.inline
  def apply(
    direction: ascending | descending,
    header: js.Any,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): DictpropNameDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictpropNameDirection]
  }
}

