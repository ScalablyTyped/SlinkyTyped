package typingsSlinky.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRequestContext extends js.Object {
  /** The type of HTTP request, such as `GET`, `POST`, etc. */
  var method: js.UndefOr[String] = js.native
  /** The referrer information that is provided with the request. */
  var referrer: js.UndefOr[String] = js.native
  /**
    * The IP address from which the request originated.
    * This can be IPv4, IPv6, or a token which is derived from the
    * IP address, depending on the data that has been provided
    * in the error report.
    */
  var remoteIp: js.UndefOr[String] = js.native
  /** The HTTP response status code for the request. */
  var responseStatusCode: js.UndefOr[Double] = js.native
  /** The URL of the request. */
  var url: js.UndefOr[String] = js.native
  /** The user agent information that is provided with the request. */
  var userAgent: js.UndefOr[String] = js.native
}

object HttpRequestContext {
  @scala.inline
  def apply(): HttpRequestContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequestContext]
  }
  @scala.inline
  implicit class HttpRequestContextOps[Self <: HttpRequestContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: String): Self = {
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
    def withReferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteIp")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStatusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
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
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
  }
  
}

