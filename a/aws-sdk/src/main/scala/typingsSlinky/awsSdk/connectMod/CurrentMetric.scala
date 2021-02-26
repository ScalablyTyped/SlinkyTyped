package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentMetric extends StObject {
  
  /**
    * The name of the metric.
    */
  var Name: js.UndefOr[CurrentMetricName] = js.native
  
  /**
    * The unit for the metric.
    */
  var Unit: js.UndefOr[typingsSlinky.awsSdk.connectMod.Unit] = js.native
}
object CurrentMetric {
  
  @scala.inline
  def apply(): CurrentMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentMetric]
  }
  
  @scala.inline
  implicit class CurrentMetricMutableBuilder[Self <: CurrentMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: CurrentMetricName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
