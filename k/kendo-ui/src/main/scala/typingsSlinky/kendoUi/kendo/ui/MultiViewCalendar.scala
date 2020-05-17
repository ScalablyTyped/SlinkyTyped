package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiViewCalendar extends Widget {
  @JSName("options")
  var options_MultiViewCalendar: MultiViewCalendarOptions = js.native
  var wrapper: JQuery = js.native
  def current(): js.Date = js.native
  def max(): js.Date = js.native
  def max(value: String): Unit = js.native
  def max(value: js.Date): Unit = js.native
  def min(): js.Date = js.native
  def min(value: String): Unit = js.native
  def min(value: js.Date): Unit = js.native
  def navigate(value: js.Date, view: String): Unit = js.native
  def navigateDown(value: js.Date): Unit = js.native
  def navigateToFuture(): Unit = js.native
  def navigateToPast(): Unit = js.native
  def navigateUp(): Unit = js.native
  def selectDates(): js.Any = js.native
  def selectDates(dates: js.Any): Unit = js.native
  def selectRange(): js.Any = js.native
  def selectRange(range: js.Any): Unit = js.native
  def value(): js.Date = js.native
  def value(value: String): Unit = js.native
  def value(value: js.Date): Unit = js.native
  def view(): js.Any = js.native
}

