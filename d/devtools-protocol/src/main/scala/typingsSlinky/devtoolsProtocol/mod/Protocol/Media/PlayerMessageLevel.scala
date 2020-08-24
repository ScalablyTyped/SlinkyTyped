package typingsSlinky.devtoolsProtocol.mod.Protocol.Media

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.debug
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.info
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.warning
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.info
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.debug
*/
trait PlayerMessageLevel extends js.Object

object PlayerMessageLevel {
  @scala.inline
  def Debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def Error: error = "error".asInstanceOf[error]
  @scala.inline
  def Info: info = "info".asInstanceOf[info]
  @scala.inline
  def Warning: warning = "warning".asInstanceOf[warning]
}

