package typingsSlinky.ckeditor.CKEDITOR.plugins

import typingsSlinky.ckeditor.CKEDITOR.event
import typingsSlinky.ckeditor.CKEDITOR.plugins.notificationAggregator.task
import typingsSlinky.ckeditor.anon.Weight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait notificationAggregator extends event {
  
  def createTask(): task = js.native
  def createTask(options: Weight): task = js.native
  
  val editor: typingsSlinky.ckeditor.CKEDITOR.editor = js.native
  
  def getDoneTaskCount(): Double = js.native
  
  def getPercentage(): Double = js.native
  
  def getTaskCount(): Double = js.native
  
  def isFinished(): Boolean = js.native
  
  val notification: typingsSlinky.ckeditor.CKEDITOR.plugins.notification = js.native
  
  def update(): Unit = js.native
}
@JSGlobal("CKEDITOR.plugins.notificationAggregator")
@js.native
object notificationAggregator extends js.Object {
  
  @js.native
  trait task extends event {
    
    def cancel(): Unit = js.native
    
    def done(): Unit = js.native
    
    def isCanceled(): Boolean = js.native
    
    def isDone(): Boolean = js.native
    
    def update(weight: Double): Unit = js.native
  }
}
