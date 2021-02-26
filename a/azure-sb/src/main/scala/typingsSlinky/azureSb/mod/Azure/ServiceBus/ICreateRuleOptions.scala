package typingsSlinky.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICreateRuleOptions extends StObject {
  
  var correlationIdFilter: String = js.native
  
  var falseFilter: String = js.native
  
  var sqlExpressionFilter: String = js.native
  
  var sqlRuleAction: String = js.native
  
  var trueFilter: String = js.native
}
object ICreateRuleOptions {
  
  @scala.inline
  def apply(
    correlationIdFilter: String,
    falseFilter: String,
    sqlExpressionFilter: String,
    sqlRuleAction: String,
    trueFilter: String
  ): ICreateRuleOptions = {
    val __obj = js.Dynamic.literal(correlationIdFilter = correlationIdFilter.asInstanceOf[js.Any], falseFilter = falseFilter.asInstanceOf[js.Any], sqlExpressionFilter = sqlExpressionFilter.asInstanceOf[js.Any], sqlRuleAction = sqlRuleAction.asInstanceOf[js.Any], trueFilter = trueFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateRuleOptions]
  }
  
  @scala.inline
  implicit class ICreateRuleOptionsMutableBuilder[Self <: ICreateRuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrelationIdFilter(value: String): Self = StObject.set(x, "correlationIdFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalseFilter(value: String): Self = StObject.set(x, "falseFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlExpressionFilter(value: String): Self = StObject.set(x, "sqlExpressionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlRuleAction(value: String): Self = StObject.set(x, "sqlRuleAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueFilter(value: String): Self = StObject.set(x, "trueFilter", value.asInstanceOf[js.Any])
  }
}
