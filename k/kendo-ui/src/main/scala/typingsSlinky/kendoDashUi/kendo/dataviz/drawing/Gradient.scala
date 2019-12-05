package typingsSlinky.kendoDashUi.kendo.dataviz.drawing

import typingsSlinky.kendoDashUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Gradient")
@js.native
class Gradient () extends Class {
  def this(options: GradientOptions) = this()
  var options: GradientOptions = js.native
  var stops: js.Any = js.native
  def addStop(offset: Double, color: String, opacity: Double): typingsSlinky.kendoDashUi.kendo.drawing.GradientStop = js.native
  def removeStop(stop: typingsSlinky.kendoDashUi.kendo.drawing.GradientStop): Unit = js.native
}

