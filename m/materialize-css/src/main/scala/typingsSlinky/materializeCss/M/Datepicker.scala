package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialDatepickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Datepicker")
@js.native
class Datepicker ()
  extends Component[DatepickerOptions]
     with Openable {
  /**
    * CLEAR button instance (undocumented!).
    */
  var clearBtn: HTMLButtonElement = js.native
  /**
    * The selected Date.
    */
  var date: js.Date = js.native
  /**
    * DONE button instance (undocumented!).
    */
  var doneBtn: HTMLButtonElement = js.native
  /**
    * Change date view to a specific date on the datepicker
    * @param date Date to show on the datepicker.
    */
  def gotoDate(date: js.Date): Unit = js.native
  /**
    * Set a date on the datepicker
    * @param date Date to set on the datepicker.
    * @param preventOnSelect Undocumented as of 5 March 2018
    */
  def setDate(): Unit = js.native
  def setDate(date: String): Unit = js.native
  def setDate(date: String, preventOnSelect: Boolean): Unit = js.native
  def setDate(date: js.Date): Unit = js.native
  def setDate(date: js.Date, preventOnSelect: Boolean): Unit = js.native
  def setInputValue(): Unit = js.native
}

/* static members */
@JSGlobal("M.Datepicker")
@js.native
object Datepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Datepicker = js.native
  /**
    * Init Datepickers
    */
  def init(els: MElements): js.Array[Datepicker] = js.native
  def init(els: MElements, options: PartialDatepickerOptions): js.Array[Datepicker] = js.native
  /**
    * Init Datepicker
    */
  def init(els: Element): Datepicker = js.native
  def init(els: Element, options: PartialDatepickerOptions): Datepicker = js.native
}

