package typingsSlinky.gapiClientProximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBearertoken extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to return for this request, up to a
    * server-defined upper limit.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /** A pagination token obtained from a previous request to list beacons. */
  var pageToken: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * The project id to list beacons under. If not present then the project
    * credential that made the request is used as the project.
    * Optional.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Filter query string that supports the following field filters:
    *
    * &#42; &#42;&#42;description:`"<string>"`&#42;&#42;
    * For example: &#42;&#42;description:"Room 3"&#42;&#42;
    * Returns beacons whose description matches tokens in the string "Room 3"
    * (not necessarily that exact string).
    * The string must be double-quoted.
    * &#42; &#42;&#42;status:`<enum>`&#42;&#42;
    * For example: &#42;&#42;status:active&#42;&#42;
    * Returns beacons whose status matches the given value. Values must be
    * one of the Beacon.Status enum values (case insensitive). Accepts
    * multiple filters which will be combined with OR logic.
    * &#42; &#42;&#42;stability:`<enum>`&#42;&#42;
    * For example: &#42;&#42;stability:mobile&#42;&#42;
    * Returns beacons whose expected stability matches the given value.
    * Values must be one of the Beacon.Stability enum values (case
    * insensitive). Accepts multiple filters which will be combined with
    * OR logic.
    * &#42; &#42;&#42;place\_id:`"<string>"`&#42;&#42;
    * For example: &#42;&#42;place\_id:"ChIJVSZzVR8FdkgRXGmmm6SslKw="&#42;&#42;
    * Returns beacons explicitly registered at the given place, expressed as
    * a Place ID obtained from [Google Places API](/places/place-id). Does not
    * match places inside the given place. Does not consider the beacon's
    * actual location (which may be different from its registered place).
    * Accepts multiple filters that will be combined with OR logic. The place
    * ID must be double-quoted.
    * &#42; &#42;&#42;registration\_time`[<|>|<=|>=]<integer>`&#42;&#42;
    * For example: &#42;&#42;registration\_time>=1433116800&#42;&#42;
    * Returns beacons whose registration time matches the given filter.
    * Supports the operators: <, >, <=, and >=. Timestamp must be expressed as
    * an integer number of seconds since midnight January 1, 1970 UTC. Accepts
    * at most two filters that will be combined with AND logic, to support
    * "between" semantics. If more than two are supplied, the latter ones are
    * ignored.
    * &#42; &#42;&#42;lat:`<double> lng:<double> radius:<integer>`&#42;&#42;
    * For example: &#42;&#42;lat:51.1232343 lng:-1.093852 radius:1000&#42;&#42;
    * Returns beacons whose registered location is within the given circle.
    * When any of these fields are given, all are required. Latitude and
    * longitude must be decimal degrees between -90.0 and 90.0 and between
    * -180.0 and 180.0 respectively. Radius must be an integer number of
    * meters between 10 and 1,000,000 (1000 km).
    * &#42; &#42;&#42;property:`"<string>=<string>"`&#42;&#42;
    * For example: &#42;&#42;property:"battery-type=CR2032"&#42;&#42;
    * Returns beacons which have a property of the given name and value.
    * Supports multiple filters which will be combined with OR logic.
    * The entire name=value string must be double-quoted as one string.
    * &#42; &#42;&#42;attachment\_type:`"<string>"`&#42;&#42;
    * For example: &#42;&#42;attachment_type:"my-namespace/my-type"&#42;&#42;
    * Returns beacons having at least one attachment of the given namespaced
    * type. Supports "any within this namespace" via the partial wildcard
    * syntax: "my-namespace/&#42;". Supports multiple filters which will be
    * combined with OR logic. The string must be double-quoted.
    * &#42; &#42;&#42;indoor\_level:`"<string>"`&#42;&#42;
    * For example: &#42;&#42;indoor\_level:"1"&#42;&#42;
    * Returns beacons which are located on the given indoor level. Accepts
    * multiple filters that will be combined with OR logic.
    *
    * Multiple filters on the same field are combined with OR logic (except
    * registration_time which is combined with AND logic).
    * Multiple filters on different fields are combined with AND logic.
    * Filters should be separated by spaces.
    *
    * As with any HTTP query string parameter, the whole filter expression must
    * be URL-encoded.
    *
    * Example REST request:
    * `GET /v1beta1/beacons?q=status:active%20lat:51.123%20lng:-1.095%20radius:1000`
    */
  var q: js.UndefOr[String] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

object AnonBearertoken {
  @scala.inline
  def apply(): AnonBearertoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBearertoken]
  }
  @scala.inline
  implicit class AnonBearertokenOps[Self <: AnonBearertoken] (val x: Self) extends AnyVal {
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
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withQ(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(js.undefined)
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
  }
  
}

