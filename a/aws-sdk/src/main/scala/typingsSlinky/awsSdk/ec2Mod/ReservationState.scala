package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.`payment-pending`
  - typingsSlinky.awsSdk.awsSdkStrings.`payment-failed`
  - typingsSlinky.awsSdk.awsSdkStrings.active__
  - typingsSlinky.awsSdk.awsSdkStrings.retired
  - java.lang.String
*/
trait ReservationState extends js.Object

object ReservationState {
  @scala.inline
  def `payment-pending`: typingsSlinky.awsSdk.awsSdkStrings.`payment-pending` = "payment-pending".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`payment-pending`]
  @scala.inline
  def `payment-failed`: typingsSlinky.awsSdk.awsSdkStrings.`payment-failed` = "payment-failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`payment-failed`]
  @scala.inline
  def active__ : typingsSlinky.awsSdk.awsSdkStrings.active__ = "active".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.active__]
  @scala.inline
  def retired: typingsSlinky.awsSdk.awsSdkStrings.retired = "retired".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.retired]
  @scala.inline
  implicit def apply(value: java.lang.String): ReservationState = value.asInstanceOf[ReservationState]
}

