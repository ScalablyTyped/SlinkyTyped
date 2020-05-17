package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a VCL container window.
  * @deprecated Deprecated
  */
@js.native
trait XVclContainer extends XInterface {
  /** returns all windows. */
  val Windows: SafeArray[XWindow] = js.native
  /** adds the specified container listener to receive container events from this container. */
  def addVclContainerListener(l: XVclContainerListener): Unit = js.native
  /** returns all windows. */
  def getWindows(): SafeArray[XWindow] = js.native
  /** removes the specified container listener so that it no longer receives container events from this container. */
  def removeVclContainerListener(l: XVclContainerListener): Unit = js.native
}

object XVclContainer {
  @scala.inline
  def apply(
    Windows: SafeArray[XWindow],
    acquire: () => Unit,
    addVclContainerListener: XVclContainerListener => Unit,
    getWindows: () => SafeArray[XWindow],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeVclContainerListener: XVclContainerListener => Unit
  ): XVclContainer = {
    val __obj = js.Dynamic.literal(Windows = Windows.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addVclContainerListener = js.Any.fromFunction1(addVclContainerListener), getWindows = js.Any.fromFunction0(getWindows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeVclContainerListener = js.Any.fromFunction1(removeVclContainerListener))
    __obj.asInstanceOf[XVclContainer]
  }
  @scala.inline
  implicit class XVclContainerOps[Self <: XVclContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWindows(value: SafeArray[XWindow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Windows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddVclContainerListener(value: XVclContainerListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addVclContainerListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWindows(value: () => SafeArray[XWindow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveVclContainerListener(value: XVclContainerListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeVclContainerListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

