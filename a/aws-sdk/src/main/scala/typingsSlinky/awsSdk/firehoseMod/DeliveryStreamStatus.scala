package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATING
  - typingsSlinky.awsSdk.awsSdkStrings.CREATING_FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.DELETING
  - typingsSlinky.awsSdk.awsSdkStrings.DELETING_FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
trait DeliveryStreamStatus extends js.Object

object DeliveryStreamStatus {
  @scala.inline
  def CREATING: typingsSlinky.awsSdk.awsSdkStrings.CREATING = "CREATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATING]
  @scala.inline
  def CREATING_FAILED: typingsSlinky.awsSdk.awsSdkStrings.CREATING_FAILED = "CREATING_FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATING_FAILED]
  @scala.inline
  def DELETING: typingsSlinky.awsSdk.awsSdkStrings.DELETING = "DELETING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETING]
  @scala.inline
  def DELETING_FAILED: typingsSlinky.awsSdk.awsSdkStrings.DELETING_FAILED = "DELETING_FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETING_FAILED]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  implicit def apply(value: String): DeliveryStreamStatus = value.asInstanceOf[DeliveryStreamStatus]
}

