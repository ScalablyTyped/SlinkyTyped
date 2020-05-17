package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.PASSED
  - typingsSlinky.awsSdk.awsSdkStrings.WARNED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.SKIPPED
  - typingsSlinky.awsSdk.awsSdkStrings.ERRORED
  - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
trait ExecutionResult extends js.Object

object ExecutionResult {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def PASSED: typingsSlinky.awsSdk.awsSdkStrings.PASSED = "PASSED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PASSED]
  @scala.inline
  def WARNED: typingsSlinky.awsSdk.awsSdkStrings.WARNED = "WARNED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WARNED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def SKIPPED: typingsSlinky.awsSdk.awsSdkStrings.SKIPPED = "SKIPPED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SKIPPED]
  @scala.inline
  def ERRORED: typingsSlinky.awsSdk.awsSdkStrings.ERRORED = "ERRORED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ERRORED]
  @scala.inline
  def STOPPED: typingsSlinky.awsSdk.awsSdkStrings.STOPPED = "STOPPED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOPPED]
  @scala.inline
  implicit def apply(value: java.lang.String): ExecutionResult = value.asInstanceOf[ExecutionResult]
}

