package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.PUT
import typingsSlinky.octokitTypes.octokitTypesStrings.Slashnotifications
import typingsSlinky.octokitTypes.requestHeadersMod.RequestHeaders
import typingsSlinky.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityMarkNotificationsAsReadRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: PUT = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: Slashnotifications = js.native
}
object ActivityMarkNotificationsAsReadRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, method: PUT, request: RequestRequestOptions, url: Slashnotifications): ActivityMarkNotificationsAsReadRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityMarkNotificationsAsReadRequestOptions]
  }
  
  @scala.inline
  implicit class ActivityMarkNotificationsAsReadRequestOptionsMutableBuilder[Self <: ActivityMarkNotificationsAsReadRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: Slashnotifications): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
