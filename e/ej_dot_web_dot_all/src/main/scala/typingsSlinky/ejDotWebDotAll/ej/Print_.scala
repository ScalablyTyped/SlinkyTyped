package typingsSlinky.ejDotWebDotAll.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejDotWebDotAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Print")
@js.native
class Print_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejDotWebDotAll.ej.Print.Model) = this()
  def this(element: Element, options: typingsSlinky.ejDotWebDotAll.ej.Print.Model) = this()
  var defaults: typingsSlinky.ejDotWebDotAll.ej.Print.Model = js.native
  @JSName("model")
  var model_Print_ : typingsSlinky.ejDotWebDotAll.ej.Print.Model = js.native
  /** Print the specific page or an element.
    * @returns {void}
    */
  def print(): Unit = js.native
}

