package typingsSlinky.devtoolsProtocol.mod.Protocol.Console

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.debug
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.info
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.log
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.log
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.warning
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.debug
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.info
*/
trait ConsoleMessageLevel extends js.Object
object ConsoleMessageLevel {
  
  @scala.inline
  def Debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def Error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def Info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def Log: log = "log".asInstanceOf[log]
  
  @scala.inline
  def Warning: warning = "warning".asInstanceOf[warning]
}
