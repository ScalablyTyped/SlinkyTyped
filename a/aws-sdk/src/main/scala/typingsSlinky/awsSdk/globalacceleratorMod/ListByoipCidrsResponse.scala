package typingsSlinky.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListByoipCidrsResponse extends StObject {
  
  /**
    * Information about your address ranges.
    */
  var ByoipCidrs: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.ByoipCidrs] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}
object ListByoipCidrsResponse {
  
  @scala.inline
  def apply(): ListByoipCidrsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListByoipCidrsResponse]
  }
  
  @scala.inline
  implicit class ListByoipCidrsResponseMutableBuilder[Self <: ListByoipCidrsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByoipCidrs(value: ByoipCidrs): Self = StObject.set(x, "ByoipCidrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByoipCidrsUndefined: Self = StObject.set(x, "ByoipCidrs", js.undefined)
    
    @scala.inline
    def setByoipCidrsVarargs(value: ByoipCidr*): Self = StObject.set(x, "ByoipCidrs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
