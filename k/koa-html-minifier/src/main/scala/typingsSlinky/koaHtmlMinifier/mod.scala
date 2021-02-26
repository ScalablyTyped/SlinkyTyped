package typingsSlinky.koaHtmlMinifier

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-html-minifier", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-html-minifier", JSImport.Namespace)
  @js.native
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = js.native
  
  type Options = typingsSlinky.htmlMinifier.mod.Options
}
