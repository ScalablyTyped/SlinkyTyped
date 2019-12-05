package typingsSlinky.koaDashFavicon

import typingsSlinky.koa.koaMod.DefaultContext
import typingsSlinky.koa.koaMod.DefaultState
import typingsSlinky.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-favicon", JSImport.Namespace)
@js.native
object koaDashFaviconMod extends js.Object {
  /**
    * Returns a middleware serving the favicon found on the given path.
    */
  def apply(path: String): Middleware[DefaultState, DefaultContext] = js.native
  def apply(path: String, options: Anon_Maxage): Middleware[DefaultState, DefaultContext] = js.native
}

