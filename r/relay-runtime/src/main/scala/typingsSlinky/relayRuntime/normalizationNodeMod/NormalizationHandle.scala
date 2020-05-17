package typingsSlinky.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationScalarHandle
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLinkedHandle
*/
trait NormalizationHandle extends NormalizationSelection

object NormalizationHandle {
  @scala.inline
  implicit def apply(value: NormalizationLinkedHandle): NormalizationHandle = value.asInstanceOf[NormalizationHandle]
  @scala.inline
  implicit def apply(value: NormalizationScalarHandle): NormalizationHandle = value.asInstanceOf[NormalizationHandle]
}

