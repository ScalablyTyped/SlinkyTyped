package typingsSlinky.maximMazurokGapiClientAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityKey extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** The unique ID of the customer to retrieve data for. */
  var customerId: js.UndefOr[String] = js.native
  
  /** Represents the date the usage occurred. The timestamp is in the ISO 8601 format, yyyy-mm-dd. We recommend you use your account's time zone for this. */
  var date: String = js.native
  
  /** Represents the key of the object to filter the data with. */
  var entityKey: String = js.native
  
  /** Represents the type of entity for the report. */
  var entityType: String = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The filters query string is a comma-separated list of an application's event parameters where the parameter's value is manipulated by a relational operator. The filters query
    * string includes the name of the application whose usage is returned in the report. The application values for the Entities usage report include accounts, docs, and gmail.
    * Filters are in the form [application name]:parameter name[parameter value],.... In this example, the <> 'not equal to' operator is URL-encoded in the request's query string
    * (%3C%3E): GET https://www.googleapis.com/admin/reports/v1/usage/gplus_communities/all/dates/2017-12-01 ?parameters=gplus:community_name,gplus:num_total_members
    * &filters=gplus:num_total_members>0 The relational operators include: - == - 'equal to'. - <> - 'not equal to'. It is URL-encoded (%3C%3E). - < - 'less than'. It is URL-encoded
    * (%3C). - <= - 'less than or equal to'. It is URL-encoded (%3C=). - > - 'greater than'. It is URL-encoded (%3E). - >= - 'greater than or equal to'. It is URL-encoded (%3E=).
    * Filters can only be applied to numeric parameters.
    */
  var filters: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Determines how many activity records are shown on each response page. For example, if the request sets maxResults=1 and the report has two activities, the report has two pages.
    * The response's nextPageToken property has the token to the second page.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /**
    * Token to specify next page. A report with multiple pages has a nextPageToken property in the response. In your follow-on request getting the next page of the report, enter the
    * nextPageToken value in the pageToken query string.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The parameters query string is a comma-separated list of event parameters that refine a report's results. The parameter is associated with a specific application. The
    * application values for the Entities usage report are only gplus. A parameter query string is in the CSV form of [app_name1:param_name1], [app_name2:param_name2].... *Note:* The
    * API doesn't accept multiple values of a parameter. If a particular parameter is supplied more than once in the API request, the API only accepts the last value of that request
    * parameter. In addition, if an invalid request parameter is supplied in the API request, the API ignores that request parameter and returns the response corresponding to the
    * remaining valid request parameters. An example of an invalid request parameter is one that does not belong to the application. If no parameters are requested, all parameters are
    * returned.
    */
  var parameters: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object EntityKey {
  
  @scala.inline
  def apply(date: String, entityKey: String, entityType: String): EntityKey = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], entityKey = entityKey.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityKey]
  }
  
  @scala.inline
  implicit class EntityKeyMutableBuilder[Self <: EntityKey] (val x: Self) extends AnyVal {
    
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
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityKey(value: String): Self = StObject.set(x, "entityKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
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
