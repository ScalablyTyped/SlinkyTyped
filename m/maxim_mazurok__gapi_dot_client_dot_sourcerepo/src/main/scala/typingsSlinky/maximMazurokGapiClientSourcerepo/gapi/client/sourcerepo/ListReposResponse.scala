package typingsSlinky.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReposResponse extends StObject {
  
  /** If non-empty, additional repositories exist within the project. These can be retrieved by including this value in the next ListReposRequest's page_token field. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The listed repos. */
  var repos: js.UndefOr[js.Array[Repo]] = js.native
}
object ListReposResponse {
  
  @scala.inline
  def apply(): ListReposResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReposResponse]
  }
  
  @scala.inline
  implicit class ListReposResponseMutableBuilder[Self <: ListReposResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRepos(value: js.Array[Repo]): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReposUndefined: Self = StObject.set(x, "repos", js.undefined)
    
    @scala.inline
    def setReposVarargs(value: Repo*): Self = StObject.set(x, "repos", js.Array(value :_*))
  }
}
