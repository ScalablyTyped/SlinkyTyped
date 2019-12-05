package typingsSlinky.ejDotWebDotAll.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejDotWebDotAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Slider")
@js.native
class Slider_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejDotWebDotAll.ej.Slider.Model) = this()
  def this(element: Element, options: typingsSlinky.ejDotWebDotAll.ej.Slider.Model) = this()
  var defaults: typingsSlinky.ejDotWebDotAll.ej.Slider.Model = js.native
  @JSName("model")
  var model_Slider_ : typingsSlinky.ejDotWebDotAll.ej.Slider.Model = js.native
  /** To disable the slider
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the slider
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** To get value from slider handle
    * @returns {number}
    */
  def getValue(): Double = js.native
  /** To set value to slider handle.By default animation is false while set the value. If you want to enable the animation, pass the enableAnimation as true to this method.
    * @returns {void}
    */
  def setValue(): Unit = js.native
}

