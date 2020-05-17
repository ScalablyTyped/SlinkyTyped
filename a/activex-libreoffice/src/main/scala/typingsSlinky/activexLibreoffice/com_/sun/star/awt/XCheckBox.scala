package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the state of a check box and makes it possible to register for events. */
@js.native
trait XCheckBox extends XInterface {
  /**
    * returns the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  var State: Double = js.native
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit = js.native
  /** enables or disables the tri state mode. */
  def enableTriState(b: Boolean): Unit = js.native
  /**
    * returns the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  def getState(): Double = js.native
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit = js.native
  /** sets the label of the check box. */
  def setLabel(Label: String): Unit = js.native
  /**
    * sets the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  def setState(n: Double): Unit = js.native
}

object XCheckBox {
  @scala.inline
  def apply(
    State: Double,
    acquire: () => Unit,
    addItemListener: XItemListener => Unit,
    enableTriState: Boolean => Unit,
    getState: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeItemListener: XItemListener => Unit,
    setLabel: String => Unit,
    setState: Double => Unit
  ): XCheckBox = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addItemListener = js.Any.fromFunction1(addItemListener), enableTriState = js.Any.fromFunction1(enableTriState), getState = js.Any.fromFunction0(getState), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItemListener = js.Any.fromFunction1(removeItemListener), setLabel = js.Any.fromFunction1(setLabel), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[XCheckBox]
  }
  @scala.inline
  implicit class XCheckBoxOps[Self <: XCheckBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddItemListener(value: XItemListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItemListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableTriState(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTriState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveItemListener(value: XItemListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItemListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLabel(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetState(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

