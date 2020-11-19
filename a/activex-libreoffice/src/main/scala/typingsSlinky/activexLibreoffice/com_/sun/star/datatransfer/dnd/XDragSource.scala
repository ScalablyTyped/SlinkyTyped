package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is implemented by a view or window that supports drag operations and will be received as part of a {@link DragGestureEvent} through a
  * {@link com.sun.star.datatransfer.dnd.XDragGestureListener.dragGestureRecognized()} callback.
  *
  * Differently to Java, the association between view and interface is fixed and can not be changed. Otherwise, the AWT messaging would have to be
  * implemented for any window supporting Drag and Drop operations, which would be a real performance issue.
  */
@js.native
trait XDragSource extends XInterface {
  
  /**
    * To get the default cursor for a specified drag action.
    * @param dragAction A drag action as specified in {@link DNDConstants} .
    * @returns The default drag cursor for the specified drag action. The returned value may be used as parameter for the method {@link com.sun.star.datatransfe
    */
  def getDefaultCursor(dragAction: Double): Double = js.native
  
  /**
    * In order to query if drag image support is available.
    * @returns A boolean indicating whether or not drag image support is available on the underlying platform.
    */
  def isDragImageSupported(): Boolean = js.native
  
  /**
    * Starts the drag operation.
    *
    * Note: this call does **not** block until the drag and drop operation ends. If the Drag and Drop system is unable to initiate a drag operation or if
    * the user attempts to start a drag while an existing drag operation is still executing, the action fails immediately. This is indicated by calling
    * {@link com.sun.star.datatransfer.dnd.XDragSourceListener.dragDropEnd()} on the parameter listener with a {@link DragSourceDragEvent} showing a
    * failure.
    * @param trigger The {@link DragGestureEvent} that initiated the drag.
    * @param sourceActions The action or actions supported for this transferable as defined in {@link DNDConstants} .
    * @param cursor The initial drag cursor id or 0 as default.
    * @param image The initial drag image id or 0 as default.
    * @param trans The transferable object dragged.
    * @param listener The {@link XDragSourceListener} .
    * @see com.sun.star.datatransfer.XTransferable
    */
  def startDrag(
    trigger: DragGestureEvent,
    sourceActions: Double,
    cursor: Double,
    image: Double,
    trans: XTransferable,
    listener: XDragSourceListener
  ): Unit = js.native
}
object XDragSource {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDefaultCursor: Double => Double,
    isDragImageSupported: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    startDrag: (DragGestureEvent, Double, Double, Double, XTransferable, XDragSourceListener) => Unit
  ): XDragSource = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDefaultCursor = js.Any.fromFunction1(getDefaultCursor), isDragImageSupported = js.Any.fromFunction0(isDragImageSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startDrag = js.Any.fromFunction6(startDrag))
    __obj.asInstanceOf[XDragSource]
  }
  
  @scala.inline
  implicit class XDragSourceOps[Self <: XDragSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetDefaultCursor(value: Double => Double): Self = this.set("getDefaultCursor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDragImageSupported(value: () => Boolean): Self = this.set("isDragImageSupported", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartDrag(value: (DragGestureEvent, Double, Double, Double, XTransferable, XDragSourceListener) => Unit): Self = this.set("startDrag", js.Any.fromFunction6(value))
  }
}
