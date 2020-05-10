package typingsSlinky.reactNative.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualizedListProps[ItemT] extends VirtualizedListWithoutRenderItemProps[ItemT] {
  var renderItem: js.UndefOr[ListRenderItem[ItemT] | Null] = js.native
}

object VirtualizedListProps {
  @scala.inline
  def apply[ItemT](): VirtualizedListProps[ItemT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualizedListProps[ItemT]]
  }
  @scala.inline
  implicit class VirtualizedListPropsOps[Self[itemt] <: VirtualizedListProps[itemt], ItemT] (val x: Self[ItemT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ItemT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ItemT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ItemT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ItemT] with Other]
    @scala.inline
    def withRenderItem(value: /* info */ ListRenderItemInfo[ItemT] => ReactElement | Null): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderItem: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderItemNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(null)
        ret
    }
  }
  
}

