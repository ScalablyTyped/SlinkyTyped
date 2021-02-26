package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricDimension extends StObject {
  
  /**
    * The operator to use when comparing metric values. Valid values are: GREATER_THAN, LESS_THAN, GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, and EQUAL.
    */
  var ComparisonOperator: string = js.native
  
  /**
    * The value to compare.
    */
  var Value: double = js.native
}
object MetricDimension {
  
  @scala.inline
  def apply(ComparisonOperator: string, Value: double): MetricDimension = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDimension]
  }
  
  @scala.inline
  implicit class MetricDimensionMutableBuilder[Self <: MetricDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonOperator(value: string): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
