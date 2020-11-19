package typingsSlinky.pikadayTime.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pikaday extends js.Object {
  
  /**
    * Recalculate and change the position of the picker.
    */
  def adjustPosition(): Unit = js.native
  
  /**
    * Extends the existing configuration options for Pikaday object with the options provided.
    * Can be used to change/extend the configurations on runtime.
    * @param options full/partial configuration options.
    * @returns extended configurations.
    */
  def config(options: PikadayOptions): PikadayOptions = js.native
  
  /**
    * Hide the picker and remove all event listeners - no going back!
    */
  def destroy(): Unit = js.native
  
  /**
    * Update the HTML.
    */
  def draw(force: Boolean): Unit = js.native
  
  var el: HTMLElement = js.native
  
  /**
    * Returns a JavaScript Date object for the selected day, or null if
    * no date is selected.
    */
  def getDate(): js.Date = js.native
  
  /**
    * Returns a Moment.js object for the selected date (Moment must be
    * loaded before Pikaday).
    */
  def getMoment(): Moment = js.native
  
  /**
    * Change the current view to see a specific date.
    */
  def gotoDate(date: js.Date): Unit = js.native
  
  /**
    * Change the current view by month (0: January, 1: Februrary, etc).
    */
  def gotoMonth(monthIndex: Double): Unit = js.native
  
  /**
    * Shortcut for picker.gotoDate(new Date())
    */
  def gotoToday(): Unit = js.native
  
  /**
    * Change the year being viewed.
    */
  def gotoYear(year: Double): Unit = js.native
  
  /**
    * Hide the picker making it invisible.
    */
  def hide(): Unit = js.native
  
  /**
    * Returns true if the picker is visible.
    */
  def isVisible(): Boolean = js.native
  
  /**
    * Go to the next month (this will change year if necessary).
    */
  def nextMonth(): Unit = js.native
  
  /**
    * Go to the previous month (this will change year if necessary).
    */
  def prevMonth(): Unit = js.native
  
  /**
    * Set the current selection. This will be restricted within the bounds
    * of minDate and maxDate options if they're specified. A boolean (true)
    * can optionally be passed as the second parameter to prevent triggering
    * of the onSelect callback, allowing the date to be set silently.
    */
  def setDate(date: String): Unit = js.native
  def setDate(date: String, triggerOnSelect: Boolean): Unit = js.native
  def setDate(date: js.Date): Unit = js.native
  def setDate(date: js.Date, triggerOnSelect: Boolean): Unit = js.native
  
  /**
    * Update the range end date. For using two Pikaday instances to select
    * a date range.
    */
  def setEndRange(date: js.Date): Unit = js.native
  
  /**
    * Update the maximum/latest date that can be selected.
    */
  def setMaxDate(date: js.Date): Unit = js.native
  
  /**
    * Update the minimum/earliest date that can be selected.
    */
  def setMinDate(date: js.Date): Unit = js.native
  
  /**
    * Set the current selection with a Moment.js object (see setDate).
    */
  def setMoment(moment: js.Any): Unit = js.native
  
  /**
    * Update the range start date. For using two Pikaday instances to
    * select a date range.
    */
  def setStartRange(date: js.Date): Unit = js.native
  
  /**
    * Make the picker visible.
    */
  def show(): Unit = js.native
  
  def toString(format: String): String = js.native
}
