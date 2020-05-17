package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.error__
  - typingsSlinky.awsSdk.awsSdkStrings.pending_fulfillment
  - typingsSlinky.awsSdk.awsSdkStrings.pending_termination
  - typingsSlinky.awsSdk.awsSdkStrings.fulfilled__
  - java.lang.String
*/
trait FleetActivityStatus extends js.Object

object FleetActivityStatus {
  @scala.inline
  def error__ : typingsSlinky.awsSdk.awsSdkStrings.error__ = "error".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.error__]
  @scala.inline
  def pending_fulfillment: typingsSlinky.awsSdk.awsSdkStrings.pending_fulfillment = "pending_fulfillment".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.pending_fulfillment]
  @scala.inline
  def pending_termination: typingsSlinky.awsSdk.awsSdkStrings.pending_termination = "pending_termination".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.pending_termination]
  @scala.inline
  def fulfilled__ : typingsSlinky.awsSdk.awsSdkStrings.fulfilled__ = "fulfilled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.fulfilled__]
  @scala.inline
  implicit def apply(value: java.lang.String): FleetActivityStatus = value.asInstanceOf[FleetActivityStatus]
}

