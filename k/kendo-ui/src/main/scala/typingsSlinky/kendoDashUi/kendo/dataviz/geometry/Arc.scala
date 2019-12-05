package typingsSlinky.kendoDashUi.kendo.dataviz.geometry

import typingsSlinky.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Arc")
@js.native
class Arc protected () extends Observable {
  def this(center: js.Any) = this()
  def this(center: typingsSlinky.kendoDashUi.kendo.geometry.Point) = this()
  def this(center: js.Any, options: ArcOptions) = this()
  def this(center: typingsSlinky.kendoDashUi.kendo.geometry.Point, options: ArcOptions) = this()
  var anticlockwise: Boolean = js.native
  var center: typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  var endAngle: Double = js.native
  var options: ArcOptions = js.native
  var radiusX: Double = js.native
  var radiusY: Double = js.native
  var startAngle: Double = js.native
  def bbox(matrix: typingsSlinky.kendoDashUi.kendo.geometry.Matrix): typingsSlinky.kendoDashUi.kendo.geometry.Rect = js.native
  def getAnticlockwise(): Boolean = js.native
  def getCenter(): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def getEndAngle(): Double = js.native
  def getRadiusX(): Double = js.native
  def getRadiusY(): Double = js.native
  def getStartAngle(): Double = js.native
  def pointAt(angle: Double): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def setAnticlockwise(value: Boolean): typingsSlinky.kendoDashUi.kendo.geometry.Arc = js.native
  def setCenter(value: typingsSlinky.kendoDashUi.kendo.geometry.Point): typingsSlinky.kendoDashUi.kendo.geometry.Arc = js.native
  def setEndAngle(value: Double): typingsSlinky.kendoDashUi.kendo.geometry.Arc = js.native
  def setRadiusX(value: Double): typingsSlinky.kendoDashUi.kendo.geometry.Arc = js.native
  def setRadiusY(value: Double): typingsSlinky.kendoDashUi.kendo.geometry.Arc = js.native
  def setStartAngle(value: Double): typingsSlinky.kendoDashUi.kendo.geometry.Arc = js.native
}

