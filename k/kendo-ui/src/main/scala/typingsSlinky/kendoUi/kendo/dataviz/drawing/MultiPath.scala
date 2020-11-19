package typingsSlinky.kendoUi.kendo.dataviz.drawing

import typingsSlinky.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiPath
  extends typingsSlinky.kendoUi.kendo.drawing.Element {
  
  def close(): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: Point): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: js.Any): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: Point): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: js.Any): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: Point): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: js.Any): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  
  def fill(color: String): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def fill(color: String, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  
  def lineTo(x: js.Any): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: js.Any, y: Double): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Double): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Double, y: Double): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Point): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Point, y: Double): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  
  def moveTo(x: js.Any): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: js.Any, y: Double): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Double): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Double, y: Double): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Point): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Point, y: Double): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  
  @JSName("options")
  var options_MultiPath: MultiPathOptions = js.native
  
  var paths: js.Any = js.native
  
  def stroke(color: String): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String, width: js.UndefOr[scala.Nothing], opacity: Double): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String, width: Double): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.MultiPath = js.native
}
