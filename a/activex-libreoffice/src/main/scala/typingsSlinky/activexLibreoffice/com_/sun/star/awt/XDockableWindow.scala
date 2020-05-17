package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the docking interface for a window component.
  *
  * A window can either be docked where it resides as a child window in an application frame window or it can be floating where it will reside in its own
  * decorated top level window.
  */
@js.native
trait XDockableWindow extends XInterface {
  /** adds a docking listener to the object. only a single listener may be registered at any time. */
  def addDockableWindowListener(xListener: XDockableWindowListener): Unit = js.native
  /**
    * enable or disable docking, docking is disabled by default
    * @param bEnable `TRUE` specifies that docking is enabled `FALSE` specifies that docking is disabled and no {@link com.sun.star.awt.XDockableWindowListene
    */
  def enableDocking(bEnable: Boolean): Unit = js.native
  /**
    * queries the current window state
    * @returns `TRUE` if the window is floating `FALSE` if the window is docked
    */
  def isFloating(): Boolean = js.native
  /**
    * queries the current pop-up mode
    * @returns `TRUE` if the window is in pop-up mode `FALSE` if the window is not in pop-up mode
    */
  def isInPopupMode(): Boolean = js.native
  /**
    * queries the current locking state
    * @returns `TRUE` if the window is locked `FALSE` if the window is not locked
    */
  def isLocked(): Boolean = js.native
  /** prevents the window from being undocked this has no effect if the window is floating */
  def lock(): Unit = js.native
  /** removes the specified docking listener from the object. */
  def removeDockableWindowListener(xListener: XDockableWindowListener): Unit = js.native
  /**
    * toggle between floating and docked state
    * @param bFloating specifies the new floating mode: `TRUE` means floating, `FALSE` means docked
    */
  def setFloatingMode(bFloating: Boolean): Unit = js.native
  /**
    * shows the window in a menu like style, i.e. without decoration a special indicator will allow for tearing off the window see {@link
    * com.sun.star.awt.XDockableWindowListener} for the corresponding events
    * @param WindowRect specifies the position and size of the pop-up window in frame coordinates
    */
  def startPopupMode(WindowRect: Rectangle): Unit = js.native
  /** enables undocking this has no effect if the window is floating */
  def unlock(): Unit = js.native
}

object XDockableWindow {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addDockableWindowListener: XDockableWindowListener => Unit,
    enableDocking: Boolean => Unit,
    isFloating: () => Boolean,
    isInPopupMode: () => Boolean,
    isLocked: () => Boolean,
    lock: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDockableWindowListener: XDockableWindowListener => Unit,
    setFloatingMode: Boolean => Unit,
    startPopupMode: Rectangle => Unit,
    unlock: () => Unit
  ): XDockableWindow = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addDockableWindowListener = js.Any.fromFunction1(addDockableWindowListener), enableDocking = js.Any.fromFunction1(enableDocking), isFloating = js.Any.fromFunction0(isFloating), isInPopupMode = js.Any.fromFunction0(isInPopupMode), isLocked = js.Any.fromFunction0(isLocked), lock = js.Any.fromFunction0(lock), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDockableWindowListener = js.Any.fromFunction1(removeDockableWindowListener), setFloatingMode = js.Any.fromFunction1(setFloatingMode), startPopupMode = js.Any.fromFunction1(startPopupMode), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[XDockableWindow]
  }
  @scala.inline
  implicit class XDockableWindowOps[Self <: XDockableWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDockableWindowListener(value: XDockableWindowListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDockableWindowListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableDocking(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDocking")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFloating(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFloating")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInPopupMode(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInPopupMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLocked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveDockableWindowListener(value: XDockableWindowListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDockableWindowListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFloatingMode(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloatingMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartPopupMode(value: Rectangle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPopupMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnlock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

