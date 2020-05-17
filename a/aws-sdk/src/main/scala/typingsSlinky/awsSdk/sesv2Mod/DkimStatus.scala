package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_STARTED
  - java.lang.String
*/
trait DkimStatus extends js.Object

object DkimStatus {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def SUCCESS: typingsSlinky.awsSdk.awsSdkStrings.SUCCESS = "SUCCESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCESS]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def TEMPORARY_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.TEMPORARY_FAILURE = "TEMPORARY_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TEMPORARY_FAILURE]
  @scala.inline
  def NOT_STARTED: typingsSlinky.awsSdk.awsSdkStrings.NOT_STARTED = "NOT_STARTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_STARTED]
  @scala.inline
  implicit def apply(value: String): DkimStatus = value.asInstanceOf[DkimStatus]
}

