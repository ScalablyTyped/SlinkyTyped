package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATING
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.DELETING
  - typingsSlinky.awsSdk.awsSdkStrings.DELETED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_CREATE
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_DELETE
  - java.lang.String
*/
trait FleetStatus extends js.Object

object FleetStatus {
  @scala.inline
  def CREATING: typingsSlinky.awsSdk.awsSdkStrings.CREATING = "CREATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATING]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def DELETING: typingsSlinky.awsSdk.awsSdkStrings.DELETING = "DELETING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETING]
  @scala.inline
  def DELETED: typingsSlinky.awsSdk.awsSdkStrings.DELETED = "DELETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETED]
  @scala.inline
  def FAILED_TO_CREATE: typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_CREATE = "FAILED_TO_CREATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_CREATE]
  @scala.inline
  def FAILED_TO_DELETE: typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_DELETE = "FAILED_TO_DELETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_DELETE]
  @scala.inline
  implicit def apply(value: String): FleetStatus = value.asInstanceOf[FleetStatus]
}

