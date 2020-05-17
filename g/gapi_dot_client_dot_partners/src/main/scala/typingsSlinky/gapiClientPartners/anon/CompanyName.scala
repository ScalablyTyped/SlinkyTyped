package typingsSlinky.gapiClientPartners.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def with$Dotxgafv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$.xgafv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$Dotxgafv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$.xgafv")(js.undefined)
        ret
    }
    @scala.inline
    def withAccess_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withBearer_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearer_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBearer_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearer_token")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withGpsMotivations(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpsMotivations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGpsMotivations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpsMotivations")(js.undefined)
        ret
    }
    @scala.inline
    def withIndustries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("industries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndustries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("industries")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCodes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMonthlyBudgetDotcurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMonthlyBudget.currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMonthlyBudgetDotcurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMonthlyBudget.currencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMonthlyBudgetDotnanos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMonthlyBudget.nanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMonthlyBudgetDotnanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMonthlyBudget.nanos")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMonthlyBudgetDotunits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMonthlyBudget.units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMonthlyBudgetDotunits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMonthlyBudget.units")(js.undefined)
        ret
    }
    @scala.inline
    def withMinMonthlyBudgetDotcurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMonthlyBudget.currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinMonthlyBudgetDotcurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMonthlyBudget.currencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withMinMonthlyBudgetDotnanos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMonthlyBudget.nanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinMonthlyBudgetDotnanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMonthlyBudget.nanos")(js.undefined)
        ret
    }
    @scala.inline
    def withMinMonthlyBudgetDotunits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMonthlyBudget.units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinMonthlyBudgetDotunits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMonthlyBudget.units")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pp")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMetadataDotexperimentIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.experimentIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMetadataDotexperimentIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.experimentIds")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMetadataDotlocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMetadataDotlocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.locale")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMetadataDotpartnersSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.partnersSessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMetadataDotpartnersSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.partnersSessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMetadataDottrafficSourceDottrafficSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.trafficSource.trafficSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMetadataDottrafficSourceDottrafficSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.trafficSource.trafficSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMetadataDottrafficSourceDottrafficSubId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.trafficSource.trafficSubId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMetadataDottrafficSourceDottrafficSubId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.trafficSource.trafficSubId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMetadataDotuserOverridesDotipAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.userOverrides.ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMetadataDotuserOverridesDotipAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.userOverrides.ipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMetadataDotuserOverridesDotuserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.userOverrides.userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMetadataDotuserOverridesDotuserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata.userOverrides.userId")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecializations(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specializations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecializations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specializations")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadType")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload_protocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpload_protocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(js.undefined)
        ret
    }
  }
  
}

