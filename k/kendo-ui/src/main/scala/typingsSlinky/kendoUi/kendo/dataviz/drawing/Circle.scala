package typingsSlinky.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Circle
  extends typingsSlinky.kendoUi.kendo.drawing.Element {
  @JSName("options")
  var options_Circle: CircleOptions = js.native
  def fill(color: String): typingsSlinky.kendoUi.kendo.drawing.Circle = js.native
  def fill(color: String, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.Circle = js.native
  def geometry(): typingsSlinky.kendoUi.kendo.geometry.Circle = js.native
  def geometry(value: typingsSlinky.kendoUi.kendo.geometry.Circle): Unit = js.native
  def stroke(color: String): typingsSlinky.kendoUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double): typingsSlinky.kendoUi.kendo.drawing.Circle = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.Circle = js.native
}

