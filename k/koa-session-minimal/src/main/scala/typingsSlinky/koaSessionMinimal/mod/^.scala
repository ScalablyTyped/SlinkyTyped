package typingsSlinky.koaSessionMinimal.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaSessionMinimal.anon.Cookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-session-minimal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Cookie): Middleware[DefaultState, DefaultContext] = js.native
}

