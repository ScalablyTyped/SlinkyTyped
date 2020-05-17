package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is implemented by a view or window that supports drop operations.
  *
  * Differently to Java, the association between view and interface is fixed and cannot be changed. Otherwise, the AWT messaging would have to be
  * implemented for any window supporting Drag and Drop operations, which would be a performance issue.
  */
@js.native
trait XDropTarget extends XInterface {
  /**
    * Determine the actions supported by a drop target.
    * @returns The current action or actions supported by this drop target.  By default this will include all drag and drop actions.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DefaultActions: Double = js.native
  /**
    * Add a DropTargetListener.
    *
    * The listener will be queried for the {@link XAutoscroll} interface to see if it supports autoscrolling.
    * @param dtl The listener to add to the notification list.
    */
  def addDropTargetListener(dtl: XDropTargetListener): Unit = js.native
  /**
    * Determine the actions supported by a drop target.
    * @returns The current action or actions supported by this drop target.  By default this will include all drag and drop actions.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  def getDefaultActions(): Double = js.native
  /**
    * Indicates either a drop target object is active or not.
    * @returns A boolean indicating whether or not this drop target object is currently active, that is ready to accept drops.
    */
  def isActive(): Boolean = js.native
  /**
    * Remove a drop target listener.
    * @param dtl The listener to remove from notification list.
    */
  def removeDropTargetListener(dtl: XDropTargetListener): Unit = js.native
  /**
    * Sets the drop target object active or inactive.
    * @param active A value of `TRUE` sets the drop target object active. A value of `FALSE` sets the drop target object inactive.
    */
  def setActive(active: Boolean): Unit = js.native
  /**
    * Sets the default acceptable actions for this drop target.
    *
    * This method is a way to reduce the number of Drag and Drop events by blocking events for actions not supported by this target.
    *
    * By default the listener will receive notifications for all actions.
    * @param actions The actions.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  def setDefaultActions(actions: Double): Unit = js.native
}

object XDropTarget {
  @scala.inline
  def apply(
    DefaultActions: Double,
    acquire: () => Unit,
    addDropTargetListener: XDropTargetListener => Unit,
    getDefaultActions: () => Double,
    isActive: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDropTargetListener: XDropTargetListener => Unit,
    setActive: Boolean => Unit,
    setDefaultActions: Double => Unit
  ): XDropTarget = {
    val __obj = js.Dynamic.literal(DefaultActions = DefaultActions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDropTargetListener = js.Any.fromFunction1(addDropTargetListener), getDefaultActions = js.Any.fromFunction0(getDefaultActions), isActive = js.Any.fromFunction0(isActive), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDropTargetListener = js.Any.fromFunction1(removeDropTargetListener), setActive = js.Any.fromFunction1(setActive), setDefaultActions = js.Any.fromFunction1(setDefaultActions))
    __obj.asInstanceOf[XDropTarget]
  }
  @scala.inline
  implicit class XDropTargetOps[Self <: XDropTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultActions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddDropTargetListener(value: XDropTargetListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDropTargetListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDefaultActions(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultActions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveDropTargetListener(value: XDropTargetListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDropTargetListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetActive(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDefaultActions(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultActions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

