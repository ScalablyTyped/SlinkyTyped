package typingsSlinky.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.minappEnv.IAPISuccessParam
  - typingsSlinky.minappEnv.IAPIError
*/
trait IAPICompleteParam extends StObject
object IAPICompleteParam {
  
  @scala.inline
  def IAPIError(errMsg: java.lang.String): typingsSlinky.minappEnv.IAPIError = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.minappEnv.IAPIError]
  }
  
  @scala.inline
  def IAPISuccessParam(errMsg: java.lang.String): typingsSlinky.minappEnv.IAPISuccessParam = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.minappEnv.IAPISuccessParam]
  }
}
