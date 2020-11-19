package typingsSlinky.koaStaticCache.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-static-cache", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(dir: String): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String, options: js.UndefOr[scala.Nothing], files: Files): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String, options: Files): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String, options: Files, files: Files): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String, options: Options): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String, options: Options, files: Files): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: Options): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: Options, options: js.UndefOr[scala.Nothing], files: Files): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: Options, options: Files): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: Options, options: Files, files: Files): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: Options, options: Options): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: Options, options: Options, files: Files): Middleware[DefaultState, DefaultContext] = js.native
}
