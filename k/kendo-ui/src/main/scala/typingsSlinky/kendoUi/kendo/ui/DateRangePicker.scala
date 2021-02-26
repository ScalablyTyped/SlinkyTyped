package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangePicker extends Widget {
  
  def close(): Unit = js.native
  
  def enable(enable: Boolean): Unit = js.native
  
  def max(): js.Date = js.native
  def max(value: String): Unit = js.native
  def max(value: js.Date): Unit = js.native
  
  def min(): js.Date = js.native
  def min(value: String): Unit = js.native
  def min(value: js.Date): Unit = js.native
  
  def open(): Unit = js.native
  
  @JSName("options")
  var options_DateRangePicker: DateRangePickerOptions = js.native
  
  def range(): js.Any = js.native
  def range(range: DateRangePickerRange): Unit = js.native
  
  def readonly(readonly: Boolean): Unit = js.native
  
  def setOptions(options: js.Any): Unit = js.native
  
  var wrapper: JQuery = js.native
}
