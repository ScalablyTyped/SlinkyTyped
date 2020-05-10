package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the session cookie options needed for the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#createSessionCookie `createSessionCookie()`} method.
  */
@js.native
trait SessionCookieOptions extends js.Object {
  /**
    * The session cookie custom expiration in milliseconds. The minimum allowed is
    * 5 minutes and the maxium allowed is 2 weeks.
    */
  var expiresIn: Double = js.native
}

object SessionCookieOptions {
  @scala.inline
  def apply(expiresIn: Double): SessionCookieOptions = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionCookieOptions]
  }
  @scala.inline
  implicit class SessionCookieOptionsOps[Self <: SessionCookieOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiresIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

