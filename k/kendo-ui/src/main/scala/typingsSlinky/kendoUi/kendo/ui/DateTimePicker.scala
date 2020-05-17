package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimePicker extends Widget {
  @JSName("options")
  var options_DateTimePicker: DateTimePickerOptions = js.native
  var wrapper: JQuery = js.native
  def close(view: String): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  def max(): js.Date = js.native
  def max(value: String): Unit = js.native
  def max(value: js.Date): Unit = js.native
  def min(): js.Date = js.native
  def min(value: String): Unit = js.native
  def min(value: js.Date): Unit = js.native
  def open(view: String): Unit = js.native
  def readonly(readonly: Boolean): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def toggle(view: String): Unit = js.native
  def value(): js.Date = js.native
  def value(value: String): Unit = js.native
  def value(value: js.Date): Unit = js.native
}

