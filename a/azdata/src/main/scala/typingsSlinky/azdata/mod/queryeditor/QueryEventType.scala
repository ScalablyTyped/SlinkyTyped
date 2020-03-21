package typingsSlinky.azdata.mod.queryeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.azdata.azdataStrings.queryStart
  - typingsSlinky.azdata.azdataStrings.queryUpdate
  - typingsSlinky.azdata.azdataStrings.queryStop
  - typingsSlinky.azdata.azdataStrings.executionPlan
  - typingsSlinky.azdata.azdataStrings.visualize
*/
trait QueryEventType extends js.Object

object QueryEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def executionPlan: typingsSlinky.azdata.azdataStrings.executionPlan = this.cast("executionPlan")
  @scala.inline
  def queryStart: typingsSlinky.azdata.azdataStrings.queryStart = this.cast("queryStart")
  @scala.inline
  def queryStop: typingsSlinky.azdata.azdataStrings.queryStop = this.cast("queryStop")
  @scala.inline
  def queryUpdate: typingsSlinky.azdata.azdataStrings.queryUpdate = this.cast("queryUpdate")
  @scala.inline
  def visualize: typingsSlinky.azdata.azdataStrings.visualize = this.cast("visualize")
}

