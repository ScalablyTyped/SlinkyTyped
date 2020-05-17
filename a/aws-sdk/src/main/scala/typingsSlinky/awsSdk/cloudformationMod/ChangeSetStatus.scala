package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATE_PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.CREATE_COMPLETE
  - typingsSlinky.awsSdk.awsSdkStrings.DELETE_COMPLETE
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait ChangeSetStatus extends js.Object

object ChangeSetStatus {
  @scala.inline
  def CREATE_PENDING: typingsSlinky.awsSdk.awsSdkStrings.CREATE_PENDING = "CREATE_PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATE_PENDING]
  @scala.inline
  def CREATE_IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS]
  @scala.inline
  def CREATE_COMPLETE: typingsSlinky.awsSdk.awsSdkStrings.CREATE_COMPLETE = "CREATE_COMPLETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATE_COMPLETE]
  @scala.inline
  def DELETE_COMPLETE: typingsSlinky.awsSdk.awsSdkStrings.DELETE_COMPLETE = "DELETE_COMPLETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETE_COMPLETE]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: String): ChangeSetStatus = value.asInstanceOf[ChangeSetStatus]
}

