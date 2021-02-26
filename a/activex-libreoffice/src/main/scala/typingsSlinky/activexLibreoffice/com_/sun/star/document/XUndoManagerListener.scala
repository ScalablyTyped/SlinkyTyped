package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implemented by components which want to be notified of changes in the Undo/Redo stacks of an Undo manager.
  * @see XUndoManager
  * @since OOo 3.4
  */
@js.native
trait XUndoManagerListener
  extends typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener {
  
  /**
    * is called when the top-most action of the Redo stack has been re-applied.
    * @see XUndoManager.redo
    */
  def actionRedone(iEvent: UndoManagerEvent): Unit = js.native
  
  /**
    * is called when the top-most action of the undo stack has been undone.
    * @see XUndoManager.undo
    */
  def actionUndone(iEvent: UndoManagerEvent): Unit = js.native
  
  /**
    * is called when both the Undo and the Redo stack have been cleared from all Undo actions.
    * @see XUndoManager.clear
    */
  def allActionsCleared(iEvent: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject): Unit = js.native
  
  /**
    * is called when an Undo context has been left, but no actions have been added within this context.
    *
    * In such a case, the context which has just been left will not contribute to the undo stack, but instead be silently removed. Consequently, the {@link
    * UndoManagerEvent.UndoActionTitle} is empty.
    * @see XUndoManager.leaveUndoContext
    * @see leftContext
    * @see leftHiddenContext
    */
  def cancelledContext(iEvent: UndoManagerEvent): Unit = js.native
  
  /**
    * is called when a new Undo context has been entered.
    *
    * {@link UndoManagerEvent.UndoActionTitle} carries the title of the Undo context, and {@link UndoManagerEvent.UndoContextDepth} the number of open Undo
    * contexts, including the one just entered.
    * @see XUndoManager.enterUndoContext
    */
  def enteredContext(iEvent: UndoManagerEvent): Unit = js.native
  
  /**
    * is called when a new hidden Undo context has been entered.
    *
    * {@link UndoManagerEvent.UndoActionTitle} carries the title of the Undo context, and {@link UndoManagerEvent.UndoContextDepth} the number of open Undo
    * contexts, including the one just entered.
    * @see XUndoManager.enterUndoContext
    */
  def enteredHiddenContext(iEvent: UndoManagerEvent): Unit = js.native
  
  /**
    * is called when an Undo context has been left.
    *
    * {@link UndoManagerEvent.UndoActionTitle} carries the title of the Undo context, and {@link UndoManagerEvent.UndoContextDepth} the number of open Undo
    * contexts, exluding the one just left.
    * @see XUndoManager.leaveUndoContext
    * @see leftHiddenUndocontext
    * @see cancelledContext
    */
  def leftContext(iEvent: UndoManagerEvent): Unit = js.native
  
  /**
    * is calledn when a hidden Undo context has been left.
    *
    * {@link UndoManagerEvent.UndoActionTitle} is empty, as hidden Undo contexts don't have a title.
    * @see XUndoManager.leaveHiddenUndoContext
    * @see leftContext
    * @see cancelledContext
    */
  def leftHiddenContext(iEvent: UndoManagerEvent): Unit = js.native
  
  /**
    * is called when the Redo stack has been cleared.
    * @see XUndoManager.clearRedo
    */
  def redoActionsCleared(iEvent: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject): Unit = js.native
  
  /** called when the complete undo manager has been reset */
  def resetAll(iEvent: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject): Unit = js.native
  
  /**
    * is called when an undo action is added to the undo stack.
    *
    * Note that the action must not necessarily be the new top element of the stack: In case there's an open Undo context, {@link
    * UndoManagerEvent.UndoContextDepth} will be greater `0` , and the newly added action will be subordinate of the context action.
    * @see XUndoManager.addUndoAction
    */
  def undoActionAdded(iEvent: UndoManagerEvent): Unit = js.native
}
object XUndoManagerListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    actionRedone: UndoManagerEvent => Unit,
    actionUndone: UndoManagerEvent => Unit,
    allActionsCleared: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject => Unit,
    cancelledContext: UndoManagerEvent => Unit,
    disposing: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject => Unit,
    enteredContext: UndoManagerEvent => Unit,
    enteredHiddenContext: UndoManagerEvent => Unit,
    leftContext: UndoManagerEvent => Unit,
    leftHiddenContext: UndoManagerEvent => Unit,
    queryInterface: `type` => js.Any,
    redoActionsCleared: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject => Unit,
    release: () => Unit,
    resetAll: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject => Unit,
    undoActionAdded: UndoManagerEvent => Unit
  ): XUndoManagerListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), actionRedone = js.Any.fromFunction1(actionRedone), actionUndone = js.Any.fromFunction1(actionUndone), allActionsCleared = js.Any.fromFunction1(allActionsCleared), cancelledContext = js.Any.fromFunction1(cancelledContext), disposing = js.Any.fromFunction1(disposing), enteredContext = js.Any.fromFunction1(enteredContext), enteredHiddenContext = js.Any.fromFunction1(enteredHiddenContext), leftContext = js.Any.fromFunction1(leftContext), leftHiddenContext = js.Any.fromFunction1(leftHiddenContext), queryInterface = js.Any.fromFunction1(queryInterface), redoActionsCleared = js.Any.fromFunction1(redoActionsCleared), release = js.Any.fromFunction0(release), resetAll = js.Any.fromFunction1(resetAll), undoActionAdded = js.Any.fromFunction1(undoActionAdded))
    __obj.asInstanceOf[XUndoManagerListener]
  }
  
  @scala.inline
  implicit class XUndoManagerListenerMutableBuilder[Self <: XUndoManagerListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionRedone(value: UndoManagerEvent => Unit): Self = StObject.set(x, "actionRedone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActionUndone(value: UndoManagerEvent => Unit): Self = StObject.set(x, "actionUndone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAllActionsCleared(value: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject => Unit): Self = StObject.set(x, "allActionsCleared", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelledContext(value: UndoManagerEvent => Unit): Self = StObject.set(x, "cancelledContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnteredContext(value: UndoManagerEvent => Unit): Self = StObject.set(x, "enteredContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnteredHiddenContext(value: UndoManagerEvent => Unit): Self = StObject.set(x, "enteredHiddenContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLeftContext(value: UndoManagerEvent => Unit): Self = StObject.set(x, "leftContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLeftHiddenContext(value: UndoManagerEvent => Unit): Self = StObject.set(x, "leftHiddenContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRedoActionsCleared(value: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject => Unit): Self = StObject.set(x, "redoActionsCleared", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetAll(value: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject => Unit): Self = StObject.set(x, "resetAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUndoActionAdded(value: UndoManagerEvent => Unit): Self = StObject.set(x, "undoActionAdded", js.Any.fromFunction1(value))
  }
}
