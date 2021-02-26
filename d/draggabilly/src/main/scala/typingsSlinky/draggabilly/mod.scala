package typingsSlinky.draggabilly

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Touch
import typingsSlinky.draggabilly.draggabillyStrings.x
import typingsSlinky.draggabilly.draggabillyStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("draggabilly", JSImport.Default)
  @js.native
  class default protected () extends Draggabilly {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: DraggabillyOptions) = this()
    def this(element: Element, options: DraggabillyOptions) = this()
  }
  
  @js.native
  trait Draggabilly extends StObject {
    
    def destroy(): Unit = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def off(
      eventName: DraggabillyClickEventName,
      listener: js.Function2[/* event */ Event, /* pointer */ MouseEvent | Touch, Unit]
    ): Draggabilly = js.native
    def off(
      eventName: DraggabillyMoveEventName,
      listener: js.Function3[/* event */ Event, /* pointer */ MouseEvent | Touch, /* moveVector */ Position, Unit]
    ): Draggabilly = js.native
    
    def on(
      eventName: DraggabillyClickEventName,
      listener: js.Function2[/* event */ Event, /* pointer */ MouseEvent | Touch, Unit]
    ): Draggabilly = js.native
    def on(
      eventName: DraggabillyMoveEventName,
      listener: js.Function3[/* event */ Event, /* pointer */ MouseEvent | Touch, /* moveVector */ Position, Unit]
    ): Draggabilly = js.native
    
    def once(
      eventName: DraggabillyClickEventName,
      listener: js.Function2[/* event */ Event, /* pointer */ MouseEvent | Touch, Unit]
    ): Draggabilly = js.native
    def once(
      eventName: DraggabillyMoveEventName,
      listener: js.Function3[/* event */ Event, /* pointer */ MouseEvent | Touch, /* moveVector */ Position, Unit]
    ): Draggabilly = js.native
    
    var position: Position = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.draggabilly.draggabillyStrings.dragStart
    - typingsSlinky.draggabilly.draggabillyStrings.dragEnd
    - typingsSlinky.draggabilly.draggabillyStrings.pointerDown
    - typingsSlinky.draggabilly.draggabillyStrings.pointerUp
    - typingsSlinky.draggabilly.draggabillyStrings.staticClick
  */
  trait DraggabillyClickEventName extends StObject
  object DraggabillyClickEventName {
    
    @scala.inline
    def dragEnd: typingsSlinky.draggabilly.draggabillyStrings.dragEnd = "dragEnd".asInstanceOf[typingsSlinky.draggabilly.draggabillyStrings.dragEnd]
    
    @scala.inline
    def dragStart: typingsSlinky.draggabilly.draggabillyStrings.dragStart = "dragStart".asInstanceOf[typingsSlinky.draggabilly.draggabillyStrings.dragStart]
    
    @scala.inline
    def pointerDown: typingsSlinky.draggabilly.draggabillyStrings.pointerDown = "pointerDown".asInstanceOf[typingsSlinky.draggabilly.draggabillyStrings.pointerDown]
    
    @scala.inline
    def pointerUp: typingsSlinky.draggabilly.draggabillyStrings.pointerUp = "pointerUp".asInstanceOf[typingsSlinky.draggabilly.draggabillyStrings.pointerUp]
    
    @scala.inline
    def staticClick: typingsSlinky.draggabilly.draggabillyStrings.staticClick = "staticClick".asInstanceOf[typingsSlinky.draggabilly.draggabillyStrings.staticClick]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.draggabilly.draggabillyStrings.dragMove
    - typingsSlinky.draggabilly.draggabillyStrings.pointerMove
  */
  trait DraggabillyMoveEventName extends StObject
  object DraggabillyMoveEventName {
    
    @scala.inline
    def dragMove: typingsSlinky.draggabilly.draggabillyStrings.dragMove = "dragMove".asInstanceOf[typingsSlinky.draggabilly.draggabillyStrings.dragMove]
    
    @scala.inline
    def pointerMove: typingsSlinky.draggabilly.draggabillyStrings.pointerMove = "pointerMove".asInstanceOf[typingsSlinky.draggabilly.draggabillyStrings.pointerMove]
  }
  
  @js.native
  trait DraggabillyOptions extends StObject {
    
    var axis: js.UndefOr[x | y] = js.native
    
    var containment: js.UndefOr[Element | String | Boolean] = js.native
    
    var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var handle: js.UndefOr[String] = js.native
  }
  object DraggabillyOptions {
    
    @scala.inline
    def apply(): DraggabillyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggabillyOptions]
    }
    
    @scala.inline
    implicit class DraggabillyOptionsMutableBuilder[Self <: DraggabillyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: typingsSlinky.draggabilly.draggabillyStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setContainment(value: Element | String | Boolean): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainmentElement(value: Element): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
      
      @scala.inline
      def setGrid(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    }
  }
  
  @js.native
  trait Position extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Position {
    
    @scala.inline
    def apply(x: Double, y: Double): Position = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
