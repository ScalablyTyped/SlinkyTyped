package typingsSlinky.relayRuntime.normalizationNodeMod

import typingsSlinky.relayRuntime.relayRuntimeStrings.Defer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationDefer
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLinkedField
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationOperation
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationSplitOperation
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationStream
*/
trait NormalizationSelectableNode extends StObject
object NormalizationSelectableNode {
  
  @scala.inline
  def NormalizationDefer(kind: Defer, label: String, selections: js.Array[NormalizationSelection]): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationDefer = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationDefer]
  }
  
  @scala.inline
  def NormalizationLinkedField(
    args: js.Array[NormalizationArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[NormalizationSelection]
  ): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLinkedField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLinkedField]
  }
  
  @scala.inline
  def NormalizationOperation(
    argumentDefinitions: js.Array[NormalizationLocalArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection]
  ): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationOperation = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationOperation]
  }
  
  @scala.inline
  def NormalizationSplitOperation(kind: String, name: String, selections: js.Array[NormalizationSelection]): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationSplitOperation]
  }
  
  @scala.inline
  def NormalizationStream(kind: String, label: String, selections: js.Array[NormalizationSelection]): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationStream = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationStream]
  }
}
