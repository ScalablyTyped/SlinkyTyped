package typingsSlinky.easyXapiUtils

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-xapi-utils", "hasRole")
  @js.native
  def hasRole(role: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("easy-xapi-utils", "isLoggedIn")
  @js.native
  def isLoggedIn(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("easy-xapi-utils", "isLoggedIn")
  @js.native
  def isLoggedIn(role: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("easy-xapi-utils", "isLoggedOut")
  @js.native
  def isLoggedOut(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
