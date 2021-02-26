package typingsSlinky.reduxDevtoolsDockMonitor

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-devtools-dock-monitor", JSImport.Default)
  @js.native
  class default ()
    extends Component[IDockMonitorProps, js.Object, js.Any]
  
  type DockMonitor = ReactComponentClass[IDockMonitorProps]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.left
    - typingsSlinky.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.top
    - typingsSlinky.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.right
    - typingsSlinky.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.bottom
  */
  trait DockPosition extends StObject
  object DockPosition {
    
    @scala.inline
    def bottom: typingsSlinky.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.bottom = "bottom".asInstanceOf[typingsSlinky.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.bottom]
    
    @scala.inline
    def left: typingsSlinky.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.left = "left".asInstanceOf[typingsSlinky.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.left]
    
    @scala.inline
    def right: typingsSlinky.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.right = "right".asInstanceOf[typingsSlinky.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.right]
    
    @scala.inline
    def top: typingsSlinky.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.top = "top".asInstanceOf[typingsSlinky.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.top]
  }
  
  @js.native
  trait IDockMonitorProps extends StObject {
    
    /**
      * A key or a key combination that switches the currently visible monitor.
      * Must be recognizable by parse-key (for example, 'ctrl-m')
      * Required if you use more than one monitor.
      *
      * @default undefined
      */
    var changeMonitorKey: js.UndefOr[String] = js.native
    
    /**
      * A key or a key combination that toggles the dock position.
      * Must be recognizable by parse-key (for example, 'ctrl-w')
      */
    var changePositionKey: String = js.native
    
    /**
      * Any valid Redux DevTools monitor.
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    /**
      * @default true
      */
    var defaultIsVisible: js.UndefOr[Boolean] = js.native
    
    /**
      * Where the dock appears on the screen.
      * Valid values: 'left', 'top', 'right', 'bottom'
      *
      * @default 'right'
      */
    var defaultPosition: js.UndefOr[DockPosition] = js.native
    
    /**
      * Size of the dock. When fluid is true, a float (0.5 means half the window size).
      * When fluid is false, a width in pixels
      *
      * @default 0.3 (3/10th of the window size)
      */
    var defaultSize: js.UndefOr[Double] = js.native
    
    /**
      * When true, the dock size is a fraction of the window size, fixed otherwise.
      *
      * @default true
      */
    var fluid: js.UndefOr[Boolean] = js.native
    
    /**
      * A key or a key combination that toggles the dock visibility.
      * Must be recognizable by parse-key (for example, 'ctrl-h')
      */
    var toggleVisibilityKey: String = js.native
  }
  object IDockMonitorProps {
    
    @scala.inline
    def apply(changePositionKey: String, toggleVisibilityKey: String): IDockMonitorProps = {
      val __obj = js.Dynamic.literal(changePositionKey = changePositionKey.asInstanceOf[js.Any], toggleVisibilityKey = toggleVisibilityKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDockMonitorProps]
    }
    
    @scala.inline
    implicit class IDockMonitorPropsMutableBuilder[Self <: IDockMonitorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeMonitorKey(value: String): Self = StObject.set(x, "changeMonitorKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeMonitorKeyUndefined: Self = StObject.set(x, "changeMonitorKey", js.undefined)
      
      @scala.inline
      def setChangePositionKey(value: String): Self = StObject.set(x, "changePositionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultIsVisible(value: Boolean): Self = StObject.set(x, "defaultIsVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIsVisibleUndefined: Self = StObject.set(x, "defaultIsVisible", js.undefined)
      
      @scala.inline
      def setDefaultPosition(value: DockPosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPositionUndefined: Self = StObject.set(x, "defaultPosition", js.undefined)
      
      @scala.inline
      def setDefaultSize(value: Double): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setToggleVisibilityKey(value: String): Self = StObject.set(x, "toggleVisibilityKey", value.asInstanceOf[js.Any])
    }
  }
}
