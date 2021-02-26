package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to prevent object internal updates for a certain period to be able to quickly change multiple parts of the objects, where the
  * updates would invalidate each other, anyway.
  */
@js.native
trait XActionLockable extends XInterface {
  
  /** increments the lock count of the object by one. */
  def addActionLock(): Unit = js.native
  
  /** @returns `TRUE` if at least one lock exists. */
  def isActionLocked(): Boolean = js.native
  
  /** decrements the lock count of the object by one. */
  def removeActionLock(): Unit = js.native
  
  /**
    * resets the locking level.
    *
    * This method is used for debugging purposes. The debugging environment of a programming language can reset the locks to allow refreshing of the view if
    * a breakpoint is reached or step execution is used.
    */
  def resetActionLocks(): Double = js.native
  
  /**
    * sets the locking level.
    *
    * This method is used for debugging purposes. The programming environment can restore the locking after a break of a debug session.
    */
  def setActionLocks(nLock: Double): Unit = js.native
}
object XActionLockable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addActionLock: () => Unit,
    isActionLocked: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionLock: () => Unit,
    resetActionLocks: () => Double,
    setActionLocks: Double => Unit
  ): XActionLockable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addActionLock = js.Any.fromFunction0(addActionLock), isActionLocked = js.Any.fromFunction0(isActionLocked), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionLock = js.Any.fromFunction0(removeActionLock), resetActionLocks = js.Any.fromFunction0(resetActionLocks), setActionLocks = js.Any.fromFunction1(setActionLocks))
    __obj.asInstanceOf[XActionLockable]
  }
  
  @scala.inline
  implicit class XActionLockableMutableBuilder[Self <: XActionLockable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddActionLock(value: () => Unit): Self = StObject.set(x, "addActionLock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsActionLocked(value: () => Boolean): Self = StObject.set(x, "isActionLocked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveActionLock(value: () => Unit): Self = StObject.set(x, "removeActionLock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetActionLocks(value: () => Double): Self = StObject.set(x, "resetActionLocks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetActionLocks(value: Double => Unit): Self = StObject.set(x, "setActionLocks", js.Any.fromFunction1(value))
  }
}
