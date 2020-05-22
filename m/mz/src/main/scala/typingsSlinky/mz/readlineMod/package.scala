package typingsSlinky.mz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readlineMod {
  type AsyncCompleter = (js.Function2[
    /* line */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ js.UndefOr[scala.Null | js.Error], 
      /* result */ js.UndefOr[typingsSlinky.node.readlineMod.CompleterResult], 
      scala.Unit
    ], 
    scala.Unit
  ]) | (js.Function1[
    /* line */ java.lang.String, 
    js.Promise[typingsSlinky.node.readlineMod.CompleterResult]
  ])
  type Completer = typingsSlinky.mz.readlineMod.AsyncCompleter | typingsSlinky.node.readlineMod.Completer
  type ReadLine = typingsSlinky.mz.readlineMod.Interface
}
