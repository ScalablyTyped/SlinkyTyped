package typingsSlinky.kendoUi.kendo.dataviz.diagram

import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends Observable {
  
  def append(element: js.Any): Unit = js.native
  
  def clear(): Unit = js.native
  
  var drawingElement: typingsSlinky.kendoUi.kendo.drawing.Group = js.native
  
  var options: GroupOptions = js.native
  
  def position(): Unit = js.native
  def position(offset: Point): Unit = js.native
  
  def remove(element: js.Any): Unit = js.native
  
  def rotate(angle: Double, center: Point): Unit = js.native
  
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}
