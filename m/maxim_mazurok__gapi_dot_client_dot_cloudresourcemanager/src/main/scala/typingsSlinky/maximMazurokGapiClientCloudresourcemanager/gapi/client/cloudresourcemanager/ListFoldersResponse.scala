package typingsSlinky.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFoldersResponse extends StObject {
  
  /** A possibly paginated list of Folders that are direct descendants of the specified parent resource. */
  var folders: js.UndefOr[js.Array[Folder]] = js.native
  
  /** A pagination token returned from a previous call to `ListFolders` that indicates from where listing should continue. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListFoldersResponse {
  
  @scala.inline
  def apply(): ListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFoldersResponse]
  }
  
  @scala.inline
  implicit class ListFoldersResponseMutableBuilder[Self <: ListFoldersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolders(value: js.Array[Folder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: Folder*): Self = StObject.set(x, "folders", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
