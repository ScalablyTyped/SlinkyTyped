package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.REJECTED
  - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
  - typingsSlinky.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
trait JobExecutionFailureType extends js.Object

object JobExecutionFailureType {
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def REJECTED: typingsSlinky.awsSdk.awsSdkStrings.REJECTED = "REJECTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REJECTED]
  @scala.inline
  def TIMED_OUT: typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT = "TIMED_OUT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT]
  @scala.inline
  def ALL: typingsSlinky.awsSdk.awsSdkStrings.ALL = "ALL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALL]
  @scala.inline
  implicit def apply(value: java.lang.String): JobExecutionFailureType = value.asInstanceOf[JobExecutionFailureType]
}

