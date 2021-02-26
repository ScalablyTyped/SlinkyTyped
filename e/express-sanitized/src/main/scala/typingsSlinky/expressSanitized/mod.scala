package typingsSlinky.expressSanitized

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("express-sanitized", JSImport.Namespace)
  @js.native
  val ^ : e = js.native
  
  type _To = e
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: e = ^
  
  type e = js.Function0[
    js.Function3[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* res */ Response_[js.Any], 
      /* next */ NextFunction, 
      Unit
    ]
  ]
}
