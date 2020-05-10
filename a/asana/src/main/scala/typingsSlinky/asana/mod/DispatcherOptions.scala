package typingsSlinky.asana.mod

import typingsSlinky.asana.mod.auth.Authenticator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatcherOptions extends js.Object {
  var authenticator: js.UndefOr[Authenticator] = js.native
  var handleUnauthorized: js.UndefOr[js.Function0[Boolean | typingsSlinky.bluebird.mod.^[Boolean]]] = js.native
  var requestTimeout: js.UndefOr[String] = js.native
  var retryOnRateLimit: js.UndefOr[Boolean] = js.native
}

object DispatcherOptions {
  @scala.inline
  def apply(): DispatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatcherOptions]
  }
  @scala.inline
  implicit class DispatcherOptionsOps[Self <: DispatcherOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticator(value: Authenticator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticator")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleUnauthorized(value: () => Boolean | typingsSlinky.bluebird.mod.^[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleUnauthorized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHandleUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleUnauthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryOnRateLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryOnRateLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryOnRateLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryOnRateLimit")(js.undefined)
        ret
    }
  }
  
}

