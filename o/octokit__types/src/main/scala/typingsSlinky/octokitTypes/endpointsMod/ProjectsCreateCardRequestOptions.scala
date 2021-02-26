package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.POST
import typingsSlinky.octokitTypes.octokitTypesStrings.SlashprojectsSlashcolumnsSlashColoncolumn_idSlashcards
import typingsSlinky.octokitTypes.requestHeadersMod.RequestHeaders
import typingsSlinky.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsCreateCardRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: POST = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: SlashprojectsSlashcolumnsSlashColoncolumn_idSlashcards = js.native
}
object ProjectsCreateCardRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: POST,
    request: RequestRequestOptions,
    url: SlashprojectsSlashcolumnsSlashColoncolumn_idSlashcards
  ): ProjectsCreateCardRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateCardRequestOptions]
  }
  
  @scala.inline
  implicit class ProjectsCreateCardRequestOptionsMutableBuilder[Self <: ProjectsCreateCardRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashprojectsSlashcolumnsSlashColoncolumn_idSlashcards): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
