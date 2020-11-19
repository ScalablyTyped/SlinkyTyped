package typingsSlinky.kendoUi.kendo.geometry

import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transformation extends Observable {
  
  def equals(other: Transformation): Boolean = js.native
  
  def matrix(): Matrix = js.native
  
  def multiply(transformation: Transformation): Transformation = js.native
  
  var options: TransformationOptions = js.native
  
  def rotate(angle: Double, center: js.Any): Transformation = js.native
  def rotate(angle: Double, center: Point): Transformation = js.native
  
  def scale(scaleX: Double, scaleY: Double): Transformation = js.native
  
  def translate(x: Double, y: Double): Transformation = js.native
}
