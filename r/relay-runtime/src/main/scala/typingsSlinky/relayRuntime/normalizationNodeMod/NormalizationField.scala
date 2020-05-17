package typingsSlinky.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationScalarField
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLinkedField
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationMatchField
*/
trait NormalizationField extends NormalizationSelection

object NormalizationField {
  @scala.inline
  implicit def apply(value: NormalizationLinkedField): NormalizationField = value.asInstanceOf[NormalizationField]
  @scala.inline
  implicit def apply(value: NormalizationMatchField): NormalizationField = value.asInstanceOf[NormalizationField]
  @scala.inline
  implicit def apply(value: NormalizationScalarField): NormalizationField = value.asInstanceOf[NormalizationField]
}

