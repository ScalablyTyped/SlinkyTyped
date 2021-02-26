package typingsSlinky.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricDimension extends StObject {
  
  /**
    * The name of the dimension.
    */
  var Name: MetricDimensionName = js.native
  
  /**
    * The value of the dimension.
    */
  var Value: MetricDimensionValue = js.native
}
object MetricDimension {
  
  @scala.inline
  def apply(Name: MetricDimensionName, Value: MetricDimensionValue): MetricDimension = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDimension]
  }
  
  @scala.inline
  implicit class MetricDimensionMutableBuilder[Self <: MetricDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: MetricDimensionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: MetricDimensionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
