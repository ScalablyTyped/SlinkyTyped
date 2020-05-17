package typingsSlinky.mz.readlineMod

import typingsSlinky.node.readlineMod.CompleterResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * line * / java.lang.String, 
/ * callback * / js.Function2[
  / * err * / js.UndefOr[scala.Null | typingsSlinky.std.Error], 
  / * result * / js.UndefOr[typingsSlinky.node.readlineMod.CompleterResult], 
  scala.Unit
], 
scala.Unit]
  - js.Function1[
/ * line * / java.lang.String, 
js.Promise[typingsSlinky.node.readlineMod.CompleterResult]]
*/
trait AsyncCompleter extends Completer

object AsyncCompleter {
  @scala.inline
  implicit def apply(value: js.Function1[/* line */ String, js.Promise[CompleterResult]]): AsyncCompleter = value.asInstanceOf[AsyncCompleter]
  @scala.inline
  implicit def apply(
    value: js.Function2[
      /* line */ String, 
      /* callback */ js.Function2[
        /* err */ js.UndefOr[Null | js.Error], 
        /* result */ js.UndefOr[CompleterResult], 
        Unit
      ], 
      Unit
    ]
  ): AsyncCompleter = value.asInstanceOf[AsyncCompleter]
}

