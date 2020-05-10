package typingsSlinky.expressOauthServer.mod

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.oauth2Server.mod.AuthenticateOptions
import typingsSlinky.oauth2Server.mod.AuthorizationCode
import typingsSlinky.oauth2Server.mod.AuthorizeOptions
import typingsSlinky.oauth2Server.mod.Token
import typingsSlinky.oauth2Server.mod.TokenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressOAuthServer extends js.Object {
  var server: typingsSlinky.oauth2Server.mod.^ = js.native
  def authenticate(): js.Function3[
    /* request */ Request_[ParamsDictionary, _, _, Query], 
    /* response */ Response_[_], 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
  def authenticate(options: AuthenticateOptions): js.Function3[
    /* request */ Request_[ParamsDictionary, _, _, Query], 
    /* response */ Response_[_], 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
  def authorize(): js.Function3[
    /* request */ Request_[ParamsDictionary, _, _, Query], 
    /* response */ Response_[_], 
    /* next */ NextFunction, 
    js.Promise[AuthorizationCode]
  ] = js.native
  def authorize(options: AuthorizeOptions): js.Function3[
    /* request */ Request_[ParamsDictionary, _, _, Query], 
    /* response */ Response_[_], 
    /* next */ NextFunction, 
    js.Promise[AuthorizationCode]
  ] = js.native
  def token(): js.Function3[
    /* request */ Request_[ParamsDictionary, _, _, Query], 
    /* response */ Response_[_], 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
  def token(options: TokenOptions): js.Function3[
    /* request */ Request_[ParamsDictionary, _, _, Query], 
    /* response */ Response_[_], 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
}

