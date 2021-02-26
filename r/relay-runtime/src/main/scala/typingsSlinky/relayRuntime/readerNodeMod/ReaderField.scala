package typingsSlinky.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.anon.FragmentName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderScalarField
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderLinkedField
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderMatchField
*/
trait ReaderField extends ReaderSelection
object ReaderField {
  
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
