package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader extends StObject {
  
  /**
    * The name of the query header to inspect. This setting must be provided as lower case characters.
    */
  var name: Input[String] = js.native
}
object WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader {
  
  @scala.inline
  def apply(name: Input[String]): WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderMutableBuilder[Self <: WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
