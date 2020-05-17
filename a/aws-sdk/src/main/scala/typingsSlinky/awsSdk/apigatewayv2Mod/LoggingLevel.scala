package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.INFO
  - typingsSlinky.awsSdk.awsSdkStrings.OFF
  - java.lang.String
*/
trait LoggingLevel extends js.Object

object LoggingLevel {
  @scala.inline
  def ERROR: typingsSlinky.awsSdk.awsSdkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ERROR]
  @scala.inline
  def INFO: typingsSlinky.awsSdk.awsSdkStrings.INFO = "INFO".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INFO]
  @scala.inline
  def OFF: typingsSlinky.awsSdk.awsSdkStrings.OFF = "OFF".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OFF]
  @scala.inline
  implicit def apply(value: String): LoggingLevel = value.asInstanceOf[LoggingLevel]
}

