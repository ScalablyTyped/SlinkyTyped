package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.AnonHighlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRenderItemInfo[ItemT] extends js.Object {
  var index: Double = js.native
  var item: ItemT = js.native
  var separators: AnonHighlight = js.native
}

object ListRenderItemInfo {
  @scala.inline
  def apply[ItemT](index: Double, item: ItemT, separators: AnonHighlight): ListRenderItemInfo[ItemT] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRenderItemInfo[ItemT]]
  }
  @scala.inline
  implicit class ListRenderItemInfoOps[Self[itemt] <: ListRenderItemInfo[itemt], ItemT] (val x: Self[ItemT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ItemT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ItemT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ItemT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ItemT] with Other]
    @scala.inline
    def withIndex(value: Double): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: ItemT): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparators(value: AnonHighlight): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separators")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

