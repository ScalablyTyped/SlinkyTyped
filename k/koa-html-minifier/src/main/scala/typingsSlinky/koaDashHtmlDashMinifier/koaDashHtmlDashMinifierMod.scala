package typingsSlinky.koaDashHtmlDashMinifier

import typingsSlinky.koa.koaMod.DefaultContext
import typingsSlinky.koa.koaMod.DefaultState
import typingsSlinky.koa.koaMod.Middleware
import typingsSlinky.koaDashHtmlDashMinifier.koaDashHtmlDashMinifierMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-html-minifier", JSImport.Namespace)
@js.native
object koaDashHtmlDashMinifierMod extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = js.native
  type Options = typingsSlinky.htmlDashMinifier.htmlDashMinifierMod.Options
}

