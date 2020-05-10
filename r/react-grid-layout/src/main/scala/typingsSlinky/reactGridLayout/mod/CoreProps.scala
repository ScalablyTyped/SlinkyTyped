package typingsSlinky.reactGridLayout.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactGridLayout.AnonE
import typingsSlinky.reactGridLayout.AnonH
import typingsSlinky.reactGridLayout.reactGridLayoutStrings.horizontal
import typingsSlinky.reactGridLayout.reactGridLayoutStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreProps extends js.Object {
  /**
    * If true, the container height swells and contracts to fit contents.
    */
  var autoSize: js.UndefOr[Boolean] = js.native
  /**
    * The classname to add to the root element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Compaction type.
    */
  var compactType: js.UndefOr[vertical | horizontal | Null] = js.native
  /**
    * A CSS selector for tags that will not be draggable.
    *
    * For example: `draggableCancel: '.MyNonDraggableAreaClassName'`
    *
    * If you forget the leading. it will not work.
    */
  var draggableCancel: js.UndefOr[String] = js.native
  /**
    * A CSS selector for tags that will act as the draggable handle.
    *
    * For example: `draggableHandle: '.MyDragHandleClassName'`
    *
    * If you forget the leading . it will not work.
    */
  var draggableHandle: js.UndefOr[String] = js.native
  /**
    * Configuration of a dropping element. Dropping element is a "virtual" element
    * which appears when you drag over some element from outside.
    */
  var droppingItem: js.UndefOr[AnonH] = js.native
  /**
    * If set to false it will disable dragging on all children.
    */
  var isDraggable: js.UndefOr[Boolean] = js.native
  /**
    * If set to false it will not call `onDrop()` callback.
    */
  var isDroppable: js.UndefOr[Boolean] = js.native
  /**
    * If set to false it will disable resizing on all children.
    */
  var isResizable: js.UndefOr[Boolean] = js.native
  /**
    * Default Infinity, but you can specify a max here if you like.
    * Note that this isn't fully fleshed out and won't error if you specify a layout that
    * extends beyond the row capacity. It will, however, not allow users to drag/resize
    * an item past the barrier. They can push items beyond the barrier, though.
    * Intentionally not documented for this reason.
    */
  var maxRows: js.UndefOr[Double] = js.native
  /**
    * Calls on each drag movement.
    */
  var onDrag: js.UndefOr[ItemCallback] = js.native
  /**
    * Calls when drag starts.
    */
  var onDragStart: js.UndefOr[ItemCallback] = js.native
  /**
    * Calls when drag is complete.
    */
  var onDragStop: js.UndefOr[ItemCallback] = js.native
  /**
    * Calls when some element has been dropped
    */
  var onDrop: js.UndefOr[js.Function1[/* elemParams */ AnonE, Unit]] = js.native
  /**
    * Calls when resize movement happens.
    */
  var onResize: js.UndefOr[ItemCallback] = js.native
  /**
    * Calls when resize starts.
    */
  var onResizeStart: js.UndefOr[ItemCallback] = js.native
  /**
    * Calls when resize is complete.
    */
  var onResizeStop: js.UndefOr[ItemCallback] = js.native
  /**
    * If true, grid items won't change position when being dragged over.
    */
  var preventCollision: js.UndefOr[Boolean] = js.native
  /**
    * Rows have a static height, but you can change this based on breakpoints if you like.
    */
  var rowHeight: js.UndefOr[Double] = js.native
  /**
    * Inline-style object to pass to the root element.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Scale coefficient for CSS3 `transform: scale()`
    */
  var transformScale: js.UndefOr[Double] = js.native
  /**
    * Uses CSS3 `translate()` instead of position top/left.
    * This makes about 6x faster paint performance.
    */
  var useCSSTransforms: js.UndefOr[Boolean] = js.native
  /**
    * If true, the layout will compact vertically.
    */
  var verticalCompact: js.UndefOr[Boolean] = js.native
  /**
    * This allows setting the initial width on the server side.
    * This is required unless using the HOC <WidthProvider> or similar.
    */
  var width: js.UndefOr[Double] = js.native
}

object CoreProps {
  @scala.inline
  def apply(): CoreProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreProps]
  }
  @scala.inline
  implicit class CorePropsOps[Self <: CoreProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(js.undefined)
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
    def withCompactType(value: vertical | horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactType")(js.undefined)
        ret
    }
    @scala.inline
    def withCompactTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactType")(null)
        ret
    }
    @scala.inline
    def withDraggableCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggableCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggableHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggableHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withDroppingItem(value: AnonH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppingItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDroppingItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppingItem")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraggable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDroppable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDroppable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDroppable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDroppable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizable")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStop(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStop")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutOnDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: /* elemParams */ AnonE => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizeStart(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutOnResizeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizeStop(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStop")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutOnResizeStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStop")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventCollision(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventCollision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventCollision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventCollision")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
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
    def withTransformScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformScale")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCSSTransforms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCSSTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCSSTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCSSTransforms")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalCompact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalCompact")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

