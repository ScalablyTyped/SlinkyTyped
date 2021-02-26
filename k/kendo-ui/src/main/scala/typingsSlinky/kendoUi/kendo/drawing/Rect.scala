package typingsSlinky.kendoUi.kendo.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rect extends Element {
  
  def fill(color: String): Rect = js.native
  def fill(color: String, opacity: Double): Rect = js.native
  
  def geometry(): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  def geometry(value: typingsSlinky.kendoUi.kendo.geometry.Rect): Unit = js.native
  
  @JSName("options")
  var options_Rect: RectOptions = js.native
  
  def stroke(color: String): Rect = js.native
  def stroke(color: String, width: js.UndefOr[scala.Nothing], opacity: Double): Rect = js.native
  def stroke(color: String, width: Double): Rect = js.native
  def stroke(color: String, width: Double, opacity: Double): Rect = js.native
}
