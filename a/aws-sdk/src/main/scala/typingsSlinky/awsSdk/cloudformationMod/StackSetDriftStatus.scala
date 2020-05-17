package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DRIFTED
  - typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_CHECKED
  - java.lang.String
*/
trait StackSetDriftStatus extends js.Object

object StackSetDriftStatus {
  @scala.inline
  def DRIFTED: typingsSlinky.awsSdk.awsSdkStrings.DRIFTED = "DRIFTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DRIFTED]
  @scala.inline
  def IN_SYNC: typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC = "IN_SYNC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC]
  @scala.inline
  def NOT_CHECKED: typingsSlinky.awsSdk.awsSdkStrings.NOT_CHECKED = "NOT_CHECKED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_CHECKED]
  @scala.inline
  implicit def apply(value: String): StackSetDriftStatus = value.asInstanceOf[StackSetDriftStatus]
}

