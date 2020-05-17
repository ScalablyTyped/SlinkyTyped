package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import typingsSlinky.firefoxWebextBrowser.anon.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns value for event handlers that have the 'blocking' extraInfoSpec applied. Allows the event handler to
  * modify network requests.
  */
@js.native
trait BlockingResponse extends js.Object {
  /**
    * Only used as a response to the onAuthRequired event. If set, the request is made using the supplied
    * credentials.
    */
  var authCredentials: js.UndefOr[Password] = js.native
  /**
    * If true, the request is cancelled. Used in onBeforeRequest, this prevents the request from being sent.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /**
    * Only used as a response to the onBeforeRequest and onHeadersReceived events. If set, the original request is
    * prevented from being sent/completed and is instead redirected to the given URL. Redirections to non-HTTP
    * schemes such as data: are allowed. Redirects initiated by a redirect action use the original request method
    * for the redirect, with one exception: If the redirect is initiated at the onHeadersReceived stage, then the
    * redirect will be issued using the GET method.
    */
  var redirectUrl: js.UndefOr[String] = js.native
  /**
    * Only used as a response to the onBeforeSendHeaders event. If set, the request is made with these request
    * headers instead.
    */
  var requestHeaders: js.UndefOr[HttpHeaders] = js.native
  /**
    * Only used as a response to the onHeadersReceived event. If set, the server is assumed to have responded with
    * these response headers instead. Only return `responseHeaders` if you really want to modify the headers in
    * order to limit the number of conflicts (only one extension may modify `responseHeaders` for each request).
    */
  var responseHeaders: js.UndefOr[HttpHeaders] = js.native
  /**
    * Only used as a response to the onBeforeRequest event. If set, the original request is prevented from being
    * sent/completed and is instead upgraded to a secure request. If any extension returns `redirectUrl` during
    * onBeforeRequest, `upgradeToSecure` will have no affect.
    */
  var upgradeToSecure: js.UndefOr[Boolean] = js.native
}

object BlockingResponse {
  @scala.inline
  def apply(): BlockingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockingResponse]
  }
  @scala.inline
  implicit class BlockingResponseOps[Self <: BlockingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthCredentials(value: Password): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestHeaders(value: HttpHeaders): Self = {
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
    def withResponseHeaders(value: HttpHeaders): Self = {
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
    def withUpgradeToSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeToSecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgradeToSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeToSecure")(js.undefined)
        ret
    }
  }
  
}

