package typingsSlinky.feathersjsAuthentication.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@feathersjs/authentication", "express")
@js.native
object express extends js.Object {
  
  def authenticate(strategy: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def authenticate(strategy: String, options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def authenticate(strategy: js.Array[String]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def authenticate(strategy: js.Array[String], options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def emitEvents(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def exposeCookies(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def exposeHeaders(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def failureRedirect(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def failureRedirect(options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def setCookie(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def setCookie(options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def successRedirect(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
