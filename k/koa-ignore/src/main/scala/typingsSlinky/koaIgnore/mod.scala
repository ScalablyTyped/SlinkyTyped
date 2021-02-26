package typingsSlinky.koaIgnore

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaIgnore.anon.If
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-ignore", JSImport.Namespace)
  @js.native
  def apply(middleware: (Middleware[DefaultState, DefaultContext])*): If = js.native
}
