package typingsSlinky.keycloakConnect.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keycloak extends js.Object {
  
  def accessDenied(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): Unit = js.native
  
  def accountUrl(): String = js.native
  
  def authenticated(request: Request_[ParamsDictionary, _, _, Query]): Unit = js.native
  
  def deauthenticated(request: Request_[ParamsDictionary, _, _, Query]): Unit = js.native
  
  def getAccount(token: Token): js.Promise[_] = js.native
  
  def getGrant(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): js.Promise[Grant] = js.native
  
  def getGrantFromCode(code: String, request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): js.Promise[Grant] = js.native
  
  def loginUrl(uuid: String, redirectUrl: String): String = js.native
  
  def logoutUrl(redirectUrl: String): String = js.native
  
  def middleware(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def middleware(options: MiddlewareOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def protect(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def protect(spec: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def protect(spec: SpecHandler): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def redirectToLogin(request: Request_[ParamsDictionary, _, _, Query]): Boolean = js.native
  
  def storeGrant(grant: Grant, request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): Grant = js.native
  
  def unstoreGrant(sessionId: String): Unit = js.native
}
