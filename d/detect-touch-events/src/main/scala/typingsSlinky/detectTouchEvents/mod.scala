package typingsSlinky.detectTouchEvents

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("detect-touch-events", JSImport.Default)
  @js.native
  val default: typingsSlinky.detectTouchEvents.mod.detectTouchEvents = js.native
  
  type _To = typingsSlinky.detectTouchEvents.mod.detectTouchEvents
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typingsSlinky.detectTouchEvents.mod.detectTouchEvents = default
  
  @js.native
  trait detectTouchEvents extends StObject {
    
    var hasApi: Boolean = js.native
    
    var maxTouchPoints: Double = js.native
    
    def update(): Unit = js.native
  }
  object detectTouchEvents {
    
    @scala.inline
    def apply(hasApi: Boolean, maxTouchPoints: Double, update: () => Unit): typingsSlinky.detectTouchEvents.mod.detectTouchEvents = {
      val __obj = js.Dynamic.literal(hasApi = hasApi.asInstanceOf[js.Any], maxTouchPoints = maxTouchPoints.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[typingsSlinky.detectTouchEvents.mod.detectTouchEvents]
    }
    
    @scala.inline
    implicit class detectTouchEventsMutableBuilder[Self <: typingsSlinky.detectTouchEvents.mod.detectTouchEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasApi(value: Boolean): Self = StObject.set(x, "hasApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTouchPoints(value: Double): Self = StObject.set(x, "maxTouchPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
