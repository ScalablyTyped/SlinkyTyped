package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the state of a radio button and makes it possible to register item event listeners. */
@js.native
trait XRadioButton extends XInterface {
  /** returns `TRUE` if the button is checked, `FALSE` otherwise. */
  var State: Boolean = js.native
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit = js.native
  /** returns `TRUE` if the button is checked, `FALSE` otherwise. */
  def getState(): Boolean = js.native
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit = js.native
  /** sets the label of the radio button. */
  def setLabel(Label: String): Unit = js.native
  /** sets the state of the radio button. */
  def setState(b: Boolean): Unit = js.native
}

object XRadioButton {
  @scala.inline
  def apply(
    State: Boolean,
    acquire: () => Unit,
    addItemListener: XItemListener => Unit,
    getState: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeItemListener: XItemListener => Unit,
    setLabel: String => Unit,
    setState: Boolean => Unit
  ): XRadioButton = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addItemListener = js.Any.fromFunction1(addItemListener), getState = js.Any.fromFunction0(getState), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItemListener = js.Any.fromFunction1(removeItemListener), setLabel = js.Any.fromFunction1(setLabel), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[XRadioButton]
  }
  @scala.inline
  implicit class XRadioButtonOps[Self <: XRadioButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: Boolean): Self = {
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
    def withGetState(value: () => Boolean): Self = {
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
    def withSetState(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

