package typingsSlinky.reResizable

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizerMod {
  
  @JSImport("re-resizable/lib/resizer", "Resizer")
  @js.native
  class Resizer protected ()
    extends PureComponent[Props, js.Object, js.Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
    
    def onMouseDown(e: SyntheticMouseEvent[HTMLDivElement]): Unit = js.native
    
    def onTouchStart(e: SyntheticTouchEvent[HTMLDivElement]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reResizable.reResizableStrings.top
    - typingsSlinky.reResizable.reResizableStrings.right
    - typingsSlinky.reResizable.reResizableStrings.bottom
    - typingsSlinky.reResizable.reResizableStrings.left
    - typingsSlinky.reResizable.reResizableStrings.topRight
    - typingsSlinky.reResizable.reResizableStrings.bottomRight
    - typingsSlinky.reResizable.reResizableStrings.bottomLeft
    - typingsSlinky.reResizable.reResizableStrings.topLeft
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def bottom: typingsSlinky.reResizable.reResizableStrings.bottom = "bottom".asInstanceOf[typingsSlinky.reResizable.reResizableStrings.bottom]
    
    @scala.inline
    def bottomLeft: typingsSlinky.reResizable.reResizableStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsSlinky.reResizable.reResizableStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: typingsSlinky.reResizable.reResizableStrings.bottomRight = "bottomRight".asInstanceOf[typingsSlinky.reResizable.reResizableStrings.bottomRight]
    
    @scala.inline
    def left: typingsSlinky.reResizable.reResizableStrings.left = "left".asInstanceOf[typingsSlinky.reResizable.reResizableStrings.left]
    
    @scala.inline
    def right: typingsSlinky.reResizable.reResizableStrings.right = "right".asInstanceOf[typingsSlinky.reResizable.reResizableStrings.right]
    
    @scala.inline
    def top: typingsSlinky.reResizable.reResizableStrings.top = "top".asInstanceOf[typingsSlinky.reResizable.reResizableStrings.top]
    
    @scala.inline
    def topLeft: typingsSlinky.reResizable.reResizableStrings.topLeft = "topLeft".asInstanceOf[typingsSlinky.reResizable.reResizableStrings.topLeft]
    
    @scala.inline
    def topRight: typingsSlinky.reResizable.reResizableStrings.topRight = "topRight".asInstanceOf[typingsSlinky.reResizable.reResizableStrings.topRight]
  }
  
  type OnStartCallback = js.Function2[
    /* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], 
    /* dir */ Direction, 
    Unit
  ]
  
  @js.native
  trait Props extends StObject {
    
    var children: ReactElement = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var direction: Direction = js.native
    
    var onResizeStart: OnStartCallback = js.native
    
    var replaceStyles: js.UndefOr[CSSProperties] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(
      direction: Direction,
      onResizeStart: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], /* dir */ Direction) => Unit
    ): Props = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], onResizeStart = js.Any.fromFunction2(onResizeStart))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResizeStart(
        value: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], /* dir */ Direction) => Unit
      ): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReplaceStyles(value: CSSProperties): Self = StObject.set(x, "replaceStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceStylesUndefined: Self = StObject.set(x, "replaceStyles", js.undefined)
    }
  }
}
