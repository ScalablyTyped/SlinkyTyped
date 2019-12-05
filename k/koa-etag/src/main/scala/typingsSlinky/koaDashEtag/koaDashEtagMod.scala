package typingsSlinky.koaDashEtag

import typingsSlinky.etag.etagMod.Options
import typingsSlinky.koa.koaMod.DefaultContext
import typingsSlinky.koa.koaMod.DefaultState
import typingsSlinky.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-etag", JSImport.Namespace)
@js.native
object koaDashEtagMod extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = js.native
}

