package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NEW
  - typingsSlinky.awsSdk.awsSdkStrings.ASSIGNED
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.DEFERRED
  - typingsSlinky.awsSdk.awsSdkStrings.RESOLVED
  - java.lang.String
*/
trait WorkflowState extends js.Object

object WorkflowState {
  @scala.inline
  def NEW: typingsSlinky.awsSdk.awsSdkStrings.NEW = "NEW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NEW]
  @scala.inline
  def ASSIGNED: typingsSlinky.awsSdk.awsSdkStrings.ASSIGNED = "ASSIGNED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ASSIGNED]
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def DEFERRED: typingsSlinky.awsSdk.awsSdkStrings.DEFERRED = "DEFERRED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEFERRED]
  @scala.inline
  def RESOLVED: typingsSlinky.awsSdk.awsSdkStrings.RESOLVED = "RESOLVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RESOLVED]
  @scala.inline
  implicit def apply(value: String): WorkflowState = value.asInstanceOf[WorkflowState]
}

