package typingsSlinky.ejDotWebDotAll.ej.datavisualization

import org.scalajs.dom.raw.Element
import typingsSlinky.ejDotWebDotAll.JQuery
import typingsSlinky.ejDotWebDotAll.ej.Sparkline.Model
import typingsSlinky.ejDotWebDotAll.ej.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.Sparkline")
@js.native
class Sparkline_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
  var defaults: Model = js.native
  @JSName("model")
  var model_Sparkline_ : Model = js.native
  /** Redraws the entire sparkline. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): Unit = js.native
}

