package typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`catch`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`wasm-expression-stack`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`with`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.block
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.closure
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.eval
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.global
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.local
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.module
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.script_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.global
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.local
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`with`
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.closure
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`catch`
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.block
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.script_
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.eval
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.module
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`wasm-expression-stack`
*/
trait ScopeType extends js.Object

object ScopeType {
  @scala.inline
  def Block: block = "block".asInstanceOf[block]
  @scala.inline
  def Catch: `catch` = "catch".asInstanceOf[`catch`]
  @scala.inline
  def Closure: closure = "closure".asInstanceOf[closure]
  @scala.inline
  def Eval: eval = "eval".asInstanceOf[eval]
  @scala.inline
  def Global: global = "global".asInstanceOf[global]
  @scala.inline
  def Local: local = "local".asInstanceOf[local]
  @scala.inline
  def Module: module = "module".asInstanceOf[module]
  @scala.inline
  def Script: script_ = "script".asInstanceOf[script_]
  @scala.inline
  def WasmExpressionStack: `wasm-expression-stack` = "wasm-expression-stack".asInstanceOf[`wasm-expression-stack`]
  @scala.inline
  def With: `with` = "with".asInstanceOf[`with`]
}

