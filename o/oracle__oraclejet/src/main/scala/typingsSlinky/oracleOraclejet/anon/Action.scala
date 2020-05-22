package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action
  extends /* key */ StringDictionary[js.Any] {
  var action: String
  var element: org.scalajs.dom.raw.Element
}

object Action {
  @scala.inline
  def apply(
    action: String,
    element: org.scalajs.dom.raw.Element,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Action]
  }
}

