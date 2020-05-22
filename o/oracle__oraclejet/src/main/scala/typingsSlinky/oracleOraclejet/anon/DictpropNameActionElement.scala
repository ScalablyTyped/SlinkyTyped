package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.add
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.remove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictpropNameActionElement
  extends /* key */ StringDictionary[js.Any] {
  var action: add | remove | update
  var element: org.scalajs.dom.raw.Element
}

object DictpropNameActionElement {
  @scala.inline
  def apply(
    action: add | remove | update,
    element: org.scalajs.dom.raw.Element,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): DictpropNameActionElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictpropNameActionElement]
  }
}

