package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.PUT
import typingsSlinky.octokitTypes.octokitTypesStrings.SlashteamsSlashColonteam_idSlashprojectsSlashColonproject_id
import typingsSlinky.octokitTypes.requestHeadersMod.RequestHeaders
import typingsSlinky.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: PUT = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: SlashteamsSlashColonteam_idSlashprojectsSlashColonproject_id = js.native
}
object TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PUT,
    request: RequestRequestOptions,
    url: SlashteamsSlashColonteam_idSlashprojectsSlashColonproject_id
  ): TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions]
  }
  
  @scala.inline
  implicit class TeamsAddOrUpdateProjectPermissionsLegacyRequestOptionsMutableBuilder[Self <: TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashteamsSlashColonteam_idSlashprojectsSlashColonproject_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
