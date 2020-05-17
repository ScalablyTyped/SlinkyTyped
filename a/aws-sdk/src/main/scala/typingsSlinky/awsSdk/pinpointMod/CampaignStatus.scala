package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED
  - typingsSlinky.awsSdk.awsSdkStrings.EXECUTING
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_NEXT_RUN
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.PAUSED
  - typingsSlinky.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
trait CampaignStatus extends js.Object

object CampaignStatus {
  @scala.inline
  def SCHEDULED: typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED = "SCHEDULED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED]
  @scala.inline
  def EXECUTING: typingsSlinky.awsSdk.awsSdkStrings.EXECUTING = "EXECUTING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXECUTING]
  @scala.inline
  def PENDING_NEXT_RUN: typingsSlinky.awsSdk.awsSdkStrings.PENDING_NEXT_RUN = "PENDING_NEXT_RUN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_NEXT_RUN]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def PAUSED: typingsSlinky.awsSdk.awsSdkStrings.PAUSED = "PAUSED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PAUSED]
  @scala.inline
  def DELETED: typingsSlinky.awsSdk.awsSdkStrings.DELETED = "DELETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETED]
  @scala.inline
  implicit def apply(value: String): CampaignStatus = value.asInstanceOf[CampaignStatus]
}

