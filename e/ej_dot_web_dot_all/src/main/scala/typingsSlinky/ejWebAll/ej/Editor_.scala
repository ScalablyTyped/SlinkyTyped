package typingsSlinky.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Editor")
@js.native
class Editor_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Editor.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Editor.Model) = this()
  var defaults: typingsSlinky.ejWebAll.ej.Editor.Model = js.native
  @JSName("model")
  var model_Editor_ : typingsSlinky.ejWebAll.ej.Editor.Model = js.native
  /** To disable the corresponding Editors
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the corresponding Editors
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** To get value from corresponding Editors
    * @returns {number}
    */
  def getValue(): Double = js.native
}

