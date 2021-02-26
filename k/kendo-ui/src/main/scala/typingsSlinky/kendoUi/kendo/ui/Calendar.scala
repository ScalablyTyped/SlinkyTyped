package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calendar extends Widget {
  
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
  
  @JSName("options")
  var options_Calendar: CalendarOptions = js.native
  
  def selectDates(): Unit = js.native
  
  def value(): js.Date = js.native
  def value(value: String): Unit = js.native
  def value(value: js.Date): Unit = js.native
  
  def view(): js.Any = js.native
  
  var wrapper: JQuery = js.native
}
