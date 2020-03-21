package typingsSlinky.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Tile")
@js.native
class Tile_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Tile.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Tile.Model) = this()
  var defaults: typingsSlinky.ejWebAll.ej.Tile.Model = js.native
  @JSName("model")
  var model_Tile_ : typingsSlinky.ejWebAll.ej.Tile.Model = js.native
  /** Update the image template of tile item to another one.
    * @param {string} UpdateTemplate by using id
    * @param {number} index of the tile
    * @returns {void}
    */
  def updateTemplate(id: String, index: Double): Unit = js.native
}

