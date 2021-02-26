package typingsSlinky.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderLiteral
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderVariable
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderObjectValue
  - typingsSlinky.relayRuntime.readerNodeMod.ReaderListValue
*/
trait ReaderArgument extends StObject
object ReaderArgument {
  
  @scala.inline
  def ReaderListValue(items: js.Array[ReaderArgument | Null], kind: String, name: String): typingsSlinky.relayRuntime.readerNodeMod.ReaderListValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderListValue]
  }
  
  @scala.inline
  def ReaderLiteral(kind: String, name: String, value: js.Any): typingsSlinky.relayRuntime.readerNodeMod.ReaderLiteral = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderLiteral]
  }
  
  @scala.inline
  def ReaderObjectValue(fields: js.Array[ReaderArgument], kind: String, name: String): typingsSlinky.relayRuntime.readerNodeMod.ReaderObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderObjectValue]
  }
  
  @scala.inline
  def ReaderVariable(kind: String, name: String, variableName: String): typingsSlinky.relayRuntime.readerNodeMod.ReaderVariable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.readerNodeMod.ReaderVariable]
  }
}
