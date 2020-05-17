package typingsSlinky.playcanvas.pc

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ElementInput
  * @classdesc Handles mouse and touch events for {@link pc.ElementComponent}s. When input events
  * occur on an ElementComponent this fires the appropriate events on the ElementComponent.
  * @description Create a new pc.ElementInput instance.
  * @param {Element} domElement - The DOM element.
  * @param {object} [options] - Optional arguments.
  * @param {boolean} [options.useMouse] - Whether to allow mouse input. Defaults to true.
  * @param {boolean} [options.useTouch] - Whether to allow touch input. Defaults to true.
  */
@js.native
trait ElementInput extends js.Object {
  /**
    * @function
    * @name pc.ElementInput#addElement
    * @description Add a {@link pc.ElementComponent} to the internal list of ElementComponents that are being checked for input.
    * @param {pc.ElementComponent} element - The ElementComponent.
    */
  def addElement(element: ElementComponent): Unit = js.native
  /**
    * @function
    * @name pc.ElementInput#attach
    * @description Attach mouse and touch events to a DOM element.
    * @param {Element} domElement - The DOM element.
    */
  def attach(domElement: Element): Unit = js.native
  /**
    * @function
    * @name pc.ElementInput#detach
    * @description Remove mouse and touch events from the DOM element that it is attached to.
    */
  def detach(): Unit = js.native
  /**
    * @function
    * @name pc.ElementInput#removeElement
    * @description Remove a {@link pc.ElementComponent} from the internal list of ElementComponents that are being checked for input.
    * @param {pc.ElementComponent} element - The ElementComponent.
    */
  def removeElement(element: ElementComponent): Unit = js.native
}

object ElementInput {
  @scala.inline
  def apply(
    addElement: ElementComponent => Unit,
    attach: Element => Unit,
    detach: () => Unit,
    removeElement: ElementComponent => Unit
  ): ElementInput = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction1(addElement), attach = js.Any.fromFunction1(attach), detach = js.Any.fromFunction0(detach), removeElement = js.Any.fromFunction1(removeElement))
    __obj.asInstanceOf[ElementInput]
  }
  @scala.inline
  implicit class ElementInputOps[Self <: ElementInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddElement(value: ElementComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttach(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDetach(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveElement(value: ElementComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeElement")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

