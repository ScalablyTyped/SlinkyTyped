package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.REPLICA
  - java.lang.String
*/
trait ReplicationStatus extends js.Object

object ReplicationStatus {
  @scala.inline
  def COMPLETE: typingsSlinky.awsSdk.awsSdkStrings.COMPLETE = "COMPLETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETE]
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def REPLICA: typingsSlinky.awsSdk.awsSdkStrings.REPLICA = "REPLICA".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REPLICA]
  @scala.inline
  implicit def apply(value: String): ReplicationStatus = value.asInstanceOf[ReplicationStatus]
}

