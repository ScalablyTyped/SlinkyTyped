package typingsSlinky.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.ListValue
  - typingsSlinky.relayCompiler.iRMod.Literal
  - typingsSlinky.relayCompiler.iRMod.ObjectValue
  - typingsSlinky.relayCompiler.iRMod.Variable
*/
trait ArgumentValue extends js.Object
object ArgumentValue {
  
  @scala.inline
  def ListValue(
    items: js.Array[ArgumentValue],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.ListValue,
    loc: Location
  ): ArgumentValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentValue]
  }
  
  @scala.inline
  def Literal(kind: typingsSlinky.relayCompiler.relayCompilerStrings.Literal, loc: Location, value: js.Any): ArgumentValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentValue]
  }
  
  @scala.inline
  def ObjectValue(
    fields: js.Array[ObjectFieldValue],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.ObjectValue,
    loc: Location
  ): ArgumentValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentValue]
  }
  
  @scala.inline
  def Variable(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Variable,
    loc: Location,
    variableName: String
  ): ArgumentValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentValue]
  }
}
