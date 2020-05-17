package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DEBUG
  - typingsSlinky.awsSdk.awsSdkStrings.INFO
  - typingsSlinky.awsSdk.awsSdkStrings.WARN
  - typingsSlinky.awsSdk.awsSdkStrings.ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.FATAL
  - java.lang.String
*/
trait LoggerLevel extends js.Object

object LoggerLevel {
  @scala.inline
  def DEBUG: typingsSlinky.awsSdk.awsSdkStrings.DEBUG = "DEBUG".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEBUG]
  @scala.inline
  def INFO: typingsSlinky.awsSdk.awsSdkStrings.INFO = "INFO".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INFO]
  @scala.inline
  def WARN: typingsSlinky.awsSdk.awsSdkStrings.WARN = "WARN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WARN]
  @scala.inline
  def ERROR: typingsSlinky.awsSdk.awsSdkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ERROR]
  @scala.inline
  def FATAL: typingsSlinky.awsSdk.awsSdkStrings.FATAL = "FATAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FATAL]
  @scala.inline
  implicit def apply(value: String): LoggerLevel = value.asInstanceOf[LoggerLevel]
}

