package typingsSlinky.feathersjsAuthentication.mod

import typingsSlinky.feathersjsAuthentication.anon.Algorithm
import typingsSlinky.feathersjsAuthentication.anon.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeathersAuthenticationOptions extends js.Object {
  var cookie: js.UndefOr[Enabled] = js.native
  var entity: js.UndefOr[String] = js.native
  var header: js.UndefOr[String] = js.native
  var jwt: js.UndefOr[Algorithm] = js.native
  var passReqToCallback: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
  var service: js.UndefOr[String] = js.native
  var session: js.UndefOr[Boolean] = js.native
}

object FeathersAuthenticationOptions {
  @scala.inline
  def apply(): FeathersAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeathersAuthenticationOptions]
  }
  @scala.inline
  implicit class FeathersAuthenticationOptionsOps[Self <: FeathersAuthenticationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookie(value: Enabled): Self = {
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
    def withEntity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withJwt(value: Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJwt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwt")(js.undefined)
        ret
    }
    @scala.inline
    def withPassReqToCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passReqToCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassReqToCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passReqToCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: Boolean): Self = {
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
  }
  
}

