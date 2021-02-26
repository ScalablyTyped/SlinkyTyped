package typingsSlinky.kendoUi.kendo.dataviz.geometry

import typingsSlinky.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends Observable {
  
  def distanceTo(point: typingsSlinky.kendoUi.kendo.geometry.Point): Double = js.native
  
  def equals(other: typingsSlinky.kendoUi.kendo.geometry.Point): Boolean = js.native
  
  def getX(): Double = js.native
  
  def getY(): Double = js.native
  
  def move(x: Double, y: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  var options: PointOptions = js.native
  
  def rotate(angle: Double, center: js.Any): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def rotate(angle: Double, center: typingsSlinky.kendoUi.kendo.geometry.Point): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  def round(digits: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  def scale(scaleX: Double, scaleY: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  def scaleCopy(scaleX: Double, scaleY: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  def setX(value: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  def setY(value: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  def toArray(digits: Double): js.Any = js.native
  
  def toString(digits: Double, separator: String): String = js.native
  
  def transform(tansformation: typingsSlinky.kendoUi.kendo.geometry.Transformation): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  def transformCopy(tansformation: typingsSlinky.kendoUi.kendo.geometry.Transformation): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  def translate(dx: Double, dy: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  def translateWith(vector: js.Any): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def translateWith(vector: typingsSlinky.kendoUi.kendo.geometry.Point): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
