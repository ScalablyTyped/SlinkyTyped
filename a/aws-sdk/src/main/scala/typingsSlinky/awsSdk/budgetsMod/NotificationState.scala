package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.OK
  - typingsSlinky.awsSdk.awsSdkStrings.ALARM
  - java.lang.String
*/
trait NotificationState extends js.Object

object NotificationState {
  @scala.inline
  def OK: typingsSlinky.awsSdk.awsSdkStrings.OK = "OK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OK]
  @scala.inline
  def ALARM: typingsSlinky.awsSdk.awsSdkStrings.ALARM = "ALARM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALARM]
  @scala.inline
  implicit def apply(value: String): NotificationState = value.asInstanceOf[NotificationState]
}

