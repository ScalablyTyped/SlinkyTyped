package typingsSlinky.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLocalArgument
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationRootArgument
*/
trait NormalizationArgumentDefinition extends js.Object

object NormalizationArgumentDefinition {
  @scala.inline
  implicit def apply(value: NormalizationLocalArgument): NormalizationArgumentDefinition = value.asInstanceOf[NormalizationArgumentDefinition]
  @scala.inline
  implicit def apply(value: NormalizationRootArgument): NormalizationArgumentDefinition = value.asInstanceOf[NormalizationArgumentDefinition]
}

