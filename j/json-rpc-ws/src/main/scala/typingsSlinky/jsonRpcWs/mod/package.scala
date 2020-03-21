package typingsSlinky.jsonRpcWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handler[TConnection /* <: typingsSlinky.jsonRpcWs.mod.Connection */, ParamType, ParamCallbackType] = js.ThisFunction2[
    /* this */ TConnection, 
    /* params */ ParamType, 
    /* reply */ typingsSlinky.jsonRpcWs.mod.ReplyCallback[ParamCallbackType], 
    scala.Unit
  ]
  type ReplyCallback[ParamType] = js.Function2[/* error */ js.Any, /* params */ js.UndefOr[ParamType], scala.Unit]
}
