package typingsSlinky.ethereumProtocol.mod

import typingsSlinky.ethereumProtocol.mod.AbiType.Constructor
import typingsSlinky.ethereumProtocol.mod.AbiType.Fallback
import typingsSlinky.ethereumProtocol.mod.AbiType.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ethereumProtocol.mod.MethodAbi
  - typingsSlinky.ethereumProtocol.mod.ConstructorAbi
  - typingsSlinky.ethereumProtocol.mod.FallbackAbi
*/
trait FunctionAbi extends AbiDefinition
object FunctionAbi {
  
  @scala.inline
  def ConstructorAbi(
    inputs: js.Array[DataItem],
    payable: Boolean,
    stateMutability: ConstructorStateMutability,
    `type`: Constructor
  ): typingsSlinky.ethereumProtocol.mod.ConstructorAbi = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ethereumProtocol.mod.ConstructorAbi]
  }
  
  @scala.inline
  def FallbackAbi(payable: Boolean, `type`: Fallback): typingsSlinky.ethereumProtocol.mod.FallbackAbi = {
    val __obj = js.Dynamic.literal(payable = payable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ethereumProtocol.mod.FallbackAbi]
  }
  
  @scala.inline
  def MethodAbi(
    constant: Boolean,
    inputs: js.Array[DataItem],
    name: String,
    outputs: js.Array[DataItem],
    payable: Boolean,
    stateMutability: StateMutability,
    `type`: Function
  ): typingsSlinky.ethereumProtocol.mod.MethodAbi = {
    val __obj = js.Dynamic.literal(constant = constant.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ethereumProtocol.mod.MethodAbi]
  }
}
