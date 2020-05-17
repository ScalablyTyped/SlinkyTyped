package typingsSlinky.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationCondition
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationClientExtension
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationField
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationHandle
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationInlineFragment
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationMatchField
*/
trait NormalizationSelection extends js.Object

object NormalizationSelection {
  @scala.inline
  implicit def apply(value: NormalizationClientExtension): NormalizationSelection = value.asInstanceOf[NormalizationSelection]
  @scala.inline
  implicit def apply(value: NormalizationCondition): NormalizationSelection = value.asInstanceOf[NormalizationSelection]
  @scala.inline
  implicit def apply(value: NormalizationField): NormalizationSelection = value.asInstanceOf[NormalizationSelection]
  @scala.inline
  implicit def apply(value: NormalizationHandle): NormalizationSelection = value.asInstanceOf[NormalizationSelection]
  @scala.inline
  implicit def apply(value: NormalizationInlineFragment): NormalizationSelection = value.asInstanceOf[NormalizationSelection]
  @scala.inline
  implicit def apply(value: NormalizationMatchField): NormalizationSelection = value.asInstanceOf[NormalizationSelection]
}

