package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCESSFUL
  - typingsSlinky.awsSdk.awsSdkStrings.THROTTLED
  - typingsSlinky.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
  - typingsSlinky.awsSdk.awsSdkStrings.PERMANENT_FAILURE
  - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN_FAILURE
  - typingsSlinky.awsSdk.awsSdkStrings.OPT_OUT
  - typingsSlinky.awsSdk.awsSdkStrings.DUPLICATE
  - java.lang.String
*/
trait DeliveryStatus extends js.Object

object DeliveryStatus {
  @scala.inline
  def SUCCESSFUL: typingsSlinky.awsSdk.awsSdkStrings.SUCCESSFUL = "SUCCESSFUL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCESSFUL]
  @scala.inline
  def THROTTLED: typingsSlinky.awsSdk.awsSdkStrings.THROTTLED = "THROTTLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.THROTTLED]
  @scala.inline
  def TEMPORARY_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.TEMPORARY_FAILURE = "TEMPORARY_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TEMPORARY_FAILURE]
  @scala.inline
  def PERMANENT_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.PERMANENT_FAILURE = "PERMANENT_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PERMANENT_FAILURE]
  @scala.inline
  def UNKNOWN_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN_FAILURE = "UNKNOWN_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN_FAILURE]
  @scala.inline
  def OPT_OUT: typingsSlinky.awsSdk.awsSdkStrings.OPT_OUT = "OPT_OUT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OPT_OUT]
  @scala.inline
  def DUPLICATE: typingsSlinky.awsSdk.awsSdkStrings.DUPLICATE = "DUPLICATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DUPLICATE]
  @scala.inline
  implicit def apply(value: String): DeliveryStatus = value.asInstanceOf[DeliveryStatus]
}

