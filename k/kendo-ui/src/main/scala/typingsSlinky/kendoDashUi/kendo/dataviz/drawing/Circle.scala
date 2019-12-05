package typingsSlinky.kendoDashUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Circle")
@js.native
class Circle protected ()
  extends typingsSlinky.kendoDashUi.kendo.drawing.Element {
  def this(geometry: typingsSlinky.kendoDashUi.kendo.geometry.Circle) = this()
  def this(geometry: typingsSlinky.kendoDashUi.kendo.geometry.Circle, options: CircleOptions) = this()
  @JSName("options")
  var options_Circle: CircleOptions = js.native
  def fill(color: String): typingsSlinky.kendoDashUi.kendo.drawing.Circle = js.native
  def fill(color: String, opacity: Double): typingsSlinky.kendoDashUi.kendo.drawing.Circle = js.native
  def geometry(): typingsSlinky.kendoDashUi.kendo.geometry.Circle = js.native
  def geometry(value: typingsSlinky.kendoDashUi.kendo.geometry.Circle): Unit = js.native
  def stroke(color: String): typingsSlinky.kendoDashUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double): typingsSlinky.kendoDashUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsSlinky.kendoDashUi.kendo.drawing.Circle = js.native
}

