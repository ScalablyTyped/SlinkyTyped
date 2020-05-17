package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.DELETING
  - typingsSlinky.awsSdk.awsSdkStrings.DELETED
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.PAUSED_ON_FAILURE
  - typingsSlinky.awsSdk.awsSdkStrings.FAILING
  - java.lang.String
*/
trait ReplicationJobState extends js.Object

object ReplicationJobState {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def DELETING: typingsSlinky.awsSdk.awsSdkStrings.DELETING = "DELETING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETING]
  @scala.inline
  def DELETED: typingsSlinky.awsSdk.awsSdkStrings.DELETED = "DELETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETED]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def PAUSED_ON_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.PAUSED_ON_FAILURE = "PAUSED_ON_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PAUSED_ON_FAILURE]
  @scala.inline
  def FAILING: typingsSlinky.awsSdk.awsSdkStrings.FAILING = "FAILING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILING]
  @scala.inline
  implicit def apply(value: String): ReplicationJobState = value.asInstanceOf[ReplicationJobState]
}

