package typingsSlinky.reactNativeDraggableFlatlist.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.VirtualizedListWithoutRenderItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableFlatListProps[Item] extends VirtualizedListWithoutRenderItemProps[Item] {
  /**
    * Items to be rendered.
    */
  @JSName("data")
  var data_DraggableFlatListProps: js.Array[Item] | Null = js.native
  /**
    * Function that is called when row becomes active.
    */
  var onMoveBegin: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  /**
    *  Function that returns updated ordering of data
    */
  var onMoveEnd: js.UndefOr[js.Function1[/* info */ OnMoveEndInfo[Item], Unit]] = js.native
  /**
    * Sets where scrolling begins.
    *
    * Default is 5
    */
  var scrollPercent: js.UndefOr[Double] = js.native
  /**
    * Function that calls move when the row should become active (in an onPress, onLongPress, etc). Calls moveEnd when the gesture is complete (in onPressOut).
    */
  def renderItem(info: RenderItemInfo[Item]): ReactElement | Null = js.native
}

object DraggableFlatListProps {
  @scala.inline
  def apply[Item](renderItem: RenderItemInfo[Item] => ReactElement | Null): DraggableFlatListProps[Item] = {
    val __obj = js.Dynamic.literal(renderItem = js.Any.fromFunction1(renderItem))
    __obj.asInstanceOf[DraggableFlatListProps[Item]]
  }
  @scala.inline
  implicit class DraggableFlatListPropsOps[Self[item] <: DraggableFlatListProps[item], Item] (val x: Self[Item]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Item] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Item]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Item] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Item] with Other]
    @scala.inline
    def withRenderItem(value: RenderItemInfo[Item] => ReactElement | Null): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withData(value: js.Array[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataNull: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
    @scala.inline
    def withOnMoveBegin(value: /* index */ Double => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMoveBegin: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveEnd(value: /* info */ OnMoveEndInfo[Item] => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMoveEnd: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPercent(value: Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPercent: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPercent")(js.undefined)
        ret
    }
  }
  
}

