package typingsSlinky.koaFavicon

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaFavicon.anon.Maxage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-favicon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Returns a middleware serving the favicon found on the given path.
    */
  def apply(path: String): Middleware[DefaultState, DefaultContext] = js.native
  def apply(path: String, options: Maxage): Middleware[DefaultState, DefaultContext] = js.native
}

