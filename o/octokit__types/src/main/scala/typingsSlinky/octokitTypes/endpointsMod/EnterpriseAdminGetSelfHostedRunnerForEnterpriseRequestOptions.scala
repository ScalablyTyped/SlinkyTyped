package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.GET
import typingsSlinky.octokitTypes.octokitTypesStrings.SlashenterprisesSlashColonenterpriseSlashactionsSlashrunnersSlashColonrunner_id
import typingsSlinky.octokitTypes.requestHeadersMod.RequestHeaders
import typingsSlinky.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: GET = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: SlashenterprisesSlashColonenterpriseSlashactionsSlashrunnersSlashColonrunner_id = js.native
}
object EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: GET,
    request: RequestRequestOptions,
    url: SlashenterprisesSlashColonenterpriseSlashactionsSlashrunnersSlashColonrunner_id
  ): EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptions]
  }
  
  @scala.inline
  implicit class EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptionsMutableBuilder[Self <: EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashenterprisesSlashColonenterpriseSlashactionsSlashrunnersSlashColonrunner_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
