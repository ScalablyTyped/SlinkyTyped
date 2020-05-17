package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Pending_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - typingsSlinky.awsSdk.awsSdkStrings.Scheduled_
  - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
trait ScheduleStatus extends js.Object

object ScheduleStatus {
  @scala.inline
  def Pending_ : typingsSlinky.awsSdk.awsSdkStrings.Pending_ = "Pending".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Pending_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  def Scheduled_ : typingsSlinky.awsSdk.awsSdkStrings.Scheduled_ = "Scheduled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Scheduled_]
  @scala.inline
  def Stopped_ : typingsSlinky.awsSdk.awsSdkStrings.Stopped_ = "Stopped".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Stopped_]
  @scala.inline
  implicit def apply(value: java.lang.String): ScheduleStatus = value.asInstanceOf[ScheduleStatus]
}

