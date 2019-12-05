package typingsSlinky.kendoDashUi.kendo.dataviz.drawing

import typingsSlinky.kendoDashUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.MultiPath")
@js.native
class MultiPath ()
  extends typingsSlinky.kendoDashUi.kendo.drawing.Element {
  def this(options: MultiPathOptions) = this()
  @JSName("options")
  var options_MultiPath: MultiPathOptions = js.native
  var paths: js.Any = js.native
  def close(): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: Point): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: Point): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: Point): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def fill(color: String): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def fill(color: String, opacity: Double): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: js.Any, y: Double): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Double): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Double, y: Double): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Point): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Point, y: Double): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: js.Any): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: js.Any, y: Double): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Double): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Double, y: Double): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Point): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Point, y: Double): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String, width: Double): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsSlinky.kendoDashUi.kendo.drawing.MultiPath = js.native
}

