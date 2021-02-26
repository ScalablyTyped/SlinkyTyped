package typingsSlinky.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCostCategoryDefinitionRequest extends StObject {
  
  var Name: CostCategoryName = js.native
  
  var RuleVersion: CostCategoryRuleVersion = js.native
  
  /**
    * The Cost Category rules used to categorize costs. For more information, see CostCategoryRule.
    */
  var Rules: CostCategoryRulesList = js.native
}
object CreateCostCategoryDefinitionRequest {
  
  @scala.inline
  def apply(Name: CostCategoryName, RuleVersion: CostCategoryRuleVersion, Rules: CostCategoryRulesList): CreateCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RuleVersion = RuleVersion.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCostCategoryDefinitionRequest]
  }
  
  @scala.inline
  implicit class CreateCostCategoryDefinitionRequestMutableBuilder[Self <: CreateCostCategoryDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: CostCategoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVersion(value: CostCategoryRuleVersion): Self = StObject.set(x, "RuleVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: CostCategoryRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: CostCategoryRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
