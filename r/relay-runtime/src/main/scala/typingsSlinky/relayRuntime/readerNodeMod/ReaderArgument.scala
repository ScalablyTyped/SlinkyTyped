package typingsSlinky.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderLiteral
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderVariable
*/
trait ReaderArgument extends js.Object

object ReaderArgument {
  @scala.inline
  implicit def apply(value: ReaderLiteral): ReaderArgument = value.asInstanceOf[ReaderArgument]
  @scala.inline
  implicit def apply(value: ReaderVariable): ReaderArgument = value.asInstanceOf[ReaderArgument]
}

