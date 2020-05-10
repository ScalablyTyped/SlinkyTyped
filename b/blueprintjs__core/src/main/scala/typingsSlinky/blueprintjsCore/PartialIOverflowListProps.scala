package typingsSlinky.blueprintjsCore

import slinky.core.TagMod
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/overflow-list/overflowList.IOverflowListProps<@blueprintjs/core.@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumb.IBreadcrumbProps>> */
@js.native
trait PartialIOverflowListProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var collapseFrom: js.UndefOr[Boundary] = js.native
  var items: js.UndefOr[js.Array[IBreadcrumbProps]] = js.native
  var minVisibleItems: js.UndefOr[Double] = js.native
  var observeParents: js.UndefOr[Boolean] = js.native
  var onOverflow: js.UndefOr[js.Function1[/* overflowItems */ js.Array[IBreadcrumbProps], Unit]] = js.native
  var overflowRenderer: js.UndefOr[js.Function1[/* overflowItems */ js.Array[IBreadcrumbProps], TagMod[Any]]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  var visibleItemRenderer: js.UndefOr[js.Function2[/* item */ IBreadcrumbProps, /* index */ Double, ReactChild]] = js.native
}

object PartialIOverflowListProps {
  @scala.inline
  def apply(): PartialIOverflowListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIOverflowListProps]
  }
  @scala.inline
  implicit class PartialIOverflowListPropsOps[Self <: PartialIOverflowListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withObserveParents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeParents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserveParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeParents")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverflow(value: /* overflowItems */ js.Array[IBreadcrumbProps] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowRenderer(value: /* overflowItems */ js.Array[IBreadcrumbProps] => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOverflowRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleItemRenderer(value: (/* item */ IBreadcrumbProps, /* index */ Double) => ReactChild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemRenderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutVisibleItemRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemRenderer")(js.undefined)
        ret
    }
  }
  
}

