package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draggableZoneTypesMod {
  
  @js.native
  trait ICoordinates extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object ICoordinates {
    
    @scala.inline
    def apply(x: Double, y: Double): ICoordinates = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICoordinates]
    }
    
    @scala.inline
    implicit class ICoordinatesMutableBuilder[Self <: ICoordinates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDragData extends StObject {
    
    var delta: ICoordinates = js.native
    
    var lastPosition: js.UndefOr[ICoordinates] = js.native
    
    var position: ICoordinates = js.native
  }
  object IDragData {
    
    @scala.inline
    def apply(delta: ICoordinates, position: ICoordinates): IDragData = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDragData]
    }
    
    @scala.inline
    implicit class IDragDataMutableBuilder[Self <: IDragData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: ICoordinates): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPosition(value: ICoordinates): Self = StObject.set(x, "lastPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPositionUndefined: Self = StObject.set(x, "lastPosition", js.undefined)
      
      @scala.inline
      def setPosition(value: ICoordinates): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDraggableZoneProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Specifies a selector to be used as the handle that initiates drag
      */
    var handleSelector: js.UndefOr[String] = js.native
    
    /**
      * Callback for when the drag changes, while dragging
      */
    var onDragChange: js.UndefOr[
        js.Function2[
          /* event */ SyntheticMouseEvent[HTMLElement] with SyntheticTouchEvent[HTMLElement], 
          /* dragData */ IDragData, 
          Unit
        ]
      ] = js.native
    
    /**
      * Callback for when dragging starts
      */
    var onStart: js.UndefOr[
        js.Function2[
          /* event */ SyntheticMouseEvent[HTMLElement] with SyntheticTouchEvent[HTMLElement], 
          /* dragData */ IDragData, 
          Unit
        ]
      ] = js.native
    
    /**
      * Callback for when dragging stops
      */
    var onStop: js.UndefOr[
        js.Function2[
          /* event */ SyntheticMouseEvent[HTMLElement] with SyntheticTouchEvent[HTMLElement], 
          /* dragData */ IDragData, 
          Unit
        ]
      ] = js.native
    
    /**
      * the X and Y coordinates to use as an offest to position the draggable content
      */
    var position: js.UndefOr[ICoordinates] = js.native
    
    /**
      * Specifies a selector to be used to prevent drag initialization.
      * For example, if you do not want buttons inside of your handleSelector
      * to have the cursor change to move or to allow users to select from buttons,
      * you could pass button here (the close button in the header of a dialog is a concrete example)
      */
    var preventDragSelector: js.UndefOr[String] = js.native
  }
  object IDraggableZoneProps {
    
    @scala.inline
    def apply(): IDraggableZoneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDraggableZoneProps]
    }
    
    @scala.inline
    implicit class IDraggableZonePropsMutableBuilder[Self <: IDraggableZoneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleSelector(value: String): Self = StObject.set(x, "handleSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSelectorUndefined: Self = StObject.set(x, "handleSelector", js.undefined)
      
      @scala.inline
      def setOnDragChange(
        value: (/* event */ SyntheticMouseEvent[HTMLElement] with SyntheticTouchEvent[HTMLElement], /* dragData */ IDragData) => Unit
      ): Self = StObject.set(x, "onDragChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragChangeUndefined: Self = StObject.set(x, "onDragChange", js.undefined)
      
      @scala.inline
      def setOnStart(
        value: (/* event */ SyntheticMouseEvent[HTMLElement] with SyntheticTouchEvent[HTMLElement], /* dragData */ IDragData) => Unit
      ): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnStop(
        value: (/* event */ SyntheticMouseEvent[HTMLElement] with SyntheticTouchEvent[HTMLElement], /* dragData */ IDragData) => Unit
      ): Self = StObject.set(x, "onStop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      @scala.inline
      def setPosition(value: ICoordinates): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPreventDragSelector(value: String): Self = StObject.set(x, "preventDragSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDragSelectorUndefined: Self = StObject.set(x, "preventDragSelector", js.undefined)
    }
  }
}
