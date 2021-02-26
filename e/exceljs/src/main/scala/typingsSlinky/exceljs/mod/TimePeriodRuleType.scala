package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.timePeriod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePeriodRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var timePeriod: js.UndefOr[TimePeriodTypes] = js.native
  
  var `type`: timePeriod = js.native
}
object TimePeriodRuleType {
  
  @scala.inline
  def apply(priority: Double, `type`: timePeriod): TimePeriodRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePeriodRuleType]
  }
  
  @scala.inline
  implicit class TimePeriodRuleTypeMutableBuilder[Self <: TimePeriodRuleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimePeriod(value: TimePeriodTypes): Self = StObject.set(x, "timePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodUndefined: Self = StObject.set(x, "timePeriod", js.undefined)
    
    @scala.inline
    def setType(value: timePeriod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
