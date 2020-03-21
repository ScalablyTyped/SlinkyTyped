package typingsSlinky.kendoUi.kendo.dataviz.geometry

import typingsSlinky.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Circle")
@js.native
class Circle protected () extends Observable_ {
  def this(center: js.Any, radius: Double) = this()
  def this(center: typingsSlinky.kendoUi.kendo.geometry.Point, radius: Double) = this()
  var center: typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  var options: CircleOptions = js.native
  var radius: Double = js.native
  def bbox(matrix: typingsSlinky.kendoUi.kendo.geometry.Matrix): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  def equals(other: typingsSlinky.kendoUi.kendo.geometry.Circle): Boolean = js.native
  def getCenter(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def getRadius(): Double = js.native
  def pointAt(angle: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def setCenter(value: js.Any): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def setCenter(value: typingsSlinky.kendoUi.kendo.geometry.Point): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def setRadius(value: Double): typingsSlinky.kendoUi.kendo.geometry.Circle = js.native
}

