package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFromItem
  extends /* key */ StringDictionary[js.Any] {
  var fromItem: Element = js.native
  var fromKey: js.Any = js.native
  var toItem: Element = js.native
  var toKey: js.Any = js.native
}

object AnonFromItem {
  @scala.inline
  def apply(fromItem: Element, fromKey: js.Any, toItem: Element, toKey: js.Any): AnonFromItem = {
    val __obj = js.Dynamic.literal(fromItem = fromItem.asInstanceOf[js.Any], fromKey = fromKey.asInstanceOf[js.Any], toItem = toItem.asInstanceOf[js.Any], toKey = toKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromItem]
  }
  @scala.inline
  implicit class AnonFromItemOps[Self <: AnonFromItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromItem(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToItem(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

