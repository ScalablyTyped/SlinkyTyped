package typingsSlinky.maximMazurokGapiClientScript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accesstoken extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** The maximum number of returned processes per page of results. Defaults to 50. */
  var pageSize: js.UndefOr[Double] = js.native
  
  /** The token for continuing a previous list request on the next page. This should be set to the value of `nextPageToken` from a previous response. */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those originating from projects with a specific deployment ID. */
  @JSName("userProcessFilter.deploymentId")
  var userProcessFilterDotdeploymentId: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those that completed on or before the given timestamp. */
  @JSName("userProcessFilter.endTime")
  var userProcessFilterDotendTime: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those originating from a script function with the given function name. */
  @JSName("userProcessFilter.functionName")
  var userProcessFilterDotfunctionName: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those originating from projects with project names containing a specific string. */
  @JSName("userProcessFilter.projectName")
  var userProcessFilterDotprojectName: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those originating from projects with a specific script ID. */
  @JSName("userProcessFilter.scriptId")
  var userProcessFilterDotscriptId: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those that were started on or after the given timestamp. */
  @JSName("userProcessFilter.startTime")
  var userProcessFilterDotstartTime: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those having one of the specified process statuses. */
  @JSName("userProcessFilter.statuses")
  var userProcessFilterDotstatuses: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Optional field used to limit returned processes to those having one of the specified process types. */
  @JSName("userProcessFilter.types")
  var userProcessFilterDottypes: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Optional field used to limit returned processes to those having one of the specified user access levels. */
  @JSName("userProcessFilter.userAccessLevels")
  var userProcessFilterDotuserAccessLevels: js.UndefOr[String | js.Array[String]] = js.native
}
object Accesstoken {
  
  @scala.inline
  def apply(): Accesstoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accesstoken]
  }
  
  @scala.inline
  implicit class AccesstokenOps[Self <: Accesstoken] (val x: Self) extends AnyVal {
    
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
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotdeploymentId(value: String): Self = this.set("userProcessFilter.deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotdeploymentId: Self = this.set("userProcessFilter.deploymentId", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotendTime(value: String): Self = this.set("userProcessFilter.endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotendTime: Self = this.set("userProcessFilter.endTime", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotfunctionName(value: String): Self = this.set("userProcessFilter.functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotfunctionName: Self = this.set("userProcessFilter.functionName", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotprojectName(value: String): Self = this.set("userProcessFilter.projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotprojectName: Self = this.set("userProcessFilter.projectName", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotscriptId(value: String): Self = this.set("userProcessFilter.scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotscriptId: Self = this.set("userProcessFilter.scriptId", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotstartTime(value: String): Self = this.set("userProcessFilter.startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotstartTime: Self = this.set("userProcessFilter.startTime", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotstatusesVarargs(value: String*): Self = this.set("userProcessFilter.statuses", js.Array(value :_*))
    
    @scala.inline
    def setUserProcessFilterDotstatuses(value: String | js.Array[String]): Self = this.set("userProcessFilter.statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotstatuses: Self = this.set("userProcessFilter.statuses", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDottypesVarargs(value: String*): Self = this.set("userProcessFilter.types", js.Array(value :_*))
    
    @scala.inline
    def setUserProcessFilterDottypes(value: String | js.Array[String]): Self = this.set("userProcessFilter.types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDottypes: Self = this.set("userProcessFilter.types", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotuserAccessLevelsVarargs(value: String*): Self = this.set("userProcessFilter.userAccessLevels", js.Array(value :_*))
    
    @scala.inline
    def setUserProcessFilterDotuserAccessLevels(value: String | js.Array[String]): Self = this.set("userProcessFilter.userAccessLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProcessFilterDotuserAccessLevels: Self = this.set("userProcessFilter.userAccessLevels", js.undefined)
  }
}
