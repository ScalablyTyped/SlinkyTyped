package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviousKey
  extends /* key */ StringDictionary[js.Any] {
  var item: org.scalajs.dom.raw.Element
  var key: js.Any
  var previousItem: org.scalajs.dom.raw.Element
  var previousKey: js.Any
}

object PreviousKey {
  @scala.inline
  def apply(
    item: org.scalajs.dom.raw.Element,
    key: js.Any,
    previousItem: org.scalajs.dom.raw.Element,
    previousKey: js.Any,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): PreviousKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PreviousKey]
  }
}

