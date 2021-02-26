package typingsSlinky.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trace extends StObject {
  
  var duration: Double = js.native
  
  var method: String = js.native
  
  var parentSpanId: String = js.native
  
  var service: String = js.native
  
  var spanId: String = js.native
  
  var timestamp: Double = js.native
  
  var traceId: String = js.native
}
object Trace {
  
  @scala.inline
  def apply(
    duration: Double,
    method: String,
    parentSpanId: String,
    service: String,
    spanId: String,
    timestamp: Double,
    traceId: String
  ): Trace = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentSpanId = parentSpanId.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], spanId = spanId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trace]
  }
  
  @scala.inline
  implicit class TraceMutableBuilder[Self <: Trace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSpanId(value: String): Self = StObject.set(x, "parentSpanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
  }
}
