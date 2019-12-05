package typingsSlinky.kendoDashUi.kendo.dataviz.geometry

import typingsSlinky.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Point")
@js.native
class Point protected () extends Observable {
  def this(x: Double, y: Double) = this()
  var options: PointOptions = js.native
  var x: Double = js.native
  var y: Double = js.native
  def distanceTo(point: typingsSlinky.kendoDashUi.kendo.geometry.Point): Double = js.native
  def equals(other: typingsSlinky.kendoDashUi.kendo.geometry.Point): Boolean = js.native
  def getX(): Double = js.native
  def getY(): Double = js.native
  def move(x: Double, y: Double): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def rotate(angle: Double, center: js.Any): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def rotate(angle: Double, center: typingsSlinky.kendoDashUi.kendo.geometry.Point): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def round(digits: Double): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def scale(scaleX: Double, scaleY: Double): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def scaleCopy(scaleX: Double, scaleY: Double): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def setX(value: Double): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def setY(value: Double): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def toArray(digits: Double): js.Any = js.native
  def toString(digits: Double, separator: String): String = js.native
  def transform(tansformation: typingsSlinky.kendoDashUi.kendo.geometry.Transformation): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def transformCopy(tansformation: typingsSlinky.kendoDashUi.kendo.geometry.Transformation): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def translate(dx: Double, dy: Double): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def translateWith(vector: js.Any): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def translateWith(vector: typingsSlinky.kendoDashUi.kendo.geometry.Point): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Point")
@js.native
object Point extends js.Object {
  def create(x: js.Any, y: Double): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def create(x: Double, y: Double): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def create(x: typingsSlinky.kendoDashUi.kendo.geometry.Point, y: Double): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def max(): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def maxPoint(): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def min(): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def minPoint(): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
}

