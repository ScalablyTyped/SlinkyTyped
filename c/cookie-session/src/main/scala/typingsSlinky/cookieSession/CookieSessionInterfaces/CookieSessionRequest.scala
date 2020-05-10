package typingsSlinky.cookieSession.CookieSessionInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieSessionRequest extends js.Object {
  /**
    * Represents the session for the given request.
    */
  var session: js.UndefOr[CookieSessionObject | Null] = js.native
  /**
    * Represents the session options for the current request. These options are a shallow clone of what was provided at middleware construction and can be altered to change cookie setting behavior on a per-request basis.
    */
  var sessionOptions: CookieSessionOptions = js.native
}

object CookieSessionRequest {
  @scala.inline
  def apply(sessionOptions: CookieSessionOptions): CookieSessionRequest = {
    val __obj = js.Dynamic.literal(sessionOptions = sessionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieSessionRequest]
  }
  @scala.inline
  implicit class CookieSessionRequestOps[Self <: CookieSessionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSessionOptions(value: CookieSessionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: CookieSessionObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(null)
        ret
    }
  }
  
}

