package typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`object`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.bigint
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.boolean
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.function
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.number
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.string
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.symbol
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.undefined
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.wasm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`object`
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.function
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.undefined
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.string
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.number
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.boolean
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.symbol
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.bigint
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.wasm
*/
trait RemoteObjectType extends js.Object

object RemoteObjectType {
  @scala.inline
  def Bigint: bigint = "bigint".asInstanceOf[bigint]
  @scala.inline
  def Boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def Function: function = "function".asInstanceOf[function]
  @scala.inline
  def Number: number = "number".asInstanceOf[number]
  @scala.inline
  def Object: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def String: string = "string".asInstanceOf[string]
  @scala.inline
  def Symbol: symbol = "symbol".asInstanceOf[symbol]
  @scala.inline
  def Undefined: undefined = "undefined".asInstanceOf[undefined]
  @scala.inline
  def Wasm: wasm = "wasm".asInstanceOf[wasm]
}

