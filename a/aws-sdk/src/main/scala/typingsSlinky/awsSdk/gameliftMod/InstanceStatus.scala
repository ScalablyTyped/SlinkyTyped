package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATING
  - java.lang.String
*/
trait InstanceStatus extends js.Object

object InstanceStatus {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def TERMINATING: typingsSlinky.awsSdk.awsSdkStrings.TERMINATING = "TERMINATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATING]
  @scala.inline
  implicit def apply(value: String): InstanceStatus = value.asInstanceOf[InstanceStatus]
}

