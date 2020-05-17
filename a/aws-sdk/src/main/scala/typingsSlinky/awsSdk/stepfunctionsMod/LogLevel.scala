package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ALL
  - typingsSlinky.awsSdk.awsSdkStrings.ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.FATAL
  - typingsSlinky.awsSdk.awsSdkStrings.OFF
  - java.lang.String
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def ALL: typingsSlinky.awsSdk.awsSdkStrings.ALL = "ALL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALL]
  @scala.inline
  def ERROR: typingsSlinky.awsSdk.awsSdkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ERROR]
  @scala.inline
  def FATAL: typingsSlinky.awsSdk.awsSdkStrings.FATAL = "FATAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FATAL]
  @scala.inline
  def OFF: typingsSlinky.awsSdk.awsSdkStrings.OFF = "OFF".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OFF]
  @scala.inline
  implicit def apply(value: String): LogLevel = value.asInstanceOf[LogLevel]
}

