package typingsSlinky.nightwatch.mod

import typingsSlinky.nightwatch.anon.Class
import typingsSlinky.nightwatch.nightwatchNumbers.`0`
import typingsSlinky.nightwatch.nightwatchNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nightwatch.mod.NightwatchTypedCallbackResult[T]
  - typingsSlinky.nightwatch.mod.NightwatchCallbackResultError
*/
trait NightwatchCallbackResult[T] extends StObject
object NightwatchCallbackResult {
  
  @scala.inline
  def NightwatchCallbackResultError(state: js.Error | String, status: `1`, value: Class): typingsSlinky.nightwatch.mod.NightwatchCallbackResultError = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nightwatch.mod.NightwatchCallbackResultError]
  }
  
  @scala.inline
  def NightwatchTypedCallbackResult[T](state: js.Error | String, status: `0`, value: T): typingsSlinky.nightwatch.mod.NightwatchTypedCallbackResult[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nightwatch.mod.NightwatchTypedCallbackResult[T]]
  }
}
