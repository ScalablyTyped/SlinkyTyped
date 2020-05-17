package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SMS
  - typingsSlinky.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
trait DeliveryMediumType extends js.Object

object DeliveryMediumType {
  @scala.inline
  def SMS: typingsSlinky.awsSdk.awsSdkStrings.SMS = "SMS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SMS]
  @scala.inline
  def EMAIL: typingsSlinky.awsSdk.awsSdkStrings.EMAIL = "EMAIL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EMAIL]
  @scala.inline
  implicit def apply(value: String): DeliveryMediumType = value.asInstanceOf[DeliveryMediumType]
}

