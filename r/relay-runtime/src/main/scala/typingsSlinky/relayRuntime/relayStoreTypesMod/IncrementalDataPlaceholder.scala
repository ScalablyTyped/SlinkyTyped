package typingsSlinky.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.relayStoreTypesMod.DeferPlaceholder
  - typingsSlinky.relayRuntime.relayStoreTypesMod.StreamPlaceholder
*/
trait IncrementalDataPlaceholder extends js.Object

object IncrementalDataPlaceholder {
  @scala.inline
  implicit def apply(value: DeferPlaceholder): IncrementalDataPlaceholder = value.asInstanceOf[IncrementalDataPlaceholder]
  @scala.inline
  implicit def apply(value: StreamPlaceholder): IncrementalDataPlaceholder = value.asInstanceOf[IncrementalDataPlaceholder]
}

