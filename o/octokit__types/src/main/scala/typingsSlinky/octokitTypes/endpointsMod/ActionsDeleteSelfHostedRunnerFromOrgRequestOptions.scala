package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.DELETE
import typingsSlinky.octokitTypes.octokitTypesStrings.SlashorgsSlashColonorgSlashactionsSlashrunnersSlashColonrunner_id
import typingsSlinky.octokitTypes.requestHeadersMod.RequestHeaders
import typingsSlinky.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsDeleteSelfHostedRunnerFromOrgRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: DELETE = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: SlashorgsSlashColonorgSlashactionsSlashrunnersSlashColonrunner_id = js.native
}
object ActionsDeleteSelfHostedRunnerFromOrgRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: DELETE,
    request: RequestRequestOptions,
    url: SlashorgsSlashColonorgSlashactionsSlashrunnersSlashColonrunner_id
  ): ActionsDeleteSelfHostedRunnerFromOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDeleteSelfHostedRunnerFromOrgRequestOptions]
  }
  
  @scala.inline
  implicit class ActionsDeleteSelfHostedRunnerFromOrgRequestOptionsMutableBuilder[Self <: ActionsDeleteSelfHostedRunnerFromOrgRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashorgsSlashColonorgSlashactionsSlashrunnersSlashColonrunner_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
