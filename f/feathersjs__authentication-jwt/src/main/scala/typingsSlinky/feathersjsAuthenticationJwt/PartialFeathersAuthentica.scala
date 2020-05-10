package typingsSlinky.feathersjsAuthenticationJwt

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.feathersjsAuthenticationJwt.mod.JwtFromRequestFunction
import typingsSlinky.feathersjsAuthenticationJwt.mod.Verifier
import typingsSlinky.feathersjsFeathers.mod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/authentication-jwt.@feathersjs/authentication-jwt.FeathersAuthenticationJWTOptions> */
@js.native
trait PartialFeathersAuthentica extends js.Object {
  var Verifier: js.UndefOr[
    Instantiable2[
      /* app */ Application[js.Object], 
      /* options */ js.Any, 
      typingsSlinky.feathersjsAuthenticationJwt.mod.Verifier
    ]
  ] = js.native
  var entity: js.UndefOr[String] = js.native
  var jwtFromRequest: js.UndefOr[JwtFromRequestFunction] = js.native
  var name: js.UndefOr[String] = js.native
  var passReqToCallback: js.UndefOr[Boolean] = js.native
  var secretOrKey: js.UndefOr[String] = js.native
  var service: js.UndefOr[String] = js.native
  var session: js.UndefOr[Boolean] = js.native
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
    def withVerifier(value: Instantiable2[/* app */ Application[js.Object], /* options */ js.Any, Verifier]): Self = {
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
    def withJwtFromRequest(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwtFromRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutJwtFromRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwtFromRequest")(js.undefined)
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
    def withSecretOrKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretOrKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretOrKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretOrKey")(js.undefined)
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

