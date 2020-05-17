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
  implicit class PreviousItemOps[Self[k] <: PreviousItem[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withItem(value: org.scalajs.dom.raw.Element): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousItem(value: org.scalajs.dom.raw.Element): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousKey(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

