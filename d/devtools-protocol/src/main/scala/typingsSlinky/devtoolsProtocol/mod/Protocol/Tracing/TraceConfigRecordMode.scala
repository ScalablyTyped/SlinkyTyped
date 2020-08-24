package typingsSlinky.devtoolsProtocol.mod.Protocol.Tracing

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.echoToConsole
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.recordAsMuchAsPossible
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.recordContinuously
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.recordUntilFull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.recordUntilFull
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.recordContinuously
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.recordAsMuchAsPossible
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.echoToConsole
*/
trait TraceConfigRecordMode extends js.Object

object TraceConfigRecordMode {
  @scala.inline
  def EchoToConsole: echoToConsole = "echoToConsole".asInstanceOf[echoToConsole]
  @scala.inline
  def RecordAsMuchAsPossible: recordAsMuchAsPossible = "recordAsMuchAsPossible".asInstanceOf[recordAsMuchAsPossible]
  @scala.inline
  def RecordContinuously: recordContinuously = "recordContinuously".asInstanceOf[recordContinuously]
  @scala.inline
  def RecordUntilFull: recordUntilFull = "recordUntilFull".asInstanceOf[recordUntilFull]
}

