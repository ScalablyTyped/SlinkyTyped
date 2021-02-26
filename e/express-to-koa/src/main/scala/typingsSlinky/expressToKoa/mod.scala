package typingsSlinky.expressToKoa

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-to-koa", JSImport.Namespace)
  @js.native
  def apply(
    middleware: js.Function3[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Middleware[DefaultState, DefaultContext] = js.native
}
