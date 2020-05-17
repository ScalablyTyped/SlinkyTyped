package typingsSlinky.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderCondition
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderClientExtension
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderField
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderFragmentSpread
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderInlineFragment
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderMatchField
*/
trait ReaderSelection extends js.Object

object ReaderSelection {
  @scala.inline
  implicit def apply(value: ReaderClientExtension): ReaderSelection = value.asInstanceOf[ReaderSelection]
  @scala.inline
  implicit def apply(value: ReaderCondition): ReaderSelection = value.asInstanceOf[ReaderSelection]
  @scala.inline
  implicit def apply(value: ReaderField): ReaderSelection = value.asInstanceOf[ReaderSelection]
  @scala.inline
  implicit def apply(value: ReaderFragmentSpread): ReaderSelection = value.asInstanceOf[ReaderSelection]
  @scala.inline
  implicit def apply(value: ReaderInlineFragment): ReaderSelection = value.asInstanceOf[ReaderSelection]
  @scala.inline
  implicit def apply(value: ReaderMatchField): ReaderSelection = value.asInstanceOf[ReaderSelection]
}

