package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
trait SubscriptionState extends js.Object

object SubscriptionState {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def INACTIVE: typingsSlinky.awsSdk.awsSdkStrings.INACTIVE = "INACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INACTIVE]
  @scala.inline
  implicit def apply(value: java.lang.String): SubscriptionState = value.asInstanceOf[SubscriptionState]
}

