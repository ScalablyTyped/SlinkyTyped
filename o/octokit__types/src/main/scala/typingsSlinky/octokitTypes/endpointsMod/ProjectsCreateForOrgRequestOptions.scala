package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.POST
import typingsSlinky.octokitTypes.octokitTypesStrings.SlashorgsSlashColonorgSlashprojects
import typingsSlinky.octokitTypes.requestHeadersMod.RequestHeaders
import typingsSlinky.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsCreateForOrgRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: POST = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: SlashorgsSlashColonorgSlashprojects = js.native
}
object ProjectsCreateForOrgRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: POST,
    request: RequestRequestOptions,
    url: SlashorgsSlashColonorgSlashprojects
  ): ProjectsCreateForOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForOrgRequestOptions]
  }
  
  @scala.inline
  implicit class ProjectsCreateForOrgRequestOptionsMutableBuilder[Self <: ProjectsCreateForOrgRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashorgsSlashColonorgSlashprojects): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
