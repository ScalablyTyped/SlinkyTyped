package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.POST
import typingsSlinky.octokitTypes.octokitTypesStrings.SlashorgsSlashColonorgSlashhooksSlashColonhook_idSlashpings
import typingsSlinky.octokitTypes.requestHeadersMod.RequestHeaders
import typingsSlinky.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsPingWebhookRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: POST = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: SlashorgsSlashColonorgSlashhooksSlashColonhook_idSlashpings = js.native
}
object OrgsPingWebhookRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: POST,
    request: RequestRequestOptions,
    url: SlashorgsSlashColonorgSlashhooksSlashColonhook_idSlashpings
  ): OrgsPingWebhookRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsPingWebhookRequestOptions]
  }
  
  @scala.inline
  implicit class OrgsPingWebhookRequestOptionsMutableBuilder[Self <: OrgsPingWebhookRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashorgsSlashColonorgSlashhooksSlashColonhook_idSlashpings): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
