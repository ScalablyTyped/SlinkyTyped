package typingsSlinky.feathersjsAuthenticationLocal.anon

import typingsSlinky.feathersjsAuthenticationLocal.mod.LocalVerifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/authentication-local.@feathersjs/authentication-local.FeathersAuthenticationLocalOptions> */
@js.native
trait PartialFeathersAuthentica extends js.Object {
  var Verifier: js.UndefOr[LocalVerifier] = js.native
  var entity: js.UndefOr[String] = js.native
  var entityPasswordField: js.UndefOr[String] = js.native
  var entityUsernameField: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var passReqToCallback: js.UndefOr[Boolean] = js.native
  var passwordField: js.UndefOr[String] = js.native
  var service: js.UndefOr[String] = js.native
  var session: js.UndefOr[Boolean] = js.native
  var usernameField: js.UndefOr[String] = js.native
}

object PartialFeathersAuthentica {
  @scala.inline
  def apply(): PartialFeathersAuthentica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFeathersAuthentica]
  }
  @scala.inline
  implicit class PartialFeathersAuthenticaOps[Self <: PartialFeathersAuthentica] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerifier(value: LocalVerifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Verifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Verifier")(js.undefined)
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
    def withEntityPasswordField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityPasswordField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityPasswordField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityPasswordField")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityUsernameField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityUsernameField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityUsernameField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityUsernameField")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    def withPasswordField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordField")(js.undefined)
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
    @scala.inline
    def withUsernameField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameField")(js.undefined)
        ret
    }
  }
  
}

