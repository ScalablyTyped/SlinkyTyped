package typingsSlinky.fabric.fabricImplMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtilDomEvent extends js.Object {
  /**
  	 * Adds an event listener to an element
  	 */
  def addListener(element: HTMLElement, eventName: String, handler: js.Function): Unit = js.native
  /**
  	 * Cross-browser wrapper for getting event's coordinates
  	 * @param event Event object
  	 * @param upperCanvasEl &lt;canvas> element on which object selection is drawn
  	 */
  def getPointer(event: Event, upperCanvasEl: HTMLCanvasElement): Point = js.native
  /**
  	 * Removes an event listener from an element
  	 */
  def removeListener(element: HTMLElement, eventName: String, handler: js.Function): Unit = js.native
}

object IUtilDomEvent {
  @scala.inline
  def apply(
    addListener: (HTMLElement, String, js.Function) => Unit,
    getPointer: (Event, HTMLCanvasElement) => Point,
    removeListener: (HTMLElement, String, js.Function) => Unit
  ): IUtilDomEvent = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction3(addListener), getPointer = js.Any.fromFunction2(getPointer), removeListener = js.Any.fromFunction3(removeListener))
    __obj.asInstanceOf[IUtilDomEvent]
  }
  @scala.inline
  implicit class IUtilDomEventOps[Self <: IUtilDomEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddListener(value: (HTMLElement, String, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetPointer(value: (Event, HTMLCanvasElement) => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPointer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveListener(value: (HTMLElement, String, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

