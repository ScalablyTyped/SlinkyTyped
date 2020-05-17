package typingsSlinky.kendoUi.kendo.dataviz.drawing

import typingsSlinky.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path
  extends typingsSlinky.kendoUi.kendo.drawing.Element {
  @JSName("options")
  var options_Path: PathOptions = js.native
  var segments: js.Any = js.native
  def close(): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: Point): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: Point): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: Point): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def fill(color: String): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def fill(color: String, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: js.Any, y: Double): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Double): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Double, y: Double): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Point): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Point, y: Double): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: js.Any): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: js.Any, y: Double): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Double): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Double, y: Double): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Point): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Point, y: Double): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def stroke(color: String): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Double): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
}

