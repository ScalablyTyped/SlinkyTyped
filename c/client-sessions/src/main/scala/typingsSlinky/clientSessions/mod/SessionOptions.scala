package typingsSlinky.clientSessions.mod

import typingsSlinky.cookies.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionOptions extends js.Object {
  /**
    * if expiresIn < activeDuration, the session will be extended by activeDuration milliseconds.
    * Default: 5 minutes
    */
  var activeDuration: js.UndefOr[Double] = js.native
  var cookie: js.UndefOr[IOptions] = js.native
  /**
    * session cookie name.
    * Default: 'session_state'
    */
  var cookieName: js.UndefOr[String] = js.native
  /**
    * how long the session will stay valid in ms.
    * Default: 24 hours
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * session accessor on the request object.
    * Default: 'session'
    */
  var requestKey: js.UndefOr[String] = js.native
  /**
    * encryption secret for the session.
    * required
    */
  var secret: String = js.native
}

object SessionOptions {
  @scala.inline
  def apply(secret: String): SessionOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
  @scala.inline
  implicit class SessionOptionsOps[Self <: SessionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie(value: IOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieName")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestKey")(js.undefined)
        ret
    }
  }
  
}

