package typingsSlinky.blueprintjsCore.breadcrumbsMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.anon.PartialIOverflowListProps
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typingsSlinky.blueprintjsCore.popoverMod.IPopoverProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBreadcrumbsProps extends IProps {
  /**
    * Callback invoked to render visible breadcrumbs. Best practice is to
    * render a `<Breadcrumb>` element. If `currentBreadcrumbRenderer` is also
    * supplied, that callback will be used for the current breadcrumb instead.
    * @default Breadcrumb
    */
  var breadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, ReactElement]] = js.native
  /**
    * Which direction the breadcrumbs should collapse from: start or end.
    * @default Boundary.START
    */
  var collapseFrom: js.UndefOr[Boundary] = js.native
  /**
    * Callback invoked to render the current breadcrumb, which is the last
    * element in the `items` array.
    *
    * If this prop is omitted, `breadcrumbRenderer` will be invoked for the
    * current breadcrumb instead.
    */
  var currentBreadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, ReactElement]] = js.native
  /**
    * All breadcrumbs to display. Breadcrumbs that do not fit in the container
    * will be rendered in an overflow menu instead.
    */
  var items: js.Array[IBreadcrumbProps] = js.native
  /**
    * The minimum number of visible breadcrumbs that should never collapse into
    * the overflow menu, regardless of DOM dimensions.
    * @default 0
    */
  var minVisibleItems: js.UndefOr[Double] = js.native
  /**
    * Props to spread to `OverflowList`. Note that `items`,
    * `overflowRenderer`, and `visibleItemRenderer` cannot be changed.
    */
  var overflowListProps: js.UndefOr[PartialIOverflowListProps] = js.native
  /**
    * Props to spread to the `Popover` showing the overflow menu.
    */
  var popoverProps: js.UndefOr[IPopoverProps] = js.native
}

object IBreadcrumbsProps {
  @scala.inline
  def apply(items: js.Array[IBreadcrumbProps]): IBreadcrumbsProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBreadcrumbsProps]
  }
  @scala.inline
  implicit class IBreadcrumbsPropsOps[Self <: IBreadcrumbsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[IBreadcrumbProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreadcrumbRenderer(value: /* props */ IBreadcrumbProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBreadcrumbRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbRenderer")(js.undefined)
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
    def withCurrentBreadcrumbRenderer(value: /* props */ IBreadcrumbProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentBreadcrumbRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCurrentBreadcrumbRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentBreadcrumbRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withMinVisibleItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVisibleItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVisibleItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVisibleItems")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowListProps(value: PartialIOverflowListProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowListProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowListProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowListProps")(js.undefined)
        ret
    }
    @scala.inline
    def withPopoverProps(value: IPopoverProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopoverProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(js.undefined)
        ret
    }
  }
  
}

