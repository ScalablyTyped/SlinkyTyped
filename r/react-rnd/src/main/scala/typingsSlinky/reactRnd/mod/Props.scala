package typingsSlinky.reactRnd.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.reResizable.mod.ResizeDirection
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactDraggable.mod.DraggableEvent
import typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
import typingsSlinky.reactRnd.AnonX
import typingsSlinky.reactRnd.reactRndStrings.both
import typingsSlinky.reactRnd.reactRndStrings.none
import typingsSlinky.reactRnd.reactRndStrings.x
import typingsSlinky.reactRnd.reactRndStrings.y
import typingsSlinky.reactRnd.xnumberynumberSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props
  extends /* key */ StringDictionary[js.Any] {
  var bounds: js.UndefOr[String] = js.native
  var cancel: js.UndefOr[String] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  var default: js.UndefOr[xnumberynumberSize] = js.native
  var disableDragging: js.UndefOr[Boolean] = js.native
  var dragAxis: js.UndefOr[x | y | both | none] = js.native
  var dragGrid: js.UndefOr[Grid] = js.native
  var dragHandleClassName: js.UndefOr[String] = js.native
  var enableResizing: js.UndefOr[ResizeEnable] = js.native
  var enableUserSelectHack: js.UndefOr[Boolean] = js.native
  var lockAspectRatio: js.UndefOr[Boolean | Double] = js.native
  var lockAspectRatioExtraHeight: js.UndefOr[Double] = js.native
  var lockAspectRatioExtraWidth: js.UndefOr[Double] = js.native
  var maxHeight: js.UndefOr[Double | String] = js.native
  var maxWidth: js.UndefOr[Double | String] = js.native
  var minHeight: js.UndefOr[Double | String] = js.native
  var minWidth: js.UndefOr[Double | String] = js.native
  var onDrag: js.UndefOr[RndDragCallback] = js.native
  var onDragStart: js.UndefOr[RndDragCallback] = js.native
  var onDragStop: js.UndefOr[RndDragCallback] = js.native
  var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
  var onMouseUp: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
  var onResize: js.UndefOr[RndResizeCallback] = js.native
  var onResizeStart: js.UndefOr[RndResizeStartCallback] = js.native
  var onResizeStop: js.UndefOr[RndResizeCallback] = js.native
  var position: js.UndefOr[AnonX] = js.native
  var resizeGrid: js.UndefOr[Grid] = js.native
  var resizeHandleClasses: js.UndefOr[HandleClasses] = js.native
  var resizeHandleComponent: js.UndefOr[HandleComponent] = js.native
  var resizeHandleStyles: js.UndefOr[HandleStyles] = js.native
  var resizeHandleWrapperClass: js.UndefOr[String] = js.native
  var resizeHandleWrapperStyle: js.UndefOr[CSSProperties] = js.native
  var scale: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Size] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
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
    def withDefault(value: xnumberynumberSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withDragAxis(value: x | y | both | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withDragGrid(value: Grid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withDragHandleClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandleClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragHandleClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandleClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableResizing(value: ResizeEnable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableUserSelectHack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUserSelectHack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableUserSelectHack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUserSelectHack")(js.undefined)
        ret
    }
    @scala.inline
    def withLockAspectRatio(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withLockAspectRatioExtraHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatioExtraHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockAspectRatioExtraHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatioExtraHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLockAspectRatioExtraWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatioExtraWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockAspectRatioExtraWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatioExtraWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(
      value: (/* e */ DraggableEvent, /* data */ typingsSlinky.reactDraggable.mod.DraggableData) => Unit | `false`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction2(value))
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
      value: (/* e */ DraggableEvent, /* data */ typingsSlinky.reactDraggable.mod.DraggableData) => Unit | `false`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction2(value))
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
      value: (/* e */ DraggableEvent, /* data */ typingsSlinky.reactDraggable.mod.DraggableData) => Unit | `false`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: /* e */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: /* e */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(
      value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction5(value))
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
      value: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.Any.fromFunction3(value))
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
      value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStop")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnResizeStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStop")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeGrid(value: Grid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeHandleClasses(value: HandleClasses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandleClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeHandleClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandleClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeHandleComponent(value: HandleComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandleComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeHandleComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandleComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeHandleStyles(value: HandleStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandleStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeHandleStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandleStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeHandleWrapperClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandleWrapperClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeHandleWrapperClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandleWrapperClass")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeHandleWrapperStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandleWrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeHandleWrapperStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandleWrapperStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
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
  }
  
}

