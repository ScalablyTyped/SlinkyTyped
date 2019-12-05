package typingsSlinky.kendoDashUi.kendo.dataviz.geometry

import typingsSlinky.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Circle")
@js.native
class Circle protected () extends Observable {
  def this(center: js.Any, radius: Double) = this()
  def this(center: typingsSlinky.kendoDashUi.kendo.geometry.Point, radius: Double) = this()
  var center: typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  var options: CircleOptions = js.native
  var radius: Double = js.native
  def bbox(matrix: typingsSlinky.kendoDashUi.kendo.geometry.Matrix): typingsSlinky.kendoDashUi.kendo.geometry.Rect = js.native
  def equals(other: typingsSlinky.kendoDashUi.kendo.geometry.Circle): Boolean = js.native
  def getCenter(): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def getRadius(): Double = js.native
  def pointAt(angle: Double): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def setCenter(value: js.Any): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def setCenter(value: typingsSlinky.kendoDashUi.kendo.geometry.Point): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def setRadius(value: Double): typingsSlinky.kendoDashUi.kendo.geometry.Circle = js.native
}

