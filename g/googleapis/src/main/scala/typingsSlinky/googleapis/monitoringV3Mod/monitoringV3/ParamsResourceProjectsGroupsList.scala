package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsGroupsList extends StandardParameters {
  
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns groups that are ancestors of the specified group. The groups are
    * returned in order, starting with the immediate parent and ending with the
    * most distant ancestor. If the specified group has no immediate parent,
    * the results are empty.
    */
  var ancestorsOfGroup: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns groups whose parentName field contains the group name. If no
    * groups have this parent, the results are empty.
    */
  var childrenOfGroup: js.UndefOr[String] = js.native
  
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns the descendants of the specified group. This is a superset of the
    * results returned by the childrenOfGroup filter, and includes
    * children-of-children, and so forth.
    */
  var descendantsOfGroup: js.UndefOr[String] = js.native
  
  /**
    * The project whose groups are to be listed. The format is
    * "projects/{project_id_or_number}".
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A positive number that is the maximum number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * If this field is not empty then it must contain the nextPageToken value
    * returned by a previous call to this method. Using this field causes the
    * method to return additional results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsGroupsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsGroupsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGroupsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsGroupsListOps[Self <: ParamsResourceProjectsGroupsList] (val x: Self) extends AnyVal {
    
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
    def setAncestorsOfGroup(value: String): Self = this.set("ancestorsOfGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAncestorsOfGroup: Self = this.set("ancestorsOfGroup", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setChildrenOfGroup(value: String): Self = this.set("childrenOfGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildrenOfGroup: Self = this.set("childrenOfGroup", js.undefined)
    
    @scala.inline
    def setDescendantsOfGroup(value: String): Self = this.set("descendantsOfGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescendantsOfGroup: Self = this.set("descendantsOfGroup", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
}
