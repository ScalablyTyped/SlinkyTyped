package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.close
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictpropNameAction
  extends /* propName */ StringDictionary[js.Any] {
  var action: open | close
  var element: Element
}

object AnonDictpropNameAction {
  @scala.inline
  def apply(
    action: open | close,
    element: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonDictpropNameAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictpropNameAction]
  }
}

