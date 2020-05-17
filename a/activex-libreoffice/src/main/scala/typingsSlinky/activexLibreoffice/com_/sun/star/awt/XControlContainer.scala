package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the controls within an {@link UnoControlContainer} . */
@js.native
trait XControlContainer extends XInterface {
  /** returns all controls. */
  val Controls: SafeArray[XControl] = js.native
  /** adds the given control with the specified name to the container. */
  def addControl(Name: String, Control: XControl): Unit = js.native
  /** returns the control with the specified name. */
  def getControl(aName: String): XControl = js.native
  /** returns all controls. */
  def getControls(): SafeArray[XControl] = js.native
  /** removes the given control from the container. */
  def removeControl(Control: XControl): Unit = js.native
  /** sets the status text in the status bar of the container. */
  def setStatusText(StatusText: String): Unit = js.native
}

object XControlContainer {
  @scala.inline
  def apply(
    Controls: SafeArray[XControl],
    acquire: () => Unit,
    addControl: (String, XControl) => Unit,
    getControl: String => XControl,
    getControls: () => SafeArray[XControl],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeControl: XControl => Unit,
    setStatusText: String => Unit
  ): XControlContainer = {
    val __obj = js.Dynamic.literal(Controls = Controls.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addControl = js.Any.fromFunction2(addControl), getControl = js.Any.fromFunction1(getControl), getControls = js.Any.fromFunction0(getControls), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeControl = js.Any.fromFunction1(removeControl), setStatusText = js.Any.fromFunction1(setStatusText))
    __obj.asInstanceOf[XControlContainer]
  }
  @scala.inline
  implicit class XControlContainerOps[Self <: XControlContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControls(value: SafeArray[XControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddControl(value: (String, XControl) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addControl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetControl(value: String => XControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetControls(value: () => SafeArray[XControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveControl(value: XControl => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeControl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStatusText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStatusText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

