package typingsSlinky.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationDefer
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationOperation
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationSplitOperation
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationStream
*/
trait NormalizationSelectableNode extends js.Object

object NormalizationSelectableNode {
  @scala.inline
  implicit def apply(value: NormalizationDefer): NormalizationSelectableNode = value.asInstanceOf[NormalizationSelectableNode]
  @scala.inline
  implicit def apply(value: NormalizationOperation): NormalizationSelectableNode = value.asInstanceOf[NormalizationSelectableNode]
  @scala.inline
  implicit def apply(value: NormalizationSplitOperation): NormalizationSelectableNode = value.asInstanceOf[NormalizationSelectableNode]
  @scala.inline
  implicit def apply(value: NormalizationStream): NormalizationSelectableNode = value.asInstanceOf[NormalizationSelectableNode]
}

