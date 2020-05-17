package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
  - java.lang.String
*/
trait JobStatus extends js.Object

object JobStatus {
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def PARTIAL_SUCCESS: typingsSlinky.awsSdk.awsSdkStrings.PARTIAL_SUCCESS = "PARTIAL_SUCCESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PARTIAL_SUCCESS]
  @scala.inline
  implicit def apply(value: java.lang.String): JobStatus = value.asInstanceOf[JobStatus]
}

