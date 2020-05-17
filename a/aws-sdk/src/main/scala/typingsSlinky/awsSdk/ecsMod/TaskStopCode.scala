package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TaskFailedToStart
  - typingsSlinky.awsSdk.awsSdkStrings.EssentialContainerExited
  - typingsSlinky.awsSdk.awsSdkStrings.UserInitiated
  - java.lang.String
*/
trait TaskStopCode extends js.Object

object TaskStopCode {
  @scala.inline
  def TaskFailedToStart: typingsSlinky.awsSdk.awsSdkStrings.TaskFailedToStart = "TaskFailedToStart".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TaskFailedToStart]
  @scala.inline
  def EssentialContainerExited: typingsSlinky.awsSdk.awsSdkStrings.EssentialContainerExited = "EssentialContainerExited".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EssentialContainerExited]
  @scala.inline
  def UserInitiated: typingsSlinky.awsSdk.awsSdkStrings.UserInitiated = "UserInitiated".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UserInitiated]
  @scala.inline
  implicit def apply(value: java.lang.String): TaskStopCode = value.asInstanceOf[TaskStopCode]
}

