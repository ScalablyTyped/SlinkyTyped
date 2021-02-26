package typingsSlinky.detectIt

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.detectHover.mod.detectHover
import typingsSlinky.detectIt.detectItStrings.coarse
import typingsSlinky.detectIt.detectItStrings.fine
import typingsSlinky.detectIt.detectItStrings.hover
import typingsSlinky.detectIt.detectItStrings.hybrid
import typingsSlinky.detectIt.detectItStrings.mouseOnly
import typingsSlinky.detectIt.detectItStrings.none
import typingsSlinky.detectIt.detectItStrings.touchOnly
import typingsSlinky.detectPassiveEvents.mod.detectPassiveEvents
import typingsSlinky.detectPointer.mod.detectPointer
import typingsSlinky.detectTouchEvents.mod.detectTouchEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("detect-it", JSImport.Default)
  @js.native
  val default: typingsSlinky.detectIt.mod.detectIt = js.native
  
  type _To = typingsSlinky.detectIt.mod.detectIt
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typingsSlinky.detectIt.mod.detectIt = default
  
  @js.native
  trait detectIt extends StObject {
    
    var deviceType: hybrid | mouseOnly | touchOnly = js.native
    
    var hasMouse: Boolean = js.native
    
    var hasTouch: Boolean = js.native
    
    var maxTouchPoints: Double = js.native
    
    var passiveEvents: Boolean = js.native
    
    var primaryHover: hover | none = js.native
    
    var primaryPointer: coarse | fine | none = js.native
    
    var state: typingsSlinky.detectIt.mod.state = js.native
    
    def update(): Unit = js.native
  }
  object detectIt {
    
    @scala.inline
    def apply(
      deviceType: hybrid | mouseOnly | touchOnly,
      hasMouse: Boolean,
      hasTouch: Boolean,
      maxTouchPoints: Double,
      passiveEvents: Boolean,
      primaryHover: hover | none,
      primaryPointer: coarse | fine | none,
      state: state,
      update: () => Unit
    ): typingsSlinky.detectIt.mod.detectIt = {
      val __obj = js.Dynamic.literal(deviceType = deviceType.asInstanceOf[js.Any], hasMouse = hasMouse.asInstanceOf[js.Any], hasTouch = hasTouch.asInstanceOf[js.Any], maxTouchPoints = maxTouchPoints.asInstanceOf[js.Any], passiveEvents = passiveEvents.asInstanceOf[js.Any], primaryHover = primaryHover.asInstanceOf[js.Any], primaryPointer = primaryPointer.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[typingsSlinky.detectIt.mod.detectIt]
    }
    
    @scala.inline
    implicit class detectItMutableBuilder[Self <: typingsSlinky.detectIt.mod.detectIt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceType(value: hybrid | mouseOnly | touchOnly): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMouse(value: Boolean): Self = StObject.set(x, "hasMouse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTouch(value: Boolean): Self = StObject.set(x, "hasTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTouchPoints(value: Double): Self = StObject.set(x, "maxTouchPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassiveEvents(value: Boolean): Self = StObject.set(x, "passiveEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryHover(value: hover | none): Self = StObject.set(x, "primaryHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryPointer(value: coarse | fine | none): Self = StObject.set(x, "primaryPointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: state): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait state extends StObject {
    
    var detectHover: typingsSlinky.detectHover.mod.detectHover = js.native
    
    var detectPassiveEvents: typingsSlinky.detectPassiveEvents.mod.detectPassiveEvents = js.native
    
    var detectPointer: typingsSlinky.detectPointer.mod.detectPointer = js.native
    
    var detectTouchEvents: typingsSlinky.detectTouchEvents.mod.detectTouchEvents = js.native
  }
  object state {
    
    @scala.inline
    def apply(
      detectHover: detectHover,
      detectPassiveEvents: detectPassiveEvents,
      detectPointer: detectPointer,
      detectTouchEvents: detectTouchEvents
    ): state = {
      val __obj = js.Dynamic.literal(detectHover = detectHover.asInstanceOf[js.Any], detectPassiveEvents = detectPassiveEvents.asInstanceOf[js.Any], detectPointer = detectPointer.asInstanceOf[js.Any], detectTouchEvents = detectTouchEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[state]
    }
    
    @scala.inline
    implicit class stateMutableBuilder[Self <: state] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectHover(value: detectHover): Self = StObject.set(x, "detectHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectPassiveEvents(value: detectPassiveEvents): Self = StObject.set(x, "detectPassiveEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectPointer(value: detectPointer): Self = StObject.set(x, "detectPointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectTouchEvents(value: detectTouchEvents): Self = StObject.set(x, "detectTouchEvents", value.asInstanceOf[js.Any])
    }
  }
}
