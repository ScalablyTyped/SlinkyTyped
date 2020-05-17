package typingsSlinky.jestWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ChildMessageCall = js.Tuple4[
    typingsSlinky.jestWorker.jestWorkerNumbers.`1`, 
    scala.Boolean, 
    java.lang.String, 
    js.Array[js.Any]
  ]
  type ChildMessageEnd = js.Tuple2[typingsSlinky.jestWorker.jestWorkerNumbers.`2`, scala.Boolean]
  type ChildMessageInitialize = js.Tuple5[
    typingsSlinky.jestWorker.jestWorkerNumbers.`0`, 
    scala.Boolean, 
    java.lang.String, 
    js.UndefOr[// file
  js.Array[js.Any]], 
    js.UndefOr[// setupArgs
  typingsSlinky.jestWorker.typesMod.MessagePort]
  ]
  type OnEnd = js.Function2[/* err */ js.Error | scala.Null, /* result */ js.Any, scala.Unit]
  type OnStart = js.Function1[/* worker */ typingsSlinky.jestWorker.typesMod.WorkerInterface, scala.Unit]
  type ParentMessageError = js.Tuple5[
    typingsSlinky.jestWorker.typesMod.PARENT_MESSAGE_ERROR, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    js.Any
  ]
  type ParentMessageOk = js.Tuple2[typingsSlinky.jestWorker.jestWorkerNumbers.`0`, js.Any]
}
