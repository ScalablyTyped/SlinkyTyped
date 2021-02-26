package typingsSlinky.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleFile extends StObject {
  
  var ruleFile: js.UndefOr[String] = js.native
  
  var rules: js.UndefOr[typingsSlinky.matrixAppserviceBridge.roomLinkValidatorMod.Rules] = js.native
  
  var triggerEndpoint: js.UndefOr[Boolean] = js.native
}
object RuleFile {
  
  @scala.inline
  def apply(): RuleFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleFile]
  }
  
  @scala.inline
  implicit class RuleFileMutableBuilder[Self <: RuleFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleFile(value: String): Self = StObject.set(x, "ruleFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleFileUndefined: Self = StObject.set(x, "ruleFile", js.undefined)
    
    @scala.inline
    def setRules(value: typingsSlinky.matrixAppserviceBridge.roomLinkValidatorMod.Rules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setTriggerEndpoint(value: Boolean): Self = StObject.set(x, "triggerEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerEndpointUndefined: Self = StObject.set(x, "triggerEndpoint", js.undefined)
  }
}
