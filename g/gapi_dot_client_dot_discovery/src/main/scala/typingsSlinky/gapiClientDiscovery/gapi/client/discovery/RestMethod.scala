package typingsSlinky.gapiClientDiscovery.gapi.client.discovery

import typingsSlinky.gapiClientDiscovery.anon.Accept
import typingsSlinky.gapiClientDiscovery.anon.ParameterName
import typingsSlinky.gapiClientDiscovery.anon.RefString
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestMethod extends js.Object {
  /** Description of this method. */
  var description: js.UndefOr[String] = js.native
  /** Whether this method requires an ETag to be specified. The ETag is sent as an HTTP If-Match or If-None-Match header. */
  var etagRequired: js.UndefOr[Boolean] = js.native
  /** HTTP method used by this method. */
  var httpMethod: js.UndefOr[String] = js.native
  /** A unique ID for this method. This property can be used to match methods between different versions of Discovery. */
  var id: js.UndefOr[String] = js.native
  /** Media upload parameters. */
  var mediaUpload: js.UndefOr[Accept] = js.native
  /**
    * Ordered list of required parameters, serves as a hint to clients on how to structure their method signatures. The array is ordered such that the
    * "most-significant" parameter appears first.
    */
  var parameterOrder: js.UndefOr[js.Array[String]] = js.native
  /** Details for all parameters in this method. */
  var parameters: js.UndefOr[Record[String, JsonSchema]] = js.native
  /** The URI path of this REST method. Should be used in conjunction with the basePath property at the api-level. */
  var path: js.UndefOr[String] = js.native
  /** The schema for the request. */
  var request: js.UndefOr[ParameterName] = js.native
  /** The schema for the response. */
  var response: js.UndefOr[RefString] = js.native
  /** OAuth 2.0 scopes applicable to this method. */
  var scopes: js.UndefOr[js.Array[String]] = js.native
  /** Whether this method supports media downloads. */
  var supportsMediaDownload: js.UndefOr[Boolean] = js.native
  /** Whether this method supports media uploads. */
  var supportsMediaUpload: js.UndefOr[Boolean] = js.native
  /** Whether this method supports subscriptions. */
  var supportsSubscription: js.UndefOr[Boolean] = js.native
  /** Indicates that downloads from this method should use the download service URL (i.e. "/download"). Only applies if the method supports media download. */
  var useMediaDownloadService: js.UndefOr[Boolean] = js.native
}

object RestMethod {
  @scala.inline
  def apply(): RestMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestMethod]
  }
  @scala.inline
  implicit class RestMethodOps[Self <: RestMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEtagRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etagRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtagRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etagRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaUpload(value: Accept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: Record[String, JsonSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: ParameterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: RefString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsMediaDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsMediaDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsMediaDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsMediaDownload")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsMediaUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsMediaUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsMediaUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsMediaUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsSubscription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsSubscription")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMediaDownloadService(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMediaDownloadService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMediaDownloadService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMediaDownloadService")(js.undefined)
        ret
    }
  }
  
}

