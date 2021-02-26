package typingsSlinky.cookieSession

import typingsSlinky.cookieSession.CookieSessionInterfaces.CookieSessionOptions
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cookie-session", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("cookie-session", JSImport.Namespace)
  @js.native
  def apply(options: CookieSessionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
