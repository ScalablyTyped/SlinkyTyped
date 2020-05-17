package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.APPROVED
  - typingsSlinky.awsSdk.awsSdkStrings.REJECTED
  - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
  - typingsSlinky.awsSdk.awsSdkStrings.ACTION_FAILED
  - java.lang.String
*/
trait ProposalStatus extends js.Object

object ProposalStatus {
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def APPROVED: typingsSlinky.awsSdk.awsSdkStrings.APPROVED = "APPROVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.APPROVED]
  @scala.inline
  def REJECTED: typingsSlinky.awsSdk.awsSdkStrings.REJECTED = "REJECTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REJECTED]
  @scala.inline
  def EXPIRED: typingsSlinky.awsSdk.awsSdkStrings.EXPIRED = "EXPIRED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXPIRED]
  @scala.inline
  def ACTION_FAILED: typingsSlinky.awsSdk.awsSdkStrings.ACTION_FAILED = "ACTION_FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTION_FAILED]
  @scala.inline
  implicit def apply(value: java.lang.String): ProposalStatus = value.asInstanceOf[ProposalStatus]
}

