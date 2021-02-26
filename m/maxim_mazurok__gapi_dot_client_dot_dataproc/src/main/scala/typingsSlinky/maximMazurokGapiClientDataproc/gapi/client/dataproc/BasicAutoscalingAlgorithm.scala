package typingsSlinky.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicAutoscalingAlgorithm extends StObject {
  
  /** Optional. Duration between scaling events. A scaling period starts after the update operation from the previous event has completed.Bounds: 2m, 1d. Default: 2m. */
  var cooldownPeriod: js.UndefOr[String] = js.native
  
  /** Required. YARN autoscaling configuration. */
  var yarnConfig: js.UndefOr[BasicYarnAutoscalingConfig] = js.native
}
object BasicAutoscalingAlgorithm {
  
  @scala.inline
  def apply(): BasicAutoscalingAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicAutoscalingAlgorithm]
  }
  
  @scala.inline
  implicit class BasicAutoscalingAlgorithmMutableBuilder[Self <: BasicAutoscalingAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCooldownPeriod(value: String): Self = StObject.set(x, "cooldownPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldownPeriodUndefined: Self = StObject.set(x, "cooldownPeriod", js.undefined)
    
    @scala.inline
    def setYarnConfig(value: BasicYarnAutoscalingConfig): Self = StObject.set(x, "yarnConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYarnConfigUndefined: Self = StObject.set(x, "yarnConfig", js.undefined)
  }
}
