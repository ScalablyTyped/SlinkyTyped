package typingsSlinky.kendoUi.kendo.dataviz.geometry

import typingsSlinky.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Point")
@js.native
class Point protected () extends Observable_ {
  def this(x: Double, y: Double) = this()
  var options: PointOptions = js.native
  var x: Double = js.native
  var y: Double = js.native
  def distanceTo(point: typingsSlinky.kendoUi.kendo.geometry.Point): Double = js.native
  def equals(other: typingsSlinky.kendoUi.kendo.geometry.Point): Boolean = js.native
  def getX(): Double = js.native
  def getY(): Double = js.native
  def move(x: Double, y: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def rotate(angle: Double, center: js.Any): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def rotate(angle: Double, center: typingsSlinky.kendoUi.kendo.geometry.Point): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def round(digits: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def scale(scaleX: Double, scaleY: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def scaleCopy(scaleX: Double, scaleY: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def setX(value: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def setY(value: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def toArray(digits: Double): js.Any = js.native
  def toString(digits: Double, separator: String): String = js.native
  def transform(tansformation: typingsSlinky.kendoUi.kendo.geometry.Transformation): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def transformCopy(tansformation: typingsSlinky.kendoUi.kendo.geometry.Transformation): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def translate(dx: Double, dy: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def translateWith(vector: js.Any): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def translateWith(vector: typingsSlinky.kendoUi.kendo.geometry.Point): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Point")
@js.native
object Point extends js.Object {
  def create(x: js.Any, y: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def create(x: Double, y: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def create(x: typingsSlinky.kendoUi.kendo.geometry.Point, y: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def max(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def maxPoint(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def min(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def minPoint(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
}

