package typingsSlinky.kendoDashUi.kendo.dataviz.drawing

import typingsSlinky.kendoDashUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Path")
@js.native
class Path ()
  extends typingsSlinky.kendoDashUi.kendo.drawing.Element {
  def this(options: PathOptions) = this()
  @JSName("options")
  var options_Path: PathOptions = js.native
  var segments: js.Any = js.native
  def close(): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: Point): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: Point): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: Point): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def fill(color: String): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def fill(color: String, opacity: Double): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def lineTo(x: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def lineTo(x: js.Any, y: Double): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def lineTo(x: Double): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def lineTo(x: Double, y: Double): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def lineTo(x: Point): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def lineTo(x: Point, y: Double): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def moveTo(x: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def moveTo(x: js.Any, y: Double): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def moveTo(x: Double): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def moveTo(x: Double, y: Double): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def moveTo(x: Point): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def moveTo(x: Point, y: Double): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def stroke(color: String): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Double): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.drawing.Path")
@js.native
object Path extends js.Object {
  def fromArc(arc: typingsSlinky.kendoDashUi.kendo.geometry.Arc): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def fromArc(arc: typingsSlinky.kendoDashUi.kendo.geometry.Arc, options: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def fromPoints(points: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def fromPoints(points: js.Any, options: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def fromRect(rect: typingsSlinky.kendoDashUi.kendo.geometry.Rect): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def fromRect(rect: typingsSlinky.kendoDashUi.kendo.geometry.Rect, options: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def parse(svgPath: String): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def parse(svgPath: String, options: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
}

