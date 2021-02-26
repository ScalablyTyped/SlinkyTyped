package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPicker extends Widget {
  
  def close(): Unit = js.native
  
  def color(): Unit = js.native
  def color(color: Color): Unit = js.native
  @JSName("color")
  def color_Color(): Color = js.native
  
  def enable(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  
  def open(): Unit = js.native
  
  @JSName("options")
  var options_ColorPicker: ColorPickerOptions = js.native
  
  def toggle(): Unit = js.native
  
  def value(): String = js.native
  def value(color: String): Unit = js.native
  @JSName("value")
  def value_Unit(): Unit = js.native
  
  var wrapper: JQuery = js.native
}
