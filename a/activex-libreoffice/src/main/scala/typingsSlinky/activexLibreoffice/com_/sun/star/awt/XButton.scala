package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to set the label of a button and to register for action events. */
@js.native
trait XButton extends XInterface {
  /** registers an event handler for button action events. */
  def addActionListener(l: XActionListener): Unit = js.native
  /** unregisters an event handler for button action events. */
  def removeActionListener(l: XActionListener): Unit = js.native
  /**
    * sets a command string for pushing the button.
    * @param Command value can be used to detect which button is pressed.
    */
  def setActionCommand(Command: String): Unit = js.native
  /** sets the label of the button. */
  def setLabel(Label: String): Unit = js.native
}

object XButton {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    setActionCommand: String => Unit,
    setLabel: String => Unit
  ): XButton = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), setActionCommand = js.Any.fromFunction1(setActionCommand), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[XButton]
  }
  @scala.inline
  implicit class XButtonOps[Self <: XButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddActionListener(value: XActionListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addActionListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveActionListener(value: XActionListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeActionListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetActionCommand(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActionCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLabel(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

