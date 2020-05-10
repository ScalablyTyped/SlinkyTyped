package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.chrome.double
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chrome.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAuthenticationChallengeDetails extends WebResponseHeadersDetails {
  /** The server requesting authentication. */
  var challenger: WebAuthChallenger = js.native
  /** True for Proxy-Authenticate, false for WWW-Authenticate. */
  var isProxy: Boolean = js.native
  /** The authentication realm provided by the server, if there is one. */
  var realm: js.UndefOr[String] = js.native
  /** The authentication scheme, e.g. Basic or Digest. */
  var scheme: String = js.native
}

object WebAuthenticationChallengeDetails {
  @scala.inline
  def apply(
    challenger: WebAuthChallenger,
    frameId: integer,
    isProxy: Boolean,
    method: String,
    parentFrameId: integer,
    requestId: String,
    scheme: String,
    statusCode: integer,
    statusLine: String,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String
  ): WebAuthenticationChallengeDetails = {
    val __obj = js.Dynamic.literal(challenger = challenger.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], isProxy = isProxy.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthenticationChallengeDetails]
  }
  @scala.inline
  implicit class WebAuthenticationChallengeDetailsOps[Self <: WebAuthenticationChallengeDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallenger(value: WebAuthChallenger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(js.undefined)
        ret
    }
  }
  
}

