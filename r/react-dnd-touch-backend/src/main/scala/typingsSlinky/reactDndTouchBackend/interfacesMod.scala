package typingsSlinky.reactDndTouchBackend

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.contextmenu
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.keydown
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.mousedown
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.mousemove
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.mouseup
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.touchend
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.touchmove
import typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.touchstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  sealed trait ListenerType extends StObject
  @JSImport("react-dnd-touch-backend/lib/interfaces", "ListenerType")
  @js.native
  object ListenerType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ListenerType with String] = js.native
    
    @js.native
    sealed trait keyboard extends ListenerType
    /* "keyboard" */ val keyboard: typingsSlinky.reactDndTouchBackend.interfacesMod.ListenerType.keyboard with String = js.native
    
    @js.native
    sealed trait mouse extends ListenerType
    /* "mouse" */ val mouse: typingsSlinky.reactDndTouchBackend.interfacesMod.ListenerType.mouse with String = js.native
    
    @js.native
    sealed trait touch extends ListenerType
    /* "touch" */ val touch: typingsSlinky.reactDndTouchBackend.interfacesMod.ListenerType.touch with String = js.native
  }
  
  @js.native
  trait AngleRange extends StObject {
    
    var end: Double = js.native
    
    var start: Double = js.native
  }
  object AngleRange {
    
    @scala.inline
    def apply(end: Double, start: Double): AngleRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngleRange]
    }
    
    @scala.inline
    implicit class AngleRangeMutableBuilder[Self <: AngleRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventName extends StObject {
    
    var contextmenu: js.UndefOr[typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.contextmenu] = js.native
    
    var end: js.UndefOr[mouseup | touchend] = js.native
    
    var keydown: js.UndefOr[typingsSlinky.reactDndTouchBackend.reactDndTouchBackendStrings.keydown] = js.native
    
    var move: js.UndefOr[mousemove | touchmove] = js.native
    
    var start: js.UndefOr[mousedown | touchstart] = js.native
  }
  object EventName {
    
    @scala.inline
    def apply(): EventName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventName]
    }
    
    @scala.inline
    implicit class EventNameMutableBuilder[Self <: EventName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextmenu(value: contextmenu): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
      
      @scala.inline
      def setEnd(value: mouseup | touchend): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setKeydown(value: keydown): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
      
      @scala.inline
      def setMove(value: mousemove | touchmove): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      @scala.inline
      def setStart(value: mousedown | touchstart): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait TouchBackendContext extends StObject {
    
    var window: js.UndefOr[Window] = js.native
  }
  object TouchBackendContext {
    
    @scala.inline
    def apply(): TouchBackendContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TouchBackendContext]
    }
    
    @scala.inline
    implicit class TouchBackendContextMutableBuilder[Self <: TouchBackendContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  @js.native
  trait TouchBackendOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.native
    
    var delayMouseStart: js.UndefOr[Double] = js.native
    
    var delayTouchStart: js.UndefOr[Double] = js.native
    
    var enableHoverOutsideTarget: js.UndefOr[Boolean] = js.native
    
    var enableKeyboardEvents: js.UndefOr[Boolean] = js.native
    
    var enableMouseEvents: js.UndefOr[Boolean] = js.native
    
    var enableTouchEvents: js.UndefOr[Boolean] = js.native
    
    var getDropTargetElementsAtPoint: js.UndefOr[
        js.Function3[
          /* x */ Double, 
          /* y */ Double, 
          /* dropTargets */ js.Array[HTMLElement], 
          js.Array[HTMLElement]
        ]
      ] = js.native
    
    var ignoreContextMenu: js.UndefOr[Boolean] = js.native
    
    var scrollAngleRanges: js.UndefOr[js.Array[AngleRange]] = js.native
    
    var touchSlop: js.UndefOr[Double] = js.native
  }
  object TouchBackendOptions {
    
    @scala.inline
    def apply(): TouchBackendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TouchBackendOptions]
    }
    
    @scala.inline
    implicit class TouchBackendOptionsMutableBuilder[Self <: TouchBackendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayMouseStart(value: Double): Self = StObject.set(x, "delayMouseStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayMouseStartUndefined: Self = StObject.set(x, "delayMouseStart", js.undefined)
      
      @scala.inline
      def setDelayTouchStart(value: Double): Self = StObject.set(x, "delayTouchStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayTouchStartUndefined: Self = StObject.set(x, "delayTouchStart", js.undefined)
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setEnableHoverOutsideTarget(value: Boolean): Self = StObject.set(x, "enableHoverOutsideTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableHoverOutsideTargetUndefined: Self = StObject.set(x, "enableHoverOutsideTarget", js.undefined)
      
      @scala.inline
      def setEnableKeyboardEvents(value: Boolean): Self = StObject.set(x, "enableKeyboardEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKeyboardEventsUndefined: Self = StObject.set(x, "enableKeyboardEvents", js.undefined)
      
      @scala.inline
      def setEnableMouseEvents(value: Boolean): Self = StObject.set(x, "enableMouseEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMouseEventsUndefined: Self = StObject.set(x, "enableMouseEvents", js.undefined)
      
      @scala.inline
      def setEnableTouchEvents(value: Boolean): Self = StObject.set(x, "enableTouchEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTouchEventsUndefined: Self = StObject.set(x, "enableTouchEvents", js.undefined)
      
      @scala.inline
      def setGetDropTargetElementsAtPoint(
        value: (/* x */ Double, /* y */ Double, /* dropTargets */ js.Array[HTMLElement]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getDropTargetElementsAtPoint", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetDropTargetElementsAtPointUndefined: Self = StObject.set(x, "getDropTargetElementsAtPoint", js.undefined)
      
      @scala.inline
      def setIgnoreContextMenu(value: Boolean): Self = StObject.set(x, "ignoreContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreContextMenuUndefined: Self = StObject.set(x, "ignoreContextMenu", js.undefined)
      
      @scala.inline
      def setScrollAngleRanges(value: js.Array[AngleRange]): Self = StObject.set(x, "scrollAngleRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollAngleRangesUndefined: Self = StObject.set(x, "scrollAngleRanges", js.undefined)
      
      @scala.inline
      def setScrollAngleRangesVarargs(value: AngleRange*): Self = StObject.set(x, "scrollAngleRanges", js.Array(value :_*))
      
      @scala.inline
      def setTouchSlop(value: Double): Self = StObject.set(x, "touchSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchSlopUndefined: Self = StObject.set(x, "touchSlop", js.undefined)
    }
  }
}
