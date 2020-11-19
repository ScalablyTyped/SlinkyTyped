package typingsSlinky.kendoUi.kendo.drawing

import typingsSlinky.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path extends Element {
  
  def close(): Path = js.native
  
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): Path = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: Point): Path = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: js.Any): Path = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: Point): Path = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: js.Any): Path = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: Point): Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: js.Any): Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): Path = js.native
  
  def fill(color: String): Path = js.native
  def fill(color: String, opacity: Double): Path = js.native
  
  def lineTo(x: js.Any): Path = js.native
  def lineTo(x: js.Any, y: Double): Path = js.native
  def lineTo(x: Double): Path = js.native
  def lineTo(x: Double, y: Double): Path = js.native
  def lineTo(x: Point): Path = js.native
  def lineTo(x: Point, y: Double): Path = js.native
  
  def moveTo(x: js.Any): Path = js.native
  def moveTo(x: js.Any, y: Double): Path = js.native
  def moveTo(x: Double): Path = js.native
  def moveTo(x: Double, y: Double): Path = js.native
  def moveTo(x: Point): Path = js.native
  def moveTo(x: Point, y: Double): Path = js.native
  
  @JSName("options")
  var options_Path: PathOptions = js.native
  
  var segments: js.Any = js.native
  
  def stroke(color: String): Path = js.native
  def stroke(color: String, width: js.UndefOr[scala.Nothing], opacity: Double): Path = js.native
  def stroke(color: String, width: Double): Path = js.native
  def stroke(color: String, width: Double, opacity: Double): Path = js.native
}
