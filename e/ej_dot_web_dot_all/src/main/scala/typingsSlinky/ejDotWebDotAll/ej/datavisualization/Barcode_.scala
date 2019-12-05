package typingsSlinky.ejDotWebDotAll.ej.datavisualization

import org.scalajs.dom.raw.Element
import typingsSlinky.ejDotWebDotAll.JQuery
import typingsSlinky.ejDotWebDotAll.ej.Model
import typingsSlinky.ejDotWebDotAll.ej.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.Barcode")
@js.native
class Barcode_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
  var defaults: Model = js.native
  @JSName("model")
  var model_Barcode_ : Model = js.native
  /** To disable the barcode
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the barcode
    * @returns {void}
    */
  def enable(): Unit = js.native
}

