package typingsSlinky.koaRoute.mod.KoaRoute

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.pathToRegexp.mod.ParseOptions
import typingsSlinky.pathToRegexp.mod.RegExpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method extends js.Object {
  def apply(path: Path): CreateRoute = js.native
  def apply(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
  def apply(path: Path, fn: Handler, opts: ParseOptions with RegExpOptions): Middleware[DefaultState, DefaultContext] = js.native
}

