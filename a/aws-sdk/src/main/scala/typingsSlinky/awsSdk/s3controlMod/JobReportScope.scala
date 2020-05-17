package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AllTasks
  - typingsSlinky.awsSdk.awsSdkStrings.FailedTasksOnly
  - java.lang.String
*/
trait JobReportScope extends js.Object

object JobReportScope {
  @scala.inline
  def AllTasks: typingsSlinky.awsSdk.awsSdkStrings.AllTasks = "AllTasks".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AllTasks]
  @scala.inline
  def FailedTasksOnly: typingsSlinky.awsSdk.awsSdkStrings.FailedTasksOnly = "FailedTasksOnly".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FailedTasksOnly]
  @scala.inline
  implicit def apply(value: String): JobReportScope = value.asInstanceOf[JobReportScope]
}

