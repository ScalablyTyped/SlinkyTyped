package typingsSlinky.maximMazurokGapiClientScript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alt extends StObject {
  
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
  
  /** The script ID of the project whose processes are listed. */
  var scriptId: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those originating from projects with a specific deployment ID. */
  @JSName("scriptProcessFilter.deploymentId")
  var scriptProcessFilterDotdeploymentId: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those that completed on or before the given timestamp. */
  @JSName("scriptProcessFilter.endTime")
  var scriptProcessFilterDotendTime: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those originating from a script function with the given function name. */
  @JSName("scriptProcessFilter.functionName")
  var scriptProcessFilterDotfunctionName: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those that were started on or after the given timestamp. */
  @JSName("scriptProcessFilter.startTime")
  var scriptProcessFilterDotstartTime: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those having one of the specified process statuses. */
  @JSName("scriptProcessFilter.statuses")
  var scriptProcessFilterDotstatuses: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Optional field used to limit returned processes to those having one of the specified process types. */
  @JSName("scriptProcessFilter.types")
  var scriptProcessFilterDottypes: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Optional field used to limit returned processes to those having one of the specified user access levels. */
  @JSName("scriptProcessFilter.userAccessLevels")
  var scriptProcessFilterDotuserAccessLevels: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object Alt {
  
  @scala.inline
  def apply(): Alt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alt]
  }
  
  @scala.inline
  implicit class AltMutableBuilder[Self <: Alt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotdeploymentId(value: String): Self = StObject.set(x, "scriptProcessFilter.deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDotdeploymentIdUndefined: Self = StObject.set(x, "scriptProcessFilter.deploymentId", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotendTime(value: String): Self = StObject.set(x, "scriptProcessFilter.endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDotendTimeUndefined: Self = StObject.set(x, "scriptProcessFilter.endTime", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotfunctionName(value: String): Self = StObject.set(x, "scriptProcessFilter.functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDotfunctionNameUndefined: Self = StObject.set(x, "scriptProcessFilter.functionName", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotstartTime(value: String): Self = StObject.set(x, "scriptProcessFilter.startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDotstartTimeUndefined: Self = StObject.set(x, "scriptProcessFilter.startTime", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotstatuses(value: String | js.Array[String]): Self = StObject.set(x, "scriptProcessFilter.statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDotstatusesUndefined: Self = StObject.set(x, "scriptProcessFilter.statuses", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotstatusesVarargs(value: String*): Self = StObject.set(x, "scriptProcessFilter.statuses", js.Array(value :_*))
    
    @scala.inline
    def setScriptProcessFilterDottypes(value: String | js.Array[String]): Self = StObject.set(x, "scriptProcessFilter.types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDottypesUndefined: Self = StObject.set(x, "scriptProcessFilter.types", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDottypesVarargs(value: String*): Self = StObject.set(x, "scriptProcessFilter.types", js.Array(value :_*))
    
    @scala.inline
    def setScriptProcessFilterDotuserAccessLevels(value: String | js.Array[String]): Self = StObject.set(x, "scriptProcessFilter.userAccessLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptProcessFilterDotuserAccessLevelsUndefined: Self = StObject.set(x, "scriptProcessFilter.userAccessLevels", js.undefined)
    
    @scala.inline
    def setScriptProcessFilterDotuserAccessLevelsVarargs(value: String*): Self = StObject.set(x, "scriptProcessFilter.userAccessLevels", js.Array(value :_*))
    
    @scala.inline
    def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
  }
}
