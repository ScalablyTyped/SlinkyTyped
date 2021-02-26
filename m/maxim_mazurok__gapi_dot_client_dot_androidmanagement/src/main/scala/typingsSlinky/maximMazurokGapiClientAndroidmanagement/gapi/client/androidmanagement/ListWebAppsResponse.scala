package typingsSlinky.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWebAppsResponse extends StObject {
  
  /** If there are more results, a token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of web apps. */
  var webApps: js.UndefOr[js.Array[WebApp]] = js.native
}
object ListWebAppsResponse {
  
  @scala.inline
  def apply(): ListWebAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebAppsResponse]
  }
  
  @scala.inline
  implicit class ListWebAppsResponseMutableBuilder[Self <: ListWebAppsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setWebApps(value: js.Array[WebApp]): Self = StObject.set(x, "webApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAppsUndefined: Self = StObject.set(x, "webApps", js.undefined)
    
    @scala.inline
    def setWebAppsVarargs(value: WebApp*): Self = StObject.set(x, "webApps", js.Array(value :_*))
  }
}
