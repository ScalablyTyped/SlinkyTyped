package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.PARTIAL
  - typingsSlinky.awsSdk.awsSdkStrings.DELETING
  - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
trait RecoveryPointStatus extends js.Object

object RecoveryPointStatus {
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def PARTIAL: typingsSlinky.awsSdk.awsSdkStrings.PARTIAL = "PARTIAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PARTIAL]
  @scala.inline
  def DELETING: typingsSlinky.awsSdk.awsSdkStrings.DELETING = "DELETING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETING]
  @scala.inline
  def EXPIRED: typingsSlinky.awsSdk.awsSdkStrings.EXPIRED = "EXPIRED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXPIRED]
  @scala.inline
  implicit def apply(value: String): RecoveryPointStatus = value.asInstanceOf[RecoveryPointStatus]
}

