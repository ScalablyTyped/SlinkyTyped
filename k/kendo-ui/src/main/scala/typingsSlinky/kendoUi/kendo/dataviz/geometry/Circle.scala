package typingsSlinky.kendoUi.kendo.dataviz.geometry

import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle extends Observable {
  
  def bbox(matrix: typingsSlinky.kendoUi.kendo.geometry.Matrix): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  
  var center: typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  def equals(other: typingsSlinky.kendoUi.kendo.geometry.Circle): Boolean = js.native
  
  def getCenter(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  def getRadius(): Double = js.native
  
  var options: CircleOptions = js.native
  
  def pointAt(angle: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  var radius: Double = js.native
  
  def setCenter(value: js.Any): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def setCenter(value: typingsSlinky.kendoUi.kendo.geometry.Point): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  def setRadius(value: Double): typingsSlinky.kendoUi.kendo.geometry.Circle = js.native
}
