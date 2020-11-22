package typingsSlinky.reactGridLayout.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactGridLayout.anon.H
import typingsSlinky.reactGridLayout.mod.Layout
import typingsSlinky.reactGridLayout.mod.ReactGridLayoutProps
import typingsSlinky.reactGridLayout.mod.ResizeHandle
import typingsSlinky.reactGridLayout.mod.^
import typingsSlinky.reactGridLayout.reactGridLayoutStrings.horizontal
import typingsSlinky.reactGridLayout.reactGridLayoutStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGridLayout {
  
  @JSImport("react-grid-layout", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def autoSize(value: Boolean): this.type = set("autoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compactType(value: vertical | horizontal): this.type = set("compactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compactTypeNull: this.type = set("compactType", null)
    
    @scala.inline
    def containerPadding(value: js.Tuple2[Double, Double]): this.type = set("containerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggableCancel(value: String): this.type = set("draggableCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggableHandle(value: String): this.type = set("draggableHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def droppingItem(value: H): this.type = set("droppingItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isBounded(value: Boolean): this.type = set("isBounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDraggable(value: Boolean): this.type = set("isDraggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDroppable(value: Boolean): this.type = set("isDroppable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layoutVarargs(value: Layout*): this.type = set("layout", js.Array(value :_*))
    
    @scala.inline
    def layout(value: js.Array[Layout]): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: js.Tuple2[Double, Double]): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxRows(value: Double): this.type = set("maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrag(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): this.type = set("onDrag", js.Any.fromFunction6(value))
    
    @scala.inline
    def onDragStart(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): this.type = set("onDragStart", js.Any.fromFunction6(value))
    
    @scala.inline
    def onDragStop(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): this.type = set("onDragStop", js.Any.fromFunction6(value))
    
    @scala.inline
    def onDrop(value: (/* layout */ js.Array[Layout], /* item */ Layout, /* e */ Event) => Unit): this.type = set("onDrop", js.Any.fromFunction3(value))
    
    @scala.inline
    def onLayoutChange(value: /* layout */ js.Array[Layout] => Unit): this.type = set("onLayoutChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResize(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): this.type = set("onResize", js.Any.fromFunction6(value))
    
    @scala.inline
    def onResizeStart(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): this.type = set("onResizeStart", js.Any.fromFunction6(value))
    
    @scala.inline
    def onResizeStop(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit
    ): this.type = set("onResizeStop", js.Any.fromFunction6(value))
    
    @scala.inline
    def preventCollision(value: Boolean): this.type = set("preventCollision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizeHandleReactElement(value: ReactElement): this.type = set("resizeHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizeHandleFunction1(value: /* resizeHandle */ ResizeHandle => ReactElement): this.type = set("resizeHandle", js.Any.fromFunction1(value))
    
    @scala.inline
    def resizeHandle(value: ReactElement | (js.Function1[/* resizeHandle */ ResizeHandle, ReactElement])): this.type = set("resizeHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizeHandlesVarargs(value: ResizeHandle*): this.type = set("resizeHandles", js.Array(value :_*))
    
    @scala.inline
    def resizeHandles(value: js.Array[ResizeHandle]): this.type = set("resizeHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowHeight(value: Double): this.type = set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transformScale(value: Double): this.type = set("transformScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useCSSTransforms(value: Boolean): this.type = set("useCSSTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalCompact(value: Boolean): this.type = set("verticalCompact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactGridLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactGridLayout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
