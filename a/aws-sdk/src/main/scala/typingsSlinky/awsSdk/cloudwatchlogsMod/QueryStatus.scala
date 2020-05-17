package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Scheduled_
  - typingsSlinky.awsSdk.awsSdkStrings.Running_
  - typingsSlinky.awsSdk.awsSdkStrings.Complete_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
  - java.lang.String
*/
trait QueryStatus extends js.Object

object QueryStatus {
  @scala.inline
  def Scheduled_ : typingsSlinky.awsSdk.awsSdkStrings.Scheduled_ = "Scheduled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Scheduled_]
  @scala.inline
  def Running_ : typingsSlinky.awsSdk.awsSdkStrings.Running_ = "Running".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Running_]
  @scala.inline
  def Complete_ : typingsSlinky.awsSdk.awsSdkStrings.Complete_ = "Complete".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Complete_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  def Cancelled_ : typingsSlinky.awsSdk.awsSdkStrings.Cancelled_ = "Cancelled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Cancelled_]
  @scala.inline
  implicit def apply(value: String): QueryStatus = value.asInstanceOf[QueryStatus]
}

