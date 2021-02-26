package typingsSlinky.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepositoriesResponse extends StObject {
  
  /** The token to retrieve the next page of repositories, or empty if there are no more repositories to return. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The repositories returned. */
  var repositories: js.UndefOr[js.Array[Repository]] = js.native
}
object ListRepositoriesResponse {
  
  @scala.inline
  def apply(): ListRepositoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesResponse]
  }
  
  @scala.inline
  implicit class ListRepositoriesResponseMutableBuilder[Self <: ListRepositoriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRepositories(value: js.Array[Repository]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    @scala.inline
    def setRepositoriesVarargs(value: Repository*): Self = StObject.set(x, "repositories", js.Array(value :_*))
  }
}
