package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DRIFTED
  - typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC
  - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_CHECKED
  - java.lang.String
*/
trait StackDriftStatus extends js.Object

object StackDriftStatus {
  @scala.inline
  def DRIFTED: typingsSlinky.awsSdk.awsSdkStrings.DRIFTED = "DRIFTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DRIFTED]
  @scala.inline
  def IN_SYNC: typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC = "IN_SYNC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC]
  @scala.inline
  def UNKNOWN: typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN]
  @scala.inline
  def NOT_CHECKED: typingsSlinky.awsSdk.awsSdkStrings.NOT_CHECKED = "NOT_CHECKED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_CHECKED]
  @scala.inline
  implicit def apply(value: String): StackDriftStatus = value.asInstanceOf[StackDriftStatus]
}

