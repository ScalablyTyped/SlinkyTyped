package typingsSlinky.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteArchiveRuleRequest extends StObject {
  
  /**
    * The name of the analyzer that associated with the archive rule to delete.
    */
  var analyzerName: Name = js.native
  
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the rule to delete.
    */
  var ruleName: Name = js.native
}
object DeleteArchiveRuleRequest {
  
  @scala.inline
  def apply(analyzerName: Name, ruleName: Name): DeleteArchiveRuleRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteArchiveRuleRequest]
  }
  
  @scala.inline
  implicit class DeleteArchiveRuleRequestMutableBuilder[Self <: DeleteArchiveRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzerName(value: Name): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setRuleName(value: Name): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
