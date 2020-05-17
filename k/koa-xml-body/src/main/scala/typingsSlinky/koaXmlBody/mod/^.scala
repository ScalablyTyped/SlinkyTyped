package typingsSlinky.koaXmlBody.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaXmlBody.anon.Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-xml-body", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Encoding): Middleware[DefaultState, DefaultContext] = js.native
}

