package typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchOrganizationsResponse extends js.Object {
  
  /**
    * A pagination token to be used to retrieve the next page of results. If the
    * result is too large to fit within the page size specified in the request,
    * this field will be set with a token that can be used to fetch the next page
    * of results. If this field is empty, it indicates that this response
    * contains the last page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of Organizations that matched the search query, possibly
    * paginated.
    */
  var organizations: js.UndefOr[js.Array[Organization]] = js.native
}
object SearchOrganizationsResponse {
  
  @scala.inline
  def apply(): SearchOrganizationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOrganizationsResponse]
  }
  
  @scala.inline
  implicit class SearchOrganizationsResponseOps[Self <: SearchOrganizationsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setOrganizationsVarargs(value: Organization*): Self = this.set("organizations", js.Array(value :_*))
    
    @scala.inline
    def setOrganizations(value: js.Array[Organization]): Self = this.set("organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizations: Self = this.set("organizations", js.undefined)
  }
}
