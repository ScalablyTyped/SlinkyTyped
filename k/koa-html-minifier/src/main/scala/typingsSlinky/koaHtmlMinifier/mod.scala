package typingsSlinky.koaHtmlMinifier

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-html-minifier", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = js.native
  type Options = typingsSlinky.htmlMinifier.mod.Options
}

