package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.NotStarted
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.Running
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.Completed
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.Failed
*/
trait OperationStatus extends js.Object

object OperationStatus {
  @scala.inline
  def Completed: typingsSlinky.microsoftGraph.microsoftGraphStrings.Completed = this.cast("Completed")
  @scala.inline
  def Failed: typingsSlinky.microsoftGraph.microsoftGraphStrings.Failed = this.cast("Failed")
  @scala.inline
  def NotStarted: typingsSlinky.microsoftGraph.microsoftGraphStrings.NotStarted = this.cast("NotStarted")
  @scala.inline
  def Running: typingsSlinky.microsoftGraph.microsoftGraphStrings.Running = this.cast("Running")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

