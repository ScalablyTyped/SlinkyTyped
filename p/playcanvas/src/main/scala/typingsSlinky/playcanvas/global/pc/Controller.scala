package typingsSlinky.playcanvas.global.pc

import org.scalajs.dom.raw.Element
import typingsSlinky.playcanvas.anon.Gamepads
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Controller
  * @classdesc A general input handler which handles both mouse and keyboard input assigned to named actions.
  * This allows you to define input handlers separately to defining keyboard/mouse configurations.
  * @description Create a new instance of a Controller.
  * @param {Element} [element] - Element to attach Controller to.
  * @param {object} [options] - Optional arguments.
  * @param {pc.Keyboard} [options.keyboard] - A Keyboard object to use.
  * @param {pc.Mouse} [options.mouse] - A Mouse object to use.
  * @param {pc.GamePads} [options.gamepads] - A Gamepads object to use.
  * @example
  * var c = new pc.Controller(document);
  *
  * // Register the "fire" action and assign it to both the Enter key and the Spacebar.
  * c.registerKeys("fire", [pc.KEY_ENTER, pc.KEY_SPACE]);
  */
@JSGlobal("pc.Controller")
@js.native
class Controller ()
  extends typingsSlinky.playcanvas.pc.Controller {
  def this(element: Element) = this()
  def this(element: Element, options: Gamepads) = this()
}

