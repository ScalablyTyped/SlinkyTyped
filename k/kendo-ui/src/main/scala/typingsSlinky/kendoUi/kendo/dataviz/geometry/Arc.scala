package typingsSlinky.kendoUi.kendo.dataviz.geometry

import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arc extends Observable {
  
  var anticlockwise: Boolean = js.native
  
  def bbox(matrix: typingsSlinky.kendoUi.kendo.geometry.Matrix): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  
  var center: typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  var endAngle: Double = js.native
  
  def getAnticlockwise(): Boolean = js.native
  
  def getCenter(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  def getEndAngle(): Double = js.native
  
  def getRadiusX(): Double = js.native
  
  def getRadiusY(): Double = js.native
  
  def getStartAngle(): Double = js.native
  
  var options: ArcOptions = js.native
  
  def pointAt(angle: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  var radiusX: Double = js.native
  
  var radiusY: Double = js.native
  
  def setAnticlockwise(value: Boolean): typingsSlinky.kendoUi.kendo.geometry.Arc = js.native
  
  def setCenter(value: typingsSlinky.kendoUi.kendo.geometry.Point): typingsSlinky.kendoUi.kendo.geometry.Arc = js.native
  
  def setEndAngle(value: Double): typingsSlinky.kendoUi.kendo.geometry.Arc = js.native
  
  def setRadiusX(value: Double): typingsSlinky.kendoUi.kendo.geometry.Arc = js.native
  
  def setRadiusY(value: Double): typingsSlinky.kendoUi.kendo.geometry.Arc = js.native
  
  def setStartAngle(value: Double): typingsSlinky.kendoUi.kendo.geometry.Arc = js.native
  
  var startAngle: Double = js.native
}
