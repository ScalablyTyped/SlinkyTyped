package typingsSlinky.koaCacheControl

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaCacheControl.anon.MaxAge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-cache-control", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-cache-control", JSImport.Namespace)
  @js.native
  def apply(options: MaxAge): Middleware[DefaultState, DefaultContext] = js.native
}
