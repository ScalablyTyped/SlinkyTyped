package typingsSlinky.baseui.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/menu.StatefulContainerState & {  items  :baseui.baseui/menu.ItemsT,   getRequiredItemProps  :baseui.baseui/menu.GetRequiredItemProps} */
@js.native
trait RenderProps extends js.Object {
  var activedescendantId: js.UndefOr[String] = js.native
  var getRequiredItemProps: GetRequiredItemProps = js.native
  var highlightedIndex: Double = js.native
  var isFocused: Boolean = js.native
  var items: ItemsT = js.native
}

object RenderProps {
  @scala.inline
  def apply(
    getRequiredItemProps: (/* item */ js.Any, /* index */ Double) => RenderItemProps,
    highlightedIndex: Double,
    isFocused: Boolean,
    items: ItemsT
  ): RenderProps = {
    val __obj = js.Dynamic.literal(getRequiredItemProps = js.Any.fromFunction2(getRequiredItemProps), highlightedIndex = highlightedIndex.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRequiredItemProps(value: (/* item */ js.Any, /* index */ Double) => RenderItemProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequiredItemProps")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHighlightedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: ItemsT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivedescendantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activedescendantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivedescendantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activedescendantId")(js.undefined)
        ret
    }
  }
  
}

