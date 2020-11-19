package typingsSlinky.hubot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DoneFunction = js.Function0[scala.Unit]
  
  type ListenerCallback[A /* <: typingsSlinky.hubot.mod.Adapter */, M /* <: typingsSlinky.hubot.mod.Message */] = js.Function1[/* response */ typingsSlinky.hubot.mod.Response[A, M], scala.Unit]
  
  type MiddlewareHandler[T /* <: typingsSlinky.hubot.mod.Adapter */] = js.Function3[
    /* context */ typingsSlinky.hubot.mod.MiddlewareContext[T], 
    /* next */ typingsSlinky.hubot.mod.NextFunction, 
    /* done */ typingsSlinky.hubot.mod.DoneFunction, 
    scala.Unit
  ]
  
  type NextFunction = js.Function1[/* done */ typingsSlinky.hubot.mod.DoneFunction, scala.Unit]
}
