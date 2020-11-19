package typingsSlinky.kendoUi.kendo.dataviz.drawing

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Surface extends Observable {
  
  def clear(): Unit = js.native
  
  def draw(element: typingsSlinky.kendoUi.kendo.drawing.Element): Unit = js.native
  
  var element: JQuery = js.native
  
  def eventTarget(e: js.Any): typingsSlinky.kendoUi.kendo.drawing.Element = js.native
  
  def hideTooltip(): Unit = js.native
  
  var options: SurfaceOptions = js.native
  
  def resize(): Unit = js.native
  def resize(force: Boolean): Unit = js.native
  
  def showTooltip(element: typingsSlinky.kendoUi.kendo.drawing.Element): Unit = js.native
  def showTooltip(element: typingsSlinky.kendoUi.kendo.drawing.Element, options: js.Any): Unit = js.native
}
