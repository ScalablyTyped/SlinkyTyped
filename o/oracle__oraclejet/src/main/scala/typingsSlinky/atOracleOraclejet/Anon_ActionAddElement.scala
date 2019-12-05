package typingsSlinky.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.add
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.remove
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionAddElement
  extends /* propName */ StringDictionary[js.Any] {
  var action: add | remove | update
  var element: Element
  def endCallback(): Unit
}

object Anon_ActionAddElement {
  @scala.inline
  def apply(
    action: add | remove | update,
    element: Element,
    endCallback: () => Unit,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_ActionAddElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = js.Any.fromFunction0(endCallback))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionAddElement]
  }
}

