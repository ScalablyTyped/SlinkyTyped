package typingsSlinky.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.SplitButton")
@js.native
class SplitButton_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.SplitButton.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.SplitButton.Model) = this()
  var defaults: typingsSlinky.ejWebAll.ej.SplitButton.Model = js.native
  @JSName("model")
  var model_SplitButton_ : typingsSlinky.ejWebAll.ej.SplitButton.Model = js.native
  /** To disable the split button
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To Enable the split button
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** To hide the list content of the split button.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** To show the list content of the split button.
    * @returns {void}
    */
  def show(): Unit = js.native
}

