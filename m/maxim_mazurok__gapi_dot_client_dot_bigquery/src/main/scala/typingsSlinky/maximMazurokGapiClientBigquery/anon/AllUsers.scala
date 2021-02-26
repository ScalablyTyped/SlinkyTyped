package typingsSlinky.maximMazurokGapiClientBigquery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllUsers extends StObject {
  
  /** Whether to display jobs owned by all users in the project. Default false */
  var allUsers: js.UndefOr[Boolean] = js.native
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** Max value for job creation time, in milliseconds since the POSIX epoch. If set, only jobs created before or at this timestamp are returned */
  var maxCreationTime: js.UndefOr[String] = js.native
  
  /** Maximum number of results to return */
  var maxResults: js.UndefOr[Double] = js.native
  
  /** Min value for job creation time, in milliseconds since the POSIX epoch. If set, only jobs created after or at this timestamp are returned */
  var minCreationTime: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Page token, returned by a previous call, to request the next page of results */
  var pageToken: js.UndefOr[String] = js.native
  
  /** If set, retrieves only jobs whose parent is this job. Otherwise, retrieves only jobs which have no parent */
  var parentJobId: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Project ID of the jobs to list */
  var projectId: String = js.native
  
  /** Restrict information returned to a set of selected fields */
  var projection: js.UndefOr[String] = js.native
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Filter for job state */
  var stateFilter: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}
object AllUsers {
  
  @scala.inline
  def apply(projectId: String): AllUsers = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllUsers]
  }
  
  @scala.inline
  implicit class AllUsersMutableBuilder[Self <: AllUsers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllUsers(value: Boolean): Self = StObject.set(x, "allUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUsersUndefined: Self = StObject.set(x, "allUsers", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMaxCreationTime(value: String): Self = StObject.set(x, "maxCreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCreationTimeUndefined: Self = StObject.set(x, "maxCreationTime", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMinCreationTime(value: String): Self = StObject.set(x, "minCreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCreationTimeUndefined: Self = StObject.set(x, "minCreationTime", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParentJobId(value: String): Self = StObject.set(x, "parentJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentJobIdUndefined: Self = StObject.set(x, "parentJobId", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setStateFilter(value: String | js.Array[String]): Self = StObject.set(x, "stateFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateFilterUndefined: Self = StObject.set(x, "stateFilter", js.undefined)
    
    @scala.inline
    def setStateFilterVarargs(value: String*): Self = StObject.set(x, "stateFilter", js.Array(value :_*))
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
