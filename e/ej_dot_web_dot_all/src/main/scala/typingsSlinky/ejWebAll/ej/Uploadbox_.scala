package typingsSlinky.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Uploadbox")
@js.native
class Uploadbox_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Uploadbox.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Uploadbox.Model) = this()
  var defaults: typingsSlinky.ejWebAll.ej.Uploadbox.Model = js.native
  @JSName("model")
  var model_Uploadbox_ : typingsSlinky.ejWebAll.ej.Uploadbox.Model = js.native
  /** Disables the Uploadbox control
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Enables the Uploadbox control
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Refresh the Uploadbox control
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** Upload the selected files.
    * @returns {void}
    */
  def upload(): Unit = js.native
}

