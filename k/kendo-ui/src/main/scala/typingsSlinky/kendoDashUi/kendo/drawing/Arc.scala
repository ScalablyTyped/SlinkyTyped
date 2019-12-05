package typingsSlinky.kendoDashUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Arc")
@js.native
class Arc protected () extends Element {
  def this(geometry: typingsSlinky.kendoDashUi.kendo.geometry.Arc) = this()
  def this(geometry: typingsSlinky.kendoDashUi.kendo.geometry.Arc, options: ArcOptions) = this()
  @JSName("options")
  var options_Arc: ArcOptions = js.native
  def fill(color: String): Arc = js.native
  def fill(color: String, opacity: Double): Arc = js.native
  def geometry(): typingsSlinky.kendoDashUi.kendo.geometry.Arc = js.native
  def geometry(value: typingsSlinky.kendoDashUi.kendo.geometry.Arc): Unit = js.native
  def stroke(color: String): Arc = js.native
  def stroke(color: String, width: Double): Arc = js.native
  def stroke(color: String, width: Double, opacity: Double): Arc = js.native
}

