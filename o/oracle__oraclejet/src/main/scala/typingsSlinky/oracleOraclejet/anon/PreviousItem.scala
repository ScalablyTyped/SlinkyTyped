package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviousItem[K]
  extends /* key */ StringDictionary[js.Any] {
  var item: org.scalajs.dom.raw.Element = js.native
  var key: K = js.native
  var previousItem: org.scalajs.dom.raw.Element = js.native
  var previousKey: K = js.native
}

object PreviousItem {
  @scala.inline
  def apply[K](
    item: org.scalajs.dom.raw.Element,
    key: K,
    previousItem: org.scalajs.dom.raw.Element,
    previousKey: K
  ): PreviousItem[K] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousItem[K]]
  }
  @scala.inline
  implicit class PreviousItemOps[Self <: PreviousItem[_], K] (val x: Self with PreviousItem[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItem(value: org.scalajs.dom.raw.Element): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: K): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousItem(value: org.scalajs.dom.raw.Element): Self = this.set("previousItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousKey(value: K): Self = this.set("previousKey", value.asInstanceOf[js.Any])
  }
  
}

