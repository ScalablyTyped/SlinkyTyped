package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Email_
  - typingsSlinky.awsSdk.awsSdkStrings.SQS
  - typingsSlinky.awsSdk.awsSdkStrings.SNS
  - java.lang.String
*/
trait NotificationTransport extends js.Object

object NotificationTransport {
  @scala.inline
  def Email_ : typingsSlinky.awsSdk.awsSdkStrings.Email_ = "Email".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Email_]
  @scala.inline
  def SQS: typingsSlinky.awsSdk.awsSdkStrings.SQS = "SQS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SQS]
  @scala.inline
  def SNS: typingsSlinky.awsSdk.awsSdkStrings.SNS = "SNS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SNS]
  @scala.inline
  implicit def apply(value: java.lang.String): NotificationTransport = value.asInstanceOf[NotificationTransport]
}

