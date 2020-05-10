package typingsSlinky.googleCloudCommon.utilMod

import typingsSlinky.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typingsSlinky.googleAuthLibrary.mod.GoogleAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeAuthenticatedRequestFactoryConfig extends GoogleAuthOptions {
  /**
    * A pre-instantiated GoogleAuth client that should be used.
    * A new will be created if this is not set.
    */
  var authClient: js.UndefOr[GoogleAuth] = js.native
  /**
    * Automatically retry requests if the response is related to rate limits or
    * certain intermittent server errors. We will exponentially backoff
    * subsequent requests by default. (default: true)
    */
  var autoRetry: js.UndefOr[Boolean] = js.native
  /**
    * If true, just return the provided request options. Default: false.
    */
  var customEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * Account email address, required for PEM/P12 usage.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Maximum number of automatic retries attempted before returning the error.
    * (default: 3)
    */
  var maxRetries: js.UndefOr[Double] = js.native
  var stream: js.UndefOr[Duplexify] = js.native
}

object MakeAuthenticatedRequestFactoryConfig {
  @scala.inline
  def apply(): MakeAuthenticatedRequestFactoryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeAuthenticatedRequestFactoryConfig]
  }
  @scala.inline
  implicit class MakeAuthenticatedRequestFactoryConfigOps[Self <: MakeAuthenticatedRequestFactoryConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthClient(value: GoogleAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authClient")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRetry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: Duplexify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
  }
  
}

