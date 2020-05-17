package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the operations for a hatch window.
  *
  * A hatch window owner is responsible to handle resize/move requests sent by the window. It is also responsible to validate tracking rectangle size.
  */
@js.native
trait XHatchWindowController extends XInterface {
  def activated(): Unit = js.native
  /**
    * returns the closest valid rectangle to the provided one.
    * @param aRect a new selected position and size of the tracking rectangle
    * @returns the closest valid position and size to the provided one
    */
  def calcAdjustedRectangle(aRect: Rectangle): Rectangle = js.native
  def deactivated(): Unit = js.native
  /**
    * requests window owner to resize/move the window.
    * @param aRect the new requested position and size of the window
    */
  def requestPositioning(aRect: Rectangle): Unit = js.native
}

object XHatchWindowController {
  @scala.inline
  def apply(
    acquire: () => Unit,
    activated: () => Unit,
    calcAdjustedRectangle: Rectangle => Rectangle,
    deactivated: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    requestPositioning: Rectangle => Unit
  ): XHatchWindowController = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), activated = js.Any.fromFunction0(activated), calcAdjustedRectangle = js.Any.fromFunction1(calcAdjustedRectangle), deactivated = js.Any.fromFunction0(deactivated), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), requestPositioning = js.Any.fromFunction1(requestPositioning))
    __obj.asInstanceOf[XHatchWindowController]
  }
  @scala.inline
  implicit class XHatchWindowControllerOps[Self <: XHatchWindowController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCalcAdjustedRectangle(value: Rectangle => Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calcAdjustedRectangle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeactivated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequestPositioning(value: Rectangle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPositioning")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

