package typingsSlinky.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.MaskEdit")
@js.native
class MaskEdit_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.MaskEdit.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.MaskEdit.Model) = this()
  var defaults: typingsSlinky.ejWebAll.ej.MaskEdit.Model = js.native
  @JSName("model")
  var model_MaskEdit_ : typingsSlinky.ejWebAll.ej.MaskEdit.Model = js.native
  /** To clear the text in mask edit textbox control.
    * @returns {void}
    */
  def clear(): Unit = js.native
  /** To disable the mask edit textbox control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the mask edit textbox control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** To obtained the pure value of the text value, removes all the symbols in mask edit textbox control.
    * @returns {string}
    */
  def get_StrippedValue(): String = js.native
  /** To obtained the textbox value as such that, Just replace all '_' to ' '(space) in mask edit textbox control.
    * @returns {string}
    */
  def get_UnstrippedValue(): String = js.native
}

