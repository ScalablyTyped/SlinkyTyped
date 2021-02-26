package typingsSlinky.pulumiAws.inputMod.wafregional

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulePredicate extends StObject {
  
  var dataId: Input[String] = js.native
  
  var negated: Input[Boolean] = js.native
  
  var `type`: Input[String] = js.native
}
object RulePredicate {
  
  @scala.inline
  def apply(dataId: Input[String], negated: Input[Boolean], `type`: Input[String]): RulePredicate = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulePredicate]
  }
  
  @scala.inline
  implicit class RulePredicateMutableBuilder[Self <: RulePredicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataId(value: Input[String]): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegated(value: Input[Boolean]): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
