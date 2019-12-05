package typingsSlinky.kendoDashUi.kendo.dataviz.geometry

import typingsSlinky.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Matrix")
@js.native
class Matrix () extends Observable {
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var f: Double = js.native
  var options: MatrixOptions = js.native
  def equals(other: typingsSlinky.kendoDashUi.kendo.geometry.Matrix): Boolean = js.native
  def multiplyCopy(matrix: typingsSlinky.kendoDashUi.kendo.geometry.Matrix): typingsSlinky.kendoDashUi.kendo.geometry.Matrix = js.native
  def round(digits: Double): typingsSlinky.kendoDashUi.kendo.geometry.Matrix = js.native
  def toArray(digits: Double): js.Any = js.native
  def toString(digits: Double, separator: String): String = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Matrix")
@js.native
object Matrix extends js.Object {
  def rotate(angle: Double, x: Double, y: Double): typingsSlinky.kendoDashUi.kendo.geometry.Matrix = js.native
  def scale(scaleX: Double, scaleY: Double): typingsSlinky.kendoDashUi.kendo.geometry.Matrix = js.native
  def translate(x: Double, y: Double): typingsSlinky.kendoDashUi.kendo.geometry.Matrix = js.native
  def unit(): typingsSlinky.kendoDashUi.kendo.geometry.Matrix = js.native
}

