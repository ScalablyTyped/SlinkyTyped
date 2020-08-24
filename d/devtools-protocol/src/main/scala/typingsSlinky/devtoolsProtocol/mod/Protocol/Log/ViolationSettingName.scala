package typingsSlinky.devtoolsProtocol.mod.Protocol.Log

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.blockedEvent
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.blockedParser
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.discouragedAPIUse
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.handler
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.longLayout
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.longTask
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.recurringHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.longTask
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.longLayout
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.blockedEvent
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.blockedParser
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.discouragedAPIUse
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.handler
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.recurringHandler
*/
trait ViolationSettingName extends js.Object

object ViolationSettingName {
  @scala.inline
  def BlockedEvent: blockedEvent = "blockedEvent".asInstanceOf[blockedEvent]
  @scala.inline
  def BlockedParser: blockedParser = "blockedParser".asInstanceOf[blockedParser]
  @scala.inline
  def DiscouragedAPIUse: discouragedAPIUse = "discouragedAPIUse".asInstanceOf[discouragedAPIUse]
  @scala.inline
  def Handler: handler = "handler".asInstanceOf[handler]
  @scala.inline
  def LongLayout: longLayout = "longLayout".asInstanceOf[longLayout]
  @scala.inline
  def LongTask: longTask = "longTask".asInstanceOf[longTask]
  @scala.inline
  def RecurringHandler: recurringHandler = "recurringHandler".asInstanceOf[recurringHandler]
}

