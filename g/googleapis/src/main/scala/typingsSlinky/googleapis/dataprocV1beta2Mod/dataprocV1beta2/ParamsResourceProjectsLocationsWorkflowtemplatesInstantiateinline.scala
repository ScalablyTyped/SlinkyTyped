package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsWorkflowtemplatesInstantiateinline extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Deprecated. Please use request_id field instead.
    */
  var instanceId: js.UndefOr[String] = js.native
  
  /**
    * Required. The "resource name" of the workflow template region, as
    * described in https://cloud.google.com/apis/design/resource_names of the
    * form projects/{project_id}/regions/{region}
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWorkflowTemplate] = js.native
  
  /**
    * Optional. A tag that prevents multiple concurrent workflow instances with
    * the same tag from running. This mitigates risk of concurrent instances
    * started due to retries.It is recommended to always set this value to a
    * UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The
    * tag must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
    * and hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsWorkflowtemplatesInstantiateinline {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsWorkflowtemplatesInstantiateinline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkflowtemplatesInstantiateinline]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsWorkflowtemplatesInstantiateinlineOps[Self <: ParamsResourceProjectsLocationsWorkflowtemplatesInstantiateinline] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaWorkflowTemplate): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
