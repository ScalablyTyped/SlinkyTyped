package typingsSlinky.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.anon.FragmentName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderCondition
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderClientExtension
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderField
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderFragmentSpread
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderInlineFragment
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderMatchField
*/
trait ReaderSelection extends StObject
object ReaderSelection {
  
  @scala.inline
  def ReaderClientExtension(kind: String, selections: js.Array[ReaderSelection]): typingsSlinky.relayRuntime.readerNodeMod.ReaderClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderClientExtension]
  }
  
  @scala.inline
  def ReaderCondition(condition: String, kind: String, passingValue: Boolean, selections: js.Array[ReaderSelection]): typingsSlinky.relayRuntime.readerNodeMod.ReaderCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderCondition]
  }
  
  @scala.inline
  def ReaderFragmentSpread(kind: String, name: String): typingsSlinky.relayRuntime.readerNodeMod.ReaderFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderFragmentSpread]
  }
  
  @scala.inline
  def ReaderInlineFragment(kind: String, selections: js.Array[ReaderSelection], `type`: String): typingsSlinky.relayRuntime.readerNodeMod.ReaderInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderInlineFragment]
  }
  
  @scala.inline
  def ReaderLinkedField(
    args: js.Array[ReaderArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[ReaderSelection]
  ): typingsSlinky.relayRuntime.readerNodeMod.ReaderLinkedField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderLinkedField]
  }
  
  @scala.inline
  def ReaderMatchField(kind: String, matchesByType: StringDictionary[FragmentName], name: String): typingsSlinky.relayRuntime.readerNodeMod.ReaderMatchField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderMatchField]
  }
  
  @scala.inline
  def ReaderScalarField(kind: String, name: String): typingsSlinky.relayRuntime.readerNodeMod.ReaderScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderScalarField]
  }
}
