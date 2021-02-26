package typingsSlinky.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventLoopDelay extends StObject {
  
  /**
    * event loop delay milliseconds.
    */
  var eventLoopDelay: Double = js.native
  
  /**
    * V8 heap usage.
    */
  var heapUsed: Double = js.native
  
  /**
    * RSS memory usage.
    */
  var rss: Double = js.native
}
object EventLoopDelay {
  
  @scala.inline
  def apply(eventLoopDelay: Double, heapUsed: Double, rss: Double): EventLoopDelay = {
    val __obj = js.Dynamic.literal(eventLoopDelay = eventLoopDelay.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLoopDelay]
  }
  
  @scala.inline
  implicit class EventLoopDelayMutableBuilder[Self <: EventLoopDelay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventLoopDelay(value: Double): Self = StObject.set(x, "eventLoopDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapUsed(value: Double): Self = StObject.set(x, "heapUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRss(value: Double): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
  }
}
