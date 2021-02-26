package typingsSlinky.koaRange

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("koa-range", JSImport.Namespace)
  @js.native
  val ^ : Middleware[DefaultState, DefaultContext] = js.native
  
  type _To = Middleware[DefaultState, DefaultContext]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Middleware[DefaultState, DefaultContext] = ^
}
