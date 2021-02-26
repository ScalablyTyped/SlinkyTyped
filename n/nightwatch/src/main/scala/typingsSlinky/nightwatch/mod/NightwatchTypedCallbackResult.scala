package typingsSlinky.nightwatch.mod

import typingsSlinky.nightwatch.nightwatchNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchTypedCallbackResult[T] extends NightwatchCallbackResult[T] {
  
  var state: js.Error | String = js.native
  
  var status: `0` = js.native
  
  var value: T = js.native
}
object NightwatchTypedCallbackResult {
  
  @scala.inline
  def apply[T](state: js.Error | String, status: `0`, value: T): NightwatchTypedCallbackResult[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTypedCallbackResult[T]]
  }
  
  @scala.inline
  implicit class NightwatchTypedCallbackResultMutableBuilder[Self <: NightwatchTypedCallbackResult[_], T] (val x: Self with NightwatchTypedCallbackResult[T]) extends AnyVal {
    
    @scala.inline
    def setState(value: js.Error | String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateError(value: js.Error): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `0`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
