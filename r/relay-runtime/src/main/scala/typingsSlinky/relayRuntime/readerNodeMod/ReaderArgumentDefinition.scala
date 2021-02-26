package typingsSlinky.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderLocalArgument
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderRootArgument
*/
trait ReaderArgumentDefinition extends StObject
object ReaderArgumentDefinition {
  
  @scala.inline
  def ReaderLocalArgument(defaultValue: js.Any, kind: String, name: String): typingsSlinky.relayRuntime.readerNodeMod.ReaderLocalArgument = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderLocalArgument]
  }
  
  @scala.inline
  def ReaderRootArgument(kind: String, name: String): typingsSlinky.relayRuntime.readerNodeMod.ReaderRootArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderRootArgument]
  }
}
