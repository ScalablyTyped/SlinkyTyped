package typingsSlinky.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterceptOptions extends js.Object {
  /**
    * Body-parsers
    */
  var as: js.UndefOr[BodyParser] = js.native
  /**
    * Match the full content-type header of the request or
    * response (depending on the phase)
    */
  var contentType: js.UndefOr[Filter[String]] = js.native
  /**
    * Match the full request URL including protocol and hostname.
    * Patterns like /foo/ * are allowed
    */
  var fullUrl: js.UndefOr[Filter[String]] = js.native
  /**
    * Match the host, not including :port.
    */
  var hostname: js.UndefOr[Filter[String]] = js.native
  /**
    * Match the all-uppercase HTTP request method
    */
  var method: js.UndefOr[Filter[HttpMethod]] = js.native
  /**
    * Match just the mime type portion of the content-type header
    * of the request or response (depending on the phase). I.e.,
    * if the entire header is "text/html; charset=utf-8", just
    * match the "text/html" part
    */
  var mimeType: js.UndefOr[Filter[String]] = js.native
  /**
    * Request phase to listen to
    */
  var phase: Phase = js.native
  /**
    * Match the port number.
    */
  var port: js.UndefOr[Filter[Double | String]] = js.native
  /**
    * Match the request protocol
    */
  var protocol: js.UndefOr[Filter[String]] = js.native
  /**
    * Same as contentType but only matches request
    */
  var requestContentType: js.UndefOr[Filter[String]] = js.native
  /**
    * Same as mimeType but only matches request
    */
  var requestMimeType: js.UndefOr[Filter[String]] = js.native
  /**
    * Same as contentType but only matches response
    */
  var responseContentType: js.UndefOr[Filter[String]] = js.native
  /**
    * Same as mimeType but only matches response
    */
  var responseMimeType: js.UndefOr[Filter[String]] = js.native
  /**
    * Match the request URL. Patterns like /foo/ * are allowed
    */
  var url: js.UndefOr[Filter[String]] = js.native
}

object InterceptOptions {
  @scala.inline
  def apply(phase: Phase): InterceptOptions = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterceptOptions]
  }
  @scala.inline
  implicit class InterceptOptionsOps[Self <: InterceptOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhase(value: Phase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: BodyParser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTypeFunction1(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContentTypeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: Filter[String]): Self = {
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
    def withFullUrlFunction1(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFullUrlRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullUrl(value: Filter[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHostnameFunction1(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHostnameRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostname(value: Filter[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodFunction1(value: HttpMethod => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMethodRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: Filter[HttpMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeTypeFunction1(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMimeTypeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: Filter[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withPortFunction1(value: Double | String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPortRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Filter[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocolFunction1(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProtocolRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: Filter[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestContentTypeFunction1(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestContentType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestContentTypeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestContentType(value: Filter[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMimeTypeFunction1(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMimeType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestMimeTypeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestMimeType(value: Filter[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseContentTypeFunction1(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResponseContentTypeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseContentType(value: Filter[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseMimeTypeFunction1(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMimeType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResponseMimeTypeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseMimeType(value: Filter[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlFunction1(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUrlRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: Filter[String]): Self = {
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

