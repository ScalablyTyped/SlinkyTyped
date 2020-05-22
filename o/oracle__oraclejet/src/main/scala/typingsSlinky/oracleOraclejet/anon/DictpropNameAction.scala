package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.close
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictpropNameAction
  extends /* key */ StringDictionary[js.Any] {
  var action: open | close
  var element: org.scalajs.dom.raw.Element
}

object DictpropNameAction {
  @scala.inline
  def apply(
    action: open | close,
    element: org.scalajs.dom.raw.Element,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): DictpropNameAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictpropNameAction]
  }
}

