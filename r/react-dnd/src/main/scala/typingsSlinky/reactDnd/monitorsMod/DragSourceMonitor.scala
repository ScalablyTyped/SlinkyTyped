package typingsSlinky.reactDnd.monitorsMod

import typingsSlinky.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragSourceMonitor
  extends HandlerManager
     with MonitorEventEmitter {
  
  /**
    * Returns true if no drag operation is in progress, and the owner's canDrag() returns true or is not defined.
    */
  def canDrag(): Boolean = js.native
  
  /**
    *  Returns true if some drop target has handled the drop event, false otherwise. Even if a target did not return a drop result, didDrop() returns true.
    * Use it inside endDrag() to test whether any drop target has handled the drop. Returns false if called outside endDrag().
    */
  def didDrop(): Boolean = js.native
  
  /**
    * Returns the last recorded { x, y } client offset of the pointer while a drag operation is in progress. Returns null if no item is being dragged.
    */
  def getClientOffset(): XYCoord | Null = js.native
  
  /**
    * Returns the { x, y } difference between the last recorded client offset of the pointer and the client offset when the current drag operation has started.
    * Returns null if no item is being dragged.
    */
  def getDifferenceFromInitialOffset(): XYCoord | Null = js.native
  
  /**
    * Returns a plain object representing the last recorded drop result. The drop targets may optionally specify it by returning an object from their
    * drop() methods. When a chain of drop() is dispatched for the nested targets, bottom up, any parent that explicitly returns its own result from drop()
    * overrides the child drop result previously set by the child. Returns null if called outside endDrag().
    */
  def getDropResult(): js.Any = js.native
  
  /**
    * Returns the { x, y } client offset of the pointer at the time when the current drag operation has started. Returns null if no item is being dragged.
    */
  def getInitialClientOffset(): XYCoord | Null = js.native
  
  /**
    * Returns the { x, y } client offset of the drag source component's root DOM node at the time when the current drag operation has started.
    * Returns null if no item is being dragged.
    */
  def getInitialSourceClientOffset(): XYCoord | Null = js.native
  
  /**
    * Returns a plain object representing the currently dragged item. Every drag source must specify it by returning an object from its beginDrag() method.
    * Returns null if no item is being dragged.
    */
  def getItem(): js.Any = js.native
  
  /**
    * Returns a string or an ES6 symbol identifying the type of the current dragged item. Returns null if no item is being dragged.
    */
  def getItemType(): Identifier | Null = js.native
  
  /**
    * Returns the projected { x, y } client offset of the drag source component's root DOM node, based on its position at the time when the current drag operation has
    * started, and the movement difference. Returns null if no item is being dragged.
    */
  def getSourceClientOffset(): XYCoord | Null = js.native
  
  /**
    * Returns the ids of the potential drop targets.
    */
  def getTargetIds(): js.Array[Identifier] = js.native
  
  /**
    *  Returns true if a drag operation is in progress, and either the owner initiated the drag, or its isDragging() is defined and returns true.
    */
  def isDragging(): Boolean = js.native
}
