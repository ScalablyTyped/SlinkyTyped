package typingsSlinky.chrome.chrome.declarativeWebRequest

import typingsSlinky.chrome.chrome.events.UrlFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestMatcher extends js.Object {
  var contentType: js.UndefOr[js.Array[String]] = js.native
  var excludeContentType: js.UndefOr[js.Array[String]] = js.native
  var excludeResponseHeader: js.UndefOr[js.Array[HeaderFilter]] = js.native
  var resourceType: js.UndefOr[String] = js.native
  var responseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.native
  var url: js.UndefOr[UrlFilter] = js.native
}

object RequestMatcher {
  @scala.inline
  def apply(): RequestMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMatcher]
  }
  @scala.inline
  implicit class RequestMatcherOps[Self <: RequestMatcher] (val x: Self) extends AnyVal {
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
    def withExcludeResponseHeader(value: js.Array[HeaderFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeResponseHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeResponseHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeResponseHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: String): Self = {
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

