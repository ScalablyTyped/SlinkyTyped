package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.containsText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainsTextRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var operator: js.UndefOr[ContainsTextOperators] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var `type`: containsText = js.native
}
object ContainsTextRuleType {
  
  @scala.inline
  def apply(priority: Double, `type`: containsText): ContainsTextRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsTextRuleType]
  }
  
  @scala.inline
  implicit class ContainsTextRuleTypeMutableBuilder[Self <: ContainsTextRuleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperator(value: ContainsTextOperators): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: containsText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
