package typingsSlinky.forkTsCheckerWebpackPlugin.rpcTypesMod

import typingsSlinky.forkTsCheckerWebpackPlugin.messageMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.forkTsCheckerWebpackPlugin.messageMod.Message
  - js.UndefOr[scala.Nothing]
*/
trait RunResult extends js.Object

object RunResult {
  @scala.inline
  implicit def apply(value: Message): RunResult = value.asInstanceOf[RunResult]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => RunResult): RunResult = value.asInstanceOf[RunResult]
}

