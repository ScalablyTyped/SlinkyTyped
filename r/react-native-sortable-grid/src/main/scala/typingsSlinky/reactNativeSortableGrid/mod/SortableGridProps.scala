package typingsSlinky.reactNativeSortableGrid.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSortableGrid.AnonTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableGridProps extends js.Object {
  /**
    * How long should it take for the block that is being dragged to seek its
    * place after it's released (milliseconds)
    */
  var activeBlockCenteringDuration: js.UndefOr[Double] = js.native
  /**
    * How long should the transition of a passive block take when the active
    * block takes its place (milliseconds)
    */
  var blockTransitionDuration: js.UndefOr[Double] = js.native
  /**
    * Items to be rendered in the SortableGrid
    */
  var children: js.UndefOr[js.Array[ReactElement]] = js.native
  /**
    * How long will the execution wait for the second tap before deciding it
    * was a single tap (milliseconds). Will be omitted if no
    * onDoubleTap-property is given to the item being tapped - In which case
    * single-tap callback will be executed instantly
    */
  var doubleTapTreshold: js.UndefOr[Double] = js.native
  /**
    * How long must the user hold the press on the block until it becomes
    * active and can be dragged (milliseconds)
    */
  var dragActivationThreshold: js.UndefOr[Double] = js.native
  /**
    * Custom animation to override the default wiggle. Must be an object
    * containing a key transform, which is an array of transformations.
    */
  var dragStartAnimation: js.UndefOr[AnonTransform] = js.native
  /**
    * When used together with itemsPerRow, sets the size of a block to
    * something other than the default square
    */
  var itemHeight: js.UndefOr[Double] = js.native
  /**
    * If set, itemsPerRow will be calculated to fit items of this size
    */
  var itemWidth: js.UndefOr[Double] = js.native
  /**
    * How many items should be placed on one row
    */
  var itemsPerRow: js.UndefOr[Double] = js.native
  /**
    * Function that is executed item is deleted. Will return the properties
    * of the deleted item.
    */
  var onDeleteItem: js.UndefOr[js.Function1[/* deletedItem */ OrderedItem, Unit]] = js.native
  /**
    * Function that is executed after the drag is released. Will return the
    * new item order.
    */
  var onDragRelease: js.UndefOr[js.Function1[/* itemOrder */ ItemOrder, Unit]] = js.native
  /**
    * Function that is called when the dragging starts. This can be used to
    * lock other touch responders from listening to the touch such as
    * ScrollViews and Swipers.
    */
  var onDragStart: js.UndefOr[js.Function1[/* item */ OrderedItem, Unit]] = js.native
  /**
    * Custom styles to override or complement the sortableGrid native style.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object SortableGridProps {
  @scala.inline
  def apply(): SortableGridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableGridProps]
  }
  @scala.inline
  implicit class SortableGridPropsOps[Self <: SortableGridProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveBlockCenteringDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeBlockCenteringDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveBlockCenteringDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeBlockCenteringDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockTransitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockTransitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleTapTreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTapTreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleTapTreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTapTreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDragActivationThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragActivationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragActivationThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragActivationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStartAnimation(value: AnonTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStartAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragStartAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStartAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsPerRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsPerRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsPerRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeleteItem(value: /* deletedItem */ OrderedItem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeleteItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDeleteItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeleteItem")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragRelease(value: /* itemOrder */ ItemOrder => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragRelease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: /* item */ OrderedItem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
  }
  
}

