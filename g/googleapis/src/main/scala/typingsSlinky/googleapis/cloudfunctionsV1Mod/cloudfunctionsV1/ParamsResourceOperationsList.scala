package typingsSlinky.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOperationsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required. A filter for matching the requested operations.<br><br> The
    * supported formats of <b>filter</b> are:<br> To query for specific
    * function: <code>project:*,location:*,function:*</code><br> To query for
    * all of the latest operations for a project:
    * <code>project:*,latest:true</code>
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Must not be set.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The standard list page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The standard list page token.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceOperationsList {
  
  @scala.inline
  def apply(): ParamsResourceOperationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOperationsList]
  }
  
  @scala.inline
  implicit class ParamsResourceOperationsListOps[Self <: ParamsResourceOperationsList] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
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
