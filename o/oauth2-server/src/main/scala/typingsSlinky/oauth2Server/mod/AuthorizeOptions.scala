package typingsSlinky.oauth2Server.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeOptions extends js.Object {
  /**
    * Allow clients to specify an empty state
    */
  var allowEmptyState: js.UndefOr[Boolean] = js.native
  /**
    * The authenticate handler
    */
  var authenticateHandler: js.UndefOr[js.Object] = js.native
  /**
    * Lifetime of generated authorization codes in seconds (default = 5 minutes).
    */
  var authorizationCodeLifetime: js.UndefOr[Double] = js.native
}

object AuthorizeOptions {
  @scala.inline
  def apply(): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeOptions]
  }
  @scala.inline
  implicit class AuthorizeOptionsOps[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEmptyState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmptyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmptyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmptyState")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthenticateHandler(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticateHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticateHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticateHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizationCodeLifetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationCodeLifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationCodeLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationCodeLifetime")(js.undefined)
        ret
    }
  }
  
}

