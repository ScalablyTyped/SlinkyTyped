package typingsSlinky.koaLog

import typingsSlinky.koa.mod.BaseContext
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koa.mod.ParameterizedContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-log", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(`type`: String): Middleware[DefaultState, DefaultContext] = js.native
  @js.native
  object morgan extends js.Object {
    def cookie(ctx: BaseContext, key: String): String = js.native
    def date(ctx: BaseContext, format: String): String = js.native
    def format(name: String): String = js.native
    def length(ctx: BaseContext): js.UndefOr[Double] = js.native
    def method(ctx: BaseContext): String = js.native
    def referrer(ctx: BaseContext): String = js.native
    def status(ctx: BaseContext): Double = js.native
    def token(
      name: String,
      fn: js.Function1[/* ctx */ ParameterizedContext[DefaultState, DefaultContext], String]
    ): Unit = js.native
    def url(ctx: BaseContext): String = js.native
  }
  
}

