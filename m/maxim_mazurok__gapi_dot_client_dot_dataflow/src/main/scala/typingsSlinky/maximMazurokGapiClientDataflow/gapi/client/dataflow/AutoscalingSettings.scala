package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscalingSettings extends StObject {
  
  /** The algorithm to use for autoscaling. */
  var algorithm: js.UndefOr[String] = js.native
  
  /** The maximum number of workers to cap scaling at. */
  var maxNumWorkers: js.UndefOr[Double] = js.native
}
object AutoscalingSettings {
  
  @scala.inline
  def apply(): AutoscalingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingSettings]
  }
  
  @scala.inline
  implicit class AutoscalingSettingsMutableBuilder[Self <: AutoscalingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setMaxNumWorkers(value: Double): Self = StObject.set(x, "maxNumWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNumWorkersUndefined: Self = StObject.set(x, "maxNumWorkers", js.undefined)
  }
}
