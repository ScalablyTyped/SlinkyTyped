package typingsSlinky.devtoolsProtocol.mod.Protocol.Log

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.info
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.verbose
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.verbose
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.info
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.warning
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
*/
trait LogEntryLevel extends js.Object

object LogEntryLevel {
  @scala.inline
  def Error: error = "error".asInstanceOf[error]
  @scala.inline
  def Info: info = "info".asInstanceOf[info]
  @scala.inline
  def Verbose: verbose = "verbose".asInstanceOf[verbose]
  @scala.inline
  def Warning: warning = "warning".asInstanceOf[warning]
}

