package typingsSlinky.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecretVersionsResponse extends StObject {
  
  /** A token to retrieve the next page of results. Pass this value in ListSecretVersionsRequest.page_token to retrieve the next page. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The total number of SecretVersions. */
  var totalSize: js.UndefOr[Double] = js.native
  
  /** The list of SecretVersions sorted in reverse by create_time (newest first). */
  var versions: js.UndefOr[js.Array[SecretVersion]] = js.native
}
object ListSecretVersionsResponse {
  
  @scala.inline
  def apply(): ListSecretVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecretVersionsResponse]
  }
  
  @scala.inline
  implicit class ListSecretVersionsResponseMutableBuilder[Self <: ListSecretVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[SecretVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: SecretVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
