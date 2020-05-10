package typingsSlinky.relayRuntime.normalizationNodeMod

import typingsSlinky.relayRuntime.relayRuntimeStrings.Defer
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
  def NormalizationDefer(kind: Defer, label: String, selections: js.Array[NormalizationSelection]): NormalizationSelectableNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelectableNode]
  }
  @scala.inline
  def NormalizationOperation(
    argumentDefinitions: js.Array[NormalizationLocalArgument],
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection]
  ): NormalizationSelectableNode = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelectableNode]
  }
  @scala.inline
  def NormalizationSplitOperation(kind: String, name: String, selections: js.Array[NormalizationSelection]): NormalizationSelectableNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelectableNode]
  }
  @scala.inline
  def NormalizationStream(kind: String, label: String, selections: js.Array[NormalizationSelection]): NormalizationSelectableNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSelectableNode]
  }
}

