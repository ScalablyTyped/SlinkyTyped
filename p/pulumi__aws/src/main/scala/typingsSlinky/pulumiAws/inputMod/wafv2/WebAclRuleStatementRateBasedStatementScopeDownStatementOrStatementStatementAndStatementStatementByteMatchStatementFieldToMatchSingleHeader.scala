package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader extends StObject {
  
  /**
    * The name of the query header to inspect. This setting must be provided as lower case characters.
    */
  var name: Input[String] = js.native
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader {
  
  @scala.inline
  def apply(name: Input[String]): WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderMutableBuilder[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
