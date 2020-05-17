package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.CREATION_FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.DELETION_IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.REBOOT_IN_PROGRESS
  - java.lang.String
*/
trait BrokerState extends js.Object

object BrokerState {
  @scala.inline
  def CREATION_IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS = "CREATION_IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS]
  @scala.inline
  def CREATION_FAILED: typingsSlinky.awsSdk.awsSdkStrings.CREATION_FAILED = "CREATION_FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATION_FAILED]
  @scala.inline
  def DELETION_IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.DELETION_IN_PROGRESS = "DELETION_IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETION_IN_PROGRESS]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def REBOOT_IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.REBOOT_IN_PROGRESS = "REBOOT_IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REBOOT_IN_PROGRESS]
  @scala.inline
  implicit def apply(value: String): BrokerState = value.asInstanceOf[BrokerState]
}

