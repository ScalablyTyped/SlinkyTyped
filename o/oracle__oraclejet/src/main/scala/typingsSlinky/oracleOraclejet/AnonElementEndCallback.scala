package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.add
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.remove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementEndCallback
  extends /* propName */ StringDictionary[js.Any] {
  var action: add | remove | update
  var element: Element
  def endCallback(): Unit
}

object AnonElementEndCallback {
  @scala.inline
  def apply(
    action: add | remove | update,
    element: Element,
    endCallback: () => Unit,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonElementEndCallback = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = js.Any.fromFunction0(endCallback))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonElementEndCallback]
  }
}

