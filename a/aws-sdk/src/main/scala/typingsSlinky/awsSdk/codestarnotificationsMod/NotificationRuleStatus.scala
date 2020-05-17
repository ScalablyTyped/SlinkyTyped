package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
  - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
trait NotificationRuleStatus extends js.Object

object NotificationRuleStatus {
  @scala.inline
  def ENABLED: typingsSlinky.awsSdk.awsSdkStrings.ENABLED = "ENABLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ENABLED]
  @scala.inline
  def DISABLED: typingsSlinky.awsSdk.awsSdkStrings.DISABLED = "DISABLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISABLED]
  @scala.inline
  implicit def apply(value: String): NotificationRuleStatus = value.asInstanceOf[NotificationRuleStatus]
}

