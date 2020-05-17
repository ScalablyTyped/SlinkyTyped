package typingsSlinky.mz.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mz.readlineMod.AsyncCompleter
  - typingsSlinky.node.readlineMod.Completer
*/
trait Completer extends js.Object

object Completer {
  @scala.inline
  implicit def apply(value: AsyncCompleter): Completer = value.asInstanceOf[Completer]
  @scala.inline
  implicit def apply(value: typingsSlinky.node.readlineMod.Completer): Completer = value.asInstanceOf[Completer]
}

