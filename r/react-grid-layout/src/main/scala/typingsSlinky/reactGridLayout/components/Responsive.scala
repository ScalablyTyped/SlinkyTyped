package typingsSlinky.reactGridLayout.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactGridLayout.anon.E
import typingsSlinky.reactGridLayout.anon.H
import typingsSlinky.reactGridLayout.mod.Layout
import typingsSlinky.reactGridLayout.mod.Layouts
import typingsSlinky.reactGridLayout.mod.ResponsiveProps
import typingsSlinky.reactGridLayout.reactGridLayoutStrings.horizontal
import typingsSlinky.reactGridLayout.reactGridLayoutStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Responsive {
  
  @JSImport("react-grid-layout", "Responsive")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactGridLayout.mod.Responsive] {
    
    @scala.inline
    def autoSize(value: Boolean): this.type = set("autoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compactType(value: vertical | horizontal): this.type = set("compactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compactTypeNull: this.type = set("compactType", null)
    
    @scala.inline
    def containerPadding(value: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])): this.type = set("containerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggableCancel(value: String): this.type = set("draggableCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggableHandle(value: String): this.type = set("draggableHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def droppingItem(value: H): this.type = set("droppingItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDraggable(value: Boolean): this.type = set("isDraggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDroppable(value: Boolean): this.type = set("isDroppable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layouts(value: Layouts): this.type = set("layouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxRows(value: Double): this.type = set("maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBreakpointChange(value: (/* newBreakpoint */ String, /* newCols */ Double) => Unit): this.type = set("onBreakpointChange", js.Any.fromFunction2(value))
    
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
    def onDrop(value: /* elemParams */ E => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLayoutChange(value: (/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts) => Unit): this.type = set("onLayoutChange", js.Any.fromFunction2(value))
    
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
    def onWidthChange(
      value: (/* containerWidth */ Double, /* margin */ js.Tuple2[Double, Double], /* cols */ Double, /* containerPadding */ js.Tuple2[Double, Double]) => Unit
    ): this.type = set("onWidthChange", js.Any.fromFunction4(value))
    
    @scala.inline
    def preventCollision(value: Boolean): this.type = set("preventCollision", value.asInstanceOf[js.Any])
    
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
  
  def withProps(p: ResponsiveProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Responsive.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
