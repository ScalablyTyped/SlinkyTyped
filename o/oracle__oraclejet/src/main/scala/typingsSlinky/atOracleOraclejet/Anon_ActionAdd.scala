package typingsSlinky.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.add
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.remove
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionAdd
  extends /* propName */ StringDictionary[js.Any] {
  var action: add | remove | update
  var element: Element
}

object Anon_ActionAdd {
  @scala.inline
  def apply(
    action: add | remove | update,
    element: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_ActionAdd = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionAdd]
  }
}

