package typingsSlinky.kendoUi.kendo.dataviz.diagram

import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle extends Observable {
  
  var drawingElement: typingsSlinky.kendoUi.kendo.drawing.Circle = js.native
  
  var options: CircleOptions = js.native
  
  def position(): Unit = js.native
  def position(offset: Point): Unit = js.native
  
  def rotate(angle: Double, center: Point): Unit = js.native
  
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}
