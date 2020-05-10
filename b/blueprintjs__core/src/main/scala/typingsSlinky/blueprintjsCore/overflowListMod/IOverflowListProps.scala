package typingsSlinky.blueprintjsCore.overflowListMod

import slinky.core.TagMod
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverflowListProps[T] extends IProps {
  /**
    * Which direction the items should collapse from: start or end of the
    * children. This also determines whether `overflowRenderer` appears before
    * (`START`) or after (`END`) the visible items.
    * @default Boundary.START
    */
  var collapseFrom: js.UndefOr[Boundary] = js.native
  /**
    * All items to display in the list. Items that do not fit in the container
    * will be rendered in the overflow instead.
    */
  var items: js.Array[T] = js.native
  /**
    * The minimum number of visible items that should never collapse into the
    * overflow menu, regardless of DOM dimensions.
    * @default 0
    */
  var minVisibleItems: js.UndefOr[Double] = js.native
  /**
    * If `true`, all parent DOM elements of the container will also be
    * observed. If changes to a parent's size is detected, the overflow will be
    * recalculated.
    *
    * Only enable this prop if the overflow should be recalculated when a
    * parent element resizes in a way that does not also cause the
    * `OverflowList` to resize.
    * @default false
    */
  var observeParents: js.UndefOr[Boolean] = js.native
  /**
    * Callback invoked when the overflowed items change. This is called once
    * after the DOM has settled, rather that on every intermediate change. It
    * is not invoked if resizing produces an unchanged overflow state.
    */
  var onOverflow: js.UndefOr[js.Function1[/* overflowItems */ js.Array[T], Unit]] = js.native
  /** CSS properties to apply to the root element. */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * HTML tag name for the container element.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  /**
    * Callback invoked to render the overflowed items. Unlike
    * `visibleItemRenderer`, this prop is invoked once with all items that do
    * not fit in the container.
    *
    * Typical use cases for this prop will put overflowed items in a dropdown
    * menu or display a "+X items" label.
    */
  def overflowRenderer(overflowItems: js.Array[T]): TagMod[Any] = js.native
  /**
    * Callback invoked to render each visible item.
    * Remember to set a `key` on the rendered element!
    */
  def visibleItemRenderer(item: T, index: Double): ReactChild = js.native
}

object IOverflowListProps {
  @scala.inline
  def apply[T](
    items: js.Array[T],
    overflowRenderer: js.Array[T] => TagMod[Any],
    visibleItemRenderer: (T, Double) => ReactChild
  ): IOverflowListProps[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], overflowRenderer = js.Any.fromFunction1(overflowRenderer), visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
    __obj.asInstanceOf[IOverflowListProps[T]]
  }
  @scala.inline
  implicit class IOverflowListPropsOps[Self[t] <: IOverflowListProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflowRenderer(value: js.Array[T] => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisibleItemRenderer(value: (T, Double) => ReactChild): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemRenderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCollapseFrom(value: Boundary): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseFrom: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinVisibleItems(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVisibleItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVisibleItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVisibleItems")(js.undefined)
        ret
    }
    @scala.inline
    def withObserveParents(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeParents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserveParents: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeParents")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverflow(value: /* overflowItems */ js.Array[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOverflow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
  }
  
}

