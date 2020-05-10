package typingsSlinky.extjs.Ext.dd

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragSource extends IDDProxy {
  /** [Method] An empty function by default but provided so that you can perform a custom action after a valid drag drop has occurr
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dropped element
  		*/
  var afterDragDrop: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event_], 
      /* id */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Method] An empty function by default but provided so that you can perform a custom action when the dragged item enters the d
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		*/
  var afterDragEnter: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event_], 
      /* id */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Method] An empty function by default but provided so that you can perform a custom action after the dragged item is dragged
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		*/
  var afterDragOut: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event_], 
      /* id */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Method] An empty function by default but provided so that you can perform a custom action while the dragged item is over the
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		*/
  var afterDragOver: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event_], 
      /* id */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Method] An empty function by default but provided so that you can perform a custom action after an invalid drop has occurred
  		* @param e Event The event object
  		* @param id String The id of the dropped element
  		*/
  var afterInvalidDrop: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String], Unit]] = js.native
  /** [Method] An empty function by default but provided so that you can perform a custom action after a valid drop has occurred by
  		* @param target Object The target DD
  		* @param e Event The event object
  		* @param id String The id of the dropped element
  		*/
  var afterValidDrop: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[Event_], 
      /* id */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the element to the location of the mousedown or click event maintaining the cursor location relative to the loc  */
  @JSName("alignElWithMouse")
  var alignElWithMouse_IDragSource: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var animRepair: js.UndefOr[Boolean] = js.native
  /** [Method] An empty function by default but provided so that you can perform a custom action before the dragged item is dropped
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		* @returns Boolean isValid True if the drag drop event is valid, else false to cancel
  		*/
  var beforeDragDrop: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event_], 
      /* id */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
  /** [Method] An empty function by default but provided so that you can perform a custom action before the dragged item enters the
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		* @returns Boolean isValid True if the drag event is valid, else false to cancel
  		*/
  var beforeDragEnter: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event_], 
      /* id */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
  /** [Method] An empty function by default but provided so that you can perform a custom action before the dragged item is dragged
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		* @returns Boolean isValid True if the drag event is valid, else false to cancel
  		*/
  var beforeDragOut: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event_], 
      /* id */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
  /** [Method] An empty function by default but provided so that you can perform a custom action while the dragged item is over the
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		* @returns Boolean isValid True if the drag event is valid, else false to cancel
  		*/
  var beforeDragOver: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event_], 
      /* id */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
  /** [Method] An empty function by default but provided so that you can perform a custom action after an invalid drop has occurred
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		* @returns Boolean isValid True if the invalid drop should proceed, else false to cancel
  		*/
  var beforeInvalidDrop: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event_], 
      /* id */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[String] = js.native
  /** [Property] (Object) */
  var dragData: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var dropAllowed: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var dropNotAllowed: js.UndefOr[String] = js.native
  /** [Method] Returns the data object associated with this drag source
  		* @param e Object
  		* @returns Object data An object containing arbitrary data
  		*/
  var getDragData: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the drag source s underlying Ext dd StatusProxy
  		* @returns Ext.dd.StatusProxy proxy The StatusProxy
  		*/
  var getProxy: js.UndefOr[js.Function0[IStatusProxy]] = js.native
  /** [Method] Hides the drag source s Ext dd StatusProxy */
  var hideProxy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] An empty function by default but provided so that you can perform a custom action before the initial drag event begi
  		* @param data Object An object containing arbitrary data to be shared with drop targets
  		* @param e Event The event object
  		* @returns Boolean isValid True if the drag event is valid, else false to cancel
  		*/
  var onBeforeDrag: js.UndefOr[js.Function2[/* data */ js.UndefOr[js.Any], /* e */ js.UndefOr[Event_], Boolean]] = js.native
  /** [Method] An empty function by default but provided so that you can perform a custom action once the initial drag event has be
  		* @param x Number The x position of the click on the dragged object
  		* @param y Number The y position of the click on the dragged object
  		*/
  var onStartDrag: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (String) */
  var repairHighlightColor: js.UndefOr[String] = js.native
}

object IDragSource {
  @scala.inline
  def apply(): IDragSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragSource]
  }
  @scala.inline
  implicit class IDragSourceOps[Self <: IDragSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterDragDrop(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDragDrop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterDragDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDragDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDragEnter(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDragEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDragOut(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDragOut")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterDragOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDragOut")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDragOver(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDragOver")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterInvalidDrop(value: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInvalidDrop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterInvalidDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInvalidDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterValidDrop(
      value: (/* target */ js.UndefOr[js.Any], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterValidDrop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterValidDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterValidDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignElWithMouse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignElWithMouse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAlignElWithMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignElWithMouse")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimRepair(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animRepair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimRepair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animRepair")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDragDrop(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDragDrop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeDragDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDragDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDragEnter(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDragEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDragOut(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDragOut")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeDragOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDragOut")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDragOver(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDragOver")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInvalidDrop(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInvalidDrop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeInvalidDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInvalidDrop")(js.undefined)
        ret
    }
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
    def withDragData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragData")(js.undefined)
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
    def withGetDragData(value: /* e */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDragData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDragData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDragData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProxy(value: () => IStatusProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withHideProxy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideProxy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHideProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeDrag(value: (/* data */ js.UndefOr[js.Any], /* e */ js.UndefOr[Event_]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartDrag(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStartDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withRepairHighlightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repairHighlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepairHighlightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repairHighlightColor")(js.undefined)
        ret
    }
  }
  
}

