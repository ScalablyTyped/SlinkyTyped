package typingsSlinky.reactDnd.monitorsMod

import typingsSlinky.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragLayerMonitor extends js.Object {
  /**
    * Returns the last recorded { x, y } client offset of the pointer while a drag operation is in progress.
    * Returns null if no item is being dragged.
    */
  def getClientOffset(): XYCoord | Null = js.native
  /**
    * Returns the { x, y } difference between the last recorded client offset of the pointer and the client
    * offset when current the drag operation has started. Returns null if no item is being dragged.
    */
  def getDifferenceFromInitialOffset(): XYCoord | Null = js.native
  /**
    * Returns the { x, y } client offset of the pointer at the time when the current drag operation has started.
    * Returns null if no item is being dragged.
    */
  def getInitialClientOffset(): XYCoord | Null = js.native
  /**
    * Returns the { x, y } client offset of the drag source component's root DOM node at the time when the current
    * drag operation has started. Returns null if no item is being dragged.
    */
  def getInitialSourceClientOffset(): XYCoord | Null = js.native
  /**
    * Returns a plain object representing the currently dragged item.
    * Every drag source must specify it by returning an object from its beginDrag() method.
    * Returns null if no item is being dragged.
    */
  def getItem(): js.Any = js.native
  /**
    * Returns a string or an ES6 symbol identifying the type of the current dragged item.
    * Returns null if no item is being dragged.
    */
  def getItemType(): Identifier | Null = js.native
  /**
    * Returns the projected { x, y } client offset of the drag source component's root DOM node, based on its
    * position at the time when the current drag operation has started, and the movement difference.
    * Returns null if no item is being dragged.
    */
  def getSourceClientOffset(): XYCoord | Null = js.native
  /**
    * Returns true if a drag operation is in progress. Returns false otherwise.
    */
  def isDragging(): Boolean = js.native
}

object DragLayerMonitor {
  @scala.inline
  def apply(
    getClientOffset: () => XYCoord | Null,
    getDifferenceFromInitialOffset: () => XYCoord | Null,
    getInitialClientOffset: () => XYCoord | Null,
    getInitialSourceClientOffset: () => XYCoord | Null,
    getItem: () => js.Any,
    getItemType: () => Identifier | Null,
    getSourceClientOffset: () => XYCoord | Null,
    isDragging: () => Boolean
  ): DragLayerMonitor = {
    val __obj = js.Dynamic.literal(getClientOffset = js.Any.fromFunction0(getClientOffset), getDifferenceFromInitialOffset = js.Any.fromFunction0(getDifferenceFromInitialOffset), getInitialClientOffset = js.Any.fromFunction0(getInitialClientOffset), getInitialSourceClientOffset = js.Any.fromFunction0(getInitialSourceClientOffset), getItem = js.Any.fromFunction0(getItem), getItemType = js.Any.fromFunction0(getItemType), getSourceClientOffset = js.Any.fromFunction0(getSourceClientOffset), isDragging = js.Any.fromFunction0(isDragging))
    __obj.asInstanceOf[DragLayerMonitor]
  }
  @scala.inline
  implicit class DragLayerMonitorOps[Self <: DragLayerMonitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetClientOffset(value: () => XYCoord | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDifferenceFromInitialOffset(value: () => XYCoord | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDifferenceFromInitialOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInitialClientOffset(value: () => XYCoord | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialClientOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInitialSourceClientOffset(value: () => XYCoord | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialSourceClientOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItem(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItemType(value: () => Identifier | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSourceClientOffset(value: () => XYCoord | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceClientOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDragging(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

