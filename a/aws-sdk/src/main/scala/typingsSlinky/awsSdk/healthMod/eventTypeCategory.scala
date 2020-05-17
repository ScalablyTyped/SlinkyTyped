package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.issue
  - typingsSlinky.awsSdk.awsSdkStrings.accountNotification
  - typingsSlinky.awsSdk.awsSdkStrings.scheduledChange
  - typingsSlinky.awsSdk.awsSdkStrings.investigation
  - java.lang.String
*/
trait eventTypeCategory extends js.Object

object eventTypeCategory {
  @scala.inline
  def issue: typingsSlinky.awsSdk.awsSdkStrings.issue = "issue".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.issue]
  @scala.inline
  def accountNotification: typingsSlinky.awsSdk.awsSdkStrings.accountNotification = "accountNotification".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.accountNotification]
  @scala.inline
  def scheduledChange: typingsSlinky.awsSdk.awsSdkStrings.scheduledChange = "scheduledChange".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.scheduledChange]
  @scala.inline
  def investigation: typingsSlinky.awsSdk.awsSdkStrings.investigation = "investigation".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.investigation]
  @scala.inline
  implicit def apply(value: String): eventTypeCategory = value.asInstanceOf[eventTypeCategory]
}

