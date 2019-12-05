package typingsSlinky.allureDashJsDashCommons.allureDashJsDashCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("allure-js-commons", "Attachment")
@js.native
class Attachment protected () extends js.Object {
  def this(title: String, source: js.Any, size: Double, mime: String) = this()
  def addAttachment(attachment: Attachment): Unit = js.native
  def addStep(step: Step): Unit = js.native
  def end(status: Status, error: js.Error): Unit = js.native
  def end(status: Status, error: js.Error, timestamp: Double): Unit = js.native
  def toXML(): String = js.native
}

