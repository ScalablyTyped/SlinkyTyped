package typingsSlinky.hoxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InterceptionHandler = js.ThisFunction3[
    /* this */ typingsSlinky.hoxy.mod.Proxy, 
    /* req */ typingsSlinky.hoxy.mod.Request, 
    /* res */ typingsSlinky.hoxy.mod.Response, 
    /* cycle */ typingsSlinky.hoxy.mod.Cycle, 
    js.Promise[scala.Unit] | scala.Unit
  ]
  type LoggerCallbackFunction = js.Function1[/* log */ typingsSlinky.hoxy.mod.Log, js.Any]
  type PossibleErrorCallback = js.Function1[/* err */ js.UndefOr[js.Error], js.Any]
  type TesterFunction[T] = js.Function1[/* arg */ T, scala.Boolean]
}
