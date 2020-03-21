package typingsSlinky.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Rect")
@js.native
class Rect protected ()
  extends typingsSlinky.kendoUi.kendo.drawing.Element {
  def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Rect) = this()
  def this(geometry: typingsSlinky.kendoUi.kendo.geometry.Rect, options: RectOptions) = this()
  @JSName("options")
  var options_Rect: RectOptions = js.native
  def fill(color: String): typingsSlinky.kendoUi.kendo.drawing.Rect = js.native
  def fill(color: String, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.Rect = js.native
  def geometry(): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  def geometry(value: typingsSlinky.kendoUi.kendo.geometry.Rect): Unit = js.native
  def stroke(color: String): typingsSlinky.kendoUi.kendo.drawing.Rect = js.native
  def stroke(color: String, width: Double): typingsSlinky.kendoUi.kendo.drawing.Rect = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.Rect = js.native
}

