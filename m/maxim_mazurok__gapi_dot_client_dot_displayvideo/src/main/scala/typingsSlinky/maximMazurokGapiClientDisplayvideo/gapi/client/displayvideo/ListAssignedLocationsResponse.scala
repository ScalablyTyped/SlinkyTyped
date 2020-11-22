package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssignedLocationsResponse extends js.Object {
  
  /** The list of assigned locations. This list will be absent if empty. */
  var assignedLocations: js.UndefOr[js.Array[AssignedLocation]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListAssignedLocations` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAssignedLocationsResponse {
  
  @scala.inline
  def apply(): ListAssignedLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssignedLocationsResponse]
  }
  
  @scala.inline
  implicit class ListAssignedLocationsResponseOps[Self <: ListAssignedLocationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssignedLocationsVarargs(value: AssignedLocation*): Self = this.set("assignedLocations", js.Array(value :_*))
    
    @scala.inline
    def setAssignedLocations(value: js.Array[AssignedLocation]): Self = this.set("assignedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedLocations: Self = this.set("assignedLocations", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
