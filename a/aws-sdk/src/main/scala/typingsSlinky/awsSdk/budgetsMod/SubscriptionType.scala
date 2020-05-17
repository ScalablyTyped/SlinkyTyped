package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SNS
  - typingsSlinky.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
trait SubscriptionType extends js.Object

object SubscriptionType {
  @scala.inline
  def SNS: typingsSlinky.awsSdk.awsSdkStrings.SNS = "SNS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SNS]
  @scala.inline
  def EMAIL: typingsSlinky.awsSdk.awsSdkStrings.EMAIL = "EMAIL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EMAIL]
  @scala.inline
  implicit def apply(value: String): SubscriptionType = value.asInstanceOf[SubscriptionType]
}

