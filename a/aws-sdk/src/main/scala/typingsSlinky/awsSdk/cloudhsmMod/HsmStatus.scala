package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
  - typingsSlinky.awsSdk.awsSdkStrings.SUSPENDED
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATING
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
  - typingsSlinky.awsSdk.awsSdkStrings.DEGRADED
  - java.lang.String
*/
trait HsmStatus extends js.Object

object HsmStatus {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def UPDATING: typingsSlinky.awsSdk.awsSdkStrings.UPDATING = "UPDATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UPDATING]
  @scala.inline
  def SUSPENDED: typingsSlinky.awsSdk.awsSdkStrings.SUSPENDED = "SUSPENDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUSPENDED]
  @scala.inline
  def TERMINATING: typingsSlinky.awsSdk.awsSdkStrings.TERMINATING = "TERMINATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATING]
  @scala.inline
  def TERMINATED: typingsSlinky.awsSdk.awsSdkStrings.TERMINATED = "TERMINATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATED]
  @scala.inline
  def DEGRADED: typingsSlinky.awsSdk.awsSdkStrings.DEGRADED = "DEGRADED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEGRADED]
  @scala.inline
  implicit def apply(value: java.lang.String): HsmStatus = value.asInstanceOf[HsmStatus]
}

