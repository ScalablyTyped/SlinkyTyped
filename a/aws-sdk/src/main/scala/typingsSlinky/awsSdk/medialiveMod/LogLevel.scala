package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.WARNING
  - typingsSlinky.awsSdk.awsSdkStrings.INFO
  - typingsSlinky.awsSdk.awsSdkStrings.DEBUG
  - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def ERROR: typingsSlinky.awsSdk.awsSdkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ERROR]
  @scala.inline
  def WARNING: typingsSlinky.awsSdk.awsSdkStrings.WARNING = "WARNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WARNING]
  @scala.inline
  def INFO: typingsSlinky.awsSdk.awsSdkStrings.INFO = "INFO".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INFO]
  @scala.inline
  def DEBUG: typingsSlinky.awsSdk.awsSdkStrings.DEBUG = "DEBUG".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEBUG]
  @scala.inline
  def DISABLED: typingsSlinky.awsSdk.awsSdkStrings.DISABLED = "DISABLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISABLED]
  @scala.inline
  implicit def apply(value: String): LogLevel = value.asInstanceOf[LogLevel]
}

