package typingsSlinky.blueprintjsCore

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typingsSlinky.blueprintjsCore.popoverMod.IPopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumbs.IBreadcrumbsProps> */
@js.native
trait PartialIBreadcrumbsProps extends js.Object {
  var breadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, ReactElement]] = js.native
  var className: js.UndefOr[String] = js.native
  var collapseFrom: js.UndefOr[Boundary] = js.native
  var currentBreadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, ReactElement]] = js.native
  var items: js.UndefOr[js.Array[IBreadcrumbProps]] = js.native
  var minVisibleItems: js.UndefOr[Double] = js.native
  var overflowListProps: js.UndefOr[PartialIOverflowListProps] = js.native
  var popoverProps: js.UndefOr[IPopoverProps] = js.native
}

object PartialIBreadcrumbsProps {
  @scala.inline
  def apply(): PartialIBreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIBreadcrumbsProps]
  }
  @scala.inline
  implicit class PartialIBreadcrumbsPropsOps[Self <: PartialIBreadcrumbsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
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
    def withItems(value: js.Array[IBreadcrumbProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
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

