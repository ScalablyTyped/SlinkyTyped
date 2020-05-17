package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive keyboard focus events.
  *
  * The window which has the keyboard focus is the window which gets the keyboard events.
  */
@js.native
trait XFocusListener extends XEventListener {
  /**
    * is invoked when a window gains the keyboard focus.
    * @see XActivateListener.windowActivated
    */
  def focusGained(e: FocusEvent): Unit = js.native
  /**
    * is invoked when a window loses the keyboard focus.
    * @see XActivateListener.windowDeactivated
    */
  def focusLost(e: FocusEvent): Unit = js.native
}

object XFocusListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    focusGained: FocusEvent => Unit,
    focusLost: FocusEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFocusListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), focusGained = js.Any.fromFunction1(focusGained), focusLost = js.Any.fromFunction1(focusLost), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFocusListener]
  }
  @scala.inline
  implicit class XFocusListenerOps[Self <: XFocusListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusGained(value: FocusEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusGained")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFocusLost(value: FocusEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusLost")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

