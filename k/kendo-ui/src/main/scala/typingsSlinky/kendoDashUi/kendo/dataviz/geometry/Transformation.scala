package typingsSlinky.kendoDashUi.kendo.dataviz.geometry

import typingsSlinky.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Transformation")
@js.native
class Transformation () extends Observable {
  var options: TransformationOptions = js.native
  def equals(other: typingsSlinky.kendoDashUi.kendo.geometry.Transformation): Boolean = js.native
  def matrix(): typingsSlinky.kendoDashUi.kendo.geometry.Matrix = js.native
  def multiply(transformation: typingsSlinky.kendoDashUi.kendo.geometry.Transformation): typingsSlinky.kendoDashUi.kendo.geometry.Transformation = js.native
  def rotate(angle: Double, center: js.Any): typingsSlinky.kendoDashUi.kendo.geometry.Transformation = js.native
  def rotate(angle: Double, center: typingsSlinky.kendoDashUi.kendo.geometry.Point): typingsSlinky.kendoDashUi.kendo.geometry.Transformation = js.native
  def scale(scaleX: Double, scaleY: Double): typingsSlinky.kendoDashUi.kendo.geometry.Transformation = js.native
  def translate(x: Double, y: Double): typingsSlinky.kendoDashUi.kendo.geometry.Transformation = js.native
}

