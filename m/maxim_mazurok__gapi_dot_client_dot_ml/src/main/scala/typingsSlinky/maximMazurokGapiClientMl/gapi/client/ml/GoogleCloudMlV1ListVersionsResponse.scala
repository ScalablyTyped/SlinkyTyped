package typingsSlinky.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1ListVersionsResponse extends StObject {
  
  /** Optional. Pass this token as the `page_token` field of the request for a subsequent call. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of versions. */
  var versions: js.UndefOr[js.Array[GoogleCloudMlV1Version]] = js.native
}
object GoogleCloudMlV1ListVersionsResponse {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ListVersionsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ListVersionsResponseMutableBuilder[Self <: GoogleCloudMlV1ListVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[GoogleCloudMlV1Version]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: GoogleCloudMlV1Version*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
