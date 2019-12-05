package typingsSlinky.expressDashOauthDashServer.expressDashOauthDashServerMod

import typingsSlinky.express.expressMod.NextFunction
import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.oauth2DashServer.oauth2DashServerMod.AuthenticateOptions
import typingsSlinky.oauth2DashServer.oauth2DashServerMod.AuthorizationCode
import typingsSlinky.oauth2DashServer.oauth2DashServerMod.AuthorizeOptions
import typingsSlinky.oauth2DashServer.oauth2DashServerMod.Token
import typingsSlinky.oauth2DashServer.oauth2DashServerMod.TokenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressOAuthServer extends js.Object {
  var server: typingsSlinky.oauth2DashServer.oauth2DashServerMod.^ = js.native
  def authenticate(): js.Function3[
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
  def authenticate(options: AuthenticateOptions): js.Function3[
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
  def authorize(): js.Function3[
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    /* next */ NextFunction, 
    js.Promise[AuthorizationCode]
  ] = js.native
  def authorize(options: AuthorizeOptions): js.Function3[
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    /* next */ NextFunction, 
    js.Promise[AuthorizationCode]
  ] = js.native
  def token(): js.Function3[
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
  def token(options: TokenOptions): js.Function3[
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
}

