package typingsSlinky.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TotalImpactFilter extends StObject {
  
  /**
    *  The upper bound dollar value used in the filter. 
    */
  var EndValue: js.UndefOr[GenericDouble] = js.native
  
  /**
    *  The comparing value used in the filter. 
    */
  var NumericOperator: typingsSlinky.awsSdk.costexplorerMod.NumericOperator = js.native
  
  /**
    *  The lower bound dollar value used in the filter. 
    */
  var StartValue: GenericDouble = js.native
}
object TotalImpactFilter {
  
  @scala.inline
  def apply(NumericOperator: NumericOperator, StartValue: GenericDouble): TotalImpactFilter = {
    val __obj = js.Dynamic.literal(NumericOperator = NumericOperator.asInstanceOf[js.Any], StartValue = StartValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalImpactFilter]
  }
  
  @scala.inline
  implicit class TotalImpactFilterMutableBuilder[Self <: TotalImpactFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndValue(value: GenericDouble): Self = StObject.set(x, "EndValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndValueUndefined: Self = StObject.set(x, "EndValue", js.undefined)
    
    @scala.inline
    def setNumericOperator(value: NumericOperator): Self = StObject.set(x, "NumericOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValue(value: GenericDouble): Self = StObject.set(x, "StartValue", value.asInstanceOf[js.Any])
  }
}
