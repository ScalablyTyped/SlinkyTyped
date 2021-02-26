package typingsSlinky.nextServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  var error: js.UndefOr[js.Error | Null] = js.native
  
  var isLoading: js.UndefOr[Boolean] = js.native
  
  var pastDelay: js.UndefOr[Boolean] = js.native
  
  var timedOut: js.UndefOr[Boolean] = js.native
}
object Error {
  
  @scala.inline
  def apply(): Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    @scala.inline
    def setPastDelay(value: Boolean): Self = StObject.set(x, "pastDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPastDelayUndefined: Self = StObject.set(x, "pastDelay", js.undefined)
    
    @scala.inline
    def setTimedOut(value: Boolean): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedOutUndefined: Self = StObject.set(x, "timedOut", js.undefined)
  }
}
