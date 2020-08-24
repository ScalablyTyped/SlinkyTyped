package typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`return`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.call
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.debuggerStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.debuggerStatement
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.call
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`return`
*/
trait BreakLocationType extends js.Object

object BreakLocationType {
  @scala.inline
  def Call: call = "call".asInstanceOf[call]
  @scala.inline
  def DebuggerStatement: debuggerStatement = "debuggerStatement".asInstanceOf[debuggerStatement]
  @scala.inline
  def Return: `return` = "return".asInstanceOf[`return`]
}

