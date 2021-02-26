package typingsSlinky.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDirectoryPeopleResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A token, which can be sent as `sync_token` to retrieve changes since the last request. Request must set `request_sync_token` to return the sync token. */
  var nextSyncToken: js.UndefOr[String] = js.native
  
  /** The list of people in the domain directory. */
  var people: js.UndefOr[js.Array[Person]] = js.native
}
object ListDirectoryPeopleResponse {
  
  @scala.inline
  def apply(): ListDirectoryPeopleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDirectoryPeopleResponse]
  }
  
  @scala.inline
  implicit class ListDirectoryPeopleResponseMutableBuilder[Self <: ListDirectoryPeopleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
    
    @scala.inline
    def setPeople(value: js.Array[Person]): Self = StObject.set(x, "people", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeopleUndefined: Self = StObject.set(x, "people", js.undefined)
    
    @scala.inline
    def setPeopleVarargs(value: Person*): Self = StObject.set(x, "people", js.Array(value :_*))
  }
}
