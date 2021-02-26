package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformation extends StObject {
  
  /**
    * The relative processing order for multiple transformations that are defined for a rule statement. AWS WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content.
    */
  var priority: Input[Double] = js.native
  
  /**
    * The transformation to apply, you can specify the following types: `NONE`, `COMPRESS_WHITE_SPACE`, `HTML_ENTITY_DECODE`, `LOWERCASE`, `CMD_LINE`, `URL_DECODE`. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_TextTransformation.html) for more details.
    */
  var `type`: Input[String] = js.native
}
object RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformation {
  
  @scala.inline
  def apply(priority: Input[Double], `type`: Input[String]): RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformation = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformation]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformationMutableBuilder[Self <: RuleGroupRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
