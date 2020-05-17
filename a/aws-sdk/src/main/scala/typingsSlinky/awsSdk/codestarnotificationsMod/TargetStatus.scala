package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.UNREACHABLE
  - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.DEACTIVATED
  - java.lang.String
*/
trait TargetStatus extends js.Object

object TargetStatus {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def UNREACHABLE: typingsSlinky.awsSdk.awsSdkStrings.UNREACHABLE = "UNREACHABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNREACHABLE]
  @scala.inline
  def INACTIVE: typingsSlinky.awsSdk.awsSdkStrings.INACTIVE = "INACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INACTIVE]
  @scala.inline
  def DEACTIVATED: typingsSlinky.awsSdk.awsSdkStrings.DEACTIVATED = "DEACTIVATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEACTIVATED]
  @scala.inline
  implicit def apply(value: String): TargetStatus = value.asInstanceOf[TargetStatus]
}

