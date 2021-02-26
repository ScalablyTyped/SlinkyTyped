package typingsSlinky.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListListenersResponse extends StObject {
  
  /**
    * The list of listeners for an accelerator.
    */
  var Listeners: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.Listeners] = js.native
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}
object ListListenersResponse {
  
  @scala.inline
  def apply(): ListListenersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListListenersResponse]
  }
  
  @scala.inline
  implicit class ListListenersResponseMutableBuilder[Self <: ListListenersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListeners(value: Listeners): Self = StObject.set(x, "Listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersUndefined: Self = StObject.set(x, "Listeners", js.undefined)
    
    @scala.inline
    def setListenersVarargs(value: Listener*): Self = StObject.set(x, "Listeners", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
