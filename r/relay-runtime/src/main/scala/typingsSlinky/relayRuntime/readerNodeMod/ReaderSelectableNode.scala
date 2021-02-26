package typingsSlinky.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderSplitOperation
*/
trait ReaderSelectableNode extends StObject
object ReaderSelectableNode {
  
  @scala.inline
  def ReaderFragment(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String
  ): typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment]
  }
  
  @scala.inline
  def ReaderSplitOperation(kind: String, name: String, selections: js.Array[ReaderSelection]): typingsSlinky.relayRuntime.readerNodeMod.ReaderSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderSplitOperation]
  }
}
