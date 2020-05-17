package typingsSlinky.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.relayStoreTypesMod.SingularReaderSelector
  - typingsSlinky.relayRuntime.relayStoreTypesMod.PluralReaderSelector
*/
trait ReaderSelector extends js.Object

object ReaderSelector {
  @scala.inline
  implicit def apply(value: PluralReaderSelector): ReaderSelector = value.asInstanceOf[ReaderSelector]
  @scala.inline
  implicit def apply(value: SingularReaderSelector): ReaderSelector = value.asInstanceOf[ReaderSelector]
}

