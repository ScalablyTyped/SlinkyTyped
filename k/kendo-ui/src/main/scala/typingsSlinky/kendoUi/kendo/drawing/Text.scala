package typingsSlinky.kendoUi.kendo.drawing

import typingsSlinky.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Text extends Element {
  
  def content(): String = js.native
  def content(value: String): Unit = js.native
  
  def fill(color: String): Text = js.native
  def fill(color: String, opacity: Double): Text = js.native
  
  @JSName("options")
  var options_Text: TextOptions = js.native
  
  def position(): Point = js.native
  def position(value: Point): Unit = js.native
  
  def stroke(color: String): Text = js.native
  def stroke(color: String, width: js.UndefOr[scala.Nothing], opacity: Double): Text = js.native
  def stroke(color: String, width: Double): Text = js.native
  def stroke(color: String, width: Double, opacity: Double): Text = js.native
}
