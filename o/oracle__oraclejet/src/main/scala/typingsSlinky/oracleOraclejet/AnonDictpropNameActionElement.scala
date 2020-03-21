package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.add
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.remove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictpropNameActionElement
  extends /* propName */ StringDictionary[js.Any] {
  var action: add | remove | update
  var element: Element
}

object AnonDictpropNameActionElement {
  @scala.inline
  def apply(
    action: add | remove | update,
    element: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonDictpropNameActionElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictpropNameActionElement]
  }
}

