package typingsSlinky.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVersionsResponse extends StObject {
  
  /** The token use to fetch the next page of records. if not exist in the response, that means no more versions to list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of versions. */
  var versions: js.UndefOr[js.Array[Version]] = js.native
}
object ListVersionsResponse {
  
  @scala.inline
  def apply(): ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVersionsResponse]
  }
  
  @scala.inline
  implicit class ListVersionsResponseMutableBuilder[Self <: ListVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[Version]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: Version*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
