package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.READY
  - typingsSlinky.awsSdk.awsSdkStrings.CREATING
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_DELETION
  - typingsSlinky.awsSdk.awsSdkStrings.DELETING
  - typingsSlinky.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
trait AccountRoleStatus extends js.Object

object AccountRoleStatus {
  @scala.inline
  def READY: typingsSlinky.awsSdk.awsSdkStrings.READY = "READY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READY]
  @scala.inline
  def CREATING: typingsSlinky.awsSdk.awsSdkStrings.CREATING = "CREATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATING]
  @scala.inline
  def PENDING_DELETION: typingsSlinky.awsSdk.awsSdkStrings.PENDING_DELETION = "PENDING_DELETION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_DELETION]
  @scala.inline
  def DELETING: typingsSlinky.awsSdk.awsSdkStrings.DELETING = "DELETING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETING]
  @scala.inline
  def DELETED: typingsSlinky.awsSdk.awsSdkStrings.DELETED = "DELETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETED]
  @scala.inline
  implicit def apply(value: String): AccountRoleStatus = value.asInstanceOf[AccountRoleStatus]
}

