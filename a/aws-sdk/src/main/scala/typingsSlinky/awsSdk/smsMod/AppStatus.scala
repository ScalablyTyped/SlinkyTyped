package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATING
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
  - typingsSlinky.awsSdk.awsSdkStrings.DELETING
  - typingsSlinky.awsSdk.awsSdkStrings.DELETED
  - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
trait AppStatus extends js.Object

object AppStatus {
  @scala.inline
  def CREATING: typingsSlinky.awsSdk.awsSdkStrings.CREATING = "CREATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATING]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def UPDATING: typingsSlinky.awsSdk.awsSdkStrings.UPDATING = "UPDATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UPDATING]
  @scala.inline
  def DELETING: typingsSlinky.awsSdk.awsSdkStrings.DELETING = "DELETING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETING]
  @scala.inline
  def DELETED: typingsSlinky.awsSdk.awsSdkStrings.DELETED = "DELETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETED]
  @scala.inline
  def DELETE_FAILED: typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED = "DELETE_FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED]
  @scala.inline
  implicit def apply(value: String): AppStatus = value.asInstanceOf[AppStatus]
}

