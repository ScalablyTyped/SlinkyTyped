package typingsSlinky.feathersjsAuthenticationLocal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeathersAuthenticationLocalOptions extends js.Object {
  /**
    * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
    */
  var Verifier: LocalVerifier = js.native
  /**
    * the entity that you're comparing username/password against
    */
  var entity: String = js.native
  /**
    * key name of the password on the entity (defaults to `passwordField`)
    */
  var entityPasswordField: String = js.native
  /**
    * key name of the username field on the entity (defaults to `usernameField`)
    */
  var entityUsernameField: String = js.native
  /**
    * the name to use when invoking the authentication Strategy
    */
  var name: String = js.native
  /**
    * whether the request object should be passed to `verify`
    */
  var passReqToCallback: Boolean = js.native
  /**
    * key name of password field on the request
    */
  var passwordField: String = js.native
  /**
    * the service to look up the entity
    */
  var service: String = js.native
  /**
    * whether to use sessions,
    */
  var session: Boolean = js.native
  /**
    * key name of username field on the request
    */
  var usernameField: String = js.native
}

object FeathersAuthenticationLocalOptions {
  @scala.inline
  def apply(
    Verifier: LocalVerifier,
    entity: String,
    entityPasswordField: String,
    entityUsernameField: String,
    name: String,
    passReqToCallback: Boolean,
    passwordField: String,
    service: String,
    session: Boolean,
    usernameField: String
  ): FeathersAuthenticationLocalOptions = {
    val __obj = js.Dynamic.literal(Verifier = Verifier.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], entityPasswordField = entityPasswordField.asInstanceOf[js.Any], entityUsernameField = entityUsernameField.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], passwordField = passwordField.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], usernameField = usernameField.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeathersAuthenticationLocalOptions]
  }
  @scala.inline
  implicit class FeathersAuthenticationLocalOptionsOps[Self <: FeathersAuthenticationLocalOptions] (val x: Self) extends AnyVal {
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
    def withEntity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityPasswordField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityPasswordField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityUsernameField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityUsernameField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassReqToCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passReqToCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsernameField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameField")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

