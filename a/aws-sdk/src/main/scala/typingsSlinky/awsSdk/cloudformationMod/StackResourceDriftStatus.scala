package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC
  - typingsSlinky.awsSdk.awsSdkStrings.MODIFIED
  - typingsSlinky.awsSdk.awsSdkStrings.DELETED
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_CHECKED
  - java.lang.String
*/
trait StackResourceDriftStatus extends js.Object

object StackResourceDriftStatus {
  @scala.inline
  def IN_SYNC: typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC = "IN_SYNC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC]
  @scala.inline
  def MODIFIED: typingsSlinky.awsSdk.awsSdkStrings.MODIFIED = "MODIFIED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MODIFIED]
  @scala.inline
  def DELETED: typingsSlinky.awsSdk.awsSdkStrings.DELETED = "DELETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETED]
  @scala.inline
  def NOT_CHECKED: typingsSlinky.awsSdk.awsSdkStrings.NOT_CHECKED = "NOT_CHECKED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_CHECKED]
  @scala.inline
  implicit def apply(value: String): StackResourceDriftStatus = value.asInstanceOf[StackResourceDriftStatus]
}

