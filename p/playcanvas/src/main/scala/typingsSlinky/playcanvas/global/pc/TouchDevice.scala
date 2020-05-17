package typingsSlinky.playcanvas.global.pc

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.TouchDevice
  * @augments pc.EventHandler
  * @classdesc Attach a TouchDevice to an element and it will receive and fire events when the element is touched.
  * See also {@link pc.Touch} and {@link pc.TouchEvent}.
  * @description Create a new touch device and attach it to an element.
  * @param {Element} element - The element to attach listen for events on.
  */
@JSGlobal("pc.TouchDevice")
@js.native
class TouchDevice protected ()
  extends typingsSlinky.playcanvas.pc.TouchDevice {
  def this(element: Element) = this()
}

