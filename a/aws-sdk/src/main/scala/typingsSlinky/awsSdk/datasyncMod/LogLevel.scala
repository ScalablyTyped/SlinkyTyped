package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.OFF
  - typingsSlinky.awsSdk.awsSdkStrings.BASIC
  - typingsSlinky.awsSdk.awsSdkStrings.TRANSFER
  - java.lang.String
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def OFF: typingsSlinky.awsSdk.awsSdkStrings.OFF = "OFF".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OFF]
  @scala.inline
  def BASIC: typingsSlinky.awsSdk.awsSdkStrings.BASIC = "BASIC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BASIC]
  @scala.inline
  def TRANSFER: typingsSlinky.awsSdk.awsSdkStrings.TRANSFER = "TRANSFER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TRANSFER]
  @scala.inline
  implicit def apply(value: String): LogLevel = value.asInstanceOf[LogLevel]
}

