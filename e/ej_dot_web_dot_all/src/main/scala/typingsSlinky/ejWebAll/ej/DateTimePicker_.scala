package typingsSlinky.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.DateTimePicker")
@js.native
class DateTimePicker_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.DateTimePicker.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.DateTimePicker.Model) = this()
  var defaults: typingsSlinky.ejWebAll.ej.DateTimePicker.Model = js.native
  @JSName("model")
  var model_DateTimePicker_ : typingsSlinky.ejWebAll.ej.DateTimePicker.Model = js.native
  /** Disables the DateTimePicker control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Enables the DateTimePicker control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Returns the current datetime value in the DateTimePicker.
    * @returns {string}
    */
  def getValue(): String = js.native
  /** Hides or closes the DateTimePicker popup.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** Updates the current system date value and time value to the DateTimePicker.
    * @returns {void}
    */
  def setCurrentDateTime(): Unit = js.native
  /** Shows or opens the DateTimePicker popup.
    * @returns {void}
    */
  def show(): Unit = js.native
}

