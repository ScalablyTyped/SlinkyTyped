package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Calendar")
@js.native
class Calendar protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: CalendarOptions) = this()
  @JSName("options")
  var options_Calendar: CalendarOptions = js.native
  var wrapper: JQuery = js.native
  def current(): js.Date = js.native
  def max(): js.Date = js.native
  def max(value: String): Unit = js.native
  def max(value: Date): Unit = js.native
  def min(): js.Date = js.native
  def min(value: String): Unit = js.native
  def min(value: Date): Unit = js.native
  def navigate(value: js.Date, view: String): Unit = js.native
  def navigateDown(value: js.Date): Unit = js.native
  def navigateToFuture(): Unit = js.native
  def navigateToPast(): Unit = js.native
  def navigateUp(): Unit = js.native
  def selectDates(): Unit = js.native
  def value(): js.Date = js.native
  def value(value: String): Unit = js.native
  def value(value: Date): Unit = js.native
  def view(): js.Any = js.native
}

/* static members */
@JSGlobal("kendo.ui.Calendar")
@js.native
object Calendar extends js.Object {
  var fn: Calendar = js.native
  def extend(proto: js.Object): Calendar = js.native
}

