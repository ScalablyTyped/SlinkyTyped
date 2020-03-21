package typingsSlinky.allureJsCommons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("allure-js-commons", "Test")
@js.native
class Test protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, timestamp: Double) = this()
  def addAttachment(attachment: Attachment): Unit = js.native
  def addLabel(name: String, value: String): Unit = js.native
  def addParameter(kind: js.Any, name: String, value: String): Unit = js.native
  def addStep(step: Step): Unit = js.native
  def end(status: Status, error: js.Error): Unit = js.native
  def end(status: Status, error: js.Error, timestamp: Double): Unit = js.native
  def setDescription(description: String, `type`: TYPE): Unit = js.native
  def toXML(): String = js.native
}

