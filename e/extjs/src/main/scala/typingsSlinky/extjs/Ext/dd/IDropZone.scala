package typingsSlinky.extjs.Ext.dd

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropZone extends IDropTarget {
  /** [Method] Returns a custom data object associated with the DOM node that is the target of the event
  		* @param e Event The event
  		* @returns Object data The custom data
  		*/
  var getTargetFromEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event_], _]] = js.native
  /** [Method] Called when the DropZone determines that a Ext dd DragSource has been dropped on it but not on any of its registered
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		* @returns Boolean True if the drop was valid, else false
  		*/
  var onContainerDrop: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event_], 
      /* data */ js.UndefOr[js.Any], 
      Boolean
    ]
  ] = js.native
  /** [Method] Called while the DropZone determines that a Ext dd DragSource is being dragged over it but not over any of its regis
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		* @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
  		*/
  var onContainerOver: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event_], 
      /* data */ js.UndefOr[js.Any], 
      String
    ]
  ] = js.native
  /** [Method] Called when the DropZone determines that a Ext dd DragSource has been dropped onto the drop node
  		* @param nodeData Object The custom data associated with the drop node (this is the same value returned from getTargetFromEvent for this node)
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		* @returns Boolean True if the drop was valid, else false
  		*/
  var onNodeDrop: js.UndefOr[
    js.Function4[
      /* nodeData */ js.UndefOr[js.Any], 
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event_], 
      /* data */ js.UndefOr[js.Any], 
      Boolean
    ]
  ] = js.native
  /** [Method] Called when the DropZone determines that a Ext dd DragSource has entered a drop node that has either been registered
  		* @param nodeData Object The custom data associated with the drop node (this is the same value returned from getTargetFromEvent for this node)
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		*/
  var onNodeEnter: js.UndefOr[
    js.Function4[
      /* nodeData */ js.UndefOr[js.Any], 
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event_], 
      /* data */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Called when the DropZone determines that a Ext dd DragSource has been dragged out of the drop node without dropping
  		* @param nodeData Object The custom data associated with the drop node (this is the same value returned from getTargetFromEvent for this node)
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		*/
  var onNodeOut: js.UndefOr[
    js.Function4[
      /* nodeData */ js.UndefOr[js.Any], 
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event_], 
      /* data */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Called while the DropZone determines that a Ext dd DragSource is over a drop node that has either been registered or
  		* @param nodeData Object The custom data associated with the drop node (this is the same value returned from getTargetFromEvent for this node)
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		* @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
  		*/
  var onNodeOver: js.UndefOr[
    js.Function4[
      /* nodeData */ js.UndefOr[js.Any], 
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event_], 
      /* data */ js.UndefOr[js.Any], 
      String
    ]
  ] = js.native
}

object IDropZone {
  @scala.inline
  def apply(): IDropZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropZone]
  }
  @scala.inline
  implicit class IDropZoneOps[Self <: IDropZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTargetFromEvent(value: /* e */ js.UndefOr[Event_] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTargetFromEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetTargetFromEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTargetFromEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContainerDrop(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContainerDrop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnContainerDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContainerDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContainerOver(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContainerOver")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnContainerOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContainerOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeDrop(
      value: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeDrop")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnNodeDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeEnter(
      value: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeEnter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnNodeEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeOut(
      value: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeOut")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnNodeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeOver(
      value: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeOver")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnNodeOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeOver")(js.undefined)
        ret
    }
  }
  
}

