package typingsSlinky.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderLocalArgument
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderRootArgument
*/
trait ReaderArgumentDefinition extends js.Object

object ReaderArgumentDefinition {
  @scala.inline
  implicit def apply(value: ReaderLocalArgument): ReaderArgumentDefinition = value.asInstanceOf[ReaderArgumentDefinition]
  @scala.inline
  implicit def apply(value: ReaderRootArgument): ReaderArgumentDefinition = value.asInstanceOf[ReaderArgumentDefinition]
}

