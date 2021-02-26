package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends StObject {
  
  /**
    * The detector for which the rule is associated.
    */
  var detectorId: identifier = js.native
  
  /**
    * The rule ID.
    */
  var ruleId: identifier = js.native
  
  /**
    * The rule version.
    */
  var ruleVersion: wholeNumberVersionString = js.native
}
object Rule {
  
  @scala.inline
  def apply(detectorId: identifier, ruleId: identifier, ruleVersion: wholeNumberVersionString): Rule = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], ruleVersion = ruleVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleId(value: identifier): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVersion(value: wholeNumberVersionString): Self = StObject.set(x, "ruleVersion", value.asInstanceOf[js.Any])
  }
}
