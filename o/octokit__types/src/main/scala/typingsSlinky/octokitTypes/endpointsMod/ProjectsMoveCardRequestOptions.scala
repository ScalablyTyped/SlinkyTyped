package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.POST
import typingsSlinky.octokitTypes.octokitTypesStrings.SlashprojectsSlashcolumnsSlashcardsSlashColoncard_idSlashmoves
import typingsSlinky.octokitTypes.requestHeadersMod.RequestHeaders
import typingsSlinky.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsMoveCardRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: POST = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: SlashprojectsSlashcolumnsSlashcardsSlashColoncard_idSlashmoves = js.native
}
object ProjectsMoveCardRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: POST,
    request: RequestRequestOptions,
    url: SlashprojectsSlashcolumnsSlashcardsSlashColoncard_idSlashmoves
  ): ProjectsMoveCardRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsMoveCardRequestOptions]
  }
  
  @scala.inline
  implicit class ProjectsMoveCardRequestOptionsMutableBuilder[Self <: ProjectsMoveCardRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashprojectsSlashcolumnsSlashcardsSlashColoncard_idSlashmoves): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
