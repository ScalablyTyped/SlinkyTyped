package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConfig extends StObject {
  
  var Delay: js.UndefOr[Double] = js.native
  
  var FailureAction: js.UndefOr[String] = js.native
  
  var MaxFailureRatio: js.UndefOr[Double] = js.native
  
  var Monitor: js.UndefOr[Double] = js.native
  
  var Order: String = js.native
  
  var Parallelism: Double = js.native
}
object UpdateConfig {
  
  @scala.inline
  def apply(Order: String, Parallelism: Double): UpdateConfig = {
    val __obj = js.Dynamic.literal(Order = Order.asInstanceOf[js.Any], Parallelism = Parallelism.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfig]
  }
  
  @scala.inline
  implicit class UpdateConfigMutableBuilder[Self <: UpdateConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "Delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "Delay", js.undefined)
    
    @scala.inline
    def setFailureAction(value: String): Self = StObject.set(x, "FailureAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureActionUndefined: Self = StObject.set(x, "FailureAction", js.undefined)
    
    @scala.inline
    def setMaxFailureRatio(value: Double): Self = StObject.set(x, "MaxFailureRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFailureRatioUndefined: Self = StObject.set(x, "MaxFailureRatio", js.undefined)
    
    @scala.inline
    def setMonitor(value: Double): Self = StObject.set(x, "Monitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorUndefined: Self = StObject.set(x, "Monitor", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelism(value: Double): Self = StObject.set(x, "Parallelism", value.asInstanceOf[js.Any])
  }
}
