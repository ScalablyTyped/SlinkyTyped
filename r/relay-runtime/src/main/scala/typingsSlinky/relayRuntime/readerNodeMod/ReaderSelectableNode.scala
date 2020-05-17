package typingsSlinky.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderSplitOperation
*/
trait ReaderSelectableNode extends js.Object

object ReaderSelectableNode {
  @scala.inline
  implicit def apply(value: ReaderFragment): ReaderSelectableNode = value.asInstanceOf[ReaderSelectableNode]
  @scala.inline
  implicit def apply(value: ReaderSplitOperation): ReaderSelectableNode = value.asInstanceOf[ReaderSelectableNode]
}

