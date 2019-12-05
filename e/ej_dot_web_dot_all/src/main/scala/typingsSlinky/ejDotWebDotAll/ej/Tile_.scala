package typingsSlinky.ejDotWebDotAll.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejDotWebDotAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Tile")
@js.native
class Tile_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejDotWebDotAll.ej.Tile.Model) = this()
  def this(element: Element, options: typingsSlinky.ejDotWebDotAll.ej.Tile.Model) = this()
  var defaults: typingsSlinky.ejDotWebDotAll.ej.Tile.Model = js.native
  @JSName("model")
  var model_Tile_ : typingsSlinky.ejDotWebDotAll.ej.Tile.Model = js.native
  /** Update the image template of tile item to another one.
    * @param {string} UpdateTemplate by using id
    * @param {number} index of the tile
    * @returns {void}
    */
  def updateTemplate(id: String, index: Double): Unit = js.native
}

