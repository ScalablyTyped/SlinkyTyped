package typingsSlinky.gapiClientPartners.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompanyName extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /**
    * The address to use when searching for companies.
    * If not given, the geo-located address of the request is used.
    */
  var address: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** Company name to search for. */
  var companyName: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** List of reasons for using Google Partner Search to get companies. */
  var gpsMotivations: js.UndefOr[String] = js.native
  
  /** List of industries the company can help with. */
  var industries: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /**
    * List of language codes that company can support. Only primary language
    * subtags are accepted as defined by
    * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
    * (IETF BCP 47, "Tags for Identifying Languages").
    */
  var languageCodes: js.UndefOr[String] = js.native
  
  /** The 3-letter currency code defined in ISO 4217. */
  @JSName("maxMonthlyBudget.currencyCode")
  var maxMonthlyBudgetDotcurrencyCode: js.UndefOr[String] = js.native
  
  /**
    * Number of nano (10^-9) units of the amount.
    * The value must be between -999,999,999 and +999,999,999 inclusive.
    * If `units` is positive, `nanos` must be positive or zero.
    * If `units` is zero, `nanos` can be positive, zero, or negative.
    * If `units` is negative, `nanos` must be negative or zero.
    * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
    */
  @JSName("maxMonthlyBudget.nanos")
  var maxMonthlyBudgetDotnanos: js.UndefOr[Double] = js.native
  
  /**
    * The whole units of the amount.
    * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
    */
  @JSName("maxMonthlyBudget.units")
  var maxMonthlyBudgetDotunits: js.UndefOr[String] = js.native
  
  /** The 3-letter currency code defined in ISO 4217. */
  @JSName("minMonthlyBudget.currencyCode")
  var minMonthlyBudgetDotcurrencyCode: js.UndefOr[String] = js.native
  
  /**
    * Number of nano (10^-9) units of the amount.
    * The value must be between -999,999,999 and +999,999,999 inclusive.
    * If `units` is positive, `nanos` must be positive or zero.
    * If `units` is zero, `nanos` can be positive, zero, or negative.
    * If `units` is negative, `nanos` must be negative or zero.
    * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
    */
  @JSName("minMonthlyBudget.nanos")
  var minMonthlyBudgetDotnanos: js.UndefOr[Double] = js.native
  
  /**
    * The whole units of the amount.
    * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
    */
  @JSName("minMonthlyBudget.units")
  var minMonthlyBudgetDotunits: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /**
    * How to order addresses within the returned companies. Currently, only
    * `address` and `address desc` is supported which will sorted by closest to
    * farthest in distance from given address and farthest to closest distance
    * from given address respectively.
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * Requested page size. Server may return fewer companies than requested.
    * If unspecified, server picks an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * A token identifying a page of results that the server returns.
    * Typically, this is the value of `ListCompaniesResponse.next_page_token`
    * returned from the previous call to
    * ListCompanies.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Experiment IDs the current request belongs to. */
  @JSName("requestMetadata.experimentIds")
  var requestMetadataDotexperimentIds: js.UndefOr[String] = js.native
  
  /** Locale to use for the current request. */
  @JSName("requestMetadata.locale")
  var requestMetadataDotlocale: js.UndefOr[String] = js.native
  
  /** Google Partners session ID. */
  @JSName("requestMetadata.partnersSessionId")
  var requestMetadataDotpartnersSessionId: js.UndefOr[String] = js.native
  
  /**
    * Identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  @JSName("requestMetadata.trafficSource.trafficSourceId")
  var requestMetadataDottrafficSourceDottrafficSourceId: js.UndefOr[String] = js.native
  
  /**
    * Second level identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  @JSName("requestMetadata.trafficSource.trafficSubId")
  var requestMetadataDottrafficSourceDottrafficSubId: js.UndefOr[String] = js.native
  
  /** IP address to use instead of the user's geo-located IP address. */
  @JSName("requestMetadata.userOverrides.ipAddress")
  var requestMetadataDotuserOverridesDotipAddress: js.UndefOr[String] = js.native
  
  /** Logged-in user ID to impersonate instead of the user's ID. */
  @JSName("requestMetadata.userOverrides.userId")
  var requestMetadataDotuserOverridesDotuserId: js.UndefOr[String] = js.native
  
  /**
    * List of services that the returned agencies should provide. If this is
    * not empty, any returned agency must have at least one of these services,
    * or one of the specializations in the "specializations" field.
    */
  var services: js.UndefOr[String] = js.native
  
  /**
    * List of specializations that the returned agencies should provide. If this
    * is not empty, any returned agency must have at least one of these
    * specializations, or one of the services in the "services" field.
    */
  var specializations: js.UndefOr[String] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
  
  /**
    * The view of the `Company` resource to be returned. This must not be
    * `COMPANY_VIEW_UNSPECIFIED`.
    */
  var view: js.UndefOr[String] = js.native
  
  /**
    * Website URL that will help to find a better matched company.
    * .
    */
  var websiteUrl: js.UndefOr[String] = js.native
}
object CompanyName {
  
  @scala.inline
  def apply(): CompanyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompanyName]
  }
  
  @scala.inline
  implicit class CompanyNameOps[Self <: CompanyName] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setBearer_token(value: String): Self = this.set("bearer_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBearer_token: Self = this.set("bearer_token", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setGpsMotivations(value: String): Self = this.set("gpsMotivations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGpsMotivations: Self = this.set("gpsMotivations", js.undefined)
    
    @scala.inline
    def setIndustries(value: String): Self = this.set("industries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndustries: Self = this.set("industries", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLanguageCodes(value: String): Self = this.set("languageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCodes: Self = this.set("languageCodes", js.undefined)
    
    @scala.inline
    def setMaxMonthlyBudgetDotcurrencyCode(value: String): Self = this.set("maxMonthlyBudget.currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMonthlyBudgetDotcurrencyCode: Self = this.set("maxMonthlyBudget.currencyCode", js.undefined)
    
    @scala.inline
    def setMaxMonthlyBudgetDotnanos(value: Double): Self = this.set("maxMonthlyBudget.nanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMonthlyBudgetDotnanos: Self = this.set("maxMonthlyBudget.nanos", js.undefined)
    
    @scala.inline
    def setMaxMonthlyBudgetDotunits(value: String): Self = this.set("maxMonthlyBudget.units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMonthlyBudgetDotunits: Self = this.set("maxMonthlyBudget.units", js.undefined)
    
    @scala.inline
    def setMinMonthlyBudgetDotcurrencyCode(value: String): Self = this.set("minMonthlyBudget.currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinMonthlyBudgetDotcurrencyCode: Self = this.set("minMonthlyBudget.currencyCode", js.undefined)
    
    @scala.inline
    def setMinMonthlyBudgetDotnanos(value: Double): Self = this.set("minMonthlyBudget.nanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinMonthlyBudgetDotnanos: Self = this.set("minMonthlyBudget.nanos", js.undefined)
    
    @scala.inline
    def setMinMonthlyBudgetDotunits(value: String): Self = this.set("minMonthlyBudget.units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinMonthlyBudgetDotunits: Self = this.set("minMonthlyBudget.units", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPp(value: Boolean): Self = this.set("pp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePp: Self = this.set("pp", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setRequestMetadataDotexperimentIds(value: String): Self = this.set("requestMetadata.experimentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMetadataDotexperimentIds: Self = this.set("requestMetadata.experimentIds", js.undefined)
    
    @scala.inline
    def setRequestMetadataDotlocale(value: String): Self = this.set("requestMetadata.locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMetadataDotlocale: Self = this.set("requestMetadata.locale", js.undefined)
    
    @scala.inline
    def setRequestMetadataDotpartnersSessionId(value: String): Self = this.set("requestMetadata.partnersSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMetadataDotpartnersSessionId: Self = this.set("requestMetadata.partnersSessionId", js.undefined)
    
    @scala.inline
    def setRequestMetadataDottrafficSourceDottrafficSourceId(value: String): Self = this.set("requestMetadata.trafficSource.trafficSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMetadataDottrafficSourceDottrafficSourceId: Self = this.set("requestMetadata.trafficSource.trafficSourceId", js.undefined)
    
    @scala.inline
    def setRequestMetadataDottrafficSourceDottrafficSubId(value: String): Self = this.set("requestMetadata.trafficSource.trafficSubId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMetadataDottrafficSourceDottrafficSubId: Self = this.set("requestMetadata.trafficSource.trafficSubId", js.undefined)
    
    @scala.inline
    def setRequestMetadataDotuserOverridesDotipAddress(value: String): Self = this.set("requestMetadata.userOverrides.ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMetadataDotuserOverridesDotipAddress: Self = this.set("requestMetadata.userOverrides.ipAddress", js.undefined)
    
    @scala.inline
    def setRequestMetadataDotuserOverridesDotuserId(value: String): Self = this.set("requestMetadata.userOverrides.userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMetadataDotuserOverridesDotuserId: Self = this.set("requestMetadata.userOverrides.userId", js.undefined)
    
    @scala.inline
    def setServices(value: String): Self = this.set("services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
    
    @scala.inline
    def setSpecializations(value: String): Self = this.set("specializations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecializations: Self = this.set("specializations", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
}
