package typingsSlinky.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arc
  extends typingsSlinky.kendoUi.kendo.drawing.Element {
  
  def fill(color: String): typingsSlinky.kendoUi.kendo.drawing.Arc = js.native
  def fill(color: String, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.Arc = js.native
  
  def geometry(): typingsSlinky.kendoUi.kendo.geometry.Arc = js.native
  def geometry(value: typingsSlinky.kendoUi.kendo.geometry.Arc): Unit = js.native
  
  @JSName("options")
  var options_Arc: ArcOptions = js.native
  
  def stroke(color: String): typingsSlinky.kendoUi.kendo.drawing.Arc = js.native
  def stroke(color: String, width: js.UndefOr[scala.Nothing], opacity: Double): typingsSlinky.kendoUi.kendo.drawing.Arc = js.native
  def stroke(color: String, width: Double): typingsSlinky.kendoUi.kendo.drawing.Arc = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.Arc = js.native
}
