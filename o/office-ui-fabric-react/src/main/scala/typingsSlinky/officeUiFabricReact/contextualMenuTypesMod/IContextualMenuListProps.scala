package typingsSlinky.officeUiFabricReact.contextualMenuTypesMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuListProps extends js.Object {
  var hasCheckmarks: Boolean = js.native
  var hasIcons: Boolean = js.native
  var items: js.Array[IContextualMenuItem] = js.native
  var totalItemCount: Double = js.native
  def defaultMenuItemRenderer(item: IContextualMenuItemRenderProps): TagMod[Any] = js.native
}

object IContextualMenuListProps {
  @scala.inline
  def apply(
    defaultMenuItemRenderer: IContextualMenuItemRenderProps => TagMod[Any],
    hasCheckmarks: Boolean,
    hasIcons: Boolean,
    items: js.Array[IContextualMenuItem],
    totalItemCount: Double
  ): IContextualMenuListProps = {
    val __obj = js.Dynamic.literal(defaultMenuItemRenderer = js.Any.fromFunction1(defaultMenuItemRenderer), hasCheckmarks = hasCheckmarks.asInstanceOf[js.Any], hasIcons = hasIcons.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuListProps]
  }
  @scala.inline
  implicit class IContextualMenuListPropsOps[Self <: IContextualMenuListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultMenuItemRenderer(value: IContextualMenuItemRenderProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMenuItemRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasCheckmarks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCheckmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[IContextualMenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItemCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

