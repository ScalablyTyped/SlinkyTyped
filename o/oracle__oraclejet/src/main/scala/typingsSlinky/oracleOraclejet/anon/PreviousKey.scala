package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviousKey
  extends /* key */ StringDictionary[js.Any] {
  var item: org.scalajs.dom.raw.Element = js.native
  var key: js.Any = js.native
  var previousItem: org.scalajs.dom.raw.Element = js.native
  var previousKey: js.Any = js.native
}

object PreviousKey {
  @scala.inline
  def apply(
    item: org.scalajs.dom.raw.Element,
    key: js.Any,
    previousItem: org.scalajs.dom.raw.Element,
    previousKey: js.Any
  ): PreviousKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousKey]
  }
  @scala.inline
  implicit class PreviousKeyOps[Self <: PreviousKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousItem(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

