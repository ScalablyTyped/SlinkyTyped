package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromItem
  extends /* key */ StringDictionary[js.Any] {
  var fromItem: org.scalajs.dom.raw.Element = js.native
  var fromKey: js.Any = js.native
  var toItem: org.scalajs.dom.raw.Element = js.native
  var toKey: js.Any = js.native
}

object FromItem {
  @scala.inline
  def apply(
    fromItem: org.scalajs.dom.raw.Element,
    fromKey: js.Any,
    toItem: org.scalajs.dom.raw.Element,
    toKey: js.Any
  ): FromItem = {
    val __obj = js.Dynamic.literal(fromItem = fromItem.asInstanceOf[js.Any], fromKey = fromKey.asInstanceOf[js.Any], toItem = toItem.asInstanceOf[js.Any], toKey = toKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromItem]
  }
  @scala.inline
  implicit class FromItemOps[Self <: FromItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromItem(value: org.scalajs.dom.raw.Element): Self = {
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
    def withToItem(value: org.scalajs.dom.raw.Element): Self = {
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

