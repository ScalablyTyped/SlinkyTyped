package typingsSlinky.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIPSetResponse extends StObject {
  
  /**
    * High-level information about an IPSet, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage an IPSet, and the ARN, that you provide to the IPSetReferenceStatement to use the address set in a Rule.
    */
  var Summary: js.UndefOr[IPSetSummary] = js.native
}
object CreateIPSetResponse {
  
  @scala.inline
  def apply(): CreateIPSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIPSetResponse]
  }
  
  @scala.inline
  implicit class CreateIPSetResponseMutableBuilder[Self <: CreateIPSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSummary(value: IPSetSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "Summary", js.undefined)
  }
}
