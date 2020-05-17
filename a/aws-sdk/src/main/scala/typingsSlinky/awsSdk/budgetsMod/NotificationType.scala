package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTUAL
  - typingsSlinky.awsSdk.awsSdkStrings.FORECASTED
  - java.lang.String
*/
trait NotificationType extends js.Object

object NotificationType {
  @scala.inline
  def ACTUAL: typingsSlinky.awsSdk.awsSdkStrings.ACTUAL = "ACTUAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTUAL]
  @scala.inline
  def FORECASTED: typingsSlinky.awsSdk.awsSdkStrings.FORECASTED = "FORECASTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FORECASTED]
  @scala.inline
  implicit def apply(value: String): NotificationType = value.asInstanceOf[NotificationType]
}

