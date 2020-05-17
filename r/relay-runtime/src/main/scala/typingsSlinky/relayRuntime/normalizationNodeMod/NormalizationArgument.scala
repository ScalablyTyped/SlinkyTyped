package typingsSlinky.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLiteral
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationVariable
*/
trait NormalizationArgument extends js.Object

object NormalizationArgument {
  @scala.inline
  implicit def apply(value: NormalizationLiteral): NormalizationArgument = value.asInstanceOf[NormalizationArgument]
  @scala.inline
  implicit def apply(value: NormalizationVariable): NormalizationArgument = value.asInstanceOf[NormalizationArgument]
}

