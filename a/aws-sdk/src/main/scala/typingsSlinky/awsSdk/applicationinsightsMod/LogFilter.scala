package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.WARN
  - typingsSlinky.awsSdk.awsSdkStrings.INFO
  - java.lang.String
*/
trait LogFilter extends js.Object

object LogFilter {
  @scala.inline
  def ERROR: typingsSlinky.awsSdk.awsSdkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ERROR]
  @scala.inline
  def WARN: typingsSlinky.awsSdk.awsSdkStrings.WARN = "WARN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WARN]
  @scala.inline
  def INFO: typingsSlinky.awsSdk.awsSdkStrings.INFO = "INFO".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INFO]
  @scala.inline
  implicit def apply(value: String): LogFilter = value.asInstanceOf[LogFilter]
}

