package typingsSlinky.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenMonitoring extends StObject {
  
  /**
    * 
    Prometheus settings.
    
    */
  var Prometheus: typingsSlinky.awsSdk.kafkaMod.Prometheus = js.native
}
object OpenMonitoring {
  
  @scala.inline
  def apply(Prometheus: Prometheus): OpenMonitoring = {
    val __obj = js.Dynamic.literal(Prometheus = Prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMonitoring]
  }
  
  @scala.inline
  implicit class OpenMonitoringMutableBuilder[Self <: OpenMonitoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrometheus(value: Prometheus): Self = StObject.set(x, "Prometheus", value.asInstanceOf[js.Any])
  }
}
