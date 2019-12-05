package typingsSlinky.ckeditor.CKEDITOR.plugins

import typingsSlinky.ckeditor.Anon_Weight
import typingsSlinky.ckeditor.CKEDITOR.event
import typingsSlinky.ckeditor.CKEDITOR.plugins.notificationAggregator.task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.notificationAggregator")
@js.native
class notificationAggregator protected () extends event {
  def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, message: String) = this()
  def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, message: String, singularMessage: String) = this()
  val editor: typingsSlinky.ckeditor.CKEDITOR.editor = js.native
  val notification: typingsSlinky.ckeditor.CKEDITOR.plugins.notification = js.native
  def createTask(): task = js.native
  def createTask(options: Anon_Weight): task = js.native
  def getDoneTaskCount(): Double = js.native
  def getPercentage(): Double = js.native
  def getTaskCount(): Double = js.native
  def isFinished(): Boolean = js.native
  def update(): Unit = js.native
}

@JSGlobal("CKEDITOR.plugins.notificationAggregator")
@js.native
object notificationAggregator extends js.Object {
  @js.native
  class task () extends event {
    def this(weight: Double) = this()
    def cancel(): Unit = js.native
    def done(): Unit = js.native
    def isCanceled(): Boolean = js.native
    def isDone(): Boolean = js.native
    def update(weight: Double): Unit = js.native
  }
  
}

