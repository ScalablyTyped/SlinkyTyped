package typingsSlinky.allureJsCommons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("allure-js-commons", "Step")
@js.native
class Step protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, timestamp: Double) = this()
  
  def addAttachment(attachment: Attachment): Unit = js.native
  
  def addStep(step: Step): Unit = js.native
  
  def end(status: Status, error: js.Error): Unit = js.native
  def end(status: Status, error: js.Error, timestamp: Double): Unit = js.native
  
  def toXML(): String = js.native
}
