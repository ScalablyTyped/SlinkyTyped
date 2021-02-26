package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XDockableWindowMutableBuilder[Self <: XDockableWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDockableWindowListener(value: XDockableWindowListener => Unit): Self = StObject.set(x, "addDockableWindowListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableDocking(value: Boolean => Unit): Self = StObject.set(x, "enableDocking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFloating(value: () => Boolean): Self = StObject.set(x, "isFloating", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInPopupMode(value: () => Boolean): Self = StObject.set(x, "isInPopupMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLocked(value: () => Boolean): Self = StObject.set(x, "isLocked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLock(value: () => Unit): Self = StObject.set(x, "lock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveDockableWindowListener(value: XDockableWindowListener => Unit): Self = StObject.set(x, "removeDockableWindowListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFloatingMode(value: Boolean => Unit): Self = StObject.set(x, "setFloatingMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartPopupMode(value: Rectangle => Unit): Self = StObject.set(x, "startPopupMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnlock(value: () => Unit): Self = StObject.set(x, "unlock", js.Any.fromFunction0(value))
  }
}
