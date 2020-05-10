package typingsSlinky.reactRnd.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reResizable.mod.ResizeDirection
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactDraggable.mod.DraggableData
import typingsSlinky.reactDraggable.mod.DraggableEvent
import typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
import typingsSlinky.reactRnd.AnonX
import typingsSlinky.reactRnd.mod.Grid
import typingsSlinky.reactRnd.mod.HandleClasses
import typingsSlinky.reactRnd.mod.HandleComponent
import typingsSlinky.reactRnd.mod.HandleStyles
import typingsSlinky.reactRnd.mod.Position
import typingsSlinky.reactRnd.mod.Props
import typingsSlinky.reactRnd.mod.ResizableDelta
import typingsSlinky.reactRnd.mod.ResizeEnable
import typingsSlinky.reactRnd.mod.Size
import typingsSlinky.reactRnd.reactRndStrings.both
import typingsSlinky.reactRnd.reactRndStrings.none
import typingsSlinky.reactRnd.reactRndStrings.x
import typingsSlinky.reactRnd.reactRndStrings.y
import typingsSlinky.reactRnd.xnumberynumberSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rnd {
  @JSImport("react-rnd", "Rnd")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRnd.mod.Rnd] {
    @scala.inline
    def bounds(value: String): this.type = set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def cancel(value: String): this.type = set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def default(value: xnumberynumberSize): this.type = set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def disableDragging(value: Boolean): this.type = set("disableDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def dragAxis(value: x | y | both | none): this.type = set("dragAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def dragGrid(value: Grid): this.type = set("dragGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def dragHandleClassName(value: String): this.type = set("dragHandleClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def enableResizing(value: ResizeEnable): this.type = set("enableResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def enableUserSelectHack(value: Boolean): this.type = set("enableUserSelectHack", value.asInstanceOf[js.Any])
    @scala.inline
    def lockAspectRatio(value: Boolean | Double): this.type = set("lockAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def lockAspectRatioExtraHeight(value: Double): this.type = set("lockAspectRatioExtraHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def lockAspectRatioExtraWidth(value: Double): this.type = set("lockAspectRatioExtraWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def maxHeight(value: Double | String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def maxWidth(value: Double | String): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def minHeight(value: Double | String): this.type = set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def minWidth(value: Double | String): this.type = set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def onDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onDrag", js.Any.fromFunction2(value))
    @scala.inline
    def onDragStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onDragStart", js.Any.fromFunction2(value))
    @scala.inline
    def onDragStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onDragStop", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseDown(value: /* e */ MouseEvent => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseUp(value: /* e */ MouseEvent => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def onResize(
      value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
    ): this.type = set("onResize", js.Any.fromFunction5(value))
    @scala.inline
    def onResizeStart(
      value: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement) => Unit
    ): this.type = set("onResizeStart", js.Any.fromFunction3(value))
    @scala.inline
    def onResizeStop(
      value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
    ): this.type = set("onResizeStop", js.Any.fromFunction5(value))
    @scala.inline
    def position(value: AnonX): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def resizeGrid(value: Grid): this.type = set("resizeGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def resizeHandleClasses(value: HandleClasses): this.type = set("resizeHandleClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def resizeHandleComponent(value: HandleComponent): this.type = set("resizeHandleComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def resizeHandleStyles(value: HandleStyles): this.type = set("resizeHandleStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def resizeHandleWrapperClass(value: String): this.type = set("resizeHandleWrapperClass", value.asInstanceOf[js.Any])
    @scala.inline
    def resizeHandleWrapperStyle(value: CSSProperties): this.type = set("resizeHandleWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Rnd.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

