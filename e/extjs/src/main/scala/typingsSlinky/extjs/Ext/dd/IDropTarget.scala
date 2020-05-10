package typingsSlinky.extjs.Ext.dd

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropTarget extends IDDTarget {
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var dropAllowed: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var dropNotAllowed: js.UndefOr[String] = js.native
  /** [Method] The function a Ext dd DragSource calls once to notify this drop target that the dragged item has been dropped on it
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop target
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		* @returns Boolean False if the drop was invalid.
  		*/
  var notifyDrop: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event_], 
      /* data */ js.UndefOr[js.Any], 
      Boolean
    ]
  ] = js.native
  /** [Method] The function a Ext dd DragSource calls once to notify this drop target that the source is now over the target
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop target
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		* @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
  		*/
  var notifyEnter: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event_], 
      /* data */ js.UndefOr[js.Any], 
      String
    ]
  ] = js.native
  /** [Method] The function a Ext dd DragSource calls once to notify this drop target that the source has been dragged out of the ta
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop target
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		*/
  var notifyOut: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event_], 
      /* data */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] The function a Ext dd DragSource calls continuously while it is being dragged over the target
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop target
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		* @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
  		*/
  var notifyOver: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event_], 
      /* data */ js.UndefOr[js.Any], 
      String
    ]
  ] = js.native
  /** [Config Option] (String) */
  var overClass: js.UndefOr[String] = js.native
}

object IDropTarget {
  @scala.inline
  def apply(): IDropTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropTarget]
  }
  @scala.inline
  implicit class IDropTargetOps[Self <: IDropTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDdGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDdGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withDropAllowed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withDropNotAllowed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropNotAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropNotAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropNotAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyDrop(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyDrop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutNotifyDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyEnter(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutNotifyEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyOut(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOut")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutNotifyOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOut")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyOver(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOver")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutNotifyOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOverClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overClass")(js.undefined)
        ret
    }
  }
  
}

