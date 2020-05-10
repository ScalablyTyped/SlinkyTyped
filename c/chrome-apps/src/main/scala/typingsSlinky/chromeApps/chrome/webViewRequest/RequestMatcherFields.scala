package typingsSlinky.chromeApps.chrome.webViewRequest

import typingsSlinky.chromeApps.chrome.events.UrlFilter
import typingsSlinky.chromeApps.chrome.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestMatcherFields extends js.Object {
  /**
    * Matches if the MIME media type of a response
    * (from the HTTP Content-Type header)
    * is contained in the list. */
  var contentType: js.UndefOr[js.Array[String]] = js.native
  /**
    * Matches if the MIME media type of a response
    * (from the HTTP Content-Type header) is not contained in the list.
    */
  var excludeContentType: js.UndefOr[js.Array[String]] = js.native
  /**
    * Matches if none of the request headers is matched by any of the HeaderFilters.
    */
  var excludeRequestHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.native
  /**
    * Matches if none of the response headers is matched by any of the HeaderFilters.
    */
  var excludeResponseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.native
  /**
    * Matches if the conditions of the UrlFilter are fulfilled for the
    * 'first party' URL of the request. The 'first party' URL of a request,
    * when present, can be different from the request's target URL, and
    * describes what is considered 'first party' for the sake of third-party
    * checks for cookies.
    */
  var firstPartyForCookiesUrl: js.UndefOr[UrlFilter] = js.native
  /**
    * Matches if some of the request headers is matched by one of the HeaderFilters.
    */
  var requestHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.native
  /**
    * Matches if the request type of a request is contained in the list.
    * Requests that cannot match any of the types will be filtered out. */
  var resourceType: js.UndefOr[js.Array[ResourceType]] = js.native
  /**
    * Matches if some of the response headers is matched by one of the HeaderFilters.
    */
  var responseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.native
  /**
    * Contains a list of strings describing stages.
    * If this attribute is present, then it limits the applicable stages to those listed.
    * Note that the whole condition is only applicable in stages compatible with all attributes. */
  var stages: js.UndefOr[js.Array[Stage]] = js.native
  /**
    * If set to true, matches requests that are subject to third-party cookie policies.
    * If set to false, matches all other requests.
    */
  var thirdPartyForCookies: js.UndefOr[Boolean] = js.native
  /** Matches if the conditions of the UrlFilter are fulfilled for the URL of the request. */
  var url: js.UndefOr[UrlFilter] = js.native
}

object RequestMatcherFields {
  @scala.inline
  def apply(): RequestMatcherFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMatcherFields]
  }
  @scala.inline
  implicit class RequestMatcherFieldsOps[Self <: RequestMatcherFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeContentType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeRequestHeaders(value: js.Array[HeaderFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeRequestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeRequestHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeRequestHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeResponseHeaders(value: js.Array[HeaderFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeResponseHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeResponseHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeResponseHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPartyForCookiesUrl(value: UrlFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPartyForCookiesUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPartyForCookiesUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPartyForCookiesUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestHeaders(value: js.Array[HeaderFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: js.Array[ResourceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseHeaders(value: js.Array[HeaderFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withStages(value: js.Array[Stage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stages")(js.undefined)
        ret
    }
    @scala.inline
    def withThirdPartyForCookies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyForCookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThirdPartyForCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyForCookies")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: UrlFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

