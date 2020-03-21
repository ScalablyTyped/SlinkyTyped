package typingsSlinky.kendoUi.kendo.dataviz.geometry

import typingsSlinky.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Transformation")
@js.native
class Transformation () extends Observable_ {
  var options: TransformationOptions = js.native
  def equals(other: typingsSlinky.kendoUi.kendo.geometry.Transformation): Boolean = js.native
  def matrix(): typingsSlinky.kendoUi.kendo.geometry.Matrix = js.native
  def multiply(transformation: typingsSlinky.kendoUi.kendo.geometry.Transformation): typingsSlinky.kendoUi.kendo.geometry.Transformation = js.native
  def rotate(angle: Double, center: js.Any): typingsSlinky.kendoUi.kendo.geometry.Transformation = js.native
  def rotate(angle: Double, center: typingsSlinky.kendoUi.kendo.geometry.Point): typingsSlinky.kendoUi.kendo.geometry.Transformation = js.native
  def scale(scaleX: Double, scaleY: Double): typingsSlinky.kendoUi.kendo.geometry.Transformation = js.native
  def translate(x: Double, y: Double): typingsSlinky.kendoUi.kendo.geometry.Transformation = js.native
}

