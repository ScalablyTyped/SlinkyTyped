package typingsSlinky.blueprintjsCore.collapsibleListMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.menuItemMod.IMenuItemProps
import typingsSlinky.blueprintjsCore.popoverMod.IPopoverProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollapsibleListProps extends IProps {
  /**
    * Which direction the items should collapse from: start or end of the children.
    * @default Boundary.START
    */
  var collapseFrom: js.UndefOr[Boundary] = js.native
  /**
    * Props to pass to the dropdown.
    */
  var dropdownProps: js.UndefOr[IPopoverProps] = js.native
  /**
    * Element to render as dropdown target with `CLICK` interaction to show collapsed menu.
    */
  var dropdownTarget: ReactElement = js.native
  /**
    * CSS class names to add to `<li>` tags containing each visible item and the dropdown.
    */
  var visibleItemClassName: js.UndefOr[String] = js.native
  /**
    * Exact number of visible items.
    * @default 3
    */
  var visibleItemCount: js.UndefOr[Double] = js.native
  /**
    * Callback invoked to render each visible item. The item will be wrapped in an `li` with
    * the optional `visibleItemClassName` prop.
    */
  def visibleItemRenderer(props: IMenuItemProps, index: Double): ReactElement = js.native
}

object ICollapsibleListProps {
  @scala.inline
  def apply(dropdownTarget: ReactElement, visibleItemRenderer: (IMenuItemProps, Double) => ReactElement): ICollapsibleListProps = {
    val __obj = js.Dynamic.literal(dropdownTarget = dropdownTarget.asInstanceOf[js.Any], visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
    __obj.asInstanceOf[ICollapsibleListProps]
  }
  @scala.inline
  implicit class ICollapsibleListPropsOps[Self <: ICollapsibleListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropdownTarget(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleItemRenderer(value: (IMenuItemProps, Double) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemRenderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCollapseFrom(value: Boundary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownProps(value: IPopoverProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownProps")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleItemClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleItemClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemCount")(js.undefined)
        ret
    }
  }
  
}

