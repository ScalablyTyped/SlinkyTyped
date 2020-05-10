package typingsSlinky.feathersjsAuthenticationOauth1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeathersAuthenticationOAuth1Options extends js.Object {
  /**
    * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
    */
  var Verifier: OAuth1Verifier = js.native
  /**
    * The route to register the callback handler
    */
  var callbackPath: String = js.native
  /**
    * hostname[:port]/auth/<provider>/callback',
    */
  var callbackURL: String = js.native
  /**
    * the entity that you are looking up
    */
  var entity: String = js.native
  /**
    * The response formatter. Defaults the the built in feathers-rest formatter, which returns JSON. todo: needs a proper type
    */
  var formatter: js.Any = js.native
  /**
    * Express middleware for handling the oauth callback. Defaults to the built in middleware. todo: needs a proper type
    */
  var handler: js.Any = js.native
  /**
    * The field to look up the entity by when logging in with the provider. Defaults to '<provider>Id' (ie. 'twitterId').
    */
  var idField: String = js.native
  /**
    * whether the request object should be passed to `verify`
    */
  var passReqToCallback: Boolean = js.native
  /**
    * The route to register the middleware
    */
  var path: String = js.native
  /**
    * the service to look up the entity
    */
  var service: String = js.native
  /**
    * whether to use sessions,
    */
  var session: Boolean = js.native
}

object FeathersAuthenticationOAuth1Options {
  @scala.inline
  def apply(
    Verifier: OAuth1Verifier,
    callbackPath: String,
    callbackURL: String,
    entity: String,
    formatter: js.Any,
    handler: js.Any,
    idField: String,
    passReqToCallback: Boolean,
    path: String,
    service: String,
    session: Boolean
  ): FeathersAuthenticationOAuth1Options = {
    val __obj = js.Dynamic.literal(Verifier = Verifier.asInstanceOf[js.Any], callbackPath = callbackPath.asInstanceOf[js.Any], callbackURL = callbackURL.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], idField = idField.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeathersAuthenticationOAuth1Options]
  }
  @scala.inline
  implicit class FeathersAuthenticationOAuth1OptionsOps[Self <: FeathersAuthenticationOAuth1Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerifier(value: OAuth1Verifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Verifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassReqToCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passReqToCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
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
  }
  
}

