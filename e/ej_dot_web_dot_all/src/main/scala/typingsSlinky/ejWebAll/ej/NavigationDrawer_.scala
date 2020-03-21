package typingsSlinky.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.NavigationDrawer")
@js.native
class NavigationDrawer_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.NavigationDrawer.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.NavigationDrawer.Model) = this()
  var defaults: typingsSlinky.ejWebAll.ej.NavigationDrawer.Model = js.native
  @JSName("model")
  var model_NavigationDrawer_ : typingsSlinky.ejWebAll.ej.NavigationDrawer.Model = js.native
  /** To close the navigation drawer control
    * @returns {void}
    */
  def close(): Unit = js.native
  /** To load AJAX content into NavigationDrawer container.
    * @returns {void}
    */
  def loadContent(): Unit = js.native
  /** To open the navigation drawer control
    * @returns {void}
    */
  def open(): Unit = js.native
  /** To Toggle the navigation drawer control
    * @returns {void}
    */
  def toggle(): Unit = js.native
}

