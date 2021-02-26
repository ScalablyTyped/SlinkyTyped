package typingsSlinky.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.definitionsMod.APIResponseSuccess
  - typingsSlinky.ionic.definitionsMod.APIResponseError
*/
trait APIResponse extends StObject
object APIResponse {
  
  @scala.inline
  def APIResponseError(error: APIResponseErrorError, meta: APIResponseMeta): typingsSlinky.ionic.definitionsMod.APIResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionic.definitionsMod.APIResponseError]
  }
  
  @scala.inline
  def APIResponseSuccess(data: APIResponseData, meta: APIResponseMeta): typingsSlinky.ionic.definitionsMod.APIResponseSuccess = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionic.definitionsMod.APIResponseSuccess]
  }
}
