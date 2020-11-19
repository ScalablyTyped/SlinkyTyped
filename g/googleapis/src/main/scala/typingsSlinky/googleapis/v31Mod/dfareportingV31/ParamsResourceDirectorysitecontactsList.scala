package typingsSlinky.googleapis.v31Mod.dfareportingV31

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDirectorysitecontactsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Select only directory site contacts with these directory site IDs. This
    * is a required field.
    */
  var directorySiteIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only directory site contacts with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  
  /**
    * Allows searching for objects by name, ID or email. Wildcards (*) are
    * allowed. For example, "directory site contact*2015" will return objects
    * with names like "directory site contact June 2015", "directory site
    * contact April 2015", or simply "directory site contact 2015". Most of the
    * searches also add wildcards implicitly at the start and the end of the
    * search string. For example, a search string of "directory site contact"
    * will match objects with name "my directory site contact", "directory site
    * contact 2015", or simply "directory site contact".
    */
  var searchString: js.UndefOr[String] = js.native
  
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.native
  
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.native
}
object ParamsResourceDirectorysitecontactsList {
  
  @scala.inline
  def apply(): ParamsResourceDirectorysitecontactsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDirectorysitecontactsList]
  }
  
  @scala.inline
  implicit class ParamsResourceDirectorysitecontactsListOps[Self <: ParamsResourceDirectorysitecontactsList] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setDirectorySiteIdsVarargs(value: String*): Self = this.set("directorySiteIds", js.Array(value :_*))
    
    @scala.inline
    def setDirectorySiteIds(value: js.Array[String]): Self = this.set("directorySiteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectorySiteIds: Self = this.set("directorySiteIds", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
    
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
}
