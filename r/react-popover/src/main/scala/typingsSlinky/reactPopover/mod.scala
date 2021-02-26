package typingsSlinky.reactPopover

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-popover", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PopoverProps, js.Object, js.Any]
  
  type Popover = ReactComponentClass[PopoverProps]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactPopover.reactPopoverStrings.above
    - typingsSlinky.reactPopover.reactPopoverStrings.right
    - typingsSlinky.reactPopover.reactPopoverStrings.below
    - typingsSlinky.reactPopover.reactPopoverStrings.left
    - typingsSlinky.reactPopover.reactPopoverStrings.row
    - typingsSlinky.reactPopover.reactPopoverStrings.column
    - typingsSlinky.reactPopover.reactPopoverStrings.start
    - typingsSlinky.reactPopover.reactPopoverStrings.end
  */
  trait PopoverPlace extends StObject
  object PopoverPlace {
    
    @scala.inline
    def above: typingsSlinky.reactPopover.reactPopoverStrings.above = "above".asInstanceOf[typingsSlinky.reactPopover.reactPopoverStrings.above]
    
    @scala.inline
    def below: typingsSlinky.reactPopover.reactPopoverStrings.below = "below".asInstanceOf[typingsSlinky.reactPopover.reactPopoverStrings.below]
    
    @scala.inline
    def column: typingsSlinky.reactPopover.reactPopoverStrings.column = "column".asInstanceOf[typingsSlinky.reactPopover.reactPopoverStrings.column]
    
    @scala.inline
    def end: typingsSlinky.reactPopover.reactPopoverStrings.end = "end".asInstanceOf[typingsSlinky.reactPopover.reactPopoverStrings.end]
    
    @scala.inline
    def left: typingsSlinky.reactPopover.reactPopoverStrings.left = "left".asInstanceOf[typingsSlinky.reactPopover.reactPopoverStrings.left]
    
    @scala.inline
    def right: typingsSlinky.reactPopover.reactPopoverStrings.right = "right".asInstanceOf[typingsSlinky.reactPopover.reactPopoverStrings.right]
    
    @scala.inline
    def row: typingsSlinky.reactPopover.reactPopoverStrings.row = "row".asInstanceOf[typingsSlinky.reactPopover.reactPopoverStrings.row]
    
    @scala.inline
    def start: typingsSlinky.reactPopover.reactPopoverStrings.start = "start".asInstanceOf[typingsSlinky.reactPopover.reactPopoverStrings.start]
  }
  
  @js.native
  trait PopoverProps extends StObject {
    
    var appendTarget: js.UndefOr[Element] = js.native
    
    var body: ReactElement = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var enterExitTransitionDurationMs: js.UndefOr[Double] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var onOuterAction: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var place: js.UndefOr[PopoverPlace] = js.native
    
    var preferPlace: js.UndefOr[PopoverPlace] = js.native
    
    var refreshIntervalMs: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var target: js.UndefOr[ReactElement] = js.native
    
    var tipSize: js.UndefOr[Double] = js.native
  }
  object PopoverProps {
    
    @scala.inline
    def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class PopoverPropsMutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTarget(value: Element): Self = StObject.set(x, "appendTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendTargetUndefined: Self = StObject.set(x, "appendTarget", js.undefined)
      
      @scala.inline
      def setBody(value: ReactElement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEnterExitTransitionDurationMs(value: Double): Self = StObject.set(x, "enterExitTransitionDurationMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterExitTransitionDurationMsUndefined: Self = StObject.set(x, "enterExitTransitionDurationMs", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setOnOuterAction(value: /* event */ Event => Unit): Self = StObject.set(x, "onOuterAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOuterActionUndefined: Self = StObject.set(x, "onOuterAction", js.undefined)
      
      @scala.inline
      def setPlace(value: PopoverPlace): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
      
      @scala.inline
      def setPreferPlace(value: PopoverPlace): Self = StObject.set(x, "preferPlace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferPlaceUndefined: Self = StObject.set(x, "preferPlace", js.undefined)
      
      @scala.inline
      def setRefreshIntervalMs(value: Double): Self = StObject.set(x, "refreshIntervalMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshIntervalMsUndefined: Self = StObject.set(x, "refreshIntervalMs", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTarget(value: ReactElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTipSize(value: Double): Self = StObject.set(x, "tipSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipSizeUndefined: Self = StObject.set(x, "tipSize", js.undefined)
    }
  }
}
