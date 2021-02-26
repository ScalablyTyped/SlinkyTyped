package typingsSlinky.kendoUi.kendo.dataviz.drawing

import typingsSlinky.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Text
  extends typingsSlinky.kendoUi.kendo.drawing.Element {
  
  def content(): String = js.native
  def content(value: String): Unit = js.native
  
  def fill(color: String): typingsSlinky.kendoUi.kendo.drawing.Text = js.native
  def fill(color: String, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.Text = js.native
  
  @JSName("options")
  var options_Text: TextOptions = js.native
  
  def position(): Point = js.native
  def position(value: Point): Unit = js.native
  
  def stroke(color: String): typingsSlinky.kendoUi.kendo.drawing.Text = js.native
  def stroke(color: String, width: js.UndefOr[scala.Nothing], opacity: Double): typingsSlinky.kendoUi.kendo.drawing.Text = js.native
  def stroke(color: String, width: Double): typingsSlinky.kendoUi.kendo.drawing.Text = js.native
  def stroke(color: String, width: Double, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.Text = js.native
}
