package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element
  extends /* key */ StringDictionary[js.Any] {
  var action: String
  var element: org.scalajs.dom.raw.Element
  def endCallback(): Unit
}

object Element {
  @scala.inline
  def apply(
    action: String,
    element: org.scalajs.dom.raw.Element,
    endCallback: () => Unit,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Element = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = js.Any.fromFunction0(endCallback))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Element]
  }
}

