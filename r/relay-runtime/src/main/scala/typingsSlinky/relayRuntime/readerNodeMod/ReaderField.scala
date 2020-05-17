package typingsSlinky.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderScalarField
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderLinkedField
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderMatchField
*/
trait ReaderField extends ReaderSelection

object ReaderField {
  @scala.inline
  implicit def apply(value: ReaderLinkedField): ReaderField = value.asInstanceOf[ReaderField]
  @scala.inline
  implicit def apply(value: ReaderMatchField): ReaderField = value.asInstanceOf[ReaderField]
  @scala.inline
  implicit def apply(value: ReaderScalarField): ReaderField = value.asInstanceOf[ReaderField]
}

