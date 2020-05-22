package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromItem
  extends /* key */ StringDictionary[js.Any] {
  var fromItem: org.scalajs.dom.raw.Element
  var fromKey: js.Any
  var toItem: org.scalajs.dom.raw.Element
  var toKey: js.Any
}

object FromItem {
  @scala.inline
  def apply(
    fromItem: org.scalajs.dom.raw.Element,
    fromKey: js.Any,
    toItem: org.scalajs.dom.raw.Element,
    toKey: js.Any,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): FromItem = {
    val __obj = js.Dynamic.literal(fromItem = fromItem.asInstanceOf[js.Any], fromKey = fromKey.asInstanceOf[js.Any], toItem = toItem.asInstanceOf[js.Any], toKey = toKey.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FromItem]
  }
}

