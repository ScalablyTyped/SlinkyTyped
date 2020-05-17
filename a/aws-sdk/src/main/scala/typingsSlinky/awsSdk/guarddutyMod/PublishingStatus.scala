package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VERIFICATION
  - typingsSlinky.awsSdk.awsSdkStrings.PUBLISHING
  - typingsSlinky.awsSdk.awsSdkStrings.UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY
  - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
trait PublishingStatus extends js.Object

object PublishingStatus {
  @scala.inline
  def PENDING_VERIFICATION: typingsSlinky.awsSdk.awsSdkStrings.PENDING_VERIFICATION = "PENDING_VERIFICATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_VERIFICATION]
  @scala.inline
  def PUBLISHING: typingsSlinky.awsSdk.awsSdkStrings.PUBLISHING = "PUBLISHING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PUBLISHING]
  @scala.inline
  def UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY: typingsSlinky.awsSdk.awsSdkStrings.UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY = "UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY]
  @scala.inline
  def STOPPED: typingsSlinky.awsSdk.awsSdkStrings.STOPPED = "STOPPED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOPPED]
  @scala.inline
  implicit def apply(value: java.lang.String): PublishingStatus = value.asInstanceOf[PublishingStatus]
}

